package com.hansecom.abt.presentation.screens.auth;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.auth.register.RegistrationStep;
import com.hansecom.abt.presentation.screens.main.HomeDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AuthNavigationKt$authNavigation$1$3 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34249z;

    public AuthNavigationKt$authNavigation$1$3(NavHostController navHostController) {
        this.f34249z = navHostController;
    }

    public static final Unit A(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        navHostController.W(new RegisterResultExitingAccountDestination(str), new n());
        return Unit.f40552a;
    }

    public static final Unit B(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.f(navOptionsBuilder, WelcomeDestination.INSTANCE, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit C(NavHostController navHostController) {
        navHostController.W(HomeDestination.INSTANCE, new o());
        return Unit.f40552a;
    }

    public static final Unit D(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.e(navOptionsBuilder, 0, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit E(NavHostController navHostController) {
        navHostController.W(LoginDestination.INSTANCE, new w());
        return Unit.f40552a;
    }

    public static final Unit F(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.f(navOptionsBuilder, WelcomeDestination.INSTANCE, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit G(NavHostController navHostController) {
        NavController.Y(navHostController, RegistrationStep.Questions.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit v(NavHostController navHostController, NavHostController navHostController2) {
        if (!navHostController.a0()) {
            navHostController2.a0();
        }
        return Unit.f40552a;
    }

    public static final Unit w(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        navHostController.W(new RegisterResultNeedsActivationDestination(str), new v());
        return Unit.f40552a;
    }

    public static final Unit x(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.f(navOptionsBuilder, WelcomeDestination.INSTANCE, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit y(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        navHostController.W(new RegisterResultExitingAccountNeedsActivationDestination(str), new x());
        return Unit.f40552a;
    }

    public static final Unit z(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.f(navOptionsBuilder, WelcomeDestination.INSTANCE, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        u((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(androidx.compose.animation.AnimatedContentScope r15, androidx.navigation.NavBackStackEntry r16, androidx.compose.runtime.Composer r17, int r18) {
        /*
            r14 = this;
            r0 = r14
            r10 = r17
            r1 = r18
            java.lang.String r2 = "$this$composable"
            r3 = r15
            kotlin.jvm.internal.Intrinsics.i(r15, r2)
            java.lang.String r2 = "backStackEntry"
            r3 = r16
            kotlin.jvm.internal.Intrinsics.i(r3, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0021
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.auth.authNavigation.<anonymous>.<anonymous> (AuthNavigation.kt:97)"
            r5 = 1215883103(0x4878e75f, float:254877.48)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0021:
            java.lang.String r2 = "RegisterScreen"
            r4 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r2, r10, r4)
            r2 = 0
            androidx.navigation.Navigator[] r4 = new androidx.navigation.Navigator[r2]
            androidx.navigation.NavHostController r2 = androidx.navigation.compose.NavHostControllerKt.e(r4, r10, r2)
            r4 = 213621546(0xcbb9b2a, float:2.8905298E-31)
            r10.X(r4)
            boolean r4 = r10.l(r2)
            androidx.navigation.NavHostController r5 = r0.f34249z
            boolean r5 = r10.l(r5)
            r4 = r4 | r5
            androidx.navigation.NavHostController r5 = r0.f34249z
            java.lang.Object r6 = r17.g()
            if (r4 != 0) goto L_0x004f
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0057
        L_0x004f:
            com.hansecom.abt.presentation.screens.auth.m r6 = new com.hansecom.abt.presentation.screens.auth.m
            r6.<init>(r2, r5)
            r10.N(r6)
        L_0x0057:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r17.M()
            r5 = 213627665(0xcbbb311, float:2.8919684E-31)
            r10.X(r5)
            androidx.navigation.NavHostController r5 = r0.f34249z
            boolean r5 = r10.l(r5)
            androidx.navigation.NavHostController r6 = r0.f34249z
            java.lang.Object r7 = r17.g()
            if (r5 != 0) goto L_0x0079
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x0081
        L_0x0079:
            com.hansecom.abt.presentation.screens.auth.p r7 = new com.hansecom.abt.presentation.screens.auth.p
            r7.<init>(r6)
            r10.N(r7)
        L_0x0081:
            r5 = r7
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r17.M()
            r6 = 213633091(0xcbbc843, float:2.893244E-31)
            r10.X(r6)
            androidx.navigation.NavHostController r6 = r0.f34249z
            boolean r6 = r10.l(r6)
            androidx.navigation.NavHostController r7 = r0.f34249z
            java.lang.Object r8 = r17.g()
            if (r6 != 0) goto L_0x00a3
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x00ab
        L_0x00a3:
            com.hansecom.abt.presentation.screens.auth.q r8 = new com.hansecom.abt.presentation.screens.auth.q
            r8.<init>(r7)
            r10.N(r8)
        L_0x00ab:
            r6 = r8
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r17.M()
            r7 = 213639249(0xcbbe051, float:2.8946917E-31)
            r10.X(r7)
            boolean r7 = r10.l(r2)
            java.lang.Object r8 = r17.g()
            if (r7 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00d1
        L_0x00c9:
            com.hansecom.abt.presentation.screens.auth.r r8 = new com.hansecom.abt.presentation.screens.auth.r
            r8.<init>(r2)
            r10.N(r8)
        L_0x00d1:
            r7 = r8
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r17.M()
            r8 = 213659199(0xcbc2e3f, float:2.899382E-31)
            r10.X(r8)
            androidx.navigation.NavHostController r8 = r0.f34249z
            boolean r8 = r10.l(r8)
            androidx.navigation.NavHostController r9 = r0.f34249z
            java.lang.Object r11 = r17.g()
            if (r8 != 0) goto L_0x00f3
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x00fb
        L_0x00f3:
            com.hansecom.abt.presentation.screens.auth.s r11 = new com.hansecom.abt.presentation.screens.auth.s
            r11.<init>(r9)
            r10.N(r11)
        L_0x00fb:
            r8 = r11
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r17.M()
            r9 = 213644493(0xcbbf4cd, float:2.8959246E-31)
            r10.X(r9)
            androidx.navigation.NavHostController r9 = r0.f34249z
            boolean r9 = r10.l(r9)
            androidx.navigation.NavHostController r11 = r0.f34249z
            java.lang.Object r12 = r17.g()
            if (r9 != 0) goto L_0x011d
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x0125
        L_0x011d:
            com.hansecom.abt.presentation.screens.auth.t r12 = new com.hansecom.abt.presentation.screens.auth.t
            r12.<init>(r11)
            r10.N(r12)
        L_0x0125:
            r9 = r12
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r17.M()
            r11 = 213652062(0xcbc125e, float:2.897704E-31)
            r10.X(r11)
            androidx.navigation.NavHostController r11 = r0.f34249z
            boolean r11 = r10.l(r11)
            androidx.navigation.NavHostController r12 = r0.f34249z
            java.lang.Object r13 = r17.g()
            if (r11 != 0) goto L_0x0147
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x014f
        L_0x0147:
            com.hansecom.abt.presentation.screens.auth.u r13 = new com.hansecom.abt.presentation.screens.auth.u
            r13.<init>(r12)
            r10.N(r13)
        L_0x014f:
            r11 = r13
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r17.M()
            int r1 = r1 >> 3
            r12 = r1 & 14
            r13 = 0
            r1 = r16
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r17
            r11 = r12
            r12 = r13
            com.hansecom.abt.presentation.screens.auth.register.RegisterScreenKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0173
            androidx.compose.runtime.ComposerKt.X()
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.AuthNavigationKt$authNavigation$1$3.u(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}
