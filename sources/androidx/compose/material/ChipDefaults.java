package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ChipDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ChipDefaults f7470a = new ChipDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f7471b = Dp.m((float) 32);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7472c = Dp.m((float) 1);

    /* renamed from: d  reason: collision with root package name */
    public static final float f7473d = Dp.m((float) 20);

    /* renamed from: e  reason: collision with root package name */
    public static final float f7474e = Dp.m((float) 18);

    public final ChipColors a(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long j9;
        Composer composer2 = composer;
        if ((i3 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f7937a;
            j8 = ColorKt.g(Color.l(materialTheme.a(composer2, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.a(composer2, 6).n());
        } else {
            j8 = j2;
        }
        long l2 = (i3 & 2) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long l3 = (i3 & 4) != 0 ? Color.l(l2, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j4;
        if ((i3 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.f7937a;
            j9 = ColorKt.g(Color.l(materialTheme2.a(composer2, 6).i(), ContentAlpha.f7561a.b(composer2, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme2.a(composer2, 6).n());
        } else {
            j9 = j5;
        }
        long l4 = (i3 & 16) != 0 ? Color.l(l2, ContentAlpha.f7561a.b(composer2, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long l5 = (i3 & 32) != 0 ? Color.l(l3, ContentAlpha.f7561a.b(composer2, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        if (ComposerKt.P()) {
            ComposerKt.Y(1838505436, i2, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:391)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(j8, l2, l3, j9, l4, l5, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultChipColors;
    }

    public final SelectableChipColors b(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i2, int i3) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        Composer composer2 = composer;
        int i4 = i3;
        if ((i4 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f7937a;
            j11 = ColorKt.g(Color.l(materialTheme.a(composer2, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.a(composer2, 6).n());
        } else {
            j11 = j2;
        }
        long l2 = (i4 & 2) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long l3 = (i4 & 4) != 0 ? Color.l(l2, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j4;
        if ((i4 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.f7937a;
            j12 = ColorKt.g(Color.l(materialTheme2.a(composer2, 6).i(), ContentAlpha.f7561a.b(composer2, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme2.a(composer2, 6).n());
        } else {
            j12 = j5;
        }
        long l4 = (i4 & 16) != 0 ? Color.l(l2, ContentAlpha.f7561a.b(composer2, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long l5 = (i4 & 32) != 0 ? Color.l(l3, ContentAlpha.f7561a.b(composer2, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        if ((i4 & 64) != 0) {
            j13 = l5;
            j14 = ColorKt.g(Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j11);
        } else {
            j13 = l5;
            j14 = j8;
        }
        if ((i4 & 128) != 0) {
            j15 = j11;
            j16 = ColorKt.g(Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.16f, 0.0f, 0.0f, 0.0f, 14, (Object) null), l2);
        } else {
            j15 = j11;
            j16 = j9;
        }
        long g2 = (i4 & 256) != 0 ? ColorKt.g(Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.16f, 0.0f, 0.0f, 0.0f, 14, (Object) null), l3) : j10;
        if (ComposerKt.P()) {
            j17 = g2;
            ComposerKt.Y(830140629, i2, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:476)");
        } else {
            j17 = g2;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j15, l2, l3, j12, l4, j13, j14, j16, j17, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultSelectableChipColors;
    }

    public final float c() {
        return f7471b;
    }
}
