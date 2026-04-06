package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

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
public final class CardOptionsNavigationKt$cardOptionsNavigation$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36534z;

    public CardOptionsNavigationKt$cardOptionsNavigation$1$1(NavHostController navHostController) {
        this.f36534z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit A(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsPassesDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit B(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsRemoveCardDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit C(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsConvertToVirtualDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit D(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsTransferBalanceDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit E(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsCardHistoryDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit F(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsCardInformationDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit G(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsInstitutionsDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit v(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsFareCappingDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit w(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsAddValueDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit x(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsAutoloadDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit y(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsLockCardDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit z(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsUnlockCardDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        u((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(androidx.compose.animation.AnimatedContentScope r20, androidx.navigation.NavBackStackEntry r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r14 = r22
            java.lang.String r2 = "$this$composable"
            r3 = r20
            kotlin.jvm.internal.Intrinsics.i(r3, r2)
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0023
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous>.<anonymous> (CardOptionsNavigation.kt:110)"
            r4 = 2094599439(0x7cd90d0f, float:9.015946E36)
            r5 = r23
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r2, r3)
        L_0x0023:
            r2 = 2121338159(0x7e710d2f, float:8.01031E37)
            r14.X(r2)
            boolean r2 = r14.W(r1)
            java.lang.Object r3 = r22.g()
            if (r2 != 0) goto L_0x003b
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0096
        L_0x003b:
            android.os.Bundle r2 = r21.e()
            if (r2 != 0) goto L_0x0046
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x0046:
            androidx.navigation.NavDestination r1 = r21.g()
            java.util.Map r1 = r1.o()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = r1.size()
            int r4 = kotlin.collections.MapsKt.e(r4)
            r3.<init>(r4)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0065:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            androidx.navigation.NavArgument r4 = (androidx.navigation.NavArgument) r4
            androidx.navigation.NavType r4 = r4.a()
            r3.put(r5, r4)
            goto L_0x0065
        L_0x0083:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsDestination$Companion r1 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsDestination.Companion
            kotlinx.serialization.KSerializer r1 = r1.serializer()
            java.lang.Object r1 = androidx.navigation.serialization.RouteDeserializerKt.a(r1, r2, r3)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsDestination r1 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsDestination) r1
            java.lang.String r3 = r1.a()
            r14.N(r3)
        L_0x0096:
            java.lang.String r3 = (java.lang.String) r3
            r22.M()
            java.lang.String r1 = "CardOptionsScreen"
            r2 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r1, r14, r2)
            r1 = 2121344746(0x7e7126ea, float:8.01365E37)
            r14.X(r1)
            androidx.navigation.NavHostController r1 = r0.f36534z
            boolean r1 = r14.l(r1)
            boolean r2 = r14.W(r3)
            r1 = r1 | r2
            androidx.navigation.NavHostController r2 = r0.f36534z
            java.lang.Object r4 = r22.g()
            if (r1 != 0) goto L_0x00c2
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x00ca
        L_0x00c2:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.a r4 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.a
            r4.<init>(r2, r3)
            r14.N(r4)
        L_0x00ca:
            r1 = r4
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r22.M()
            r2 = 2121357391(0x7e71584f, float:8.020062E37)
            r14.X(r2)
            androidx.navigation.NavHostController r2 = r0.f36534z
            boolean r2 = r14.l(r2)
            boolean r4 = r14.W(r3)
            r2 = r2 | r4
            androidx.navigation.NavHostController r4 = r0.f36534z
            java.lang.Object r5 = r22.g()
            if (r2 != 0) goto L_0x00f1
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00f9
        L_0x00f1:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.f r5 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.f
            r5.<init>(r4, r3)
            r14.N(r5)
        L_0x00f9:
            r2 = r5
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r22.M()
            r4 = 2121350995(0x7e713f53, float:8.0168186E37)
            r14.X(r4)
            androidx.navigation.NavHostController r4 = r0.f36534z
            boolean r4 = r14.l(r4)
            boolean r5 = r14.W(r3)
            r4 = r4 | r5
            androidx.navigation.NavHostController r5 = r0.f36534z
            java.lang.Object r6 = r22.g()
            if (r4 != 0) goto L_0x0120
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0128
        L_0x0120:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.g r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.g
            r6.<init>(r5, r3)
            r14.N(r6)
        L_0x0128:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r22.M()
            r5 = 2121369968(0x7e718970, float:8.026439E37)
            r14.X(r5)
            androidx.navigation.NavHostController r5 = r0.f36534z
            boolean r5 = r14.l(r5)
            boolean r6 = r14.W(r3)
            r5 = r5 | r6
            androidx.navigation.NavHostController r6 = r0.f36534z
            java.lang.Object r7 = r22.g()
            if (r5 != 0) goto L_0x014f
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x0157
        L_0x014f:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.h r7 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.h
            r7.<init>(r6, r3)
            r14.N(r7)
        L_0x0157:
            r5 = r7
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r22.M()
            r6 = 2121363663(0x7e7170cf, float:8.023242E37)
            r14.X(r6)
            androidx.navigation.NavHostController r6 = r0.f36534z
            boolean r6 = r14.l(r6)
            boolean r7 = r14.W(r3)
            r6 = r6 | r7
            androidx.navigation.NavHostController r7 = r0.f36534z
            java.lang.Object r8 = r22.g()
            if (r6 != 0) goto L_0x017e
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0186
        L_0x017e:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.i r8 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.i
            r8.<init>(r7, r3)
            r14.N(r8)
        L_0x0186:
            r6 = r8
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r22.M()
            r7 = 2121376172(0x7e71a1ac, float:8.029585E37)
            r14.X(r7)
            androidx.navigation.NavHostController r7 = r0.f36534z
            boolean r7 = r14.l(r7)
            boolean r8 = r14.W(r3)
            r7 = r7 | r8
            androidx.navigation.NavHostController r8 = r0.f36534z
            java.lang.Object r9 = r22.g()
            if (r7 != 0) goto L_0x01ad
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x01b5
        L_0x01ad:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.j r9 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.j
            r9.<init>(r8, r3)
            r14.N(r9)
        L_0x01b5:
            r7 = r9
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r22.M()
            r8 = 2121382252(0x7e71b96c, float:8.032668E37)
            r14.X(r8)
            androidx.navigation.NavHostController r8 = r0.f36534z
            boolean r8 = r14.l(r8)
            boolean r9 = r14.W(r3)
            r8 = r8 | r9
            androidx.navigation.NavHostController r9 = r0.f36534z
            java.lang.Object r10 = r22.g()
            if (r8 != 0) goto L_0x01dc
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x01e4
        L_0x01dc:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.k r10 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.k
            r10.<init>(r9, r3)
            r14.N(r10)
        L_0x01e4:
            r8 = r10
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r22.M()
            r9 = 2121388332(0x7e71d12c, float:8.0357507E37)
            r14.X(r9)
            androidx.navigation.NavHostController r9 = r0.f36534z
            boolean r9 = r14.l(r9)
            boolean r10 = r14.W(r3)
            r9 = r9 | r10
            androidx.navigation.NavHostController r10 = r0.f36534z
            java.lang.Object r11 = r22.g()
            if (r9 != 0) goto L_0x020b
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r11 != r9) goto L_0x0213
        L_0x020b:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.l r11 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.l
            r11.<init>(r10, r3)
            r14.N(r11)
        L_0x0213:
            r9 = r11
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r22.M()
            r10 = 2121394478(0x7e71e92e, float:8.038867E37)
            r14.X(r10)
            androidx.navigation.NavHostController r10 = r0.f36534z
            boolean r10 = r14.l(r10)
            boolean r11 = r14.W(r3)
            r10 = r10 | r11
            androidx.navigation.NavHostController r11 = r0.f36534z
            java.lang.Object r12 = r22.g()
            if (r10 != 0) goto L_0x023a
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x0242
        L_0x023a:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.b r12 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.b
            r12.<init>(r11, r3)
            r14.N(r12)
        L_0x0242:
            r10 = r12
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r22.M()
            r11 = 2121400686(0x7e72016e, float:8.042015E37)
            r14.X(r11)
            androidx.navigation.NavHostController r11 = r0.f36534z
            boolean r11 = r14.l(r11)
            boolean r12 = r14.W(r3)
            r11 = r11 | r12
            androidx.navigation.NavHostController r12 = r0.f36534z
            java.lang.Object r13 = r22.g()
            if (r11 != 0) goto L_0x0269
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x0271
        L_0x0269:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.c r13 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.c
            r13.<init>(r12, r3)
            r14.N(r13)
        L_0x0271:
            r11 = r13
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r22.M()
            r12 = 2121407092(0x7e721a74, float:8.045263E37)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r0.f36534z
            boolean r12 = r14.l(r12)
            boolean r13 = r14.W(r3)
            r12 = r12 | r13
            androidx.navigation.NavHostController r13 = r0.f36534z
            java.lang.Object r15 = r22.g()
            if (r12 != 0) goto L_0x0298
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x02a0
        L_0x0298:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.d r15 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.d
            r15.<init>(r13, r3)
            r14.N(r15)
        L_0x02a0:
            r18 = r15
            kotlin.jvm.functions.Function0 r18 = (kotlin.jvm.functions.Function0) r18
            r22.M()
            r12 = 2121413651(0x7e723413, float:8.048589E37)
            r14.X(r12)
            androidx.navigation.NavHostController r12 = r0.f36534z
            boolean r12 = r14.l(r12)
            boolean r13 = r14.W(r3)
            r12 = r12 | r13
            androidx.navigation.NavHostController r13 = r0.f36534z
            java.lang.Object r15 = r22.g()
            if (r12 != 0) goto L_0x02c8
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x02d0
        L_0x02c8:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.e r15 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.e
            r15.<init>(r13, r3)
            r14.N(r15)
        L_0x02d0:
            r12 = r15
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            r22.M()
            r16 = 0
            r17 = 4096(0x1000, float:5.74E-42)
            r13 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r18
            r14 = r22
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsScreenKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x02f4
            androidx.compose.runtime.ComposerKt.X()
        L_0x02f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsNavigationKt$cardOptionsNavigation$1$1.u(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}
