package com.google.android.gms.common.images;

public final class Size {

    /* renamed from: a  reason: collision with root package name */
    public final int f24814a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24815b;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.f24814a == size.f24814a && this.f24815b == size.f24815b;
        }
    }

    public int hashCode() {
        int i2 = this.f24814a;
        return ((i2 >>> 16) | (i2 << 16)) ^ this.f24815b;
    }

    public String toString() {
        return this.f24814a + "x" + this.f24815b;
    }
}
