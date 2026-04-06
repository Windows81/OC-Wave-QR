package com.hansecom.abt.presentation.screens.home.faremedia;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.RouteDeserializerKt;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashInstructionsScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaNavigationKt$fareMediaNavigation$1$5 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f35950z;

    public FareMediaNavigationKt$fareMediaNavigation$1$5(NavHostController navHostController) {
        this.f35950z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(666535369, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareMediaNavigation.<anonymous>.<anonymous> (FareMediaNavigation.kt:119)");
        }
        NavHostController navHostController = this.f35950z;
        boolean contains = ((AppFeatures) composer.C(AppFeaturesKt.c())).x().contains(PaymentMethodType.CASH);
        final NavHostController navHostController2 = this.f35950z;
        AppFeatureGuardKt.b(navHostController, contains, (String) null, ComposableLambdaKt.e(-638790261, true, new Function2<Composer, Integer, Unit>() {
            /* access modifiers changed from: private */
            public static final Unit e(NavHostController navHostController, String str) {
                navHostController.c0();
                NavController.Y(navHostController, new FareMediaAddValuePaymentCashBarcodeDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.f40552a;
            }

            public final void c(Composer composer, int i2) {
                if ((i2 & 3) != 2 || !composer.t()) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(-638790261, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareMediaNavigation.<anonymous>.<anonymous>.<anonymous> (FareMediaNavigation.kt:123)");
                    }
                    composer.X(273717595);
                    boolean W = composer.W(navBackStackEntry);
                    NavBackStackEntry navBackStackEntry = navBackStackEntry;
                    Object g2 = composer.g();
                    if (W || g2 == Composer.f14567a.a()) {
                        Bundle e2 = navBackStackEntry.e();
                        if (e2 == null) {
                            e2 = new Bundle();
                        }
                        Map o2 = navBackStackEntry.g().o();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.e(o2.size()));
                        for (Map.Entry entry : o2.entrySet()) {
                            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).a());
                        }
                        g2 = ((FareMediaAddValuePaymentCashInstructionsDestination) RouteDeserializerKt.a(FareMediaAddValuePaymentCashInstructionsDestination.Companion.serializer(), e2, linkedHashMap)).a();
                        composer.N(g2);
                    }
                    String str = (String) g2;
                    composer.M();
                    LaunchTracingKt.c("FareMediaAddValueCashInstructionsScreen", composer, 6);
                    composer.X(273727217);
                    boolean l2 = composer.l(navHostController2) | composer.W(str);
                    NavHostController navHostController = navHostController2;
                    Object g3 = composer.g();
                    if (l2 || g3 == Composer.f14567a.a()) {
                        g3 = new C0582p(navHostController, str);
                        composer.N(g3);
                    }
                    composer.M();
                    FareMediaAddValueCashInstructionsScreenKt.d((FareMediaAddValueCashPaymentInstructionsViewModel) null, (Function0) g3, composer, 0, 1);
                    if (ComposerKt.P()) {
                        ComposerKt.X();
                        return;
                    }
                    return;
                }
                composer.B();
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                c((Composer) obj, ((Number) obj2).intValue());
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
