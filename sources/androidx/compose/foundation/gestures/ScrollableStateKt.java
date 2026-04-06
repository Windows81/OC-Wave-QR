package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ScrollableStateKt {
    public static final ScrollableState a(Function1 function1) {
        return new DefaultScrollableState(function1);
    }

    public static final ScrollableState b(Function1 function1, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-180460798, i2, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:159)");
        }
        State p2 = SnapshotStateKt.p(function1, composer, i2 & 14);
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = a(new ScrollableStateKt$rememberScrollableState$1$1(p2));
            composer.N(g2);
        }
        ScrollableState scrollableState = (ScrollableState) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return scrollableState;
    }
}
