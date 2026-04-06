package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AnimationVector1D extends AnimationVector {

    /* renamed from: a  reason: collision with root package name */
    public float f2475a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2476b = 1;

    public AnimationVector1D(float f2) {
        super((DefaultConstructorMarker) null);
        this.f2475a = f2;
    }

    public float a(int i2) {
        if (i2 == 0) {
            return this.f2475a;
        }
        return 0.0f;
    }

    public int b() {
        return this.f2476b;
    }

    public void d() {
        this.f2475a = 0.0f;
    }

    public void e(int i2, float f2) {
        if (i2 == 0) {
            this.f2475a = f2;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).f2475a == this.f2475a;
    }

    public final float f() {
        return this.f2475a;
    }

    /* renamed from: g */
    public AnimationVector1D c() {
        return new AnimationVector1D(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f2475a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f2475a;
    }
}
