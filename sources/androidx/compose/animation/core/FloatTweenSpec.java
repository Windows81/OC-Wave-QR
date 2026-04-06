package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class FloatTweenSpec implements FloatAnimationSpec {

    /* renamed from: a  reason: collision with root package name */
    public final int f2574a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2575b;

    /* renamed from: c  reason: collision with root package name */
    public final Easing f2576c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2577d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2578e;

    public FloatTweenSpec(int i2, int i3, Easing easing) {
        this.f2574a = i2;
        this.f2575b = i3;
        this.f2576c = easing;
        this.f2577d = ((long) i2) * 1000000;
        this.f2578e = ((long) i3) * 1000000;
    }

    public float b(long j2, float f2, float f3, float f4) {
        long j3 = j2 - this.f2578e;
        long j4 = this.f2577d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j5 = j3 > j4 ? j4 : j3;
        if (j5 == 0) {
            return f4;
        }
        float f5 = f2;
        float f6 = f3;
        float f7 = f4;
        return (e(j5, f5, f6, f7) - e(j5 - 1000000, f5, f6, f7)) * 1000.0f;
    }

    public long c(float f2, float f3, float f4) {
        return this.f2578e + this.f2577d;
    }

    public float e(long j2, float f2, float f3, float f4) {
        long j3 = j2 - this.f2578e;
        long j4 = this.f2577d;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > j4) {
            j3 = j4;
        }
        float a2 = this.f2576c.a(this.f2574a == 0 ? 1.0f : ((float) j3) / ((float) j4));
        return (f2 * (((float) 1) - a2)) + (f3 * a2);
    }
}
