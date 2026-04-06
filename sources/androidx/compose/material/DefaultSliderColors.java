package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultSliderColors implements SliderColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7615a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7616b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7617c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7618d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7619e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7620f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7621g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7622h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7623i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7624j;

    public /* synthetic */ DefaultSliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    public State a(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(1575395620);
        if (ComposerKt.P()) {
            ComposerKt.Y(1575395620, i2, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1193)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? z3 ? this.f7617c : this.f7618d : z3 ? this.f7619e : this.f7620f), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State b(boolean z2, Composer composer, int i2) {
        composer.X(-1733795637);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1733795637, i2, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1188)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7615a : this.f7616b), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State c(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(-1491563694);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1491563694, i2, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1204)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? z3 ? this.f7621g : this.f7622h : z3 ? this.f7623i : this.f7624j), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        return Color.n(this.f7615a, defaultSliderColors.f7615a) && Color.n(this.f7616b, defaultSliderColors.f7616b) && Color.n(this.f7617c, defaultSliderColors.f7617c) && Color.n(this.f7618d, defaultSliderColors.f7618d) && Color.n(this.f7619e, defaultSliderColors.f7619e) && Color.n(this.f7620f, defaultSliderColors.f7620f) && Color.n(this.f7621g, defaultSliderColors.f7621g) && Color.n(this.f7622h, defaultSliderColors.f7622h) && Color.n(this.f7623i, defaultSliderColors.f7623i) && Color.n(this.f7624j, defaultSliderColors.f7624j);
    }

    public int hashCode() {
        return (((((((((((((((((Color.t(this.f7615a) * 31) + Color.t(this.f7616b)) * 31) + Color.t(this.f7617c)) * 31) + Color.t(this.f7618d)) * 31) + Color.t(this.f7619e)) * 31) + Color.t(this.f7620f)) * 31) + Color.t(this.f7621g)) * 31) + Color.t(this.f7622h)) * 31) + Color.t(this.f7623i)) * 31) + Color.t(this.f7624j);
    }

    public DefaultSliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f7615a = j2;
        this.f7616b = j3;
        this.f7617c = j4;
        this.f7618d = j5;
        this.f7619e = j6;
        this.f7620f = j7;
        this.f7621g = j8;
        this.f7622h = j9;
        this.f7623i = j10;
        this.f7624j = j11;
    }
}
