package com.google.zxing;

public class ResultPoint {

    /* renamed from: a  reason: collision with root package name */
    public final float f32471a;

    /* renamed from: b  reason: collision with root package name */
    public final float f32472b;

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            return this.f32471a == resultPoint.f32471a && this.f32472b == resultPoint.f32472b;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f32471a) * 31) + Float.floatToIntBits(this.f32472b);
    }

    public final String toString() {
        return "(" + this.f32471a + ',' + this.f32472b + ')';
    }
}
