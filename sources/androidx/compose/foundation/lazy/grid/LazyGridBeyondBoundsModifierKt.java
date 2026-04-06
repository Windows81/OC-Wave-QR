package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class LazyGridBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState a(LazyGridState lazyGridState, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(2004349821, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.W(lazyGridState)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z2 || g2 == Composer.f14567a.a()) {
            g2 = new LazyGridBeyondBoundsState(lazyGridState);
            composer.N(g2);
        }
        LazyGridBeyondBoundsState lazyGridBeyondBoundsState = (LazyGridBeyondBoundsState) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyGridBeyondBoundsState;
    }
}
