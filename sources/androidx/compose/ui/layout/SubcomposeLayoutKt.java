package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SubcomposeLayoutKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SubcomposeLayoutKt$ReusedSlotId$1 f17156a = new SubcomposeLayoutKt$ReusedSlotId$1();

    public static final void a(Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1298353104);
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
                ComposerKt.Y(-1298353104, i4, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:82)");
            }
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new SubcomposeLayoutState();
                q2.N(g2);
            }
            b((SubcomposeLayoutState) g2, modifier, function2, q2, (i4 << 3) & 1008, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SubcomposeLayoutKt$SubcomposeLayout$2(modifier, function2, i2, i3));
        }
    }

    public static final void b(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-511989831);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(subcomposeLayoutState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function2) ? 256 : 128;
        }
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-511989831, i4, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:115)");
            }
            int a2 = ComposablesKt.a(q2, 0);
            CompositionContext e2 = ComposablesKt.e(q2, 0);
            Modifier e3 = ComposedModifierKt.e(q2, modifier);
            CompositionLocalMap I = q2.I();
            Function0 a3 = LayoutNode.r0.a();
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
            Updater.g(b2, subcomposeLayoutState, subcomposeLayoutState.g());
            Updater.g(b2, e2, subcomposeLayoutState.e());
            Updater.g(b2, function2, subcomposeLayoutState.f());
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Updater.g(b2, I, companion.e());
            Updater.g(b2, e3, companion.d());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            q2.T();
            if (!q2.t()) {
                q2.X(-26326018);
                boolean l2 = q2.l(subcomposeLayoutState);
                Object g2 = q2.g();
                if (l2 || g2 == Composer.f14567a.a()) {
                    g2 = new SubcomposeLayoutKt$SubcomposeLayout$4$1(subcomposeLayoutState);
                    q2.N(g2);
                }
                EffectsKt.h((Function0) g2, q2, 0);
                q2.M();
            } else {
                q2.X(-26267397);
                q2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SubcomposeLayoutKt$SubcomposeLayout$5(subcomposeLayoutState, modifier2, function2, i2, i3));
        }
    }
}
