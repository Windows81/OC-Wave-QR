package com.hansecom.abt.presentation.screens.auth.register;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.serialization.RouteDeserializerKt;
import com.hansecom.abt.presentation.screens.auth.register.RegistrationStep;
import com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.RegisterChooseQuestionStepScreenKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RegisterNavigationKt$RegisterNavigation$1$1$1$3 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34396z;

    public RegisterNavigationKt$RegisterNavigation$1$1$1$3(NavBackStackEntry navBackStackEntry) {
        this.f34396z = navBackStackEntry;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1932502789, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.RegisterNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegisterNavigation.kt:70)");
        }
        composer.X(1550536866);
        boolean W = composer.W(navBackStackEntry);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            Bundle e2 = navBackStackEntry.e();
            if (e2 == null) {
                e2 = new Bundle();
            }
            Map o2 = navBackStackEntry.g().o();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.e(o2.size()));
            for (Map.Entry entry : o2.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).a());
            }
            g2 = Boolean.valueOf(((RegistrationStep.ChooseQuestion) RouteDeserializerKt.a(RegistrationStep.ChooseQuestion.Companion.serializer(), e2, linkedHashMap)).a());
            composer.N(g2);
        }
        boolean booleanValue = ((Boolean) g2).booleanValue();
        composer.M();
        NavBackStackEntry navBackStackEntry2 = this.f34396z;
        composer.f(1890788296);
        ViewModelProvider.Factory a2 = HiltViewModelKt.a(navBackStackEntry2, composer, 0);
        composer.f(1729797275);
        ViewModel b2 = ViewModelKt.b(RegisterViewModel.class, navBackStackEntry2, (String) null, a2, navBackStackEntry2 != null ? navBackStackEntry2.n() : CreationExtras.Empty.f22064c, composer, 36936, 0);
        composer.S();
        composer.S();
        RegisterChooseQuestionStepScreenKt.e((RegisterViewModel) b2, booleanValue, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
