package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class LazyStaggeredGridSemanticsKt {
    public static final LazyLayoutSemanticState a(LazyStaggeredGridState lazyStaggeredGridState, boolean z2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1629354903, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
        }
        boolean z3 = false;
        boolean z4 = (((i2 & 14) ^ 6) > 4 && composer.W(lazyStaggeredGridState)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) > 32 && composer.d(z2)) || (i2 & 48) == 32) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        Object g2 = composer.g();
        if (z5 || g2 == Composer.f14567a.a()) {
            g2 = new LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1(lazyStaggeredGridState);
            composer.N(g2);
        }
        LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 = (LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1;
    }
}
