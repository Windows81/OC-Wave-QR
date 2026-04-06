package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class IconToggleButtonColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10131a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10132b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10133c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10134d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10135e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10136f;

    public /* synthetic */ IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public static /* synthetic */ IconToggleButtonColors d(IconToggleButtonColors iconToggleButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        IconToggleButtonColors iconToggleButtonColors2 = iconToggleButtonColors;
        return iconToggleButtonColors.c((i2 & 1) != 0 ? iconToggleButtonColors2.f10131a : j2, (i2 & 2) != 0 ? iconToggleButtonColors2.f10132b : j3, (i2 & 4) != 0 ? iconToggleButtonColors2.f10133c : j4, (i2 & 8) != 0 ? iconToggleButtonColors2.f10134d : j5, (i2 & 16) != 0 ? iconToggleButtonColors2.f10135e : j6, (i2 & 32) != 0 ? iconToggleButtonColors2.f10136f : j7);
    }

    public final State a(boolean z2, boolean z3, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1175394478, i2, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:882)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f10133c : !z3 ? this.f10131a : this.f10135e), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return p2;
    }

    public final State b(boolean z2, boolean z3, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1340854054, i2, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:899)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f10134d : !z3 ? this.f10132b : this.f10136f), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return p2;
    }

    public final IconToggleButtonColors c(long j2, long j3, long j4, long j5, long j6, long j7) {
        return new IconToggleButtonColors(j2 != 16 ? j2 : this.f10131a, j3 != 16 ? j3 : this.f10132b, j4 != 16 ? j4 : this.f10133c, j5 != 16 ? j5 : this.f10134d, j6 != 16 ? j6 : this.f10135e, j7 != 16 ? j7 : this.f10136f, (DefaultConstructorMarker) null);
    }

    public final long e() {
        return this.f10132b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        return Color.n(this.f10131a, iconToggleButtonColors.f10131a) && Color.n(this.f10132b, iconToggleButtonColors.f10132b) && Color.n(this.f10133c, iconToggleButtonColors.f10133c) && Color.n(this.f10134d, iconToggleButtonColors.f10134d) && Color.n(this.f10135e, iconToggleButtonColors.f10135e) && Color.n(this.f10136f, iconToggleButtonColors.f10136f);
    }

    public int hashCode() {
        return (((((((((Color.t(this.f10131a) * 31) + Color.t(this.f10132b)) * 31) + Color.t(this.f10133c)) * 31) + Color.t(this.f10134d)) * 31) + Color.t(this.f10135e)) * 31) + Color.t(this.f10136f);
    }

    public IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f10131a = j2;
        this.f10132b = j3;
        this.f10133c = j4;
        this.f10134d = j5;
        this.f10135e = j6;
        this.f10136f = j7;
    }
}
