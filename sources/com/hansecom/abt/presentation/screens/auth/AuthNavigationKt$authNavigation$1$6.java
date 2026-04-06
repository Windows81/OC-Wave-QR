package com.hansecom.abt.presentation.screens.auth;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AuthNavigationKt$authNavigation$1$6 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34252z;

    public AuthNavigationKt$authNavigation$1$6(NavHostController navHostController) {
        this.f34252z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit f(NavHostController navHostController) {
        navHostController.W(LoginDestination.INSTANCE, new B());
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.f(navOptionsBuilder, WelcomeDestination.INSTANCE, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.animation.AnimatedContentScope r7, androidx.navigation.NavBackStackEntry r8, androidx.compose.runtime.Composer r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r7 = "it"
            kotlin.jvm.internal.Intrinsics.i(r8, r7)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0019
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.auth.authNavigation.<anonymous>.<anonymous> (AuthNavigation.kt:162)"
            r0 = 1629938979(0x6126e523, float:1.9241691E20)
            androidx.compose.runtime.ComposerKt.Y(r0, r10, r7, r8)
        L_0x0019:
            r7 = 0
            kotlin.jvm.functions.Function0 r1 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r9, r7)
            r7 = 213697667(0xcbcc483, float:2.9084258E-31)
            r9.X(r7)
            androidx.navigation.NavHostController r7 = r6.f34252z
            boolean r7 = r9.l(r7)
            androidx.navigation.NavHostController r8 = r6.f34252z
            java.lang.Object r10 = r9.g()
            if (r7 != 0) goto L_0x003a
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x0042
        L_0x003a:
            com.hansecom.abt.presentation.screens.auth.A r10 = new com.hansecom.abt.presentation.screens.auth.A
            r10.<init>(r8)
            r9.N(r10)
        L_0x0042:
            r2 = r10
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r9.M()
            r4 = 0
            r5 = 1
            r0 = 0
            r3 = r9
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt.c(r0, r1, r2, r3, r4, r5)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0058
            androidx.compose.runtime.ComposerKt.X()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.AuthNavigationKt$authNavigation$1$6.e(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        e((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
