package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;

@Metadata
public final class LazyLayoutItemContentFactoryKt {
    public static final void a(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2, Object obj2, Composer composer, int i3) {
        int i4;
        Composer q2 = composer.q(1439843069);
        if ((i3 & 6) == 0) {
            i4 = (q2.W(lazyLayoutItemProvider) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= q2.W(obj) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= q2.i(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= q2.W(obj2) ? 2048 : 1024;
        }
        if (q2.E((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1439843069, i4, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:127)");
            }
            ((SaveableStateHolder) obj).c(obj2, ComposableLambdaKt.e(980966366, true, new LazyLayoutItemContentFactoryKt$SkippableItem$1(lazyLayoutItemProvider, i2, obj2), q2, 54), q2, 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new LazyLayoutItemContentFactoryKt$SkippableItem$2(lazyLayoutItemProvider, obj, i2, obj2, i3));
        }
    }
}
