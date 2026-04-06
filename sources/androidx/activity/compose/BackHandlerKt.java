package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class BackHandlerKt {
    public static final void a(boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-361453782);
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
            i4 |= q2.l(function0) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            boolean z3 = true;
            if (i5 != 0) {
                z2 = true;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-361453782, i4, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            State p2 = SnapshotStateKt.p(function0, q2, (i4 >> 3) & 14);
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new BackHandlerKt$BackHandler$backCallback$1$1(z2, p2);
                q2.N(g2);
            }
            BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) g2;
            if ((i4 & 14) != 4) {
                z3 = false;
            }
            Object g3 = q2.g();
            if (z3 || g3 == companion.a()) {
                g3 = new BackHandlerKt$BackHandler$1$1(backHandlerKt$BackHandler$backCallback$1$1, z2);
                q2.N(g3);
            }
            EffectsKt.h((Function0) g3, q2, 0);
            OnBackPressedDispatcherOwner a2 = LocalOnBackPressedDispatcherOwner.f154a.a(q2, 6);
            if (a2 != null) {
                OnBackPressedDispatcher c2 = a2.c();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) q2.C(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean l2 = q2.l(c2) | q2.l(lifecycleOwner);
                Object g4 = q2.g();
                if (l2 || g4 == companion.a()) {
                    g4 = new BackHandlerKt$BackHandler$2$1(c2, lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1);
                    q2.N(g4);
                }
                EffectsKt.b(lifecycleOwner, c2, (Function1) g4, q2, 0);
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
            x2.a(new BackHandlerKt$BackHandler$3(z2, function0, i2, i3));
        }
    }

    public static final Function0 b(State state) {
        return (Function0) state.getValue();
    }
}
