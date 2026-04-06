package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class LazyListSemanticsKt {
    public static final LazyLayoutSemanticState a(LazyListState lazyListState, boolean z2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(596174919, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z3 = false;
        boolean z4 = (((i2 & 14) ^ 6) > 4 && composer.W(lazyListState)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) > 32 && composer.d(z2)) || (i2 & 48) == 32) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        Object g2 = composer.g();
        if (z5 || g2 == Composer.f14567a.a()) {
            g2 = LazyLayoutSemanticStateKt.a(lazyListState, z2);
            composer.N(g2);
        }
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyLayoutSemanticState;
    }
}
