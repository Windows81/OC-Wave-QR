package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
public final class Iterators {

    /* renamed from: com.google.common.collect.Iterators$10  reason: invalid class name */
    class AnonymousClass10 extends UnmodifiableIterator<Object> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Enumeration f28242z;

        public boolean hasNext() {
            return this.f28242z.hasMoreElements();
        }

        public Object next() {
            return this.f28242z.nextElement();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$11  reason: invalid class name */
    class AnonymousClass11 implements Enumeration<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f28243a;

        public boolean hasMoreElements() {
            return this.f28243a.hasNext();
        }

        public Object nextElement() {
            return this.f28243a.next();
        }
    }

    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        public static final UnmodifiableListIterator D = new ArrayItr(new Object[0], 0, 0, 0);

        /* renamed from: B  reason: collision with root package name */
        public final Object[] f28259B;
        public final int C;

        public ArrayItr(Object[] objArr, int i2, int i3, int i4) {
            super(i3, i4);
            this.f28259B = objArr;
            this.C = i2;
        }

        public Object b(int i2) {
            return this.f28259B[this.C + i2];
        }
    }

    public static class ConcatenatedIterator<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public Iterator f28260A = Iterators.m();

        /* renamed from: B  reason: collision with root package name */
        public Iterator f28261B;
        public Deque C;

        /* renamed from: z  reason: collision with root package name */
        public Iterator f28262z;

        public ConcatenatedIterator(Iterator it) {
            this.f28261B = (Iterator) Preconditions.q(it);
        }

        public final Iterator b() {
            while (true) {
                Iterator it = this.f28261B;
                if (it != null && it.hasNext()) {
                    return this.f28261B;
                }
                Deque deque = this.C;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f28261B = (Iterator) this.C.removeFirst();
            }
        }

        public boolean hasNext() {
            while (!((Iterator) Preconditions.q(this.f28260A)).hasNext()) {
                Iterator b2 = b();
                this.f28261B = b2;
                if (b2 == null) {
                    return false;
                }
                Iterator it = (Iterator) b2.next();
                this.f28260A = it;
                if (it instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) it;
                    this.f28260A = concatenatedIterator.f28260A;
                    if (this.C == null) {
                        this.C = new ArrayDeque();
                    }
                    this.C.addFirst(this.f28261B);
                    if (concatenatedIterator.C != null) {
                        while (!concatenatedIterator.C.isEmpty()) {
                            this.C.addFirst((Iterator) concatenatedIterator.C.removeLast());
                        }
                    }
                    this.f28261B = concatenatedIterator.f28261B;
                }
            }
            return true;
        }

        public Object next() {
            if (hasNext()) {
                Iterator it = this.f28260A;
                this.f28262z = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            Iterator it = this.f28262z;
            if (it != null) {
                it.remove();
                this.f28262z = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            CollectPreconditions.e(false);
        }
    }

    public static class MergingIterator<T> extends UnmodifiableIterator<T> {

        /* renamed from: z  reason: collision with root package name */
        public final Queue f28265z;

        public MergingIterator(Iterable iterable, Comparator comparator) {
            this.f28265z = new PriorityQueue(2, new b(comparator));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Iterator it2 = (Iterator) it.next();
                if (it2.hasNext()) {
                    this.f28265z.add(Iterators.B(it2));
                }
            }
        }

        public boolean hasNext() {
            return !this.f28265z.isEmpty();
        }

        public Object next() {
            PeekingIterator peekingIterator = (PeekingIterator) this.f28265z.remove();
            Object next = peekingIterator.next();
            if (peekingIterator.hasNext()) {
                this.f28265z.add(peekingIterator);
            }
            return next;
        }
    }

    public static class PeekingImpl<E> implements PeekingIterator<E> {

        /* renamed from: A  reason: collision with root package name */
        public boolean f28266A;

        /* renamed from: B  reason: collision with root package name */
        public Object f28267B;

        /* renamed from: z  reason: collision with root package name */
        public final Iterator f28268z;

        public PeekingImpl(Iterator it) {
            this.f28268z = (Iterator) Preconditions.q(it);
        }

        public boolean hasNext() {
            return this.f28266A || this.f28268z.hasNext();
        }

        public Object next() {
            if (!this.f28266A) {
                return this.f28268z.next();
            }
            Object a2 = NullnessCasts.a(this.f28267B);
            this.f28266A = false;
            this.f28267B = null;
            return a2;
        }

        public Object peek() {
            if (!this.f28266A) {
                this.f28267B = this.f28268z.next();
                this.f28266A = true;
            }
            return NullnessCasts.a(this.f28267B);
        }

        public void remove() {
            Preconditions.x(!this.f28266A, "Can't remove after you've peeked at next");
            this.f28268z.remove();
        }
    }

    public static UnmodifiableIterator A(final Iterator it, final int i2, final boolean z2) {
        Preconditions.q(it);
        Preconditions.d(i2 > 0);
        return new UnmodifiableIterator<List<Object>>() {
            /* renamed from: b */
            public List next() {
                if (hasNext()) {
                    Object[] objArr = new Object[i2];
                    int i2 = 0;
                    while (i2 < i2 && it.hasNext()) {
                        objArr[i2] = it.next();
                        i2++;
                    }
                    for (int i3 = i2; i3 < i2; i3++) {
                        objArr[i3] = null;
                    }
                    List unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                    return (z2 || i2 == i2) ? unmodifiableList : unmodifiableList.subList(0, i2);
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return it.hasNext();
            }
        };
    }

    public static PeekingIterator B(Iterator it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    public static Object C(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean D(Iterator it, Collection collection) {
        Preconditions.q(collection);
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean E(Iterator it, Predicate predicate) {
        Preconditions.q(predicate);
        boolean z2 = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean F(Iterator it, Collection collection) {
        Preconditions.q(collection);
        boolean z2 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static UnmodifiableIterator G(final Object obj) {
        return new UnmodifiableIterator<Object>() {

            /* renamed from: z  reason: collision with root package name */
            public boolean f28258z;

            public boolean hasNext() {
                return !this.f28258z;
            }

            public Object next() {
                if (!this.f28258z) {
                    this.f28258z = true;
                    return obj;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public static int H(Iterator it) {
        long j2 = 0;
        while (it.hasNext()) {
            it.next();
            j2++;
        }
        return Ints.k(j2);
    }

    public static String I(Iterator it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z2 = true;
        while (it.hasNext()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(it.next());
            z2 = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static Iterator J(Iterator it, final Function function) {
        Preconditions.q(function);
        return new TransformedIterator<Object, Object>(it) {
            public Object b(Object obj) {
                return function.apply(obj);
            }
        };
    }

    public static UnmodifiableIterator K(final Iterator it) {
        Preconditions.q(it);
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator<Object>() {
            public boolean hasNext() {
                return it.hasNext();
            }

            public Object next() {
                return it.next();
            }
        };
    }

    public static boolean a(Collection collection, Iterator it) {
        Preconditions.q(collection);
        Preconditions.q(it);
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= collection.add(it.next());
        }
        return z2;
    }

    public static int b(Iterator it, int i2) {
        Preconditions.q(it);
        int i3 = 0;
        Preconditions.e(i2 >= 0, "numberToAdvance must be nonnegative");
        while (i3 < i2 && it.hasNext()) {
            it.next();
            i3++;
        }
        return i3;
    }

    public static boolean c(Iterator it, Predicate predicate) {
        return v(it, predicate) != -1;
    }

    public static ListIterator d(Iterator it) {
        return (ListIterator) it;
    }

    public static void e(Iterator it) {
        Preconditions.q(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Iterator f(Iterator it) {
        return new ConcatenatedIterator(it);
    }

    public static Iterator g(Iterator it, Iterator it2) {
        Preconditions.q(it);
        Preconditions.q(it2);
        return f(h(it, it2));
    }

    public static Iterator h(final Iterator... itArr) {
        return new UnmodifiableIterator<Iterator<?>>() {

            /* renamed from: z  reason: collision with root package name */
            public int f28247z = 0;

            /* renamed from: b */
            public Iterator next() {
                if (hasNext()) {
                    Iterator it = itArr[this.f28247z];
                    Objects.requireNonNull(it);
                    Iterator it2 = it;
                    Iterator[] itArr = itArr;
                    int i2 = this.f28247z;
                    itArr[i2] = null;
                    this.f28247z = i2 + 1;
                    return it2;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return this.f28247z < itArr.length;
            }
        };
    }

    public static Iterator i(final Iterator it) {
        Preconditions.q(it);
        return new UnmodifiableIterator<Object>() {
            public boolean hasNext() {
                return it.hasNext();
            }

            public Object next() {
                Object next = it.next();
                it.remove();
                return next;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    public static boolean j(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static Iterator k(final Iterable iterable) {
        Preconditions.q(iterable);
        return new Iterator<Object>() {

            /* renamed from: z  reason: collision with root package name */
            public Iterator f28245z = Iterators.o();

            public boolean hasNext() {
                return this.f28245z.hasNext() || iterable.iterator().hasNext();
            }

            public Object next() {
                if (!this.f28245z.hasNext()) {
                    Iterator it = iterable.iterator();
                    this.f28245z = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.f28245z.next();
            }

            public void remove() {
                this.f28245z.remove();
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.Objects.a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Iterators.l(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static UnmodifiableIterator m() {
        return n();
    }

    public static UnmodifiableListIterator n() {
        return ArrayItr.D;
    }

    public static Iterator o() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static UnmodifiableIterator p(final Iterator it, final Predicate predicate) {
        Preconditions.q(it);
        Preconditions.q(predicate);
        return new AbstractIterator<Object>() {
            public Object b() {
                while (it.hasNext()) {
                    Object next = it.next();
                    if (predicate.apply(next)) {
                        return next;
                    }
                }
                return c();
            }
        };
    }

    public static Object q(Iterator it, Predicate predicate) {
        Preconditions.q(it);
        Preconditions.q(predicate);
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object r(Iterator it, Predicate predicate, Object obj) {
        Preconditions.q(it);
        Preconditions.q(predicate);
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return obj;
    }

    public static UnmodifiableIterator s(Object... objArr) {
        return t(objArr, 0, objArr.length, 0);
    }

    public static UnmodifiableListIterator t(Object[] objArr, int i2, int i3, int i4) {
        Preconditions.d(i3 >= 0);
        Preconditions.v(i2, i2 + i3, objArr.length);
        Preconditions.t(i4, i3);
        return i3 == 0 ? n() : new ArrayItr(objArr, i2, i3, i4);
    }

    public static Object u(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static int v(Iterator it, Predicate predicate) {
        Preconditions.r(predicate, "predicate");
        int i2 = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static Iterator w(final Iterator it, final int i2) {
        Preconditions.q(it);
        Preconditions.e(i2 >= 0, "limit is negative");
        return new Iterator<Object>() {

            /* renamed from: z  reason: collision with root package name */
            public int f28255z;

            public boolean hasNext() {
                return this.f28255z < i2 && it.hasNext();
            }

            public Object next() {
                if (hasNext()) {
                    this.f28255z++;
                    return it.next();
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    public static UnmodifiableIterator x(Iterable iterable, Comparator comparator) {
        Preconditions.r(iterable, "iterators");
        Preconditions.r(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
    }

    public static UnmodifiableIterator y(Iterator it, int i2) {
        return A(it, i2, true);
    }

    public static UnmodifiableIterator z(Iterator it, int i2) {
        return A(it, i2, false);
    }
}
