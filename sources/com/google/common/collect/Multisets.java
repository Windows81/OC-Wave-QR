package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class Multisets {

    /* renamed from: com.google.common.collect.Multisets$1  reason: invalid class name */
    class AnonymousClass1 extends ViewMultiset<Object> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Multiset f28450B;
        public final /* synthetic */ Multiset C;

        public int L0(Object obj) {
            return Math.max(this.f28450B.L0(obj), this.C.L0(obj));
        }

        public boolean contains(Object obj) {
            return this.f28450B.contains(obj) || this.C.contains(obj);
        }

        public Set e() {
            return Sets.o(this.f28450B.k(), this.C.k());
        }

        public Iterator i() {
            throw new AssertionError("should never be called");
        }

        public boolean isEmpty() {
            return this.f28450B.isEmpty() && this.C.isEmpty();
        }

        public Iterator m() {
            final Iterator it = this.f28450B.entrySet().iterator();
            final Iterator it2 = this.C.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* renamed from: e */
                public Multiset.Entry b() {
                    if (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object a2 = entry.a();
                        return Multisets.g(a2, Math.max(entry.getCount(), AnonymousClass1.this.C.L0(a2)));
                    }
                    while (it2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                        Object a3 = entry2.a();
                        if (!AnonymousClass1.this.f28450B.contains(a3)) {
                            return Multisets.g(a3, entry2.getCount());
                        }
                    }
                    return (Multiset.Entry) c();
                }
            };
        }
    }

    /* renamed from: com.google.common.collect.Multisets$2  reason: invalid class name */
    class AnonymousClass2 extends ViewMultiset<Object> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Multiset f28452B;
        public final /* synthetic */ Multiset C;

        public int L0(Object obj) {
            int L0 = this.f28452B.L0(obj);
            if (L0 == 0) {
                return 0;
            }
            return Math.min(L0, this.C.L0(obj));
        }

        public Set e() {
            return Sets.g(this.f28452B.k(), this.C.k());
        }

        public Iterator i() {
            throw new AssertionError("should never be called");
        }

        public Iterator m() {
            final Iterator it = this.f28452B.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* renamed from: e */
                public Multiset.Entry b() {
                    while (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object a2 = entry.a();
                        int min = Math.min(entry.getCount(), AnonymousClass2.this.C.L0(a2));
                        if (min > 0) {
                            return Multisets.g(a2, min);
                        }
                    }
                    return (Multiset.Entry) c();
                }
            };
        }
    }

    /* renamed from: com.google.common.collect.Multisets$3  reason: invalid class name */
    class AnonymousClass3 extends ViewMultiset<Object> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Multiset f28454B;
        public final /* synthetic */ Multiset C;

        public int L0(Object obj) {
            return this.f28454B.L0(obj) + this.C.L0(obj);
        }

        public boolean contains(Object obj) {
            return this.f28454B.contains(obj) || this.C.contains(obj);
        }

        public Set e() {
            return Sets.o(this.f28454B.k(), this.C.k());
        }

        public Iterator i() {
            throw new AssertionError("should never be called");
        }

        public boolean isEmpty() {
            return this.f28454B.isEmpty() && this.C.isEmpty();
        }

        public Iterator m() {
            final Iterator it = this.f28454B.entrySet().iterator();
            final Iterator it2 = this.C.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* renamed from: e */
                public Multiset.Entry b() {
                    if (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object a2 = entry.a();
                        return Multisets.g(a2, entry.getCount() + AnonymousClass3.this.C.L0(a2));
                    }
                    while (it2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                        Object a3 = entry2.a();
                        if (!AnonymousClass3.this.f28454B.contains(a3)) {
                            return Multisets.g(a3, entry2.getCount());
                        }
                    }
                    return (Multiset.Entry) c();
                }
            };
        }

        public int size() {
            return IntMath.i(this.f28454B.size(), this.C.size());
        }
    }

    /* renamed from: com.google.common.collect.Multisets$4  reason: invalid class name */
    class AnonymousClass4 extends ViewMultiset<Object> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Multiset f28456B;
        public final /* synthetic */ Multiset C;

        public int L0(Object obj) {
            int L0 = this.f28456B.L0(obj);
            if (L0 == 0) {
                return 0;
            }
            return Math.max(0, L0 - this.C.L0(obj));
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public int h() {
            return Iterators.H(m());
        }

        public Iterator i() {
            final Iterator it = this.f28456B.entrySet().iterator();
            return new AbstractIterator<Object>() {
                public Object b() {
                    while (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object a2 = entry.a();
                        if (entry.getCount() > AnonymousClass4.this.C.L0(a2)) {
                            return a2;
                        }
                    }
                    return c();
                }
            };
        }

        public Iterator m() {
            final Iterator it = this.f28456B.entrySet().iterator();
            return new AbstractIterator<Multiset.Entry<Object>>() {
                /* renamed from: e */
                public Multiset.Entry b() {
                    while (it.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) it.next();
                        Object a2 = entry.a();
                        int count = entry.getCount() - AnonymousClass4.this.C.L0(a2);
                        if (count > 0) {
                            return Multisets.g(a2, count);
                        }
                    }
                    return (Multiset.Entry) c();
                }
            };
        }
    }

    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        public boolean equals(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return getCount() == entry.getCount() && Objects.a(a(), entry.a());
        }

        public int hashCode() {
            Object a2 = a();
            return (a2 == null ? 0 : a2.hashCode()) ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(a());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    public static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {

        /* renamed from: z  reason: collision with root package name */
        public static final DecreasingCount f28459z = new DecreasingCount();

        /* renamed from: a */
        public int compare(Multiset.Entry entry, Multiset.Entry entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        public void clear() {
            m().clear();
        }

        public boolean contains(Object obj) {
            return m().contains(obj);
        }

        public boolean containsAll(Collection collection) {
            return m().containsAll(collection);
        }

        public boolean isEmpty() {
            return m().isEmpty();
        }

        public abstract Multiset m();

        public boolean remove(Object obj) {
            return m().N(obj, Integer.MAX_VALUE) > 0;
        }

        public int size() {
            return m().entrySet().size();
        }
    }

    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        public void clear() {
            m().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && m().L0(entry.a()) == entry.getCount();
        }

        public abstract Multiset m();

        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object a2 = entry.a();
                int count = entry.getCount();
                if (count != 0) {
                    return m().t0(a2, count, 0);
                }
            }
            return false;
        }
    }

    public static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* renamed from: B  reason: collision with root package name */
        public final Multiset f28460B;
        public final Predicate C;

        public int L0(Object obj) {
            int L0 = this.f28460B.L0(obj);
            if (L0 <= 0) {
                return 0;
            }
            if (this.C.apply(obj)) {
                return L0;
            }
            return 0;
        }

        public int N(Object obj, int i2) {
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0) {
                return L0(obj);
            }
            if (contains(obj)) {
                return this.f28460B.N(obj, i2);
            }
            return 0;
        }

        public int T(Object obj, int i2) {
            Preconditions.l(this.C.apply(obj), "Element %s does not match predicate %s", obj, this.C);
            return this.f28460B.T(obj, i2);
        }

        public Set e() {
            return Sets.d(this.f28460B.k(), this.C);
        }

        public Set g() {
            return Sets.d(this.f28460B.entrySet(), new Predicate<Multiset.Entry<E>>() {
                /* renamed from: a */
                public boolean apply(Multiset.Entry entry) {
                    return FilteredMultiset.this.C.apply(entry.a());
                }
            });
        }

        public Iterator i() {
            throw new AssertionError("should never be called");
        }

        public Iterator m() {
            throw new AssertionError("should never be called");
        }

        /* renamed from: n */
        public UnmodifiableIterator iterator() {
            return Iterators.p(this.f28460B.iterator(), this.C);
        }
    }

    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f28462A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28463z;

        public ImmutableEntry(Object obj, int i2) {
            this.f28463z = obj;
            this.f28462A = i2;
            CollectPreconditions.b(i2, "count");
        }

        public final Object a() {
            return this.f28463z;
        }

        public final int getCount() {
            return this.f28462A;
        }
    }

    public static final class MultisetIteratorImpl<E> implements Iterator<E> {

        /* renamed from: A  reason: collision with root package name */
        public final Iterator f28464A;

        /* renamed from: B  reason: collision with root package name */
        public Multiset.Entry f28465B;
        public int C;
        public int D;
        public boolean E;

        /* renamed from: z  reason: collision with root package name */
        public final Multiset f28466z;

        public MultisetIteratorImpl(Multiset multiset, Iterator it) {
            this.f28466z = multiset;
            this.f28464A = it;
        }

        public boolean hasNext() {
            return this.C > 0 || this.f28464A.hasNext();
        }

        public Object next() {
            if (hasNext()) {
                if (this.C == 0) {
                    Multiset.Entry entry = (Multiset.Entry) this.f28464A.next();
                    this.f28465B = entry;
                    int count = entry.getCount();
                    this.C = count;
                    this.D = count;
                }
                this.C--;
                this.E = true;
                Multiset.Entry entry2 = this.f28465B;
                java.util.Objects.requireNonNull(entry2);
                return entry2.a();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            CollectPreconditions.e(this.E);
            if (this.D == 1) {
                this.f28464A.remove();
            } else {
                Multiset multiset = this.f28466z;
                Multiset.Entry entry = this.f28465B;
                java.util.Objects.requireNonNull(entry);
                multiset.remove(entry.a());
            }
            this.D--;
            this.E = false;
        }
    }

    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public transient Set f28467A;

        /* renamed from: B  reason: collision with root package name */
        public transient Set f28468B;

        /* renamed from: z  reason: collision with root package name */
        public final Multiset f28469z;

        public UnmodifiableMultiset(Multiset multiset) {
            this.f28469z = multiset;
        }

        public int N(Object obj, int i2) {
            throw new UnsupportedOperationException();
        }

        public int T(Object obj, int i2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: Z */
        public Multiset Q() {
            return this.f28469z;
        }

        public Set a0() {
            return Collections.unmodifiableSet(this.f28469z.k());
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set entrySet() {
            Set set = this.f28468B;
            if (set != null) {
                return set;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.f28469z.entrySet());
            this.f28468B = unmodifiableSet;
            return unmodifiableSet;
        }

        public Iterator iterator() {
            return Iterators.K(this.f28469z.iterator());
        }

        public Set k() {
            Set set = this.f28467A;
            if (set != null) {
                return set;
            }
            Set a0 = a0();
            this.f28467A = a0;
            return a0;
        }

        public int n0(Object obj, int i2) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean t0(Object obj, int i2, int i3) {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        public void clear() {
            k().clear();
        }

        public int h() {
            return k().size();
        }

        public Iterator iterator() {
            return Multisets.i(this);
        }

        public int size() {
            return Multisets.j(this);
        }
    }

    public static boolean a(Multiset multiset, AbstractMapBasedMultiset abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.n(multiset);
        return true;
    }

    public static boolean b(Multiset multiset, Multiset multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return a(multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry entry : multiset2.entrySet()) {
            multiset.T(entry.a(), entry.getCount());
        }
        return true;
    }

    public static boolean c(Multiset multiset, Collection collection) {
        Preconditions.q(multiset);
        Preconditions.q(collection);
        if (collection instanceof Multiset) {
            return b(multiset, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a(multiset, collection.iterator());
    }

    public static Multiset d(Iterable iterable) {
        return (Multiset) iterable;
    }

    public static Iterator e(Iterator it) {
        return new TransformedIterator<Multiset.Entry<Object>, Object>(it) {
            /* renamed from: c */
            public Object b(Multiset.Entry entry) {
                return entry.a();
            }
        };
    }

    public static boolean f(Multiset multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.L0(entry.a()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static Multiset.Entry g(Object obj, int i2) {
        return new ImmutableEntry(obj, i2);
    }

    public static int h(Iterable iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).k().size();
        }
        return 11;
    }

    public static Iterator i(Multiset multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    public static int j(Multiset multiset) {
        long j2 = 0;
        for (Multiset.Entry count : multiset.entrySet()) {
            j2 += (long) count.getCount();
        }
        return Ints.k(j2);
    }

    public static boolean k(Multiset multiset, Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        return multiset.k().removeAll(collection);
    }

    public static boolean l(Multiset multiset, Collection collection) {
        Preconditions.q(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        return multiset.k().retainAll(collection);
    }

    public static int m(Multiset multiset, Object obj, int i2) {
        CollectPreconditions.b(i2, "count");
        int L0 = multiset.L0(obj);
        int i3 = i2 - L0;
        if (i3 > 0) {
            multiset.T(obj, i3);
        } else if (i3 < 0) {
            multiset.N(obj, -i3);
        }
        return L0;
    }

    public static boolean n(Multiset multiset, Object obj, int i2, int i3) {
        CollectPreconditions.b(i2, "oldCount");
        CollectPreconditions.b(i3, "newCount");
        if (multiset.L0(obj) != i2) {
            return false;
        }
        multiset.n0(obj, i3);
        return true;
    }

    public static SortedMultiset o(SortedMultiset sortedMultiset) {
        return new UnmodifiableSortedMultiset((SortedMultiset) Preconditions.q(sortedMultiset));
    }
}
