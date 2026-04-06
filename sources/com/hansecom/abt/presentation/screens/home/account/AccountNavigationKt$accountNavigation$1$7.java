package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
public final class AccountNavigationKt$accountNavigation$1$7 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35053z;

    public AccountNavigationKt$accountNavigation$1$7(NavHostController navHostController) {
        this.f35053z = navHostController;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.animation.AnimatedContentScope r10, androidx.navigation.NavBackStackEntry r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r10 = "it"
            kotlin.jvm.internal.Intrinsics.i(r11, r10)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0019
            r10 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.account.accountNavigation.<anonymous>.<anonymous> (AccountNavigation.kt:147)"
            r1 = -2068695520(0xffffffff84b23620, float:-4.1897305E-36)
            androidx.compose.runtime.ComposerKt.Y(r1, r13, r10, r0)
        L_0x0019:
            java.lang.String r10 = "ChangeQuestionsChooseQuestionScreen"
            r13 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r10, r12, r13)
            r10 = -1771253421(0xffffffff966cd153, float:-1.9129979E-25)
            r12.X(r10)
            boolean r10 = r12.W(r11)
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x0037
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x0096
        L_0x0037:
            android.os.Bundle r10 = r11.e()
            if (r10 != 0) goto L_0x0042
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
        L_0x0042:
            androidx.navigation.NavDestination r13 = r11.g()
            java.util.Map r13 = r13.o()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r13.size()
            int r1 = kotlin.collections.MapsKt.e(r1)
            r0.<init>(r1)
            java.util.Set r13 = r13.entrySet()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x0061:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x007f
            java.lang.Object r1 = r13.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            androidx.navigation.NavArgument r1 = (androidx.navigation.NavArgument) r1
            androidx.navigation.NavType r1 = r1.a()
            r0.put(r2, r1)
            goto L_0x0061
        L_0x007f:
            com.hansecom.abt.presentation.screens.home.account.AccountChooseQuestionsDestination$Companion r13 = com.hansecom.abt.presentation.screens.home.account.AccountChooseQuestionsDestination.Companion
            kotlinx.serialization.KSerializer r13 = r13.serializer()
            java.lang.Object r10 = androidx.navigation.serialization.RouteDeserializerKt.a(r13, r10, r0)
            com.hansecom.abt.presentation.screens.home.account.AccountChooseQuestionsDestination r10 = (com.hansecom.abt.presentation.screens.home.account.AccountChooseQuestionsDestination) r10
            boolean r10 = r10.a()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r10)
            r12.N(r13)
        L_0x0096:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r10 = r13.booleanValue()
            r12.M()
            r13 = -1771249035(0xffffffff966ce275, float:-1.9135385E-25)
            r12.X(r13)
            boolean r11 = r12.W(r11)
            androidx.navigation.NavHostController r13 = r9.f35053z
            java.lang.Object r0 = r12.g()
            if (r11 != 0) goto L_0x00b9
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x00c2
        L_0x00b9:
            com.hansecom.abt.presentation.screens.home.account.AccountChangeQuestionsGraph r11 = com.hansecom.abt.presentation.screens.home.account.AccountChangeQuestionsGraph.INSTANCE
            androidx.navigation.NavBackStackEntry r0 = r13.D(r11)
            r12.N(r0)
        L_0x00c2:
            r2 = r0
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            r12.M()
            r11 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r11)
            r11 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r11)
            r13 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r13)
            if (r2 == 0) goto L_0x00e1
            androidx.lifecycle.viewmodel.CreationExtras r13 = r2.n()
        L_0x00df:
            r5 = r13
            goto L_0x00e4
        L_0x00e1:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r13 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00df
        L_0x00e4:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r13 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r13 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r13
            kotlin.jvm.functions.Function0 r0 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r12, r11)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ChangeSecurityQuestionChooseQuestionScreenKt.d(r13, r10, r0, r12, r11)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0108
            androidx.compose.runtime.ComposerKt.X()
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountNavigationKt$accountNavigation$1$7.b(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
