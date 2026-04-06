package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AnimationVector3D extends AnimationVector {

    /* renamed from: a  reason: collision with root package name */
    public float f2480a;

    /* renamed from: b  reason: collision with root package name */
    public float f2481b;

    /* renamed from: c  reason: collision with root package name */
    public float f2482c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2483d = 3;

    public AnimationVector3D(float f2, float f3, float f4) {
        super((DefaultConstructorMarker) null);
        this.f2480a = f2;
        this.f2481b = f3;
        this.f2482c = f4;
    }

    public float a(int i2) {
        if (i2 == 0) {
            return this.f2480a;
        }
        if (i2 == 1) {
            return this.f2481b;
        }
        if (i2 != 2) {
            return 0.0f;
        }
        return this.f2482c;
    }

    public int b() {
        return this.f2483d;
    }

    public void d() {
        this.f2480a = 0.0f;
        this.f2481b = 0.0f;
        this.f2482c = 0.0f;
    }

    public void e(int i2, float f2) {
        if (i2 == 0) {
            this.f2480a = f2;
        } else if (i2 == 1) {
            this.f2481b = f2;
        } else if (i2 == 2) {
            this.f2482c = f2;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector3D) {
            AnimationVector3D animationVector3D = (AnimationVector3D) obj;
            return animationVector3D.f2480a == this.f2480a && animationVector3D.f2481b == this.f2481b && animationVector3D.f2482c == this.f2482c;
        }
    }

    /* renamed from: f */
    public AnimationVector3D c() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f2480a) * 31) + Float.hashCode(this.f2481b)) * 31) + Float.hashCode(this.f2482c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f2480a + ", v2 = " + this.f2481b + ", v3 = " + this.f2482c;
    }
}
