package com.google.common.collect;

import com.google.common.collect.Ordering;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final ImmutableMap f28090z;

    public int compare(Object obj, Object obj2) {
        return k(obj) - k(obj2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExplicitOrdering) {
            return this.f28090z.equals(((ExplicitOrdering) obj).f28090z);
        }
        return false;
    }

    public int hashCode() {
        return this.f28090z.hashCode();
    }

    public final int k(Object obj) {
        Integer num = (Integer) this.f28090z.get(obj);
        if (num != null) {
            return num.intValue();
        }
        throw new Ordering.IncomparableValueException(obj);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28090z.keySet());
        StringBuilder sb = new StringBuilder(valueOf.length() + 19);
        sb.append("Ordering.explicit(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
