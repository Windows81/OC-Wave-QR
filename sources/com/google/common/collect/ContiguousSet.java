package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public final DiscreteDomain D;

    public ContiguousSet(DiscreteDomain discreteDomain) {
        super(Ordering.e());
        this.D = discreteDomain;
    }

    public static ContiguousSet j0(Range range, DiscreteDomain discreteDomain) {
        Preconditions.q(range);
        Preconditions.q(discreteDomain);
        try {
            Range n2 = !range.l() ? range.n(Range.c(discreteDomain.c())) : range;
            if (!range.m()) {
                n2 = n2.n(Range.d(discreteDomain.b()));
            }
            if (!n2.p()) {
                Comparable t2 = range.f28498z.t(discreteDomain);
                Objects.requireNonNull(t2);
                Comparable p2 = range.f28497A.p(discreteDomain);
                Objects.requireNonNull(p2);
                if (Range.f(t2, p2) <= 0) {
                    return new RegularContiguousSet(n2, discreteDomain);
                }
            }
            return new EmptyContiguousSet(discreteDomain);
        } catch (NoSuchElementException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public ImmutableSortedSet P() {
        return new DescendingImmutableSortedSet(this);
    }

    /* renamed from: k0 */
    public ContiguousSet headSet(Comparable comparable) {
        return W((Comparable) Preconditions.q(comparable), false);
    }

    /* renamed from: l0 */
    public ContiguousSet headSet(Comparable comparable, boolean z2) {
        return W((Comparable) Preconditions.q(comparable), z2);
    }

    /* renamed from: m0 */
    public abstract ContiguousSet W(Comparable comparable, boolean z2);

    public abstract Range p0();

    /* renamed from: q0 */
    public ContiguousSet subSet(Comparable comparable, Comparable comparable2) {
        Preconditions.q(comparable);
        Preconditions.q(comparable2);
        Preconditions.d(comparator().compare(comparable, comparable2) <= 0);
        return a0(comparable, true, comparable2, false);
    }

    /* renamed from: r0 */
    public ContiguousSet subSet(Comparable comparable, boolean z2, Comparable comparable2, boolean z3) {
        Preconditions.q(comparable);
        Preconditions.q(comparable2);
        Preconditions.d(comparator().compare(comparable, comparable2) <= 0);
        return a0(comparable, z2, comparable2, z3);
    }

    public String toString() {
        return p0().toString();
    }

    /* renamed from: u0 */
    public abstract ContiguousSet a0(Comparable comparable, boolean z2, Comparable comparable2, boolean z3);

    /* renamed from: v0 */
    public ContiguousSet tailSet(Comparable comparable) {
        return f0((Comparable) Preconditions.q(comparable), true);
    }

    /* renamed from: x0 */
    public ContiguousSet tailSet(Comparable comparable, boolean z2) {
        return f0((Comparable) Preconditions.q(comparable), z2);
    }

    /* renamed from: y0 */
    public abstract ContiguousSet f0(Comparable comparable, boolean z2);
}
