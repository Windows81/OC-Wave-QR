package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class LazyLayoutPinnableItemKt {
    public static final void a(Object obj, int i2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, Function2 function2, Composer composer, int i3) {
        int i4;
        Composer q2 = composer.q(-2079116560);
        if ((i3 & 6) == 0) {
            i4 = (q2.l(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= q2.i(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= q2.l(lazyLayoutPinnedItemList) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= q2.l(function2) ? 2048 : 1024;
        }
        if (q2.E((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2079116560, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean W = q2.W(obj) | q2.W(lazyLayoutPinnedItemList);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                q2.N(g2);
            }
            LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) g2;
            lazyLayoutPinnableItem.e(i2);
            lazyLayoutPinnableItem.f((PinnableContainer) q2.C(PinnableContainerKt.a()));
            boolean W2 = q2.W(lazyLayoutPinnableItem);
            Object g3 = q2.g();
            if (W2 || g3 == Composer.f14567a.a()) {
                g3 = new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(lazyLayoutPinnableItem);
                q2.N(g3);
            }
            EffectsKt.c(lazyLayoutPinnableItem, (Function1) g3, q2, 0);
            CompositionLocalKt.c(PinnableContainerKt.a().d(lazyLayoutPinnableItem), function2, q2, ((i4 >> 6) & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(obj, i2, lazyLayoutPinnedItemList, function2, i3));
        }
    }
}
