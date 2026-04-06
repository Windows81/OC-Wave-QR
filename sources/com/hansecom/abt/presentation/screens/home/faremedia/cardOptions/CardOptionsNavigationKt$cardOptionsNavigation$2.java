package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashBarcodeDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashInstructionsDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
public final class CardOptionsNavigationKt$cardOptionsNavigation$2 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36545z;

    public CardOptionsNavigationKt$cardOptionsNavigation$2(NavHostController navHostController) {
        this.f36545z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit g(NavHostController navHostController) {
        navHostController.a0();
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new FareMediaAddValuePaymentCashBarcodeDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new FareMediaAddValuePaymentCashInstructionsDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
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
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:180)"
            r1 = -341141782(0xffffffffebaa96ea, float:-4.1246012E26)
            androidx.compose.runtime.ComposerKt.Y(r1, r12, r9, r0)
        L_0x0019:
            r9 = 188350064(0xb39fe70, float:3.5821121E-32)
            r11.X(r9)
            boolean r9 = r11.W(r10)
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x0031
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x008c
        L_0x0031:
            android.os.Bundle r9 = r10.e()
            if (r9 != 0) goto L_0x003c
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x003c:
            androidx.navigation.NavDestination r10 = r10.g()
            java.util.Map r10 = r10.o()
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            int r0 = r10.size()
            int r0 = kotlin.collections.MapsKt.e(r0)
            r12.<init>(r0)
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x005b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            androidx.navigation.NavArgument r0 = (androidx.navigation.NavArgument) r0
            androidx.navigation.NavType r0 = r0.a()
            r12.put(r1, r0)
            goto L_0x005b
        L_0x0079:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination$Companion r10 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination.Companion
            kotlinx.serialization.KSerializer r10 = r10.serializer()
            java.lang.Object r9 = androidx.navigation.serialization.RouteDeserializerKt.a(r10, r9, r12)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination r9 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination) r9
            java.lang.String r12 = r9.a()
            r11.N(r12)
        L_0x008c:
            java.lang.String r12 = (java.lang.String) r12
            r11.M()
            java.lang.String r9 = "FareMediaAddValueScreen"
            r10 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r9, r11, r10)
            r9 = 188356497(0xb3a1791, float:3.5840026E-32)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f36545z
            boolean r9 = r11.l(r9)
            androidx.navigation.NavHostController r10 = r8.f36545z
            java.lang.Object r0 = r11.g()
            if (r9 != 0) goto L_0x00b3
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r0 != r9) goto L_0x00bb
        L_0x00b3:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.y r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.y
            r0.<init>(r10)
            r11.N(r0)
        L_0x00bb:
            r2 = r0
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r11.M()
            r9 = 188358790(0xb3a2086, float:3.5846765E-32)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f36545z
            boolean r9 = r11.l(r9)
            boolean r10 = r11.W(r12)
            r9 = r9 | r10
            androidx.navigation.NavHostController r10 = r8.f36545z
            java.lang.Object r0 = r11.g()
            if (r9 != 0) goto L_0x00e2
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r0 != r9) goto L_0x00ea
        L_0x00e2:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.z r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.z
            r0.<init>(r10, r12)
            r11.N(r0)
        L_0x00ea:
            r3 = r0
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r11.M()
            r9 = 188363659(0xb3a338b, float:3.5861074E-32)
            r11.X(r9)
            androidx.navigation.NavHostController r9 = r8.f36545z
            boolean r9 = r11.l(r9)
            boolean r10 = r11.W(r12)
            r9 = r9 | r10
            androidx.navigation.NavHostController r10 = r8.f36545z
            java.lang.Object r0 = r11.g()
            if (r9 != 0) goto L_0x0111
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r0 != r9) goto L_0x0119
        L_0x0111:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.A r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.A
            r0.<init>(r10, r12)
            r11.N(r0)
        L_0x0119:
            r4 = r0
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r11.M()
            r6 = 0
            r7 = 1
            r1 = 0
            r5 = r11
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueScreenKt.s(r1, r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x012f
            androidx.compose.runtime.ComposerKt.X()
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsNavigationKt$cardOptionsNavigation$2.f(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        f((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
