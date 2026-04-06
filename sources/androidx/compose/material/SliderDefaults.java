package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SliderDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SliderDefaults f8333a = new SliderDefaults();

    public final SliderColors a(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i2, int i3, int i4) {
        long j12;
        long j13;
        Composer composer2 = composer;
        int i5 = i2;
        int i6 = i4;
        long j14 = (i6 & 1) != 0 ? MaterialTheme.f7937a.a(composer2, 6).j() : j2;
        if ((i6 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f7937a;
            j12 = ColorKt.g(Color.l(materialTheme.a(composer2, 6).i(), ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.a(composer2, 6).n());
        } else {
            j12 = j3;
        }
        long j15 = (i6 & 4) != 0 ? MaterialTheme.f7937a.a(composer2, 6).j() : j4;
        long l2 = (i6 & 8) != 0 ? Color.l(j15, 0.24f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j5;
        long l3 = (i6 & 16) != 0 ? Color.l(MaterialTheme.f7937a.a(composer2, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long l4 = (i6 & 32) != 0 ? Color.l(l3, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long l5 = (i6 & 64) != 0 ? Color.l(ColorsKt.b(j15, composer2, (i5 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long l6 = (i6 & 128) != 0 ? Color.l(j15, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j9;
        long l7 = (i6 & 256) != 0 ? Color.l(l5, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long l8 = (i6 & 512) != 0 ? Color.l(l4, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        if (ComposerKt.P()) {
            j13 = l5;
            ComposerKt.Y(436017687, i5, i3, "androidx.compose.material.SliderDefaults.colors (Slider.kt:607)");
        } else {
            j13 = l5;
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(j14, j12, j15, l2, l3, l4, j13, l6, l7, l8, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultSliderColors;
    }
}
