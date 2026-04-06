package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import com.hansecom.abt.presentation.screens.main.WebViewDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaNavigationKt$fareMediaNavigation$1$4 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35947z;

    public FareMediaNavigationKt$fareMediaNavigation$1$4(NavHostController navHostController) {
        this.f35947z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-599535416, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareMediaNavigation.<anonymous>.<anonymous> (FareMediaNavigation.kt:96)");
        }
        NavHostController navHostController = this.f35947z;
        boolean contains = ((AppFeatures) composer.C(AppFeaturesKt.c())).x().contains(PaymentMethodType.CASH);
        final NavHostController navHostController2 = this.f35947z;
        AppFeatureGuardKt.b(navHostController, contains, (String) null, ComposableLambdaKt.e(-1904861046, true, new Function2<Composer, Integer, Unit>() {
            public static final Unit f(NavHostController navHostController, String str) {
                NavController.Y(navHostController, new FareMediaAddValuePaymentCashInstructionsDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.f40552a;
            }

            public static final Unit g(NavHostController navHostController, String str, String str2) {
                Intrinsics.i(str, "url");
                NavController.Y(navHostController, new WebViewDestination(str, str2), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.f40552a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function2} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void e(androidx.compose.runtime.Composer r11, int r12) {
                /*
                    r10 = this;
                    r0 = r12 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r11.t()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r11.B()
                    goto L_0x0111
                L_0x0011:
                    boolean r0 = androidx.compose.runtime.ComposerKt.P()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.hansecom.abt.presentation.screens.home.faremedia.fareMediaNavigation.<anonymous>.<anonymous>.<anonymous> (FareMediaNavigation.kt:100)"
                    r2 = -1904861046(0xffffffff8e76208a, float:-3.0337508E-30)
                    androidx.compose.runtime.ComposerKt.Y(r2, r12, r0, r1)
                L_0x0020:
                    r12 = 273683254(0x10501336, float:4.1035567E-29)
                    r11.X(r12)
                    androidx.navigation.NavBackStackEntry r12 = r11
                    boolean r12 = r11.W(r12)
                    androidx.navigation.NavBackStackEntry r0 = r11
                    java.lang.Object r1 = r11.g()
                    if (r12 != 0) goto L_0x003c
                    androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r12 = r12.a()
                    if (r1 != r12) goto L_0x0097
                L_0x003c:
                    android.os.Bundle r12 = r0.e()
                    if (r12 != 0) goto L_0x0047
                    android.os.Bundle r12 = new android.os.Bundle
                    r12.<init>()
                L_0x0047:
                    androidx.navigation.NavDestination r0 = r0.g()
                    java.util.Map r0 = r0.o()
                    java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                    int r2 = r0.size()
                    int r2 = kotlin.collections.MapsKt.e(r2)
                    r1.<init>(r2)
                    java.util.Set r0 = r0.entrySet()
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x0066:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x0084
                    java.lang.Object r2 = r0.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    java.lang.Object r3 = r2.getKey()
                    java.lang.Object r2 = r2.getValue()
                    androidx.navigation.NavArgument r2 = (androidx.navigation.NavArgument) r2
                    androidx.navigation.NavType r2 = r2.a()
                    r1.put(r3, r2)
                    goto L_0x0066
                L_0x0084:
                    com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashBarcodeDestination$Companion r0 = com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashBarcodeDestination.Companion
                    kotlinx.serialization.KSerializer r0 = r0.serializer()
                    java.lang.Object r12 = androidx.navigation.serialization.RouteDeserializerKt.a(r0, r12, r1)
                    com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashBarcodeDestination r12 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaAddValuePaymentCashBarcodeDestination) r12
                    java.lang.String r1 = r12.a()
                    r11.N(r1)
                L_0x0097:
                    java.lang.String r1 = (java.lang.String) r1
                    r11.M()
                    androidx.compose.runtime.ProvidableCompositionLocal r12 = com.hansecom.abt.presentation.screens.main.MainNavigationKt.l()
                    java.lang.Object r12 = r11.C(r12)
                    androidx.navigation.NavHostController r12 = (androidx.navigation.NavHostController) r12
                    java.lang.String r0 = "FareMediaAddValueCashBarcodeScreen"
                    r2 = 6
                    com.hansecom.abt.util.LaunchTracingKt.c(r0, r11, r2)
                    r0 = 273694753(0x10504021, float:4.107017E-29)
                    r11.X(r0)
                    androidx.navigation.NavHostController r0 = r13
                    boolean r0 = r11.l(r0)
                    boolean r2 = r11.W(r1)
                    r0 = r0 | r2
                    androidx.navigation.NavHostController r2 = r13
                    java.lang.Object r3 = r11.g()
                    if (r0 != 0) goto L_0x00cd
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r0 = r0.a()
                    if (r3 != r0) goto L_0x00d5
                L_0x00cd:
                    com.hansecom.abt.presentation.screens.home.faremedia.n r3 = new com.hansecom.abt.presentation.screens.home.faremedia.n
                    r3.<init>(r2, r1)
                    r11.N(r3)
                L_0x00d5:
                    r5 = r3
                    kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                    r11.M()
                    r0 = 273700401(0x10505631, float:4.1087167E-29)
                    r11.X(r0)
                    boolean r0 = r11.l(r12)
                    java.lang.Object r1 = r11.g()
                    if (r0 != 0) goto L_0x00f3
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r0 = r0.a()
                    if (r1 != r0) goto L_0x00fb
                L_0x00f3:
                    com.hansecom.abt.presentation.screens.home.faremedia.o r1 = new com.hansecom.abt.presentation.screens.home.faremedia.o
                    r1.<init>(r12)
                    r11.N(r1)
                L_0x00fb:
                    r6 = r1
                    kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                    r11.M()
                    r8 = 0
                    r9 = 1
                    r4 = 0
                    r7 = r11
                    com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashBarcodeScreenKt.c(r4, r5, r6, r7, r8, r9)
                    boolean r11 = androidx.compose.runtime.ComposerKt.P()
                    if (r11 == 0) goto L_0x0111
                    androidx.compose.runtime.ComposerKt.X()
                L_0x0111:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaNavigationKt$fareMediaNavigation$1$4.AnonymousClass1.e(androidx.compose.runtime.Composer, int):void");
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                e((Composer) obj, ((Number) obj2).intValue());
                return Unit.f40552a;
            }
        }, composer, 54), composer, 3072, 4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
