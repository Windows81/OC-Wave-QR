package com.google.common.collect;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class UsingToStringOrdering extends Ordering<Object> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final UsingToStringOrdering f28681z = new UsingToStringOrdering();

    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
