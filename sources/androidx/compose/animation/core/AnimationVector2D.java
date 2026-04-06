package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AnimationVector2D extends AnimationVector {

    /* renamed from: a  reason: collision with root package name */
    public float f2477a;

    /* renamed from: b  reason: collision with root package name */
    public float f2478b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2479c = 2;

    public AnimationVector2D(float f2, float f3) {
        super((DefaultConstructorMarker) null);
        this.f2477a = f2;
        this.f2478b = f3;
    }

    public float a(int i2) {
        if (i2 == 0) {
            return this.f2477a;
        }
        if (i2 != 1) {
            return 0.0f;
        }
        return this.f2478b;
    }

    public int b() {
        return this.f2479c;
    }

    public void d() {
        this.f2477a = 0.0f;
        this.f2478b = 0.0f;
    }

    public void e(int i2, float f2) {
        if (i2 == 0) {
            this.f2477a = f2;
        } else if (i2 == 1) {
            this.f2478b = f2;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector2D) {
            AnimationVector2D animationVector2D = (AnimationVector2D) obj;
            return animationVector2D.f2477a == this.f2477a && animationVector2D.f2478b == this.f2478b;
        }
    }

    public final float f() {
        return this.f2477a;
    }

    public final float g() {
        return this.f2478b;
    }

    /* renamed from: h */
    public AnimationVector2D c() {
        return new AnimationVector2D(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f2477a) * 31) + Float.hashCode(this.f2478b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f2477a + ", v2 = " + this.f2478b;
    }
}
