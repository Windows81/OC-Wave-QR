package com.hansecom.abt.presentation.screens.auth;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.guest.GuestDestination;
import com.hansecom.abt.presentation.screens.main.DebugMenuDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
public final class AuthNavigationKt$authNavigation$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34247z;

    public AuthNavigationKt$authNavigation$1$1(NavHostController navHostController) {
        this.f34247z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit h(NavHostController navHostController) {
        NavController.Y(navHostController, LoginDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i(NavHostController navHostController) {
        NavController.Y(navHostController, RegisterDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit k(NavHostController navHostController) {
        NavController.Y(navHostController, GuestDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit p(NavHostController navHostController) {
        NavController.Y(navHostController, DebugMenuDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.animation.AnimatedContentScope r9, androidx.navigation.NavBackStackEntry r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r9 = "it"
            kotlin.jvm.internal.Intrinsics.i(r10, r9)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0019
            r9 = -1
            java.lang.String r10 = "com.hansecom.abt.presentation.screens.auth.authNavigation.<anonymous>.<anonymous> (AuthNavigation.kt:56)"
            r0 = 910516647(0x364561a7, float:2.9412129E-6)
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r9, r10)
        L_0x0019:
            java.lang.String r9 = "WelcomeScreen"
            r10 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r9, r11, r10)
            r9 = 213568823(0xcbacd37, float:2.8781347E-31)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f34247z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f34247z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x003b
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x0043
        L_0x003b:
            com.hansecom.abt.presentation.screens.auth.b r12 = new com.hansecom.abt.presentation.screens.auth.b
            r12.<init>(r10)
            r11.N(r12)
        L_0x0043:
            r1 = r12
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r11.M()
            r9 = 213572378(0xcbadb1a, float:2.8789705E-31)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f34247z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f34247z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x0065
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x006d
        L_0x0065:
            com.hansecom.abt.presentation.screens.auth.c r12 = new com.hansecom.abt.presentation.screens.auth.c
            r12.<init>(r10)
            r11.N(r12)
        L_0x006d:
            r2 = r12
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r11.M()
            r9 = 213576215(0xcbaea17, float:2.8798725E-31)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f34247z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f34247z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x008f
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x0097
        L_0x008f:
            com.hansecom.abt.presentation.screens.auth.d r12 = new com.hansecom.abt.presentation.screens.auth.d
            r12.<init>(r10)
            r11.N(r12)
        L_0x0097:
            r3 = r12
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r11.M()
            r9 = 213579803(0xcbaf81b, float:2.880716E-31)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f34247z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f34247z
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x00b9
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x00c1
        L_0x00b9:
            com.hansecom.abt.presentation.screens.auth.e r12 = new com.hansecom.abt.presentation.screens.auth.e
            r12.<init>(r10)
            r11.N(r12)
        L_0x00c1:
            r4 = r12
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r11.M()
            r6 = 0
            r7 = 1
            r0 = 0
            r5 = r11
            com.hansecom.abt.presentation.screens.auth.welcome.WelcomeScreenKt.e(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00d7
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.AuthNavigationKt$authNavigation$1$1.g(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        g((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
