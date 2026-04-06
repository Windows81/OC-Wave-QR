package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final ReverseNaturalOrdering f28518z = new ReverseNaturalOrdering();

    public Ordering j() {
        return Ordering.e();
    }

    /* renamed from: k */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.q(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: l */
    public Comparable c(Comparable comparable, Comparable comparable2) {
        return (Comparable) NaturalOrdering.f28473B.d(comparable, comparable2);
    }

    /* renamed from: m */
    public Comparable d(Comparable comparable, Comparable comparable2) {
        return (Comparable) NaturalOrdering.f28473B.c(comparable, comparable2);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
