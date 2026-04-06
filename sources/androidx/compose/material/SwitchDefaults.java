package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SwitchDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SwitchDefaults f8615a = new SwitchDefaults();

    public final SwitchColors a(long j2, long j3, float f2, long j4, long j5, float f3, long j6, long j7, long j8, long j9, Composer composer, int i2, int i3, int i4) {
        long j10;
        long j11;
        long j12;
        int i5;
        long j13;
        long j14;
        long j15;
        Composer composer2 = composer;
        int i6 = i4;
        long m2 = (i6 & 1) != 0 ? MaterialTheme.f7937a.a(composer2, 6).m() : j2;
        long j16 = (i6 & 2) != 0 ? m2 : j3;
        float f4 = (i6 & 4) != 0 ? 0.54f : f2;
        long n2 = (i6 & 8) != 0 ? MaterialTheme.f7937a.a(composer2, 6).n() : j4;
        long i7 = (i6 & 16) != 0 ? MaterialTheme.f7937a.a(composer2, 6).i() : j5;
        float f5 = (i6 & 32) != 0 ? 0.38f : f3;
        if ((i6 & 64) != 0) {
            j10 = m2;
            j11 = ColorKt.g(Color.l(m2, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.f7937a.a(composer2, 6).n());
        } else {
            j10 = m2;
            j11 = j6;
        }
        if ((i6 & 128) != 0) {
            i5 = 6;
            j12 = j11;
            j13 = ColorKt.g(Color.l(j16, ContentAlpha.f7561a.b(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.f7937a.a(composer2, 6).n());
        } else {
            j12 = j11;
            i5 = 6;
            j13 = j7;
        }
        if ((i6 & 256) != 0) {
            i5 = 6;
            j14 = n2;
            j15 = ColorKt.g(Color.l(n2, ContentAlpha.f7561a.b(composer2, i5), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.f7937a.a(composer2, 6).n());
        } else {
            j14 = n2;
            j15 = j8;
        }
        long g2 = (i6 & 512) != 0 ? ColorKt.g(Color.l(i7, ContentAlpha.f7561a.b(composer2, i5), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.f7937a.a(composer2, 6).n()) : j9;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1032127534, i2, i3, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:342)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j10, Color.l(j16, f4, 0.0f, 0.0f, 0.0f, 14, (Object) null), j14, Color.l(i7, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null), j12, Color.l(j13, f4, 0.0f, 0.0f, 0.0f, 14, (Object) null), j15, Color.l(g2, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultSwitchColors;
    }
}
