package com.hansecom.abt.presentation.screens.main;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.home.HomeScreenKt;
import com.hansecom.abt.presentation.screens.home.HomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MainNavigationKt$MainNavigation$2$1$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37559z;

    public MainNavigationKt$MainNavigation$2$1$1$1(NavHostController navHostController) {
        this.f37559z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit e(NavHostController navHostController) {
        NavController.Y(navHostController, BarcodeDisplayDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public final void c(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(1982692610, i2, -1, "com.hansecom.abt.presentation.screens.main.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainNavigation.kt:69)");
        }
        composer.X(204563930);
        boolean l2 = composer.l(this.f37559z);
        NavHostController navHostController = this.f37559z;
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new n(navHostController);
            composer.N(g2);
        }
        composer.M();
        HomeScreenKt.y((HomeViewModel) null, (Function0) g2, composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
