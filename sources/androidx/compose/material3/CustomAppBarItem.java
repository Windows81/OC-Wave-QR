package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class CustomAppBarItem implements AppBarItem {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f9620a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f9621b;

    public static final Unit e(CustomAppBarItem customAppBarItem, int i2, Composer composer, int i3) {
        customAppBarItem.b(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit f(CustomAppBarItem customAppBarItem, AppBarMenuState appBarMenuState, int i2, Composer composer, int i3) {
        customAppBarItem.a(appBarMenuState, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public void a(AppBarMenuState appBarMenuState, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1853735176);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(appBarMenuState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(this) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1853735176, i3, -1, "androidx.compose.material3.CustomAppBarItem.MenuContent (AppBarDsl.kt:233)");
            }
            this.f9621b.d(appBarMenuState, q2, Integer.valueOf(i3 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0289y0(this, appBarMenuState, i2));
        }
    }

    public void b(Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1121775917);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1121775917, i3, -1, "androidx.compose.material3.CustomAppBarItem.AppbarContent (AppBarDsl.kt:228)");
            }
            this.f9620a.m(q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0280x0(this, i2));
        }
    }
}
