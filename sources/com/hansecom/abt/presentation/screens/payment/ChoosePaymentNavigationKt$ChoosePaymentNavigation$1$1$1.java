package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChoosePaymentNavigationKt$ChoosePaymentNavigation$1$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37782A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f37783z;

    public ChoosePaymentNavigationKt$ChoosePaymentNavigation$1$1$1(Function0 function0, Function1 function1) {
        this.f37783z = function0;
        this.f37782A = function1;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1253117115, i2, -1, "com.hansecom.abt.presentation.screens.payment.ChoosePaymentNavigation.<anonymous>.<anonymous>.<anonymous> (ChoosePaymentNavigation.kt:34)");
        }
        ChoosePaymentMethodScreenKt.o((ChoosePaymentMethodViewModel) null, this.f37783z, this.f37782A, composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
