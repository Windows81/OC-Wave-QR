package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BasicEdgeToEdgeDialogKt {
    public static final void b(PredictiveBackState predictiveBackState, boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(698755635);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? q2.W(predictiveBackState) : q2.l(predictiveBackState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.d(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function0) ? 256 : 128;
        }
        boolean z3 = true;
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                z2 = true;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(698755635, i4, -1, "androidx.compose.material3.internal.PredictiveBackStateHandler (BasicEdgeToEdgeDialog.kt:90)");
            }
            State p2 = SnapshotStateKt.p(function0, q2, (i4 >> 6) & 14);
            q2.r(1489276985, predictiveBackState);
            Intrinsics.g(predictiveBackState, "null cannot be cast to non-null type androidx.compose.material3.internal.PredictiveBackStateImpl");
            boolean z4 = z2 && !(((PredictiveBackStateImpl) predictiveBackState).getValue() instanceof BackEventProgress.Completed);
            if ((i4 & 14) != 4 && ((i4 & 8) == 0 || !q2.l(predictiveBackState))) {
                z3 = false;
            }
            boolean W = q2.W(p2) | z3;
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(predictiveBackState, p2, (Continuation) null);
                q2.N(g2);
            }
            BackHandler_androidKt.e(z4, (Function2) g2, q2, 0, 0);
            q2.Q();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        boolean z5 = z2;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0149w(predictiveBackState, z5, function0, i2, i3));
        }
    }

    public static final Function0 c(State state) {
        return (Function0) state.getValue();
    }

    public static final Unit d(PredictiveBackState predictiveBackState, boolean z2, Function0 function0, int i2, int i3, Composer composer, int i4) {
        b(predictiveBackState, z2, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final PredictiveBackState f(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1883443352, i2, -1, "androidx.compose.material3.internal.rememberPredictiveBackState (BasicEdgeToEdgeDialog.kt:77)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new PredictiveBackStateImpl();
            composer.N(g2);
        }
        PredictiveBackStateImpl predictiveBackStateImpl = (PredictiveBackStateImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return predictiveBackStateImpl;
    }
}
