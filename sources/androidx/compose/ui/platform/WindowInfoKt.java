package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class WindowInfoKt {
    public static final void a(Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(127829799);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(127829799, i3, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:58)");
            }
            WindowInfo windowInfo = (WindowInfo) q2.C(CompositionLocalsKt.u());
            State p2 = SnapshotStateKt.p(function1, q2, i3 & 14);
            boolean W = q2.W(windowInfo) | q2.W(p2);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, p2, (Continuation) null);
                q2.N(g2);
            }
            EffectsKt.g(windowInfo, (Function2) g2, q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new WindowInfoKt$WindowFocusObserver$2(function1, i2));
        }
    }
}
