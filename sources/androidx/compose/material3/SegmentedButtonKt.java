package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SegmentedButtonKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10928a = Dp.m((float) 8);

    public static final void b(Function2 function2, Function2 function22, PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1069265073);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.W(paddingValues) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1069265073, i3, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:386)");
            }
            Alignment e2 = Alignment.f15444a.e();
            Modifier h2 = PaddingKt.h(Modifier.f15489d, paddingValues);
            MeasurePolicy g2 = BoxKt.g(e2, false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
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
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e3, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            TextKt.h(TypographyKt.e(OutlinedSegmentedButtonTokens.f13771a.b(), q2, 6), ComposableLambdaKt.e(-1372614088, true, new SegmentedButtonKt$SegmentedButtonContent$1$1(function2, function22, MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, q2, 6)), q2, 54), q2, 48);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new M5(function2, function22, paddingValues, i2));
        }
    }

    public static final Unit c(Function2 function2, Function2 function22, PaddingValues paddingValues, int i2, Composer composer, int i3) {
        b(function2, function22, paddingValues, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
