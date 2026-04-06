package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.ComposableSingletons$CardOptionsNavigationKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$CardOptionsNavigationKt$lambda2$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CardOptionsNavigationKt$lambda2$1 f36586z = new ComposableSingletons$CardOptionsNavigationKt$lambda2$1();

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(1613571561, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.ComposableSingletons$CardOptionsNavigationKt.lambda-2.<anonymous> (CardOptionsNavigation.kt:304)");
        }
        LaunchTracingKt.c("FareCappingScreen", composer, 6);
        FareCappingScreenKt.i((FareCappingViewModel) null, composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
