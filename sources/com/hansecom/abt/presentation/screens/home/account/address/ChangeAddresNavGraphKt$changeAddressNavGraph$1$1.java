package com.hansecom.abt.presentation.screens.home.account.address;

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
public final class ChangeAddresNavGraphKt$changeAddressNavGraph$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavController f35107z;

    public ChangeAddresNavGraphKt$changeAddressNavGraph$1$1(NavController navController) {
        this.f35107z = navController;
    }

    public static final Unit f(NavController navController) {
        NavController.Y(navController, ChangeAddressChooseCountryDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit g(NavController navController) {
        NavController.Y(navController, ChangeAddressChooseStateDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.animation.AnimatedContentScope r9, androidx.navigation.NavBackStackEntry r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r9 = "it"
            kotlin.jvm.internal.Intrinsics.i(r10, r9)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0019
            r9 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.account.address.changeAddressNavGraph.<anonymous>.<anonymous> (ChangeAddresNavGraph.kt:30)"
            r1 = -940365183(0xffffffffc7f32a81, float:-124501.01)
            androidx.compose.runtime.ComposerKt.Y(r1, r12, r9, r0)
        L_0x0019:
            r9 = 891616544(0x3524fd20, float:6.1463106E-7)
            r11.X(r9)
            boolean r9 = r11.W(r10)
            androidx.navigation.NavController r10 = r8.f35107z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x0033
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x003c
        L_0x0033:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressGraph r9 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressGraph.INSTANCE
            androidx.navigation.NavBackStackEntry r12 = r10.D(r9)
            r11.N(r12)
        L_0x003c:
            r1 = r12
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r11.M()
            r9 = 1890788296(0x70b323c8, float:4.435286E29)
            r11.f(r9)
            r9 = 0
            androidx.lifecycle.ViewModelProvider$Factory r3 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r1, r11, r9)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r11.f(r10)
            if (r1 == 0) goto L_0x005b
            androidx.lifecycle.viewmodel.CreationExtras r10 = r1.n()
        L_0x0059:
            r4 = r10
            goto L_0x005e
        L_0x005b:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x0059
        L_0x005e:
            r6 = 36936(0x9048, float:5.1758E-41)
            r7 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel> r0 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel.class
            r2 = 0
            r5 = r11
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r11.S()
            r11.S()
            r0 = r10
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel) r0
            kotlin.jvm.functions.Function0 r1 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r11, r9)
            kotlin.jvm.functions.Function0 r4 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r11, r9)
            r9 = 891625981(0x352521fd, float:6.151675E-7)
            r11.X(r9)
            androidx.navigation.NavController r9 = r8.f35107z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavController r10 = r8.f35107z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x0097
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x009f
        L_0x0097:
            com.hansecom.abt.presentation.screens.home.account.address.a r12 = new com.hansecom.abt.presentation.screens.home.account.address.a
            r12.<init>(r10)
            r11.N(r12)
        L_0x009f:
            r2 = r12
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r11.M()
            r9 = 891629115(0x35252e3b, float:6.1534564E-7)
            r11.X(r9)
            androidx.navigation.NavController r9 = r8.f35107z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavController r10 = r8.f35107z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x00c1
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x00c9
        L_0x00c1:
            com.hansecom.abt.presentation.screens.home.account.address.b r12 = new com.hansecom.abt.presentation.screens.home.account.address.b
            r12.<init>(r10)
            r11.N(r12)
        L_0x00c9:
            r3 = r12
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r11.M()
            r6 = 0
            r7 = 0
            r5 = r11
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt.d(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00de
            androidx.compose.runtime.ComposerKt.X()
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddresNavGraphKt$changeAddressNavGraph$1$1.e(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        e((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
