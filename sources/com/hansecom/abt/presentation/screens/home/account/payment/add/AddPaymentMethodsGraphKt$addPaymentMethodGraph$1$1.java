package com.hansecom.abt.presentation.screens.home.account.payment.add;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
public final class AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavController f35537z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35538a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.hansecom.abt.presentation.model.PaymentProvider[] r0 = com.hansecom.abt.presentation.model.PaymentProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.presentation.model.PaymentProvider r1 = com.hansecom.abt.presentation.model.PaymentProvider.NMI     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.presentation.model.PaymentProvider r1 = com.hansecom.abt.presentation.model.PaymentProvider.CYBERSOURCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f35538a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$1.WhenMappings.<clinit>():void");
        }
    }

    public AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$1(NavController navController) {
        this.f35537z = navController;
    }

    /* access modifiers changed from: private */
    public static final Unit h(NavController navController) {
        navController.a0();
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i(NavController navController) {
        NavController.Y(navController, AddPaymentMethodChooseCountryDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit k(NavController navController) {
        NavController.Y(navController, AddPaymentMethodChooseStateDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit p(NavController navController) {
        navController.a0();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.animation.AnimatedContentScope r10, androidx.navigation.NavBackStackEntry r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r10 = "it"
            kotlin.jvm.internal.Intrinsics.i(r11, r10)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0019
            r10 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addPaymentMethodGraph.<anonymous>.<anonymous> (AddPaymentMethodsGraph.kt:34)"
            r1 = 766385852(0x2dae1ebc, float:1.9795159E-11)
            androidx.compose.runtime.ComposerKt.Y(r1, r13, r10, r0)
        L_0x0019:
            r10 = 568660324(0x21e51164, float:1.5522247E-18)
            r12.X(r10)
            boolean r10 = r12.W(r11)
            androidx.navigation.NavController r11 = r9.f35537z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x0033
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x003c
        L_0x0033:
            com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodGraph r10 = com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodGraph.INSTANCE
            androidx.navigation.NavBackStackEntry r13 = r11.D(r10)
            r12.N(r13)
        L_0x003c:
            r1 = r13
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r12.M()
            androidx.compose.runtime.ProvidableCompositionLocal r10 = com.hansecom.abt.AppFeaturesKt.c()
            java.lang.Object r10 = r12.C(r10)
            com.hansecom.abt.AppFeatures r10 = (com.hansecom.abt.AppFeatures) r10
            com.hansecom.abt.presentation.model.PaymentProvider r10 = r10.u()
            int[] r11 = com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$1.WhenMappings.f35538a
            int r10 = r10.ordinal()
            r10 = r11[r10]
            r11 = 1
            r13 = 1729797275(0x671a9c9b, float:7.301333E23)
            r0 = 1890788296(0x70b323c8, float:4.435286E29)
            r8 = 0
            if (r10 == r11) goto L_0x00dd
            r11 = 2
            if (r10 != r11) goto L_0x00ce
            r10 = 449441892(0x1ac9f064, float:8.3520024E-23)
            r12.X(r10)
            r12.f(r0)
            androidx.lifecycle.ViewModelProvider$Factory r3 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r1, r12, r8)
            r12.f(r13)
            if (r1 == 0) goto L_0x007d
            androidx.lifecycle.viewmodel.CreationExtras r10 = r1.n()
        L_0x007b:
            r4 = r10
            goto L_0x0080
        L_0x007d:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x007b
        L_0x0080:
            r6 = 36936(0x9048, float:5.1758E-41)
            r7 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel> r0 = com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel.class
            r2 = 0
            r5 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.S()
            r12.S()
            r0 = r10
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel) r0
            kotlin.jvm.functions.Function0 r1 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r12, r8)
            r10 = 568694264(0x21e595f8, float:1.555734E-18)
            r12.X(r10)
            androidx.navigation.NavController r10 = r9.f35537z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavController r11 = r9.f35537z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x00b5
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x00bd
        L_0x00b5:
            com.hansecom.abt.presentation.screens.home.account.payment.add.h r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.h
            r13.<init>(r11)
            r12.N(r13)
        L_0x00bd:
            r2 = r13
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r12.M()
            r4 = 0
            r5 = 0
            r3 = r12
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt.h(r0, r1, r2, r3, r4, r5)
            r12.M()
            goto L_0x0198
        L_0x00ce:
            r10 = 568666016(0x21e527a0, float:1.5528132E-18)
            r12.X(r10)
            r12.M()
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00dd:
            r10 = 448851838(0x1ac0ef7e, float:7.979626E-23)
            r12.X(r10)
            r12.f(r0)
            androidx.lifecycle.ViewModelProvider$Factory r3 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r1, r12, r8)
            r12.f(r13)
            if (r1 == 0) goto L_0x00f5
            androidx.lifecycle.viewmodel.CreationExtras r10 = r1.n()
        L_0x00f3:
            r4 = r10
            goto L_0x00f8
        L_0x00f5:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00f3
        L_0x00f8:
            r6 = 36936(0x9048, float:5.1758E-41)
            r7 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel> r0 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel.class
            r2 = 0
            r5 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.S()
            r12.S()
            r0 = r10
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r0
            kotlin.jvm.functions.Function0 r1 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r12, r8)
            r10 = 568683352(0x21e56b58, float:1.5546057E-18)
            r12.X(r10)
            androidx.navigation.NavController r10 = r9.f35537z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavController r11 = r9.f35537z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x012d
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x0135
        L_0x012d:
            com.hansecom.abt.presentation.screens.home.account.payment.add.e r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.e
            r13.<init>(r11)
            r12.N(r13)
        L_0x0135:
            r2 = r13
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r12.M()
            r10 = 568674898(0x21e54a52, float:1.5537316E-18)
            r12.X(r10)
            androidx.navigation.NavController r10 = r9.f35537z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavController r11 = r9.f35537z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x0157
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x015f
        L_0x0157:
            com.hansecom.abt.presentation.screens.home.account.payment.add.f r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.f
            r13.<init>(r11)
            r12.N(r13)
        L_0x015f:
            r3 = r13
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r12.M()
            r10 = 568679996(0x21e55e3c, float:1.5542587E-18)
            r12.X(r10)
            androidx.navigation.NavController r10 = r9.f35537z
            boolean r10 = r12.l(r10)
            androidx.navigation.NavController r11 = r9.f35537z
            java.lang.Object r13 = r12.g()
            if (r10 != 0) goto L_0x0181
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r13 != r10) goto L_0x0189
        L_0x0181:
            com.hansecom.abt.presentation.screens.home.account.payment.add.g r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.g
            r13.<init>(r11)
            r12.N(r13)
        L_0x0189:
            r4 = r13
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r12.M()
            r6 = 0
            r7 = 0
            r5 = r12
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt.q(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.M()
        L_0x0198:
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x01a1
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$1.g(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        g((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
