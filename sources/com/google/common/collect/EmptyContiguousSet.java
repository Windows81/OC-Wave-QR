package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    public static final class SerializedForm<C extends Comparable> implements Serializable {
    }

    public EmptyContiguousSet(DiscreteDomain discreteDomain) {
        super(discreteDomain);
    }

    /* renamed from: A0 */
    public Comparable last() {
        throw new NoSuchElementException();
    }

    public boolean C() {
        return true;
    }

    public ImmutableSortedSet P() {
        return ImmutableSortedSet.S(Ordering.e().j());
    }

    /* renamed from: Q */
    public UnmodifiableIterator descendingIterator() {
        return Iterators.m();
    }

    public boolean contains(Object obj) {
        return false;
    }

    public ImmutableList e() {
        return ImmutableList.D();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    /* renamed from: m0 */
    public ContiguousSet W(Comparable comparable, boolean z2) {
        return this;
    }

    public boolean n() {
        return false;
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return Iterators.m();
    }

    public Range p0() {
        throw new NoSuchElementException();
    }

    public int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    /* renamed from: u0 */
    public ContiguousSet a0(Comparable comparable, boolean z2, Comparable comparable2, boolean z3) {
        return this;
    }

    /* renamed from: y0 */
    public ContiguousSet f0(Comparable comparable, boolean z2) {
        return this;
    }

    /* renamed from: z0 */
    public Comparable first() {
        throw new NoSuchElementException();
    }
}
