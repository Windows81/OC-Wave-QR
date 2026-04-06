package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.serialization.RouteSerializerKt;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class CardOptionsNavigationKt$cardOptionsNavigation$9 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36557z;

    public CardOptionsNavigationKt$cardOptionsNavigation$9(NavHostController navHostController) {
        this.f36557z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(1086177511, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:284)");
        }
        NavHostController navHostController = this.f36557z;
        boolean e2 = ((AppFeatures) composer.C(AppFeaturesKt.c())).e();
        final NavHostController navHostController2 = this.f36557z;
        AppFeatureGuardKt.b(navHostController, e2, (String) null, ComposableLambdaKt.e(-556553303, true, new Function2<Composer, Integer, Unit>() {
            /* access modifiers changed from: private */
            public static final Unit e(NavHostController navHostController) {
                int g2 = RouteSerializerKt.g(CardOptionsInstitutionsDestination.Companion.serializer());
                if (NavController.z(navHostController, navHostController.K(), g2, true, (NavDestination) null, 4, (Object) null) != null) {
                    navHostController.e0(g2, false, false);
                    return Unit.f40552a;
                }
                throw new IllegalArgumentException(("Destination with route " + Reflection.b(CardOptionsInstitutionsDestination.class).e() + " cannot be found in navigation graph " + navHostController.K()).toString());
            }

            public final void c(Composer composer, int i2) {
                if ((i2 & 3) != 2 || !composer.t()) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(-556553303, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous>.<anonymous> (CardOptionsNavigation.kt:285)");
                    }
                    LaunchTracingKt.c("InstitutionDetailsScreen", composer, 6);
                    composer.X(2121558923);
                    boolean l2 = composer.l(navHostController2);
                    NavHostController navHostController = navHostController2;
                    Object g2 = composer.g();
                    if (l2 || g2 == Composer.f14567a.a()) {
                        g2 = new I(navHostController);
                        composer.N(g2);
                    }
                    composer.M();
                    InstitutionDetailsScreenKt.c((InstitutionDetailsViewModel) null, (Function0) g2, composer, 0, 1);
                    if (ComposerKt.P()) {
                        ComposerKt.X();
                        return;
                    }
                    return;
                }
                composer.B();
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                c((Composer) obj, ((Number) obj2).intValue());
                return Unit.f40552a;
            }
        }, composer, 54), composer, 3072, 4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
