package com.google.common.collect;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class NullsLastOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Ordering f28477z;

    public NullsLastOrdering(Ordering ordering) {
        this.f28477z = ordering;
    }

    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.f28477z.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsLastOrdering) {
            return this.f28477z.equals(((NullsLastOrdering) obj).f28477z);
        }
        return false;
    }

    public Ordering f() {
        return this.f28477z.f();
    }

    public Ordering g() {
        return this;
    }

    public int hashCode() {
        return this.f28477z.hashCode() ^ -921210296;
    }

    public Ordering j() {
        return this.f28477z.j().f();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28477z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 12);
        sb.append(valueOf);
        sb.append(".nullsLast()");
        return sb.toString();
    }
}
