package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultChipColors implements ChipColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7588a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7589b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7590c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7591d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7592e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7593f;

    public /* synthetic */ DefaultChipColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public State a(boolean z2, Composer composer, int i2) {
        composer.X(-1593588247);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1593588247, i2, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:578)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7588a : this.f7591d), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State b(boolean z2, Composer composer, int i2) {
        composer.X(483145880);
        if (ComposerKt.P()) {
            ComposerKt.Y(483145880, i2, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:583)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7589b : this.f7592e), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State c(boolean z2, Composer composer, int i2) {
        composer.X(1955749013);
        if (ComposerKt.P()) {
            ComposerKt.Y(1955749013, i2, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:588)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7590c : this.f7593f), composer, 0);
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
        if (obj == null || DefaultChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) obj;
        return Color.n(this.f7588a, defaultChipColors.f7588a) && Color.n(this.f7589b, defaultChipColors.f7589b) && Color.n(this.f7590c, defaultChipColors.f7590c) && Color.n(this.f7591d, defaultChipColors.f7591d) && Color.n(this.f7592e, defaultChipColors.f7592e) && Color.n(this.f7593f, defaultChipColors.f7593f);
    }

    public int hashCode() {
        return (((((((((Color.t(this.f7588a) * 31) + Color.t(this.f7589b)) * 31) + Color.t(this.f7590c)) * 31) + Color.t(this.f7591d)) * 31) + Color.t(this.f7592e)) * 31) + Color.t(this.f7593f);
    }

    public DefaultChipColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f7588a = j2;
        this.f7589b = j3;
        this.f7590c = j4;
        this.f7591d = j5;
        this.f7592e = j6;
        this.f7593f = j7;
    }
}
