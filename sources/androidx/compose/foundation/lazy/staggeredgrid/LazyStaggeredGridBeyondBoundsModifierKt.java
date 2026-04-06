package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class LazyStaggeredGridBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState a(LazyStaggeredGridState lazyStaggeredGridState, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-363070453, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
        }
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.W(lazyStaggeredGridState)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z2 || g2 == Composer.f14567a.a()) {
            g2 = new LazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState);
            composer.N(g2);
        }
        LazyStaggeredGridBeyondBoundsState lazyStaggeredGridBeyondBoundsState = (LazyStaggeredGridBeyondBoundsState) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyStaggeredGridBeyondBoundsState;
    }
}
