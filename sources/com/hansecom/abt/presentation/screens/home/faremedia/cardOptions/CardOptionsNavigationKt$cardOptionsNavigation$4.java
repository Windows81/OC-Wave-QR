package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.serialization.RouteSerializerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class CardOptionsNavigationKt$cardOptionsNavigation$4 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36547z;

    public CardOptionsNavigationKt$cardOptionsNavigation$4(NavHostController navHostController) {
        this.f36547z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit e(NavHostController navHostController) {
        int g2 = RouteSerializerKt.g(FareMediaDestination.Companion.serializer());
        if (NavController.z(navHostController, navHostController.K(), g2, true, (NavDestination) null, 4, (Object) null) != null) {
            navHostController.e0(g2, false, false);
            return Unit.f40552a;
        }
        throw new IllegalArgumentException(("Destination with route " + Reflection.b(FareMediaDestination.class).e() + " cannot be found in navigation graph " + navHostController.K()).toString());
    }

    public final void c(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-232307614, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:210)");
        }
        LaunchTracingKt.c("CardInformationScreen", composer, 6);
        composer.X(188389654);
        boolean l2 = composer.l(this.f36547z);
        NavHostController navHostController = this.f36547z;
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new C(navHostController);
            composer.N(g2);
        }
        composer.M();
        CardInformationScreenKt.f((CardInformationViewModel) null, (Function0) g2, composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
