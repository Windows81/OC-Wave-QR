package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.hansecom.abt.util.CallDeviceOnBackButtonKt;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpNavigationKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$HelpNavigationKt$lambda1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$HelpNavigationKt$lambda1$1 f34809z = new ComposableSingletons$HelpNavigationKt$lambda1$1();

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1714246183, i2, -1, "com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpNavigationKt.lambda-1.<anonymous> (HelpNavigation.kt:26)");
        }
        LaunchTracingKt.c("HelpRequestScreen", composer, 6);
        HelpRequestScreenKt.l0((HelpRequestViewModel) null, CallDeviceOnBackButtonKt.b(composer, 0), composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
