package com.hansecom.abt.presentation.screens.auth;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.main.HomeDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AuthNavigationKt$authNavigation$1$2 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34248z;

    public AuthNavigationKt$authNavigation$1$2(NavHostController navHostController) {
        this.f34248z = navHostController;
    }

    public static final Unit p(NavHostController navHostController) {
        navHostController.a0();
        return Unit.f40552a;
    }

    public static final Unit q(NavHostController navHostController) {
        navHostController.W(HomeDestination.INSTANCE, new k());
        return Unit.f40552a;
    }

    public static final Unit s(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.e(navOptionsBuilder, 0, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit t(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        navHostController.W(new RegisterResultExitingAccountNeedsActivationDestination(str), new l());
        return Unit.f40552a;
    }

    public static final Unit u(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.f(navOptionsBuilder, WelcomeDestination.INSTANCE, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit v(NavHostController navHostController) {
        NavController.Y(navHostController, ResetPasswordDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit w(NavHostController navHostController) {
        NavController.Y(navHostController, RegisterDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        k((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(androidx.compose.animation.AnimatedContentScope r10, androidx.navigation.NavBackStackEntry r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r10 = "it"
            kotlin.jvm.internal.Intrinsics.i(r11, r10)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0019
            r10 = -1
            java.lang.String r11 = "com.hansecom.abt.presentation.screens.auth.authNavigation.<anonymous>.<anonymous> (AuthNavigation.kt:74)"
            r0 = 52301918(0x31e105e, float:4.6450815E-37)
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r10, r11)
        L_0x0019:
            java.lang.String r10 = "LoginScreen"
            r11 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r10, r12, r11)
            r10 = 213587825(0xcbb1771, float:2.882602E-31)
            r12.X(r10)
            androidx.navigation.NavHostController r10 = r9.f34248z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavHostController r11 = r9.f34248z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x003b
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x0043
        L_0x003b:
            com.hansecom.abt.presentation.screens.auth.f r13 = new com.hansecom.abt.presentation.screens.auth.f
            r13.<init>(r11)
            r12.N(r13)
        L_0x0043:
            r1 = r13
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r12.M()
            r10 = 213593517(0xcbb2dad, float:2.8839402E-31)
            r12.X(r10)
            androidx.navigation.NavHostController r10 = r9.f34248z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavHostController r11 = r9.f34248z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x0065
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x006d
        L_0x0065:
            com.hansecom.abt.presentation.screens.auth.g r13 = new com.hansecom.abt.presentation.screens.auth.g
            r13.<init>(r11)
            r12.N(r13)
        L_0x006d:
            r2 = r13
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r12.M()
            r10 = 213600895(0xcbb4a7f, float:2.8856748E-31)
            r12.X(r10)
            androidx.navigation.NavHostController r10 = r9.f34248z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavHostController r11 = r9.f34248z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x008f
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x0097
        L_0x008f:
            com.hansecom.abt.presentation.screens.auth.h r13 = new com.hansecom.abt.presentation.screens.auth.h
            r13.<init>(r11)
            r12.N(r13)
        L_0x0097:
            r3 = r13
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r12.M()
            r10 = 213604698(0xcbb595a, float:2.8865688E-31)
            r12.X(r10)
            androidx.navigation.NavHostController r10 = r9.f34248z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavHostController r11 = r9.f34248z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x00b9
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x00c1
        L_0x00b9:
            com.hansecom.abt.presentation.screens.auth.i r13 = new com.hansecom.abt.presentation.screens.auth.i
            r13.<init>(r11)
            r12.N(r13)
        L_0x00c1:
            r4 = r13
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r12.M()
            r10 = 213608165(0xcbb66e5, float:2.887384E-31)
            r12.X(r10)
            androidx.navigation.NavHostController r10 = r9.f34248z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavHostController r11 = r9.f34248z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x00e3
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x00eb
        L_0x00e3:
            com.hansecom.abt.presentation.screens.auth.j r13 = new com.hansecom.abt.presentation.screens.auth.j
            r13.<init>(r11)
            r12.N(r13)
        L_0x00eb:
            r5 = r13
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r12.M()
            r7 = 0
            r8 = 1
            r0 = 0
            r6 = r12
            com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt.j(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0101
            androidx.compose.runtime.ComposerKt.X()
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.AuthNavigationKt$authNavigation$1$2.k(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}
