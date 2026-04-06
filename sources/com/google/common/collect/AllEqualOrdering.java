package com.google.common.collect;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class AllEqualOrdering extends Ordering<Object> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final AllEqualOrdering f27998z = new AllEqualOrdering();

    public ImmutableList b(Iterable iterable) {
        return ImmutableList.v(iterable);
    }

    public int compare(Object obj, Object obj2) {
        return 0;
    }

    public Ordering j() {
        return this;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
