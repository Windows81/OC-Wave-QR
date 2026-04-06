package androidx.compose.material3.internal;

import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class BackHandler_androidKt {
    public static final void c(boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1339183247);
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
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                z2 = true;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1339183247, i4, -1, "androidx.compose.material3.internal.BackHandler (BackHandler.android.kt:24)");
            }
            BackHandlerKt.a(z2, function0, q2, i4 & 126, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0147u(z2, function0, i2, i3));
        }
    }

    public static final Unit d(boolean z2, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(z2, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void e(boolean z2, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1437916225);
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
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                z2 = true;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1437916225, i4, -1, "androidx.compose.material3.internal.PredictiveBackHandler (BackHandler.android.kt:32)");
            }
            PredictiveBackHandlerKt.a(z2, function2, q2, i4 & 126, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0148v(z2, function2, i2, i3));
        }
    }

    public static final Unit f(boolean z2, Function2 function2, int i2, int i3, Composer composer, int i4) {
        e(z2, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
