package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaNavigationKt$fareMediaNavigation$1$3 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35945z;

    public FareMediaNavigationKt$fareMediaNavigation$1$3(NavHostController navHostController) {
        this.f35945z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1865606201, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareMediaNavigation.<anonymous>.<anonymous> (FareMediaNavigation.kt:76)");
        }
        NavHostController navHostController = this.f35945z;
        boolean I = ((AppFeatures) composer.C(AppFeaturesKt.c())).I();
        final NavHostController navHostController2 = this.f35945z;
        AppFeatureGuardKt.b(navHostController, I, "Virtual card creation is not supported yet", ComposableLambdaKt.e(1124035465, true, new Function2<Composer, Integer, Unit>() {
            /* access modifiers changed from: private */
            public static final Unit f(NavHostController navHostController) {
                navHostController.c0();
                return Unit.f40552a;
            }

            public static final Unit g(NavHostController navHostController) {
                navHostController.c0();
                return Unit.f40552a;
            }

            public final void e(Composer composer, int i2) {
                if ((i2 & 3) != 2 || !composer.t()) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(1124035465, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareMediaNavigation.<anonymous>.<anonymous>.<anonymous> (FareMediaNavigation.kt:81)");
                    }
                    if (((AppFeatures) composer.C(AppFeaturesKt.c())).F()) {
                        composer.X(-106546541);
                        LaunchTracingKt.c("FareMediaPurchaseCardScreen", composer, 6);
                        composer.X(273661721);
                        boolean l2 = composer.l(navHostController2);
                        NavHostController navHostController = navHostController2;
                        Object g2 = composer.g();
                        if (l2 || g2 == Composer.f14567a.a()) {
                            g2 = new C0577l(navHostController);
                            composer.N(g2);
                        }
                        composer.M();
                        FareMediaPurchaseCardScreenKt.c((FareMediaPurchaseCardViewModel) null, (Function0) g2, composer, 0, 1);
                        composer.M();
                    } else {
                        composer.X(-106360169);
                        LaunchTracingKt.c("FareMediaCreateCardScreen", composer, 6);
                        composer.X(273667609);
                        boolean l3 = composer.l(navHostController2);
                        NavHostController navHostController2 = navHostController2;
                        Object g3 = composer.g();
                        if (l3 || g3 == Composer.f14567a.a()) {
                            g3 = new C0579m(navHostController2);
                            composer.N(g3);
                        }
                        composer.M();
                        FareMediaCreateCardScreenKt.c((FareMediaCreateCardViewModel) null, (Function0) g3, composer, 0, 1);
                        composer.M();
                    }
                    if (ComposerKt.P()) {
                        ComposerKt.X();
                        return;
                    }
                    return;
                }
                composer.B();
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                e((Composer) obj, ((Number) obj2).intValue());
                return Unit.f40552a;
            }
        }, composer, 54), composer, 3456, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
