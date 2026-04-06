package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public final class Iterables {

    /* renamed from: com.google.common.collect.Iterables$1  reason: invalid class name */
    class AnonymousClass1 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Iterable f28222A;

        public Iterator iterator() {
            return Iterators.k(this.f28222A);
        }

        public String toString() {
            return String.valueOf(this.f28222A.toString()).concat(" (cycled)");
        }
    }

    /* renamed from: com.google.common.collect.Iterables$2  reason: invalid class name */
    class AnonymousClass2 extends FluentIterable<List<Object>> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Iterable f28223A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ int f28224B;

        public Iterator iterator() {
            return Iterators.z(this.f28223A.iterator(), this.f28224B);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$3  reason: invalid class name */
    class AnonymousClass3 extends FluentIterable<List<Object>> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Iterable f28225A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ int f28226B;

        public Iterator iterator() {
            return Iterators.y(this.f28225A.iterator(), this.f28226B);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$7  reason: invalid class name */
    class AnonymousClass7 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Iterable f28235A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ int f28236B;

        public Iterator iterator() {
            return Iterators.w(this.f28235A.iterator(), this.f28236B);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$8  reason: invalid class name */
    class AnonymousClass8 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Iterable f28237A;

        public Iterator iterator() {
            Iterable iterable = this.f28237A;
            return iterable instanceof Queue ? new ConsumingQueueIterator((Queue) iterable) : Iterators.i(iterable.iterator());
        }

        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: com.google.common.collect.Iterables$9  reason: invalid class name */
    class AnonymousClass9 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Iterable f28238A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Comparator f28239B;

        public Iterator iterator() {
            return Iterators.x(Iterables.s(this.f28238A, Iterables.q()), this.f28239B);
        }
    }

    public static final class UnmodifiableIterable<T> extends FluentIterable<T> {

        /* renamed from: A  reason: collision with root package name */
        public final Iterable f28240A;

        public Iterator iterator() {
            return Iterators.K(this.f28240A.iterator());
        }

        public String toString() {
            return this.f28240A.toString();
        }
    }

    public static boolean a(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : Iterators.a(collection, ((Iterable) Preconditions.q(iterable)).iterator());
    }

    public static boolean b(Iterable iterable, Predicate predicate) {
        return Iterators.c(iterable.iterator(), predicate);
    }

    public static Collection c(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.j(iterable.iterator());
    }

    public static Iterable d(Iterable iterable, Iterable iterable2) {
        return FluentIterable.e(iterable, iterable2);
    }

    public static Iterable e(final Iterable iterable, final Predicate predicate) {
        Preconditions.q(iterable);
        Preconditions.q(predicate);
        return new FluentIterable<Object>() {
            public Iterator iterator() {
                return Iterators.p(iterable.iterator(), predicate);
            }
        };
    }

    public static Iterable f(Iterable iterable, Class cls) {
        Preconditions.q(iterable);
        Preconditions.q(cls);
        return e(iterable, Predicates.h(cls));
    }

    public static Object g(Iterable iterable, Predicate predicate, Object obj) {
        return Iterators.r(iterable.iterator(), predicate, obj);
    }

    public static Object h(Iterable iterable, Object obj) {
        return Iterators.u(iterable.iterator(), obj);
    }

    public static Object i(Iterable iterable, Predicate predicate) {
        Preconditions.q(predicate);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static boolean j(Iterable iterable, Predicate predicate) {
        return (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) ? Iterators.E(iterable.iterator(), predicate) : k((List) iterable, (Predicate) Preconditions.q(predicate));
    }

    public static boolean k(List list, Predicate predicate) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!predicate.apply(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (UnsupportedOperationException unused) {
                        m(list, predicate, i3, i2);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m(list, predicate, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    public static Iterable l(final Iterable iterable, final int i2) {
        Preconditions.q(iterable);
        Preconditions.e(i2 >= 0, "number to skip cannot be negative");
        return new FluentIterable<Object>() {
            public Iterator iterator() {
                Iterable iterable = iterable;
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), i2), list.size()).iterator();
                }
                final Iterator it = iterable.iterator();
                Iterators.b(it, i2);
                return new Iterator<Object>(this) {

                    /* renamed from: z  reason: collision with root package name */
                    public boolean f28234z = true;

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public Object next() {
                        Object next = it.next();
                        this.f28234z = false;
                        return next;
                    }

                    public void remove() {
                        CollectPreconditions.e(!this.f28234z);
                        it.remove();
                    }
                };
            }
        };
    }

    public static void m(List list, Predicate predicate, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    public static Object[] n(Iterable iterable) {
        return c(iterable).toArray();
    }

    public static Object[] o(Iterable iterable, Class cls) {
        return p(iterable, ObjectArrays.f(cls, 0));
    }

    public static Object[] p(Iterable iterable, Object[] objArr) {
        return c(iterable).toArray(objArr);
    }

    public static Function q() {
        return new Function<Iterable<Object>, Iterator<Object>>() {
            /* renamed from: a */
            public Iterator apply(Iterable iterable) {
                return iterable.iterator();
            }
        };
    }

    public static String r(Iterable iterable) {
        return Iterators.I(iterable.iterator());
    }

    public static Iterable s(final Iterable iterable, final Function function) {
        Preconditions.q(iterable);
        Preconditions.q(function);
        return new FluentIterable<Object>() {
            public Iterator iterator() {
                return Iterators.J(iterable.iterator(), function);
            }
        };
    }
}
