package com.hansecom.abt.presentation.screens.guest;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel;
import com.hansecom.abt.util.CallDeviceOnBackButtonKt;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.guest.ComposableSingletons$GuestNavigationKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$GuestNavigationKt$lambda1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GuestNavigationKt$lambda1$1 f34683z = new ComposableSingletons$GuestNavigationKt$lambda1$1();

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1933200941, i2, -1, "com.hansecom.abt.presentation.screens.guest.ComposableSingletons$GuestNavigationKt.lambda-1.<anonymous> (GuestNavigation.kt:62)");
        }
        LaunchTracingKt.c("CheckFareMediaBalanceScreen", composer, 6);
        CheckFareMediaBalanceScreenKt.c((CheckFareMediaBalanceViewModel) null, CallDeviceOnBackButtonKt.b(composer, 0), composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
