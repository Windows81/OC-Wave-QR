package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
public final class AccountNavigationKt$accountNavigation$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35046z;

    public AccountNavigationKt$accountNavigation$1$1(NavHostController navHostController) {
        this.f35046z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit p(NavHostController navHostController) {
        NavController.Y(navHostController, AccountInformationDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit q(NavHostController navHostController) {
        NavController.Y(navHostController, AccountChangePinDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit s(NavHostController navHostController) {
        navHostController.a0();
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit t(NavHostController navHostController) {
        NavController.Y(navHostController, ChangeAddressDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit u(NavHostController navHostController) {
        NavController.Y(navHostController, AccountPaymentMethodsDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit v(NavHostController navHostController) {
        NavController.Y(navHostController, AccountChangePasswordDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit w(NavHostController navHostController) {
        NavController.Y(navHostController, AccountChangeQuestionsGraph.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        k((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(androidx.compose.animation.AnimatedContentScope r12, androidx.navigation.NavBackStackEntry r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r12 = "it"
            kotlin.jvm.internal.Intrinsics.i(r13, r12)
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0019
            r12 = -1
            java.lang.String r13 = "com.hansecom.abt.presentation.screens.home.account.accountNavigation.<anonymous>.<anonymous> (AccountNavigation.kt:68)"
            r0 = 1408093990(0x53edcf26, float:2.04276525E12)
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r12, r13)
        L_0x0019:
            java.lang.String r12 = "AccountScreen"
            r13 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r12, r14, r13)
            r12 = -1771381247(0xffffffff966ade01, float:-1.8972422E-25)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f35046z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f35046z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x003b
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x0043
        L_0x003b:
            com.hansecom.abt.presentation.screens.home.account.g r15 = new com.hansecom.abt.presentation.screens.home.account.g
            r15.<init>(r13)
            r14.N(r15)
        L_0x0043:
            r0 = r15
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r14.M()
            r12 = -1771378308(0xffffffff966ae97c, float:-1.8976044E-25)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f35046z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f35046z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x0065
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x006d
        L_0x0065:
            com.hansecom.abt.presentation.screens.home.account.h r15 = new com.hansecom.abt.presentation.screens.home.account.h
            r15.<init>(r13)
            r14.N(r15)
        L_0x006d:
            r1 = r15
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r14.M()
            r12 = -1771375292(0xffffffff966af544, float:-1.8979762E-25)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f35046z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f35046z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x008f
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x0097
        L_0x008f:
            com.hansecom.abt.presentation.screens.home.account.i r15 = new com.hansecom.abt.presentation.screens.home.account.i
            r15.<init>(r13)
            r14.N(r15)
        L_0x0097:
            r2 = r15
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r14.M()
            r12 = -1771372028(0xffffffff966b0204, float:-1.8983785E-25)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f35046z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f35046z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x00b9
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x00c1
        L_0x00b9:
            com.hansecom.abt.presentation.screens.home.account.j r15 = new com.hansecom.abt.presentation.screens.home.account.j
            r15.<init>(r13)
            r14.N(r15)
        L_0x00c1:
            r3 = r15
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r14.M()
            r12 = -1771368737(0xffffffff966b0edf, float:-1.8987841E-25)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f35046z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f35046z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x00e3
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x00eb
        L_0x00e3:
            com.hansecom.abt.presentation.screens.home.account.k r15 = new com.hansecom.abt.presentation.screens.home.account.k
            r15.<init>(r13)
            r14.N(r15)
        L_0x00eb:
            r4 = r15
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r14.M()
            r12 = -1771365793(0xffffffff966b1a5f, float:-1.899147E-25)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f35046z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f35046z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x010d
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x0115
        L_0x010d:
            com.hansecom.abt.presentation.screens.home.account.l r15 = new com.hansecom.abt.presentation.screens.home.account.l
            r15.<init>(r13)
            r14.N(r15)
        L_0x0115:
            r5 = r15
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r14.M()
            r12 = -1771363194(0xffffffff966b2486, float:-1.8994674E-25)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f35046z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f35046z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x0137
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x013f
        L_0x0137:
            com.hansecom.abt.presentation.screens.home.account.m r15 = new com.hansecom.abt.presentation.screens.home.account.m
            r15.<init>(r13)
            r14.N(r15)
        L_0x013f:
            r6 = r15
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r14.M()
            r9 = 0
            r10 = 128(0x80, float:1.794E-43)
            r7 = 0
            r8 = r14
            com.hansecom.abt.presentation.screens.home.account.AccountScreenKt.m(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0156
            androidx.compose.runtime.ComposerKt.X()
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountNavigationKt$accountNavigation$1$1.k(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}
