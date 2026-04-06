package com.hansecom.abt.presentation.screens.guest;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestDestination;
import com.hansecom.abt.presentation.screens.main.GuidedTourDestination;
import com.hansecom.abt.presentation.screens.main.WebViewDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GuestNavigationKt$guestNavigation$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34699z;

    public GuestNavigationKt$guestNavigation$1$1(NavHostController navHostController) {
        this.f34699z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit k(NavHostController navHostController) {
        NavController.Y(navHostController, GuidedTourDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit p(NavHostController navHostController) {
        navHostController.c0();
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit q(NavHostController navHostController) {
        NavController.Y(navHostController, new HelpRequestDestination(false, true, true, false, 8, (DefaultConstructorMarker) null), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit s(NavHostController navHostController) {
        NavController.Y(navHostController, GuestCheckFareMediaBalanceDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit t(NavHostController navHostController, String str, String str2) {
        Intrinsics.i(str, "url");
        NavController.Y(navHostController, new WebViewDestination(str, str2), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit u(MainActivity mainActivity, String str) {
        Intrinsics.i(str, "url");
        if (mainActivity != null) {
            mainActivity.B0(str);
        }
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(androidx.compose.animation.AnimatedContentScope r12, androidx.navigation.NavBackStackEntry r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r12 = "it"
            kotlin.jvm.internal.Intrinsics.i(r13, r12)
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0019
            r12 = -1
            java.lang.String r13 = "com.hansecom.abt.presentation.screens.guest.guestNavigation.<anonymous>.<anonymous> (GuestNavigation.kt:31)"
            r0 = 589877034(0x2328cf2a, float:9.151167E-18)
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r12, r13)
        L_0x0019:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.activity.compose.LocalActivityKt.a()
            java.lang.Object r12 = r14.C(r12)
            boolean r13 = r12 instanceof com.hansecom.abt.presentation.main.MainActivity
            if (r13 == 0) goto L_0x0028
            com.hansecom.abt.presentation.main.MainActivity r12 = (com.hansecom.abt.presentation.main.MainActivity) r12
            goto L_0x0029
        L_0x0028:
            r12 = 0
        L_0x0029:
            java.lang.String r13 = "GuestModeScreen"
            r15 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r13, r14, r15)
            r13 = -1653785008(0xffffffff9d6d3e50, float:-3.1398904E-21)
            r14.X(r13)
            androidx.navigation.NavHostController r13 = r11.f34699z
            boolean r13 = r14.l(r13)
            androidx.navigation.NavHostController r15 = r11.f34699z
            java.lang.Object r0 = r14.g()
            if (r13 != 0) goto L_0x004b
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x0053
        L_0x004b:
            com.hansecom.abt.presentation.screens.guest.j r0 = new com.hansecom.abt.presentation.screens.guest.j
            r0.<init>(r15)
            r14.N(r0)
        L_0x0053:
            r1 = r0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r14.M()
            r13 = -1653780971(0xffffffff9d6d4e15, float:-3.1407056E-21)
            r14.X(r13)
            androidx.navigation.NavHostController r13 = r11.f34699z
            boolean r13 = r14.l(r13)
            androidx.navigation.NavHostController r15 = r11.f34699z
            java.lang.Object r0 = r14.g()
            if (r13 != 0) goto L_0x0075
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x007d
        L_0x0075:
            com.hansecom.abt.presentation.screens.guest.k r0 = new com.hansecom.abt.presentation.screens.guest.k
            r0.<init>(r15)
            r14.N(r0)
        L_0x007d:
            r2 = r0
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r14.M()
            r13 = -1653769728(0xffffffff9d6d7a00, float:-3.1429761E-21)
            r14.X(r13)
            androidx.navigation.NavHostController r13 = r11.f34699z
            boolean r13 = r14.l(r13)
            androidx.navigation.NavHostController r15 = r11.f34699z
            java.lang.Object r0 = r14.g()
            if (r13 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x00a7
        L_0x009f:
            com.hansecom.abt.presentation.screens.guest.l r0 = new com.hansecom.abt.presentation.screens.guest.l
            r0.<init>(r15)
            r14.N(r0)
        L_0x00a7:
            r3 = r0
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r14.M()
            r13 = -1653765433(0xffffffff9d6d8ac7, float:-3.1438435E-21)
            r14.X(r13)
            androidx.navigation.NavHostController r13 = r11.f34699z
            boolean r13 = r14.l(r13)
            androidx.navigation.NavHostController r15 = r11.f34699z
            java.lang.Object r0 = r14.g()
            if (r13 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x00d1
        L_0x00c9:
            com.hansecom.abt.presentation.screens.guest.m r0 = new com.hansecom.abt.presentation.screens.guest.m
            r0.<init>(r15)
            r14.N(r0)
        L_0x00d1:
            r4 = r0
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r14.M()
            r13 = -1653760952(0xffffffff9d6d9c48, float:-3.1447484E-21)
            r14.X(r13)
            boolean r13 = r14.l(r12)
            java.lang.Object r15 = r14.g()
            if (r13 != 0) goto L_0x00ef
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r15 != r13) goto L_0x00f7
        L_0x00ef:
            com.hansecom.abt.presentation.screens.guest.n r15 = new com.hansecom.abt.presentation.screens.guest.n
            r15.<init>(r12)
            r14.N(r15)
        L_0x00f7:
            r5 = r15
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r14.M()
            r12 = -1653757697(0xffffffff9d6da8ff, float:-3.1454058E-21)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r11.f34699z
            boolean r12 = r14.l(r12)
            androidx.navigation.NavHostController r13 = r11.f34699z
            java.lang.Object r15 = r14.g()
            if (r12 != 0) goto L_0x0119
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x0121
        L_0x0119:
            com.hansecom.abt.presentation.screens.guest.o r15 = new com.hansecom.abt.presentation.screens.guest.o
            r15.<init>(r13)
            r14.N(r15)
        L_0x0121:
            r6 = r15
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r14.M()
            r9 = 0
            r10 = 64
            r7 = 0
            r8 = r14
            com.hansecom.abt.presentation.screens.guest.GuestScreenKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0138
            androidx.compose.runtime.ComposerKt.X()
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.GuestNavigationKt$guestNavigation$1$1.i(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        i((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
