package com.google.common.collect;

@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public final ImmutableSortedSet D;

    public DescendingImmutableSortedSet(ImmutableSortedSet immutableSortedSet) {
        super(Ordering.a(immutableSortedSet.comparator()).j());
        this.D = immutableSortedSet;
    }

    public ImmutableSortedSet P() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: Q */
    public UnmodifiableIterator descendingIterator() {
        return this.D.iterator();
    }

    /* renamed from: R */
    public ImmutableSortedSet descendingSet() {
        return this.D;
    }

    public ImmutableSortedSet W(Object obj, boolean z2) {
        return this.D.tailSet(obj, z2).descendingSet();
    }

    public ImmutableSortedSet a0(Object obj, boolean z2, Object obj2, boolean z3) {
        return this.D.subSet(obj2, z3, obj, z2).descendingSet();
    }

    public Object ceiling(Object obj) {
        return this.D.floor(obj);
    }

    public boolean contains(Object obj) {
        return this.D.contains(obj);
    }

    public ImmutableSortedSet f0(Object obj, boolean z2) {
        return this.D.headSet(obj, z2).descendingSet();
    }

    public Object floor(Object obj) {
        return this.D.ceiling(obj);
    }

    public Object higher(Object obj) {
        return this.D.lower(obj);
    }

    public Object lower(Object obj) {
        return this.D.higher(obj);
    }

    public boolean n() {
        return this.D.n();
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return this.D.descendingIterator();
    }

    public int size() {
        return this.D.size();
    }
}
