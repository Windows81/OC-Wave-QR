package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultSwitchColors implements SwitchColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7625a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7626b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7627c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7628d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7629e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7630f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7631g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7632h;

    public /* synthetic */ DefaultSwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9);
    }

    public State a(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(-1176343362);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1176343362, i2, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:379)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? z3 ? this.f7626b : this.f7628d : z3 ? this.f7630f : this.f7632h), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State b(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(-66424183);
        if (ComposerKt.P()) {
            ComposerKt.Y(-66424183, i2, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:368)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? z3 ? this.f7625a : this.f7627c : z3 ? this.f7629e : this.f7631g), composer, 0);
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
        if (obj == null || DefaultSwitchColors.class != obj.getClass()) {
            return false;
        }
        DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) obj;
        return Color.n(this.f7625a, defaultSwitchColors.f7625a) && Color.n(this.f7626b, defaultSwitchColors.f7626b) && Color.n(this.f7627c, defaultSwitchColors.f7627c) && Color.n(this.f7628d, defaultSwitchColors.f7628d) && Color.n(this.f7629e, defaultSwitchColors.f7629e) && Color.n(this.f7630f, defaultSwitchColors.f7630f) && Color.n(this.f7631g, defaultSwitchColors.f7631g) && Color.n(this.f7632h, defaultSwitchColors.f7632h);
    }

    public int hashCode() {
        return (((((((((((((Color.t(this.f7625a) * 31) + Color.t(this.f7626b)) * 31) + Color.t(this.f7627c)) * 31) + Color.t(this.f7628d)) * 31) + Color.t(this.f7629e)) * 31) + Color.t(this.f7630f)) * 31) + Color.t(this.f7631g)) * 31) + Color.t(this.f7632h);
    }

    public DefaultSwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f7625a = j2;
        this.f7626b = j3;
        this.f7627c = j4;
        this.f7628d = j5;
        this.f7629e = j6;
        this.f7630f = j7;
        this.f7631g = j8;
        this.f7632h = j9;
    }
}
