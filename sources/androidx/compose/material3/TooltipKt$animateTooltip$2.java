package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class TooltipKt$animateTooltip$2 implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f11614z;

    public TooltipKt$animateTooltip$2(Transition transition) {
        this.f11614z = transition;
    }

    private static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float e(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(-1498516085);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1498516085, i2, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:1268)");
        }
        FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
        FiniteAnimationSpec b3 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer2, 6);
        Transition transition = this.f11614z;
        TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = new TooltipKt$animateTooltip$2$scale$2(b2);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.f40896a;
        TwoWayConverter i3 = VectorConvertersKt.i(floatCompanionObject);
        boolean booleanValue = ((Boolean) transition.i()).booleanValue();
        composer2.X(-1553362193);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
        }
        float f2 = 0.8f;
        float f3 = 1.0f;
        float f4 = booleanValue ? 1.0f : 0.8f;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        Float valueOf = Float.valueOf(f4);
        boolean booleanValue2 = ((Boolean) transition.q()).booleanValue();
        composer2.X(-1553362193);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
        }
        if (booleanValue2) {
            f2 = 1.0f;
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        State f5 = TransitionKt.f(transition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$scale$2.d(transition.o(), composer2, 0), i3, "tooltip transition: scaling", composer, 196608);
        Transition transition2 = this.f11614z;
        TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = new TooltipKt$animateTooltip$2$alpha$2(b3);
        TwoWayConverter i4 = VectorConvertersKt.i(floatCompanionObject);
        boolean booleanValue3 = ((Boolean) transition2.i()).booleanValue();
        composer2.X(2073045083);
        if (ComposerKt.P()) {
            ComposerKt.Y(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
        }
        float f6 = booleanValue3 ? 1.0f : 0.0f;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        Float valueOf2 = Float.valueOf(f6);
        boolean booleanValue4 = ((Boolean) transition2.q()).booleanValue();
        composer2.X(2073045083);
        if (ComposerKt.P()) {
            ComposerKt.Y(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
        }
        if (!booleanValue4) {
            f3 = 0.0f;
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        Modifier c2 = GraphicsLayerModifierKt.c(modifier, c(f5), c(f5), e(TransitionKt.f(transition2, valueOf2, Float.valueOf(f3), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$alpha$2.d(transition2.o(), composer2, 0), i4, "tooltip transition: alpha", composer, 196608)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131064, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return c2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
