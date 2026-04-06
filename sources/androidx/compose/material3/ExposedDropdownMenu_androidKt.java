package androidx.compose.material3;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ExposedDropdownMenu_androidKt {
    public static final void d(Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1646555525);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1646555525, i3, -1, "androidx.compose.material3.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:47)");
            }
            f((View) q2.C(AndroidCompositionLocals_androidKt.j()), (Density) q2.C(CompositionLocalsKt.g()), function0, q2, (i3 << 6) & 896);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new N2(function0, i2));
        }
    }

    public static final Unit e(Function0 function0, int i2, Composer composer, int i3) {
        d(function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void f(View view, Density density, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1319522472);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(view) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(density) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function0) ? 256 : 128;
        }
        boolean z2 = false;
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1319522472, i3, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:85)");
            }
            boolean l2 = q2.l(view);
            if ((i3 & 896) == 256) {
                z2 = true;
            }
            boolean z3 = l2 | z2;
            Object g2 = q2.g();
            if (z3 || g2 == Composer.f14567a.a()) {
                g2 = new O2(view, function0);
                q2.N(g2);
            }
            EffectsKt.b(view, density, (Function1) g2, q2, i3 & 126);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new P2(view, density, function0, i2));
        }
    }

    public static final DisposableEffectResult g(View view, Function0 function0, DisposableEffectScope disposableEffectScope) {
        return new ExposedDropdownMenu_androidKt$SoftKeyboardListener$lambda$5$lambda$4$$inlined$onDispose$1(new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, function0));
    }

    public static final Unit h(View view, Density density, Function0 function0, int i2, Composer composer, int i3) {
        f(view, density, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final IntRect j(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.d(rect);
    }

    public static final WindowBoundsCalculator k(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(703324275, i2, -1, "androidx.compose.material3.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:40)");
        }
        View view = (View) composer.C(AndroidCompositionLocals_androidKt.j());
        boolean W = composer.W((Configuration) composer.C(AndroidCompositionLocals_androidKt.f())) | composer.W(view);
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

    public static final PopupProperties l(String str, boolean z2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(895018515, i2, -1, "androidx.compose.material3.popupPropertiesForAnchorType (ExposedDropdownMenu.android.kt:57)");
        }
        State n2 = AccessibilityServiceStateProvider_androidKt.n(false, false, false, composer, 0, 7);
        int i3 = !m(n2) ? 393248 : 393216;
        ExposedDropdownMenuAnchorType.Companion companion = ExposedDropdownMenuAnchorType.f9935b;
        if ((ExposedDropdownMenuAnchorType.g(str, companion.a()) || (ExposedDropdownMenuAnchorType.g(str, companion.c()) && !m(n2))) && !z2) {
            i3 |= 8;
        }
        PopupProperties popupProperties = new PopupProperties(i3, false, false, false, false, false, 62, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return popupProperties;
    }

    public static final boolean m(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
