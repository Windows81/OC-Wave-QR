package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodGraph;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
public final class AccountNavigationKt$accountNavigation$1$3$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35048z;

    public AccountNavigationKt$accountNavigation$1$3$1(NavHostController navHostController) {
        this.f35048z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit f(NavHostController navHostController) {
        NavController.Y(navHostController, AddPaymentMethodGraph.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit g(NavHostController navHostController, long j2) {
        NavController.Y(navHostController, new AccountPaymentMethodDetailsDestination(j2), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function1} */
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
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.account.accountNavigation.<anonymous>.<anonymous>.<anonymous> (AccountNavigation.kt:89)"
            r0 = 297238923(0x11b7818b, float:2.8952146E-28)
            androidx.compose.runtime.ComposerKt.Y(r0, r10, r7, r8)
        L_0x0019:
            java.lang.String r7 = "AccountPaymentMethodsScreen"
            r8 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r7, r9, r8)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = com.hansecom.abt.presentation.screens.main.MainNavigationKt.l()
            java.lang.Object r7 = r9.C(r7)
            androidx.navigation.NavHostController r7 = (androidx.navigation.NavHostController) r7
            r8 = -2056052248(0xffffffff857321e8, float:-1.1432033E-35)
            r9.X(r8)
            boolean r8 = r9.l(r7)
            java.lang.Object r10 = r9.g()
            if (r8 != 0) goto L_0x0041
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x0049
        L_0x0041:
            com.hansecom.abt.presentation.screens.home.account.o r10 = new com.hansecom.abt.presentation.screens.home.account.o
            r10.<init>(r7)
            r9.N(r10)
        L_0x0049:
            r1 = r10
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r9.M()
            r7 = -2056047571(0xffffffff8573342d, float:-1.1435388E-35)
            r9.X(r7)
            androidx.navigation.NavHostController r7 = r6.f35048z
            boolean r7 = r9.l(r7)
            androidx.navigation.NavHostController r8 = r6.f35048z
            java.lang.Object r10 = r9.g()
            if (r7 != 0) goto L_0x006b
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x0073
        L_0x006b:
            com.hansecom.abt.presentation.screens.home.account.p r10 = new com.hansecom.abt.presentation.screens.home.account.p
            r10.<init>(r8)
            r9.N(r10)
        L_0x0073:
            r2 = r10
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r9.M()
            r4 = 0
            r5 = 1
            r0 = 0
            r3 = r9
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt.r(r0, r1, r2, r3, r4, r5)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0089
            androidx.compose.runtime.ComposerKt.X()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountNavigationKt$accountNavigation$1$3$1.e(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        e((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
