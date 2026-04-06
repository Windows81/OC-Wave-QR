package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AnimationVector4D extends AnimationVector {

    /* renamed from: a  reason: collision with root package name */
    public float f2484a;

    /* renamed from: b  reason: collision with root package name */
    public float f2485b;

    /* renamed from: c  reason: collision with root package name */
    public float f2486c;

    /* renamed from: d  reason: collision with root package name */
    public float f2487d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2488e = 4;

    public AnimationVector4D(float f2, float f3, float f4, float f5) {
        super((DefaultConstructorMarker) null);
        this.f2484a = f2;
        this.f2485b = f3;
        this.f2486c = f4;
        this.f2487d = f5;
    }

    public float a(int i2) {
        if (i2 == 0) {
            return this.f2484a;
        }
        if (i2 == 1) {
            return this.f2485b;
        }
        if (i2 == 2) {
            return this.f2486c;
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return this.f2487d;
    }

    public int b() {
        return this.f2488e;
    }

    public void d() {
        this.f2484a = 0.0f;
        this.f2485b = 0.0f;
        this.f2486c = 0.0f;
        this.f2487d = 0.0f;
    }

    public void e(int i2, float f2) {
        if (i2 == 0) {
            this.f2484a = f2;
        } else if (i2 == 1) {
            this.f2485b = f2;
        } else if (i2 == 2) {
            this.f2486c = f2;
        } else if (i2 == 3) {
            this.f2487d = f2;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            return animationVector4D.f2484a == this.f2484a && animationVector4D.f2485b == this.f2485b && animationVector4D.f2486c == this.f2486c && animationVector4D.f2487d == this.f2487d;
        }
    }

    public final float f() {
        return this.f2484a;
    }

    public final float g() {
        return this.f2485b;
    }

    public final float h() {
        return this.f2486c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f2484a) * 31) + Float.hashCode(this.f2485b)) * 31) + Float.hashCode(this.f2486c)) * 31) + Float.hashCode(this.f2487d);
    }

    public final float i() {
        return this.f2487d;
    }

    /* renamed from: j */
    public AnimationVector4D c() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f2484a + ", v2 = " + this.f2485b + ", v3 = " + this.f2486c + ", v4 = " + this.f2487d;
    }
}
