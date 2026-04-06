package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
public final class AccountNavigationKt$accountNavigation$1$6$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35052z;

    public AccountNavigationKt$accountNavigation$1$6$1(NavHostController navHostController) {
        this.f35052z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit g(NavHostController navHostController) {
        NavController.Y(navHostController, new AccountChooseQuestionsDestination(false), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h(NavHostController navHostController) {
        NavController.Y(navHostController, new AccountChooseQuestionsDestination(true), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit i(NavHostController navHostController) {
        navHostController.a0();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.compose.animation.AnimatedContentScope r9, androidx.navigation.NavBackStackEntry r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r9 = "it"
            kotlin.jvm.internal.Intrinsics.i(r10, r9)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0019
            r9 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.account.accountNavigation.<anonymous>.<anonymous>.<anonymous> (AccountNavigation.kt:129)"
            r1 = 1799128578(0x6b3c8602, float:2.2791089E26)
            androidx.compose.runtime.ComposerKt.Y(r1, r12, r9, r0)
        L_0x0019:
            java.lang.String r9 = "ChangeQuestionsScreen"
            r12 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r9, r11, r12)
            r9 = -2055997644(0xffffffff8573f734, float:-1.1471209E-35)
            r11.X(r9)
            boolean r9 = r11.W(r10)
            androidx.navigation.NavHostController r10 = r8.f35052z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x0039
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x0042
        L_0x0039:
            com.hansecom.abt.presentation.screens.home.account.AccountChangeQuestionsGraph r9 = com.hansecom.abt.presentation.screens.home.account.AccountChangeQuestionsGraph.INSTANCE
            androidx.navigation.NavBackStackEntry r12 = r10.D(r9)
            r11.N(r12)
        L_0x0042:
            r1 = r12
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r11.M()
            r9 = 1890788296(0x70b323c8, float:4.435286E29)
            r11.f(r9)
            r9 = 0
            androidx.lifecycle.ViewModelProvider$Factory r3 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r1, r11, r9)
            r9 = 1729797275(0x671a9c9b, float:7.301333E23)
            r11.f(r9)
            if (r1 == 0) goto L_0x0061
            androidx.lifecycle.viewmodel.CreationExtras r9 = r1.n()
        L_0x005f:
            r4 = r9
            goto L_0x0064
        L_0x0061:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r9 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x005f
        L_0x0064:
            r6 = 36936(0x9048, float:5.1758E-41)
            r7 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel> r0 = com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel.class
            r2 = 0
            r5 = r11
            androidx.lifecycle.ViewModel r9 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r11.S()
            r11.S()
            r0 = r9
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r0
            r9 = -2055990456(0xffffffff85741348, float:-1.1476366E-35)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f35052z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f35052z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x0095
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x009d
        L_0x0095:
            com.hansecom.abt.presentation.screens.home.account.t r12 = new com.hansecom.abt.presentation.screens.home.account.t
            r12.<init>(r10)
            r11.N(r12)
        L_0x009d:
            r1 = r12
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r11.M()
            r9 = -2055984825(0xffffffff85742947, float:-1.1480406E-35)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f35052z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f35052z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x00bf
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x00c7
        L_0x00bf:
            com.hansecom.abt.presentation.screens.home.account.u r12 = new com.hansecom.abt.presentation.screens.home.account.u
            r12.<init>(r10)
            r11.N(r12)
        L_0x00c7:
            r2 = r12
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r11.M()
            r9 = -2055979835(0xffffffff85743cc5, float:-1.14839865E-35)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f35052z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f35052z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x00e9
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x00f1
        L_0x00e9:
            com.hansecom.abt.presentation.screens.home.account.v r12 = new com.hansecom.abt.presentation.screens.home.account.v
            r12.<init>(r10)
            r11.N(r12)
        L_0x00f1:
            r3 = r12
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r11.M()
            r5 = 0
            r6 = 0
            r4 = r11
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt.g(r0, r1, r2, r3, r4, r5, r6)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0106
            androidx.compose.runtime.ComposerKt.X()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountNavigationKt$accountNavigation$1$6$1.f(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        f((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
