package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public static final NaturalOrdering f28473B = new NaturalOrdering();

    /* renamed from: A  reason: collision with root package name */
    public transient Ordering f28474A;

    /* renamed from: z  reason: collision with root package name */
    public transient Ordering f28475z;

    public Ordering f() {
        Ordering ordering = this.f28475z;
        if (ordering != null) {
            return ordering;
        }
        Ordering f2 = super.f();
        this.f28475z = f2;
        return f2;
    }

    public Ordering g() {
        Ordering ordering = this.f28474A;
        if (ordering != null) {
            return ordering;
        }
        Ordering g2 = super.g();
        this.f28474A = g2;
        return g2;
    }

    public Ordering j() {
        return ReverseNaturalOrdering.f28518z;
    }

    /* renamed from: k */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.q(comparable);
        Preconditions.q(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
