package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ExposedDropdownMenu_android {
    public static final void a(Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1063434120);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        boolean z2 = true;
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1063434120, i3, -1, "androidx.compose.material.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:41)");
            }
            View view = (View) q2.C(AndroidCompositionLocals_androidKt.j());
            boolean l2 = q2.l(view);
            if ((i3 & 14) != 4) {
                z2 = false;
            }
            boolean z3 = l2 | z2;
            Object g2 = q2.g();
            if (z3 || g2 == Composer.f14567a.a()) {
                g2 = new ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1(view, function0);
                q2.N(g2);
            }
            EffectsKt.c(view, (Function1) g2, q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2(function0, i2));
        }
    }

    public static final IntRect c(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.d(rect);
    }

    public static final WindowBoundsCalculator d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1216067952, i2, -1, "androidx.compose.material.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:35)");
        }
        View view = (View) composer.C(AndroidCompositionLocals_androidKt.j());
        boolean W = composer.W(view);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new WindowBoundsCalculator(view);
            composer.N(g2);
        }
        WindowBoundsCalculator windowBoundsCalculator = (WindowBoundsCalculator) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return windowBoundsCalculator;
    }
}
