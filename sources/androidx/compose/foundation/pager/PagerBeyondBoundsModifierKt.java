package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class PagerBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState a(PagerState pagerState, int i2, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(373558254, i3, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z2 = false;
        boolean z3 = (((i3 & 14) ^ 6) > 4 && composer.W(pagerState)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) > 32 && composer.i(i2)) || (i3 & 48) == 32) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        Object g2 = composer.g();
        if (z4 || g2 == Composer.f14567a.a()) {
            g2 = new PagerBeyondBoundsState(pagerState, i2);
            composer.N(g2);
        }
        PagerBeyondBoundsState pagerBeyondBoundsState = (PagerBeyondBoundsState) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return pagerBeyondBoundsState;
    }
}
