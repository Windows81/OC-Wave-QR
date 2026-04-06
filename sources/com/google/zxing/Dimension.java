package com.google.zxing;

public final class Dimension {

    /* renamed from: a  reason: collision with root package name */
    public final int f32442a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32443b;

    public int a() {
        return this.f32443b;
    }

    public int b() {
        return this.f32442a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            return this.f32442a == dimension.f32442a && this.f32443b == dimension.f32443b;
        }
    }

    public int hashCode() {
        return (this.f32442a * 32713) + this.f32443b;
    }

    public String toString() {
        return this.f32442a + "x" + this.f32443b;
    }
}
