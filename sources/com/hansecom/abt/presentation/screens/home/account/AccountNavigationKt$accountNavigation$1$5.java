package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AccountNavigationKt$accountNavigation$1$5 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35050z;

    public AccountNavigationKt$accountNavigation$1$5(NavHostController navHostController) {
        this.f35050z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(13855839, i2, -1, "com.hansecom.abt.presentation.screens.home.account.accountNavigation.<anonymous>.<anonymous> (AccountNavigation.kt:117)");
        }
        NavHostController navHostController = this.f35050z;
        boolean m2 = ((AppFeatures) composer.C(AppFeaturesKt.c())).m();
        final NavHostController navHostController2 = this.f35050z;
        AppFeatureGuardKt.b(navHostController, m2, (String) null, ComposableLambdaKt.e(-1679477343, true, new Function2<Composer, Integer, Unit>() {
            public static final Unit e(NavHostController navHostController) {
                navHostController.a0();
                return Unit.f40552a;
            }

            public final void c(Composer composer, int i2) {
                if ((i2 & 3) != 2 || !composer.t()) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(-1679477343, i2, -1, "com.hansecom.abt.presentation.screens.home.account.accountNavigation.<anonymous>.<anonymous>.<anonymous> (AccountNavigation.kt:118)");
                    }
                    LaunchTracingKt.c("ChangeAccountPinScreen", composer, 6);
                    composer.X(-2056010747);
                    boolean l2 = composer.l(navHostController2);
                    NavHostController navHostController = navHostController2;
                    Object g2 = composer.g();
                    if (l2 || g2 == Composer.f14567a.a()) {
                        g2 = new C0496s(navHostController);
                        composer.N(g2);
                    }
                    composer.M();
                    ChangeAccountPinScreenKt.d((ChangeAccountPinViewModel) null, (Function0) g2, composer, 0, 1);
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
