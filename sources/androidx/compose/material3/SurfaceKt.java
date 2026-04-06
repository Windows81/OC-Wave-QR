package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SurfaceKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f11209a = CompositionLocalKt.h((SnapshotMutationPolicy) null, new J6(), 1, (Object) null);

    public static final Dp b() {
        return Dp.j(Dp.m((float) 0));
    }

    public static final void c(Modifier modifier, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, Function2 function2, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i2;
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.f15489d : modifier;
        Shape a2 = (i3 & 2) != 0 ? RectangleShapeKt.a() : shape;
        long W = (i3 & 4) != 0 ? MaterialTheme.f10273a.a(composer2, 6).W() : j2;
        long g2 = (i3 & 8) != 0 ? ColorSchemeKt.g(W, composer2, (i4 >> 6) & 14) : j3;
        float m2 = (i3 & 16) != 0 ? Dp.m((float) 0) : f2;
        float m3 = (i3 & 32) != 0 ? Dp.m((float) 0) : f3;
        BorderStroke borderStroke2 = (i3 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1093433818, i4, -1, "androidx.compose.material3.Surface (Surface.kt:104)");
        }
        ProvidableCompositionLocal providableCompositionLocal = f11209a;
        float m4 = Dp.m(((Dp) composer2.C(providableCompositionLocal)).t() + m2);
        CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(g2)), providableCompositionLocal.d(Dp.j(m4))}, ComposableLambdaKt.e(421772006, true, new SurfaceKt$Surface$1(modifier2, a2, W, m4, borderStroke2, m3, function2), composer2, 54), composer2, ProvidedValue.f14769i | 48);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void d(boolean z2, Function0 function0, Modifier modifier, boolean z3, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, Composer composer, int i2, int i3, int i4) {
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2 = composer;
        int i5 = i2;
        int i6 = i4;
        Modifier.Companion companion = (i6 & 4) != 0 ? Modifier.f15489d : modifier;
        boolean z4 = (i6 & 8) != 0 ? true : z3;
        Shape a2 = (i6 & 16) != 0 ? RectangleShapeKt.a() : shape;
        long W = (i6 & 32) != 0 ? MaterialTheme.f10273a.a(composer2, 6).W() : j2;
        long g2 = (i6 & 64) != 0 ? ColorSchemeKt.g(W, composer2, (i5 >> 15) & 14) : j3;
        float m2 = (i6 & 128) != 0 ? Dp.m((float) 0) : f2;
        float m3 = (i6 & 256) != 0 ? Dp.m((float) 0) : f3;
        MutableInteractionSource mutableInteractionSource3 = null;
        BorderStroke borderStroke2 = (i6 & 512) != 0 ? null : borderStroke;
        if ((i6 & 1024) == 0) {
            mutableInteractionSource3 = mutableInteractionSource;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(1416521139, i5, i3, "androidx.compose.material3.Surface (Surface.kt:313)");
        }
        if (mutableInteractionSource3 == null) {
            composer2.X(1528143336);
            Object g3 = composer.g();
            if (g3 == Composer.f14567a.a()) {
                g3 = InteractionSourceKt.a();
                composer2.N(g3);
            }
            composer.M();
            mutableInteractionSource2 = (MutableInteractionSource) g3;
        } else {
            composer2.X(-227800369);
            composer.M();
            mutableInteractionSource2 = mutableInteractionSource3;
        }
        ProvidableCompositionLocal providableCompositionLocal = f11209a;
        float m4 = Dp.m(((Dp) composer2.C(providableCompositionLocal)).t() + m2);
        CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(g2)), providableCompositionLocal.d(Dp.j(m4))}, ComposableLambdaKt.e(1508735219, true, new SurfaceKt$Surface$3(companion, a2, W, m4, borderStroke2, z2, mutableInteractionSource2, z4, function0, m3, function2), composer2, 54), composer2, ProvidedValue.f14769i | 48);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void e(Function0 function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, Composer composer, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i2;
        int i6 = i4;
        Modifier.Companion companion = (i6 & 2) != 0 ? Modifier.f15489d : modifier;
        boolean z3 = (i6 & 4) != 0 ? true : z2;
        Shape a2 = (i6 & 8) != 0 ? RectangleShapeKt.a() : shape;
        long W = (i6 & 16) != 0 ? MaterialTheme.f10273a.a(composer2, 6).W() : j2;
        long g2 = (i6 & 32) != 0 ? ColorSchemeKt.g(W, composer2, (i5 >> 12) & 14) : j3;
        float m2 = (i6 & 64) != 0 ? Dp.m((float) 0) : f2;
        float m3 = (i6 & 128) != 0 ? Dp.m((float) 0) : f3;
        MutableInteractionSource mutableInteractionSource2 = null;
        BorderStroke borderStroke2 = (i6 & 256) != 0 ? null : borderStroke;
        if ((i6 & 512) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(-1472753265, i5, i3, "androidx.compose.material3.Surface (Surface.kt:207)");
        }
        if (mutableInteractionSource2 == null) {
            composer2.X(-1701037204);
            Object g3 = composer.g();
            if (g3 == Composer.f14567a.a()) {
                g3 = InteractionSourceKt.a();
                composer2.N(g3);
            }
            composer.M();
            mutableInteractionSource2 = (MutableInteractionSource) g3;
        } else {
            composer2.X(2023337163);
            composer.M();
        }
        ProvidableCompositionLocal providableCompositionLocal = f11209a;
        float m4 = Dp.m(((Dp) composer2.C(providableCompositionLocal)).t() + m2);
        CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(g2)), providableCompositionLocal.d(Dp.j(m4))}, ComposableLambdaKt.e(849208527, true, new SurfaceKt$Surface$2(companion, a2, W, m4, borderStroke2, mutableInteractionSource2, z3, function0, m3, function2), composer2, 54), composer2, ProvidedValue.f14769i | 48);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final Modifier h(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f2) {
        Shape shape2;
        Modifier modifier2;
        Modifier o0 = modifier.o0(f2 > 0.0f ? GraphicsLayerModifierKt.c(Modifier.f15489d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0, shape, false, (RenderEffect) null, 0, 0, 0, 124895, (Object) null) : Modifier.f15489d);
        BorderStroke borderStroke2 = borderStroke;
        if (borderStroke2 != null) {
            shape2 = shape;
            modifier2 = BorderKt.e(Modifier.f15489d, borderStroke2, shape2);
        } else {
            shape2 = shape;
            modifier2 = Modifier.f15489d;
        }
        return ClipKt.a(BackgroundKt.a(o0.o0(modifier2), j2, shape2), shape2);
    }

    public static final long i(long j2, float f2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-2079918090, i2, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:478)");
        }
        long e2 = ColorSchemeKt.e(MaterialTheme.f10273a.a(composer, 6), j2, f2, composer, (i2 << 3) & 1008);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }
}
