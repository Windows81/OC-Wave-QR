package com.hansecom.abt.presentation.screens.auth.register;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.auth.register.RegistrationStep;
import com.hansecom.abt.presentation.screens.main.WebViewDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RegisterNavigationKt$RegisterNavigation$1$1$1$2 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34394A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f34395z;

    public RegisterNavigationKt$RegisterNavigation$1$1$1$2(NavBackStackEntry navBackStackEntry, NavHostController navHostController) {
        this.f34395z = navBackStackEntry;
        this.f34394A = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit g(NavHostController navHostController) {
        NavController.Y(navHostController, new RegistrationStep.ChooseQuestion(false), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h(NavHostController navHostController) {
        NavController.Y(navHostController, new RegistrationStep.ChooseQuestion(true), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit i(NavHostController navHostController, String str, String str2) {
        Intrinsics.i(str, "title");
        Intrinsics.i(str2, "url");
        NavController.Y(navHostController, new WebViewDestination(str2, str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function2} */
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
            java.lang.String r10 = "com.hansecom.abt.presentation.screens.auth.register.RegisterNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegisterNavigation.kt:47)"
            r0 = -1589618980(0xffffffffa14056dc, float:-6.516709E-19)
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r9, r10)
        L_0x0019:
            androidx.compose.runtime.ProvidableCompositionLocal r9 = com.hansecom.abt.presentation.screens.main.MainNavigationKt.l()
            java.lang.Object r9 = r11.C(r9)
            androidx.navigation.NavHostController r9 = (androidx.navigation.NavHostController) r9
            androidx.navigation.NavBackStackEntry r1 = r8.f34395z
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r11.f(r10)
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r3 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r1, r11, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r11.f(r10)
            if (r1 == 0) goto L_0x003e
            androidx.lifecycle.viewmodel.CreationExtras r10 = r1.n()
        L_0x003c:
            r4 = r10
            goto L_0x0041
        L_0x003e:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x003c
        L_0x0041:
            r6 = 36936(0x9048, float:5.1758E-41)
            r7 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel> r0 = com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel.class
            r2 = 0
            r5 = r11
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r11.S()
            r11.S()
            r0 = r10
            com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel r0 = (com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel) r0
            r10 = 1550509424(0x5c6ae570, float:2.64469655E17)
            r11.X(r10)
            androidx.navigation.NavHostController r10 = r8.f34394A
            boolean r10 = r11.l(r10)
            androidx.navigation.NavHostController r12 = r8.f34394A
            java.lang.Object r1 = r11.g()
            if (r10 != 0) goto L_0x0072
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r1 != r10) goto L_0x007a
        L_0x0072:
            com.hansecom.abt.presentation.screens.auth.register.d r1 = new com.hansecom.abt.presentation.screens.auth.register.d
            r1.<init>(r12)
            r11.N(r1)
        L_0x007a:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r11.M()
            r10 = 1550514991(0x5c6afb2f, float:2.64565295E17)
            r11.X(r10)
            androidx.navigation.NavHostController r10 = r8.f34394A
            boolean r10 = r11.l(r10)
            androidx.navigation.NavHostController r12 = r8.f34394A
            java.lang.Object r2 = r11.g()
            if (r10 != 0) goto L_0x009b
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r2 != r10) goto L_0x00a3
        L_0x009b:
            com.hansecom.abt.presentation.screens.auth.register.e r2 = new com.hansecom.abt.presentation.screens.auth.register.e
            r2.<init>(r12)
            r11.N(r2)
        L_0x00a3:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r11.M()
            r10 = 1550520333(0x5c6b100d, float:2.6465707E17)
            r11.X(r10)
            boolean r10 = r11.l(r9)
            java.lang.Object r12 = r11.g()
            if (r10 != 0) goto L_0x00c0
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x00c8
        L_0x00c0:
            com.hansecom.abt.presentation.screens.auth.register.f r12 = new com.hansecom.abt.presentation.screens.auth.register.f
            r12.<init>(r9)
            r11.N(r12)
        L_0x00c8:
            r3 = r12
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r11.M()
            r5 = 0
            r4 = r11
            com.hansecom.abt.presentation.screens.auth.register.questionsStep.RegisterQuestionsStepScreenKt.i(r0, r1, r2, r3, r4, r5)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00dc
            androidx.compose.runtime.ComposerKt.X()
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.RegisterNavigationKt$RegisterNavigation$1$1$1$2.f(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        f((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
