package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.material3.tokens.ExtendedFabLargeTokens;
import androidx.compose.material3.tokens.ExtendedFabMediumTokens;
import androidx.compose.material3.tokens.ExtendedFabSmallTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FloatingActionButtonKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10032a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f10033b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f10034c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f10035d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f10036e;

    /* renamed from: f  reason: collision with root package name */
    public static final TypographyKeyTokens f10037f = TypographyKeyTokens.TitleMedium;

    /* renamed from: g  reason: collision with root package name */
    public static final float f10038g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f10039h;

    /* renamed from: i  reason: collision with root package name */
    public static final float f10040i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f10041j;

    /* renamed from: k  reason: collision with root package name */
    public static final float f10042k;

    /* renamed from: l  reason: collision with root package name */
    public static final TypographyKeyTokens f10043l = TypographyKeyTokens.TitleLarge;

    /* renamed from: m  reason: collision with root package name */
    public static final float f10044m;

    /* renamed from: n  reason: collision with root package name */
    public static final float f10045n;

    /* renamed from: o  reason: collision with root package name */
    public static final float f10046o;

    /* renamed from: p  reason: collision with root package name */
    public static final float f10047p;

    /* renamed from: q  reason: collision with root package name */
    public static final float f10048q;

    /* renamed from: r  reason: collision with root package name */
    public static final TypographyKeyTokens f10049r = TypographyKeyTokens.HeadlineSmall;

    /* renamed from: s  reason: collision with root package name */
    public static final float f10050s;

    /* renamed from: t  reason: collision with root package name */
    public static final float f10051t;

    /* renamed from: u  reason: collision with root package name */
    public static final float f10052u = Dp.m((float) 20);

    /* renamed from: v  reason: collision with root package name */
    public static final float f10053v = Dp.m((float) 80);

    static {
        ExtendedFabSmallTokens extendedFabSmallTokens = ExtendedFabSmallTokens.f13176a;
        f10032a = extendedFabSmallTokens.a();
        f10033b = extendedFabSmallTokens.a();
        f10034c = extendedFabSmallTokens.c();
        f10035d = extendedFabSmallTokens.d();
        f10036e = extendedFabSmallTokens.b();
        ExtendedFabMediumTokens extendedFabMediumTokens = ExtendedFabMediumTokens.f13148a;
        f10038g = extendedFabMediumTokens.a();
        f10039h = extendedFabMediumTokens.a();
        f10040i = extendedFabMediumTokens.b();
        f10041j = extendedFabMediumTokens.c();
        float f2 = (float) 12;
        f10042k = Dp.m(f2);
        ExtendedFabLargeTokens extendedFabLargeTokens = ExtendedFabLargeTokens.f13141a;
        f10044m = extendedFabLargeTokens.a();
        f10045n = extendedFabLargeTokens.a();
        f10046o = extendedFabLargeTokens.b();
        f10047p = extendedFabLargeTokens.c();
        float f3 = (float) 16;
        f10048q = Dp.m(f3);
        f10050s = Dp.m(f3);
        f10051t = Dp.m(f2);
    }

    public static final ExitTransition g(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-56172201, i2, -1, "androidx.compose.material3.extendedFabCollapseAnimation (FloatingActionButton.kt:795)");
        }
        ExitTransition c2 = EnterExitTransitionKt.q(MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer, 6), 0.0f, 2, (Object) null).c(EnterExitTransitionKt.u(MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultSpatial, composer, 6), Alignment.f15444a.k(), false, (Function1) null, 12, (Object) null));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public static final EnterTransition h(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-719787506, i2, -1, "androidx.compose.material3.extendedFabExpandAnimation (FloatingActionButton.kt:806)");
        }
        EnterTransition c2 = EnterExitTransitionKt.o(MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6), 0.0f, 2, (Object) null).c(EnterExitTransitionKt.i(MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, composer, 6), Alignment.f15444a.k(), false, (Function1) null, 12, (Object) null));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }
}
