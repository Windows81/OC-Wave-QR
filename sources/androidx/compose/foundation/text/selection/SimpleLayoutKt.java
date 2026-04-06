package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SimpleLayoutKt {
    public static final void a(Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-2105228848);
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
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-2105228848, i4, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:30)");
            }
            SimpleLayoutKt$SimpleLayout$1 simpleLayoutKt$SimpleLayout$1 = SimpleLayoutKt$SimpleLayout$1.f6957a;
            int i6 = ((i4 >> 3) & 14) | 384 | ((i4 << 3) & 112);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            int i7 = ((i6 << 6) & 896) | 6;
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
            Updater.g(b2, simpleLayoutKt$SimpleLayout$1, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            function2.m(q2, Integer.valueOf((i7 >> 6) & 14));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SimpleLayoutKt$SimpleLayout$2(modifier, function2, i2, i3));
        }
    }
}
