package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel;
import com.hansecom.abt.util.CallDeviceOnBackButtonKt;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.ComposableSingletons$AccountNavigationKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AccountNavigationKt$lambda1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AccountNavigationKt$lambda1$1 f35084z = new ComposableSingletons$AccountNavigationKt$lambda1$1();

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1214658878, i2, -1, "com.hansecom.abt.presentation.screens.home.account.ComposableSingletons$AccountNavigationKt.lambda-1.<anonymous> (AccountNavigation.kt:100)");
        }
        LaunchTracingKt.c("AccountPaymentMethodDetailsScreen", composer, 6);
        PaymentMethodDetailsScreenKt.y((PaymentMethodDetailsViewModel) null, CallDeviceOnBackButtonKt.b(composer, 0), CallDeviceOnBackButtonKt.b(composer, 0), composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
