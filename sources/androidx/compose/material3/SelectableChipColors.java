package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class SelectableChipColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10943a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10944b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10945c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10946d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10947e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10948f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10949g;

    /* renamed from: h  reason: collision with root package name */
    public final long f10950h;

    /* renamed from: i  reason: collision with root package name */
    public final long f10951i;

    /* renamed from: j  reason: collision with root package name */
    public final long f10952j;

    /* renamed from: k  reason: collision with root package name */
    public final long f10953k;

    /* renamed from: l  reason: collision with root package name */
    public final long f10954l;

    /* renamed from: m  reason: collision with root package name */
    public final long f10955m;

    public final long a(boolean z2, boolean z3) {
        return !z2 ? this.f10948f : !z3 ? this.f10944b : this.f10953k;
    }

    public final long b(boolean z2, boolean z3) {
        return !z2 ? this.f10949g : !z3 ? this.f10945c : this.f10954l;
    }

    public final long c(boolean z2, boolean z3) {
        return !z2 ? this.f10950h : !z3 ? this.f10946d : this.f10955m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        return Color.n(this.f10943a, selectableChipColors.f10943a) && Color.n(this.f10944b, selectableChipColors.f10944b) && Color.n(this.f10945c, selectableChipColors.f10945c) && Color.n(this.f10946d, selectableChipColors.f10946d) && Color.n(this.f10947e, selectableChipColors.f10947e) && Color.n(this.f10948f, selectableChipColors.f10948f) && Color.n(this.f10949g, selectableChipColors.f10949g) && Color.n(this.f10950h, selectableChipColors.f10950h) && Color.n(this.f10951i, selectableChipColors.f10951i) && Color.n(this.f10952j, selectableChipColors.f10952j) && Color.n(this.f10953k, selectableChipColors.f10953k) && Color.n(this.f10954l, selectableChipColors.f10954l) && Color.n(this.f10955m, selectableChipColors.f10955m);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.t(this.f10943a) * 31) + Color.t(this.f10944b)) * 31) + Color.t(this.f10945c)) * 31) + Color.t(this.f10946d)) * 31) + Color.t(this.f10947e)) * 31) + Color.t(this.f10948f)) * 31) + Color.t(this.f10949g)) * 31) + Color.t(this.f10950h)) * 31) + Color.t(this.f10951i)) * 31) + Color.t(this.f10952j)) * 31) + Color.t(this.f10953k)) * 31) + Color.t(this.f10954l)) * 31) + Color.t(this.f10955m);
    }
}
