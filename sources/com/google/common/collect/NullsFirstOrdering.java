package com.google.common.collect;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Ordering f28476z;

    public NullsFirstOrdering(Ordering ordering) {
        this.f28476z = ordering;
    }

    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.f28476z.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.f28476z.equals(((NullsFirstOrdering) obj).f28476z);
        }
        return false;
    }

    public Ordering f() {
        return this;
    }

    public Ordering g() {
        return this.f28476z.g();
    }

    public int hashCode() {
        return this.f28476z.hashCode() ^ 957692532;
    }

    public Ordering j() {
        return this.f28476z.j().g();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28476z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append(valueOf);
        sb.append(".nullsFirst()");
        return sb.toString();
    }
}
