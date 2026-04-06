package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ToggleableAppBarItem implements AppBarItem {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11530a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f11531b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f11532c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11533d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11534e;

    public static final Unit f(ToggleableAppBarItem toggleableAppBarItem, int i2, Composer composer, int i3) {
        toggleableAppBarItem.b(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit g(ToggleableAppBarItem toggleableAppBarItem, AppBarMenuState appBarMenuState) {
        toggleableAppBarItem.f11531b.invoke(Boolean.valueOf(!toggleableAppBarItem.f11530a));
        appBarMenuState.a();
        return Unit.f40552a;
    }

    public static final Unit h(ToggleableAppBarItem toggleableAppBarItem, AppBarMenuState appBarMenuState, int i2, Composer composer, int i3) {
        toggleableAppBarItem.a(appBarMenuState, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public void a(AppBarMenuState appBarMenuState, Composer composer, int i2) {
        int i3;
        Composer composer2;
        AppBarMenuState appBarMenuState2 = appBarMenuState;
        int i4 = i2;
        Composer q2 = composer.q(-1187385573);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(appBarMenuState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(this) ? 32 : 16;
        }
        boolean z2 = false;
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1187385573, i3, -1, "androidx.compose.material3.ToggleableAppBarItem.MenuContent (AppBarDsl.kt:211)");
            }
            boolean z3 = this.f11533d;
            ComposableLambda e2 = ComposableLambdaKt.e(-269621941, true, new ToggleableAppBarItem$MenuContent$1(this), q2, 54);
            boolean z4 = (i3 & 112) == 32;
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            boolean z5 = z4 | z2;
            Object g2 = q2.g();
            if (z5 || g2 == Composer.f14567a.a()) {
                g2 = new X7(this, appBarMenuState2);
                q2.N(g2);
            }
            composer2 = q2;
            AndroidMenu_androidKt.e(e2, (Function0) g2, (Modifier) null, (Function2) null, (Function2) null, z3, (MenuItemColors) null, (PaddingValues) null, (MutableInteractionSource) null, q2, 6, 476);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new Y7(this, appBarMenuState2, i4));
        }
    }

    public void b(Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-53051696);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-53051696, i3, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent (AppBarDsl.kt:193)");
            }
            Composer composer2 = q2;
            TooltipKt.j(TooltipDefaults.f11582a.e(TooltipAnchorPosition.f11568b.a(), 0.0f, composer2, 390, 2), ComposableLambdaKt.e(-1965247803, true, new ToggleableAppBarItem$AppbarContent$1(this), q2, 54), TooltipKt.z(false, false, (MutatorMutex) null, composer2, 0, 7), (Modifier) null, (Function0) null, false, false, false, ComposableLambdaKt.e(694023085, true, new ToggleableAppBarItem$AppbarContent$2(this), q2, 54), q2, 100663344, 248);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new Z7(this, i2));
        }
    }
}
