package com.google.common.collect;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class Count implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public int f28066z;

    public boolean equals(Object obj) {
        return (obj instanceof Count) && ((Count) obj).f28066z == this.f28066z;
    }

    public int hashCode() {
        return this.f28066z;
    }

    public String toString() {
        return Integer.toString(this.f28066z);
    }
}
