package com.google.android.gms.maps.model;

public final class Gap extends PatternItem {

    /* renamed from: B  reason: collision with root package name */
    public final float f26010B;

    public String toString() {
        float f2 = this.f26010B;
        StringBuilder sb = new StringBuilder(29);
        sb.append("[Gap: length=");
        sb.append(f2);
        sb.append("]");
        return sb.toString();
    }
}
