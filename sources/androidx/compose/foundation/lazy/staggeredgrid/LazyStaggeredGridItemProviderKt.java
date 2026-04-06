package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty0;

@Metadata
public final class LazyStaggeredGridItemProviderKt {
    public static final Function0 a(LazyStaggeredGridState lazyStaggeredGridState, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(690901732, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:39)");
        }
        State p2 = SnapshotStateKt.p(function1, composer, (i2 >> 3) & 14);
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.W(lazyStaggeredGridState)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z2 || g2 == Composer.f14567a.a()) {
            g2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(SnapshotStateKt.d(SnapshotStateKt.o(), new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1(SnapshotStateKt.d(SnapshotStateKt.o(), new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1(p2)), lazyStaggeredGridState)));
            composer.N(g2);
        }
        KProperty0 kProperty0 = (KProperty0) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return kProperty0;
    }
}
