package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsFareCappingDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsUnlockCardDestination;
import com.hansecom.abt.presentation.screens.main.WebViewDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaNavigationKt$fareMediaNavigation$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35943z;

    public FareMediaNavigationKt$fareMediaNavigation$1$1(NavHostController navHostController) {
        this.f35943z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit p(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        NavController.Y(navHostController, new CardOptionsAddValueDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit q(NavHostController navHostController) {
        NavController.Y(navHostController, FareMediaCreateVirtualCardDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit s(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        NavController.Y(navHostController, new WebViewDestination(str, (String) null, 2, (DefaultConstructorMarker) null), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit t(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        NavController.Y(navHostController, new CardOptionsDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit u(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        NavController.Y(navHostController, new CardOptionsFareCappingDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit v(NavHostController navHostController, String str) {
        Intrinsics.i(str, "it");
        NavController.Y(navHostController, new CardOptionsUnlockCardDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit w(NavHostController navHostController) {
        NavController.Y(navHostController, FareMediaLinkCardDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        k((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(androidx.compose.animation.AnimatedContentScope r13, androidx.navigation.NavBackStackEntry r14, androidx.compose.runtime.Composer r15, int r16) {
        /*
            r12 = this;
            r0 = r12
            r9 = r15
            java.lang.String r1 = "$this$composable"
            r2 = r13
            kotlin.jvm.internal.Intrinsics.i(r13, r1)
            java.lang.String r1 = "it"
            r2 = r14
            kotlin.jvm.internal.Intrinsics.i(r14, r1)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x001f
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.fareMediaNavigation.<anonymous>.<anonymous> (FareMediaNavigation.kt:53)"
            r3 = 897892943(0x3584c24f, float:9.891318E-7)
            r4 = r16
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r1, r2)
        L_0x001f:
            androidx.compose.runtime.ProvidableCompositionLocal r1 = com.hansecom.abt.presentation.screens.main.MainNavigationKt.l()
            java.lang.Object r1 = r15.C(r1)
            androidx.navigation.NavHostController r1 = (androidx.navigation.NavHostController) r1
            java.lang.String r2 = "FareMediaScreen"
            r3 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r2, r15, r3)
            r2 = 1688414264(0x64a32838, float:2.4077739E22)
            r15.X(r2)
            androidx.navigation.NavHostController r2 = r0.f35943z
            boolean r2 = r15.l(r2)
            androidx.navigation.NavHostController r3 = r0.f35943z
            java.lang.Object r4 = r15.g()
            if (r2 != 0) goto L_0x004b
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0053
        L_0x004b:
            com.hansecom.abt.presentation.screens.home.faremedia.d r4 = new com.hansecom.abt.presentation.screens.home.faremedia.d
            r4.<init>(r3)
            r15.N(r4)
        L_0x0053:
            r2 = r4
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r15.M()
            r3 = 1688417392(0x64a33470, float:2.4084782E22)
            r15.X(r3)
            androidx.navigation.NavHostController r3 = r0.f35943z
            boolean r3 = r15.l(r3)
            androidx.navigation.NavHostController r4 = r0.f35943z
            java.lang.Object r5 = r15.g()
            if (r3 != 0) goto L_0x0075
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x007d
        L_0x0075:
            com.hansecom.abt.presentation.screens.home.faremedia.e r5 = new com.hansecom.abt.presentation.screens.home.faremedia.e
            r5.<init>(r4)
            r15.N(r5)
        L_0x007d:
            r3 = r5
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r15.M()
            r4 = 1688420283(0x64a33fbb, float:2.4091292E22)
            r15.X(r4)
            androidx.navigation.NavHostController r4 = r0.f35943z
            boolean r4 = r15.l(r4)
            androidx.navigation.NavHostController r5 = r0.f35943z
            java.lang.Object r6 = r15.g()
            if (r4 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00a7
        L_0x009f:
            com.hansecom.abt.presentation.screens.home.faremedia.f r6 = new com.hansecom.abt.presentation.screens.home.faremedia.f
            r6.<init>(r5)
            r15.N(r6)
        L_0x00a7:
            r4 = r6
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r15.M()
            r5 = 1688423482(0x64a34c3a, float:2.4098496E22)
            r15.X(r5)
            androidx.navigation.NavHostController r5 = r0.f35943z
            boolean r5 = r15.l(r5)
            androidx.navigation.NavHostController r6 = r0.f35943z
            java.lang.Object r7 = r15.g()
            if (r5 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x00d1
        L_0x00c9:
            com.hansecom.abt.presentation.screens.home.faremedia.g r7 = new com.hansecom.abt.presentation.screens.home.faremedia.g
            r7.<init>(r6)
            r15.N(r7)
        L_0x00d1:
            r5 = r7
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r15.M()
            r6 = 1688405554(0x64a30632, float:2.4058126E22)
            r15.X(r6)
            androidx.navigation.NavHostController r6 = r0.f35943z
            boolean r6 = r15.l(r6)
            androidx.navigation.NavHostController r7 = r0.f35943z
            java.lang.Object r8 = r15.g()
            if (r6 != 0) goto L_0x00f3
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x00fb
        L_0x00f3:
            com.hansecom.abt.presentation.screens.home.faremedia.h r8 = new com.hansecom.abt.presentation.screens.home.faremedia.h
            r8.<init>(r7)
            r15.N(r8)
        L_0x00fb:
            r6 = r8
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r15.M()
            r7 = 1688408475(0x64a3119b, float:2.4064703E22)
            r15.X(r7)
            androidx.navigation.NavHostController r7 = r0.f35943z
            boolean r7 = r15.l(r7)
            androidx.navigation.NavHostController r8 = r0.f35943z
            java.lang.Object r10 = r15.g()
            if (r7 != 0) goto L_0x011d
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x0125
        L_0x011d:
            com.hansecom.abt.presentation.screens.home.faremedia.i r10 = new com.hansecom.abt.presentation.screens.home.faremedia.i
            r10.<init>(r8)
            r15.N(r10)
        L_0x0125:
            r7 = r10
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r15.M()
            r8 = 1688411472(0x64a31d50, float:2.4071452E22)
            r15.X(r8)
            boolean r8 = r15.l(r1)
            java.lang.Object r10 = r15.g()
            if (r8 != 0) goto L_0x0143
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x014b
        L_0x0143:
            com.hansecom.abt.presentation.screens.home.faremedia.j r10 = new com.hansecom.abt.presentation.screens.home.faremedia.j
            r10.<init>(r1)
            r15.N(r10)
        L_0x014b:
            r8 = r10
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r15.M()
            r10 = 0
            r11 = 1
            r1 = 0
            r9 = r15
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.V(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0161
            androidx.compose.runtime.ComposerKt.X()
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaNavigationKt$fareMediaNavigation$1$1.k(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}
