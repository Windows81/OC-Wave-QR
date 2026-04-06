package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.serialization.RouteSerializerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class CardOptionsNavigationKt$cardOptionsNavigation$12 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36537z;

    public CardOptionsNavigationKt$cardOptionsNavigation$12(NavHostController navHostController) {
        this.f36537z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit e(NavHostController navHostController) {
        int g2 = RouteSerializerKt.g(CardOptionsPassesDestination.Companion.serializer());
        if (NavController.z(navHostController, navHostController.K(), g2, true, (NavDestination) null, 4, (Object) null) != null) {
            navHostController.e0(g2, false, false);
            return Unit.f40552a;
        }
        throw new IllegalArgumentException(("Destination with route " + Reflection.b(CardOptionsPassesDestination.class).e() + " cannot be found in navigation graph " + navHostController.K()).toString());
    }

    public final void c(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1544996649, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:334)");
        }
        LaunchTracingKt.c("PassCheckoutScreen", composer, 6);
        composer.X(188533918);
        boolean l2 = composer.l(this.f36537z);
        NavHostController navHostController = this.f36537z;
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new C0550o(navHostController);
            composer.N(g2);
        }
        composer.M();
        PassCheckoutScreenKt.t((PassCheckoutViewModel) null, (Function0) g2, composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
