package com.hansecom.abt.presentation.screens.home;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import com.hansecom.abt.presentation.screens.home.trip.TripPlannerScreenKt;
import com.hansecom.abt.presentation.screens.home.trip.TripPlannerViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HomeNavigationKt$HomeNavigation$1$1$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MainActivity f34976A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34977z;

    public HomeNavigationKt$HomeNavigation$1$1$1$1(NavHostController navHostController, MainActivity mainActivity) {
        this.f34977z = navHostController;
        this.f34976A = mainActivity;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(1168649321, i2, -1, "com.hansecom.abt.presentation.screens.home.HomeNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeNavigation.kt:43)");
        }
        NavHostController navHostController = this.f34977z;
        boolean g2 = ((AppFeatures) composer.C(AppFeaturesKt.c())).g();
        final MainActivity mainActivity = this.f34976A;
        AppFeatureGuardKt.b(navHostController, g2, (String) null, ComposableLambdaKt.e(-908906069, true, new Function2<Composer, Integer, Unit>() {
            public static final Unit e(MainActivity mainActivity, String str, String str2) {
                Intrinsics.i(str, "url");
                mainActivity.C0(str, str2);
                return Unit.f40552a;
            }

            public final void c(Composer composer, int i2) {
                if ((i2 & 3) != 2 || !composer.t()) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(-908906069, i2, -1, "com.hansecom.abt.presentation.screens.home.HomeNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeNavigation.kt:44)");
                    }
                    LaunchTracingKt.c("TripPlannerScreen", composer, 6);
                    composer.X(-1248569708);
                    boolean l2 = composer.l(mainActivity);
                    MainActivity mainActivity = mainActivity;
                    Object g2 = composer.g();
                    if (l2 || g2 == Composer.f14567a.a()) {
                        g2 = new C0506d(mainActivity);
                        composer.N(g2);
                    }
                    composer.M();
                    TripPlannerScreenKt.e((TripPlannerViewModel) null, (Function2) g2, composer, 0, 1);
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
