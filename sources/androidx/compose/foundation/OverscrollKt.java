package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

@Metadata
public final class OverscrollKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f3137a = CompositionLocalKt.i(OverscrollKt$LocalOverscrollFactory$1.f3138z);

    public static final ProvidableCompositionLocal a() {
        return f3137a;
    }

    public static final OverscrollEffect b(Composer composer, int i2) {
        composer.X(282942128);
        if (ComposerKt.P()) {
            ComposerKt.Y(282942128, i2, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:344)");
        }
        OverscrollFactory overscrollFactory = (OverscrollFactory) composer.C(f3137a);
        if (overscrollFactory == null) {
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            return null;
        }
        boolean W = composer.W(overscrollFactory);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = overscrollFactory.a();
            composer.N(g2);
        }
        OverscrollEffect overscrollEffect = (OverscrollEffect) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return overscrollEffect;
    }
}
