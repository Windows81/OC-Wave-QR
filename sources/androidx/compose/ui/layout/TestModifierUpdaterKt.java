package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TestModifierUpdaterKt {
    public static final void a(Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1673066036);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1673066036, i3, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:48)");
            }
            int a2 = ComposablesKt.a(q2, 0);
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1.f17178a;
            Function0 a3 = LayoutNode.r0.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.z();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Updater.g(b2, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, companion.c());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.e(b2, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(function1));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(function1, i2));
        }
    }
}
