package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class ProgressIndicatorDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ProgressIndicatorDefaults f10620a = new ProgressIndicatorDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f10621b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10622c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10623d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f10624e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f10625f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f10626g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f10627h;

    /* renamed from: i  reason: collision with root package name */
    public static final SpringSpec f10628i = new SpringSpec(1.0f, 50.0f, Float.valueOf(0.001f));

    /* renamed from: j  reason: collision with root package name */
    public static final int f10629j = 0;

    static {
        CircularProgressIndicatorTokens circularProgressIndicatorTokens = CircularProgressIndicatorTokens.f12921a;
        f10621b = circularProgressIndicatorTokens.c();
        StrokeCap.Companion companion = StrokeCap.f16130b;
        f10622c = companion.b();
        f10623d = companion.b();
        f10624e = companion.b();
        LinearProgressIndicatorTokens linearProgressIndicatorTokens = LinearProgressIndicatorTokens.f13482a;
        f10625f = linearProgressIndicatorTokens.b();
        f10626g = linearProgressIndicatorTokens.c();
        f10627h = circularProgressIndicatorTokens.b();
    }

    public static final void b(DrawScope drawScope, int i2, long j2, float f2, float f3) {
        if (StrokeCap.g(i2, StrokeCap.f16130b.b())) {
            float f4 = f2 / 2.0f;
            DrawScope.k2(drawScope, j2, f4, Offset.e((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.c() >> 32)) - f4) - f3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) / 2.0f)))), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
            return;
        }
        DrawScope.A1(drawScope, j2, Offset.e((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.c() >> 32)) - f2) - f3)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) - f2) / 2.0f)) & 4294967295L)), Size.d((((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2)))), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
    }

    public final void a(DrawScope drawScope, float f2, long j2, int i2) {
        float min = Math.min(drawScope.B1(f2), Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)));
        float B1 = drawScope.B1(ProgressIndicatorKt.J());
        float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) - min) / ((float) 2);
        float f3 = intBitsToFloat > B1 ? B1 : intBitsToFloat;
        if (drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long T1 = drawScope.T1();
            DrawContext G1 = drawScope.G1();
            long c2 = G1.c();
            G1.j().o();
            try {
                G1.e().g(-1.0f, 1.0f, T1);
                b(drawScope, i2, j2, min, f3);
            } finally {
                G1.j().t();
                G1.f(c2);
            }
        } else {
            b(drawScope, i2, j2, min, f3);
        }
    }

    public final long c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1803349725, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:817)");
        }
        long k2 = ColorSchemeKt.k(ProgressIndicatorTokens.f13885a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final int d() {
        return f10623d;
    }

    public final long e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-2143778381, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:834)");
        }
        long k2 = ColorSchemeKt.k(ProgressIndicatorTokens.f13885a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final int f() {
        return f10624e;
    }

    public final long g(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1947901123, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:838)");
        }
        long e2 = Color.f15975b.e();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }

    public final float h() {
        return f10627h;
    }

    public final float i() {
        return f10621b;
    }

    public final long j(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-914312983, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:813)");
        }
        long k2 = ColorSchemeKt.k(ProgressIndicatorTokens.f13885a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final float k() {
        return f10626g;
    }

    public final int l() {
        return f10622c;
    }

    public final long m(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1677541593, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:821)");
        }
        long k2 = ColorSchemeKt.k(ProgressIndicatorTokens.f13885a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final float n() {
        return f10625f;
    }
}
