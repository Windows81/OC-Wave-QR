package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultSelectableChipColors implements SelectableChipColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7606a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7607b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7608c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7609d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7610e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7611f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7612g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7613h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7614i;

    public /* synthetic */ DefaultSelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    public State b(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(189838188);
        if (ComposerKt.P()) {
            ComposerKt.Y(189838188, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:660)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7611f : !z3 ? this.f7608c : this.f7614i), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State c(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(-403836585);
        if (ComposerKt.P()) {
            ComposerKt.Y(-403836585, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:638)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7609d : !z3 ? this.f7606a : this.f7612g), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State d(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(2025240134);
        if (ComposerKt.P()) {
            ComposerKt.Y(2025240134, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:649)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7610e : !z3 ? this.f7607b : this.f7613h), composer, 0);
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
        if (obj == null || DefaultSelectableChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) obj;
        return Color.n(this.f7606a, defaultSelectableChipColors.f7606a) && Color.n(this.f7607b, defaultSelectableChipColors.f7607b) && Color.n(this.f7608c, defaultSelectableChipColors.f7608c) && Color.n(this.f7609d, defaultSelectableChipColors.f7609d) && Color.n(this.f7610e, defaultSelectableChipColors.f7610e) && Color.n(this.f7611f, defaultSelectableChipColors.f7611f) && Color.n(this.f7612g, defaultSelectableChipColors.f7612g) && Color.n(this.f7613h, defaultSelectableChipColors.f7613h) && Color.n(this.f7614i, defaultSelectableChipColors.f7614i);
    }

    public int hashCode() {
        return (((((((((((((((Color.t(this.f7606a) * 31) + Color.t(this.f7607b)) * 31) + Color.t(this.f7608c)) * 31) + Color.t(this.f7609d)) * 31) + Color.t(this.f7610e)) * 31) + Color.t(this.f7611f)) * 31) + Color.t(this.f7612g)) * 31) + Color.t(this.f7613h)) * 31) + Color.t(this.f7614i);
    }

    public DefaultSelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f7606a = j2;
        this.f7607b = j3;
        this.f7608c = j4;
        this.f7609d = j5;
        this.f7610e = j6;
        this.f7611f = j7;
        this.f7612g = j8;
        this.f7613h = j9;
        this.f7614i = j10;
    }
}
