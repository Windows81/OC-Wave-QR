package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SliderColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f11044a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11045b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11046c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11047d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11048e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11049f;

    /* renamed from: g  reason: collision with root package name */
    public final long f11050g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11051h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11052i;

    /* renamed from: j  reason: collision with root package name */
    public final long f11053j;

    public /* synthetic */ SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    public final long a(boolean z2) {
        return z2 ? this.f11044a : this.f11049f;
    }

    public final long b(boolean z2, boolean z3) {
        return z2 ? z3 ? this.f11046c : this.f11048e : z3 ? this.f11051h : this.f11053j;
    }

    public final long c(boolean z2, boolean z3) {
        return z2 ? z3 ? this.f11045b : this.f11047d : z3 ? this.f11050g : this.f11052i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        return Color.n(this.f11044a, sliderColors.f11044a) && Color.n(this.f11045b, sliderColors.f11045b) && Color.n(this.f11046c, sliderColors.f11046c) && Color.n(this.f11047d, sliderColors.f11047d) && Color.n(this.f11048e, sliderColors.f11048e) && Color.n(this.f11049f, sliderColors.f11049f) && Color.n(this.f11050g, sliderColors.f11050g) && Color.n(this.f11051h, sliderColors.f11051h) && Color.n(this.f11052i, sliderColors.f11052i) && Color.n(this.f11053j, sliderColors.f11053j);
    }

    public int hashCode() {
        return (((((((((((((((((Color.t(this.f11044a) * 31) + Color.t(this.f11045b)) * 31) + Color.t(this.f11046c)) * 31) + Color.t(this.f11047d)) * 31) + Color.t(this.f11048e)) * 31) + Color.t(this.f11049f)) * 31) + Color.t(this.f11050g)) * 31) + Color.t(this.f11051h)) * 31) + Color.t(this.f11052i)) * 31) + Color.t(this.f11053j);
    }

    public SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f11044a = j2;
        this.f11045b = j3;
        this.f11046c = j4;
        this.f11047d = j5;
        this.f11048e = j6;
        this.f11049f = j7;
        this.f11050g = j8;
        this.f11051h = j9;
        this.f11052i = j10;
        this.f11053j = j11;
    }
}
