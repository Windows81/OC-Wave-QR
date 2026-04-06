package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class ReverseOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Ordering f28519z;

    public ReverseOrdering(Ordering ordering) {
        this.f28519z = (Ordering) Preconditions.q(ordering);
    }

    public Object c(Object obj, Object obj2) {
        return this.f28519z.d(obj, obj2);
    }

    public int compare(Object obj, Object obj2) {
        return this.f28519z.compare(obj2, obj);
    }

    public Object d(Object obj, Object obj2) {
        return this.f28519z.c(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f28519z.equals(((ReverseOrdering) obj).f28519z);
        }
        return false;
    }

    public int hashCode() {
        return -this.f28519z.hashCode();
    }

    public Ordering j() {
        return this.f28519z;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28519z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
