package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public static final RegularImmutableSortedSet E = new RegularImmutableSortedSet(ImmutableList.D(), Ordering.e());
    public final transient ImmutableList D;

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.D = immutableList;
    }

    public ImmutableSortedSet P() {
        Comparator reverseOrder = Collections.reverseOrder(this.f28217B);
        return isEmpty() ? ImmutableSortedSet.S(reverseOrder) : new RegularImmutableSortedSet(this.D.K(), reverseOrder);
    }

    /* renamed from: Q */
    public UnmodifiableIterator descendingIterator() {
        return this.D.K().iterator();
    }

    public ImmutableSortedSet W(Object obj, boolean z2) {
        return j0(0, k0(obj, z2));
    }

    public ImmutableSortedSet a0(Object obj, boolean z2, Object obj2, boolean z3) {
        return f0(obj, z2).W(obj2, z3);
    }

    public Object ceiling(Object obj) {
        int l0 = l0(obj, true);
        if (l0 == size()) {
            return null;
        }
        return this.D.get(l0);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        if (!SortedIterables.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator o2 = iterator();
        Iterator it = collection.iterator();
        if (!o2.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = o2.next();
        while (true) {
            try {
                int h0 = h0(next2, next);
                if (h0 < 0) {
                    if (!o2.hasNext()) {
                        return false;
                    }
                    next2 = o2.next();
                } else if (h0 == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (h0 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public ImmutableList e() {
        return this.D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator r1 = r5.f28217B
            boolean r1 = com.google.common.collect.SortedIterables.b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.UnmodifiableIterator r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.h0(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedSet.equals(java.lang.Object):boolean");
    }

    public ImmutableSortedSet f0(Object obj, boolean z2) {
        return j0(l0(obj, z2), size());
    }

    public Object first() {
        if (!isEmpty()) {
            return this.D.get(0);
        }
        throw new NoSuchElementException();
    }

    public Object floor(Object obj) {
        int k0 = k0(obj, true) - 1;
        if (k0 == -1) {
            return null;
        }
        return this.D.get(k0);
    }

    public int g(Object[] objArr, int i2) {
        return this.D.g(objArr, i2);
    }

    public Object[] h() {
        return this.D.h();
    }

    public Object higher(Object obj) {
        int l0 = l0(obj, false);
        if (l0 == size()) {
            return null;
        }
        return this.D.get(l0);
    }

    public int i() {
        return this.D.i();
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.D, obj, p0());
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public RegularImmutableSortedSet j0(int i2, int i3) {
        return (i2 == 0 && i3 == size()) ? this : i2 < i3 ? new RegularImmutableSortedSet(this.D.subList(i2, i3), this.f28217B) : ImmutableSortedSet.S(this.f28217B);
    }

    public int k0(Object obj, boolean z2) {
        int binarySearch = Collections.binarySearch(this.D, Preconditions.q(obj), comparator());
        return binarySearch >= 0 ? z2 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public int l0(Object obj, boolean z2) {
        int binarySearch = Collections.binarySearch(this.D, Preconditions.q(obj), comparator());
        return binarySearch >= 0 ? z2 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public Object last() {
        if (!isEmpty()) {
            return this.D.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public Object lower(Object obj) {
        int k0 = k0(obj, false) - 1;
        if (k0 == -1) {
            return null;
        }
        return this.D.get(k0);
    }

    public int m() {
        return this.D.m();
    }

    public final int m0(Object obj) {
        return Collections.binarySearch(this.D, obj, p0());
    }

    public boolean n() {
        return this.D.n();
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return this.D.iterator();
    }

    public Comparator p0() {
        return this.f28217B;
    }

    public int size() {
        return this.D.size();
    }
}
