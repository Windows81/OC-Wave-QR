package com.hansecom.abt.presentation.screens.home;

import androidx.activity.compose.LocalActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavHostController;
import com.hansecom.abt.presentation.main.MainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HomeNavigationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f34973a = CompositionLocalKt.h((SnapshotMutationPolicy) null, new C0449a(), 1, (Object) null);

    public static final void c(NavHostController navHostController, Composer composer, int i2) {
        int i3;
        Intrinsics.i(navHostController, "navController");
        Composer q2 = composer.q(-1038889177);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(navHostController) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1038889177, i3, -1, "com.hansecom.abt.presentation.screens.home.HomeNavigation (HomeNavigation.kt:30)");
            }
            Object C = q2.C(LocalActivityKt.a());
            Intrinsics.g(C, "null cannot be cast to non-null type com.hansecom.abt.presentation.main.MainActivity");
            CompositionLocalKt.c(f34973a.d(navHostController), ComposableLambdaKt.e(-582241305, true, new HomeNavigationKt$HomeNavigation$1(navHostController, (MainActivity) C), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0504b(navHostController, i2));
        }
    }

    public static final Unit d(NavHostController navHostController, int i2, Composer composer, int i3) {
        c(navHostController, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final NavHostController e() {
        return null;
    }

    public static final ProvidableCompositionLocal f() {
        return f34973a;
    }
}
