package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata
public final class PagerDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final PagerDefaults f5265a = new PagerDefaults();

    public final TargetedFlingBehavior a(PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec, float f2, Composer composer, int i2, int i3) {
        boolean z2 = true;
        if ((i3 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.f5349a.a(1);
        }
        if ((i3 & 4) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.b(composer, 0);
        }
        if ((i3 & 8) != 0) {
            animationSpec = AnimationSpecKt.l(0.0f, 400.0f, Float.valueOf((float) VisibilityThresholdsKt.b(IntCompanionObject.f40897a)), 1, (Object) null);
        }
        if ((i3 & 16) != 0) {
            f2 = 0.5f;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(1559769181, i2, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
        }
        if (!(0.0f <= f2 && f2 <= 1.0f)) {
            InlineClassHelperKt.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f2);
        }
        Density density = (Density) composer.C(CompositionLocalsKt.g());
        LayoutDirection layoutDirection = (LayoutDirection) composer.C(CompositionLocalsKt.m());
        boolean W = ((((i2 & 14) ^ 6) > 4 && composer.W(pagerState)) || (i2 & 6) == 4) | composer.W(decayAnimationSpec) | composer.W(animationSpec);
        if ((((i2 & 112) ^ 48) <= 32 || !composer.W(pagerSnapDistance)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean W2 = W | z2 | composer.W(density) | composer.W(layoutDirection);
        Object g2 = composer.g();
        if (W2 || g2 == Composer.f14567a.a()) {
            g2 = SnapFlingBehaviorKt.n(PagerSnapLayoutInfoProviderKt.a(pagerState, pagerSnapDistance, new PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1(pagerState, layoutDirection, f2)), decayAnimationSpec, animationSpec);
            composer.N(g2);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return targetedFlingBehavior;
    }

    public final NestedScrollConnection b(PagerState pagerState, Orientation orientation, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(877583120, i2, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
        }
        boolean z2 = false;
        boolean z3 = (((i2 & 14) ^ 6) > 4 && composer.W(pagerState)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) > 32 && composer.W(orientation)) || (i2 & 48) == 32) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        Object g2 = composer.g();
        if (z4 || g2 == Composer.f14567a.a()) {
            g2 = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.N(g2);
        }
        DefaultPagerNestedScrollConnection defaultPagerNestedScrollConnection = (DefaultPagerNestedScrollConnection) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultPagerNestedScrollConnection;
    }
}
