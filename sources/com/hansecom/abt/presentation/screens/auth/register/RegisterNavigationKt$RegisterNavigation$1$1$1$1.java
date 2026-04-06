package com.hansecom.abt.presentation.screens.auth.register;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.hansecom.abt.presentation.screens.auth.register.userInfoStep.RegisterUserInfoStepScreenKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RegisterNavigationKt$RegisterNavigation$1$1$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34393z;

    public RegisterNavigationKt$RegisterNavigation$1$1$1$1(NavBackStackEntry navBackStackEntry) {
        this.f34393z = navBackStackEntry;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1964262541, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.RegisterNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegisterNavigation.kt:43)");
        }
        NavBackStackEntry navBackStackEntry2 = this.f34393z;
        composer.f(1890788296);
        ViewModelProvider.Factory a2 = HiltViewModelKt.a(navBackStackEntry2, composer, 0);
        composer.f(1729797275);
        ViewModel b2 = ViewModelKt.b(RegisterViewModel.class, navBackStackEntry2, (String) null, a2, navBackStackEntry2 != null ? navBackStackEntry2.n() : CreationExtras.Empty.f22064c, composer, 36936, 0);
        composer.S();
        composer.S();
        RegisterUserInfoStepScreenKt.n((RegisterViewModel) b2, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
