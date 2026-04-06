package com.hansecom.abt.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavHostController;
import com.hansecom.abt.presentation.navigation.NavigationBarsHelper;
import com.hansecom.abt.presentation.screens.home.HomeNavigationKt;
import com.hansecom.abt.presentation.screens.main.MainNavigationKt;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import com.hansecom.abt.ui.components.bottomBar.BottomBarKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.ScaffoldImePaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ScreenContentKt {
    public static final void d(Modifier modifier, long j2, long j3, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        long j4;
        long j5;
        long j6;
        Modifier modifier3;
        Function2 function22 = function2;
        int i5 = i2;
        Intrinsics.i(function22, "content");
        Composer q2 = composer.q(-328414550);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i4 = i5;
        }
        if ((i5 & 48) == 0) {
            j4 = j2;
            i4 |= ((i3 & 2) != 0 || !q2.j(j4)) ? 16 : 32;
        } else {
            j4 = j2;
        }
        if ((i5 & 384) == 0) {
            j5 = j3;
            i4 |= ((i3 & 4) != 0 || !q2.j(j5)) ? 128 : 256;
        } else {
            j5 = j3;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i4 |= q2.l(function22) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !q2.t()) {
            q2.p();
            if ((i5 & 1) == 0 || q2.J()) {
                modifier3 = i6 != 0 ? Modifier.f15489d : modifier2;
                if ((i3 & 2) != 0) {
                    j4 = AbtTheme.f38851a.b(q2, 6).z();
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    j5 = AbtTheme.f38851a.b(q2, 6).q();
                    i4 &= -897;
                }
            } else {
                q2.B();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                modifier3 = modifier2;
            }
            int i7 = i4;
            long j7 = j4;
            long j8 = j5;
            q2.U();
            if (ComposerKt.P()) {
                ComposerKt.Y(-328414550, i7, -1, "com.hansecom.abt.ui.components.ScreenContent (ScreenContent.kt:30)");
            }
            NavHostController navHostController = (NavHostController) q2.C(HomeNavigationKt.f());
            q2.X(1945234189);
            if (navHostController == null) {
                navHostController = (NavHostController) q2.C(MainNavigationKt.l());
            }
            q2.M();
            Object[] objArr = new Object[0];
            q2.X(1945237489);
            boolean l2 = q2.l(navHostController);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new c(navHostController);
                q2.N(g2);
            }
            q2.M();
            boolean booleanValue = ((Boolean) RememberSaveableKt.j(objArr, (Function0) g2, q2, 0)).booleanValue();
            Object[] objArr2 = new Object[0];
            q2.X(1945241012);
            boolean l3 = q2.l(navHostController);
            Object g3 = q2.g();
            if (l3 || g3 == Composer.f14567a.a()) {
                g3 = new d(navHostController);
                q2.N(g3);
            }
            q2.M();
            int i8 = i7 << 3;
            SurfaceKt.c(SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), (Shape) null, j7, j8, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(-843932113, true, new ScreenContentKt$ScreenContent$1(modifier3, booleanValue, ((Boolean) RememberSaveableKt.j(objArr2, (Function0) g3, q2, 0)).booleanValue(), function22), q2, 54), q2, (i8 & 896) | 12582918 | (i8 & 7168), 114);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            j4 = j7;
            j6 = j8;
        } else {
            q2.B();
            modifier3 = modifier2;
            j6 = j5;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(modifier3, j4, j6, function2, i2, i3));
        }
    }

    public static final boolean e(NavHostController navHostController) {
        return NavigationBarsHelper.f34208a.b(navHostController.G());
    }

    public static final boolean f(NavHostController navHostController) {
        return NavigationBarsHelper.f34208a.a(navHostController.G());
    }

    public static final Unit g(Modifier modifier, long j2, long j3, Function2 function2, int i2, int i3, Composer composer, int i4) {
        d(modifier, j2, j3, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Modifier i(Modifier modifier, boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(374601509);
        if (ComposerKt.P()) {
            ComposerKt.Y(374601509, i2, -1, "com.hansecom.abt.ui.components.navigationBarsPaddings (ScreenContent.kt:60)");
        }
        if (((Boolean) composer.C(InspectionModeKt.a())).booleanValue()) {
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            return modifier;
        }
        composer.X(856325174);
        float m2 = z2 ? Dp.m(AbtTopBarKt.d() + WindowInsetsKt.g(WindowInsets_androidKt.e(WindowInsets.f4206a, composer, 6), composer, 0).d()) : Dp.m((float) 0);
        composer.M();
        Modifier a2 = ScaffoldImePaddingKt.a(modifier, PaddingKt.e(0.0f, m2, 0.0f, z3 ? Dp.m(BottomBarKt.j() + WindowInsetsKt.g(WindowInsets_androidKt.e(WindowInsets.f4206a, composer, 6), composer, 0).a()) : Dp.m((float) 0), 5, (Object) null));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }
}
