package com.hansecom.abt.presentation.screens.main;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MainNavigationKt$MainNavigation$2$1$1$3 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37562z;

    public MainNavigationKt$MainNavigation$2$1$1$3(NavHostController navHostController) {
        this.f37562z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1816839364, i2, -1, "com.hansecom.abt.presentation.screens.main.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainNavigation.kt:116)");
        }
        AppFeatureGuardKt.b(this.f37562z, ((AppFeatures) composer.C(AppFeaturesKt.c())).s(), (String) null, ComposableSingletons$MainNavigationKt.f37526a.c(), composer, 3072, 4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
