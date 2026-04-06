package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class SplineBasedFloatDecayAnimationSpec_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f2407a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f2407a;
    }

    public static final DecayAnimationSpec b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(904445851, i2, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        Density density = (Density) composer.C(CompositionLocalsKt.g());
        boolean h2 = composer.h(density.getDensity());
        Object g2 = composer.g();
        if (h2 || g2 == Composer.f14567a.a()) {
            g2 = DecayAnimationSpecKt.d(new SplineBasedFloatDecayAnimationSpec(density));
            composer.N(g2);
        }
        DecayAnimationSpec decayAnimationSpec = (DecayAnimationSpec) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return decayAnimationSpec;
    }
}
