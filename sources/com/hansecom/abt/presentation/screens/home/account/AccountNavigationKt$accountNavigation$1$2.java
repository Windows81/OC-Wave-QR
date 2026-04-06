package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AccountNavigationKt$accountNavigation$1$2 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35047z;

    public AccountNavigationKt$accountNavigation$1$2(NavHostController navHostController) {
        this.f35047z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit e(NavHostController navHostController) {
        navHostController.a0();
        return Unit.f40552a;
    }

    public final void c(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-116008739, i2, -1, "com.hansecom.abt.presentation.screens.home.account.accountNavigation.<anonymous>.<anonymous> (AccountNavigation.kt:80)");
        }
        LaunchTracingKt.c("AccountInformationScreen", composer, 6);
        composer.X(-1771353882);
        boolean l2 = composer.l(this.f35047z);
        NavHostController navHostController = this.f35047z;
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new C0473n(navHostController);
            composer.N(g2);
        }
        composer.M();
        AccountInformationScreenKt.e((Function0) g2, (AccountInformationViewModel) null, composer, 0, 2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
