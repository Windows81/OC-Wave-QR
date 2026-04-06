package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class PredictiveBackHandlerKt {
    public static final void a(boolean z2, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-642000585);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.d(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function2) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            boolean z3 = true;
            if (i5 != 0) {
                z2 = true;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-642000585, i4, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            State p2 = SnapshotStateKt.p(function2, q2, (i4 >> 3) & 14);
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.j(EmptyCoroutineContext.f40721z, q2));
                q2.N(compositionScopedCoroutineScopeCanceller);
                g2 = compositionScopedCoroutineScopeCanceller;
            }
            CoroutineScope a2 = ((CompositionScopedCoroutineScopeCanceller) g2).a();
            Object g3 = q2.g();
            if (g3 == companion.a()) {
                g3 = new PredictiveBackHandlerCallback(z2, a2, b(p2));
                q2.N(g3);
            }
            PredictiveBackHandlerCallback predictiveBackHandlerCallback = (PredictiveBackHandlerCallback) g3;
            boolean W = q2.W(b(p2)) | q2.W(a2);
            Object g4 = q2.g();
            if (W || g4 == companion.a()) {
                predictiveBackHandlerCallback.l(b(p2));
                predictiveBackHandlerCallback.n(a2);
                q2.N(Unit.f40552a);
            }
            Boolean valueOf = Boolean.valueOf(z2);
            boolean l2 = q2.l(predictiveBackHandlerCallback);
            int i6 = i4 & 14;
            if (i6 != 4) {
                z3 = false;
            }
            boolean z4 = l2 | z3;
            Object g5 = q2.g();
            if (z4 || g5 == companion.a()) {
                g5 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(predictiveBackHandlerCallback, z2, (Continuation) null);
                q2.N(g5);
            }
            EffectsKt.g(valueOf, (Function2) g5, q2, i6);
            OnBackPressedDispatcherOwner a3 = LocalOnBackPressedDispatcherOwner.f154a.a(q2, 6);
            if (a3 != null) {
                OnBackPressedDispatcher c2 = a3.c();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) q2.C(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean l3 = q2.l(c2) | q2.l(lifecycleOwner) | q2.l(predictiveBackHandlerCallback);
                Object g6 = q2.g();
                if (l3 || g6 == companion.a()) {
                    g6 = new PredictiveBackHandlerKt$PredictiveBackHandler$3$1(c2, lifecycleOwner, predictiveBackHandlerCallback);
                    q2.N(g6);
                }
                EffectsKt.b(lifecycleOwner, c2, (Function1) g6, q2, 0);
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new PredictiveBackHandlerKt$PredictiveBackHandler$4(z2, function2, i2, i3));
        }
    }

    public static final Function2 b(State state) {
        return (Function2) state.getValue();
    }
}
