package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayoutKt {
    public static final void a(Modifier modifier, Function2 function2, MeasurePolicy measurePolicy, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(1949933075);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.W(measurePolicy) ? 256 : 128;
        }
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(1949933075, i4, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:237)");
            }
            int a2 = ComposablesKt.a(q2, 0);
            Modifier e2 = ComposedModifierKt.e(q2, modifier);
            CompositionLocalMap I = q2.I();
            Function0 a3 = LayoutNode.r0.a();
            int i6 = ((i4 << 3) & 896) | 6;
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Updater.g(b2, measurePolicy, companion.c());
            Updater.g(b2, I, companion.e());
            Updater.e(b2, LayoutKt$MultiMeasureLayout$1$1.f17054z);
            Updater.g(b2, e2, companion.d());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            function2.m(q2, Integer.valueOf((i6 >> 6) & 14));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new LayoutKt$MultiMeasureLayout$2(modifier2, function2, measurePolicy, i2, i3));
        }
    }

    public static final Function2 b(List list) {
        return ComposableLambdaKt.c(-1953651383, true, new LayoutKt$combineAsVirtualLayouts$1(list));
    }

    public static final Function3 c(Modifier modifier) {
        return ComposableLambdaKt.c(-1586257396, true, new LayoutKt$materializerOf$1(modifier));
    }
}
