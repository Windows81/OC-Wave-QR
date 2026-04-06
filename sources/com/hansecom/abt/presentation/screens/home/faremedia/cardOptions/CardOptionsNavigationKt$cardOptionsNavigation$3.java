package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.RouteDeserializerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesScreenKt;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel;
import com.hansecom.abt.util.LaunchTracingKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardOptionsNavigationKt$cardOptionsNavigation$3 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36546z;

    public CardOptionsNavigationKt$cardOptionsNavigation$3(NavHostController navHostController) {
        this.f36546z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit e(NavHostController navHostController, String str) {
        NavController.Y(navHostController, new CardOptionsAddPassesDestination(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public final void c(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-496004639, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:198)");
        }
        composer.X(188372462);
        boolean W = composer.W(navBackStackEntry);
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
            g2 = ((CardOptionsPassesDestination) RouteDeserializerKt.a(CardOptionsPassesDestination.Companion.serializer(), e2, linkedHashMap)).a();
            composer.N(g2);
        }
        String str = (String) g2;
        composer.M();
        LaunchTracingKt.c("FareMediaPassesScreen", composer, 6);
        composer.X(188378857);
        boolean l2 = composer.l(this.f36546z) | composer.W(str);
        NavHostController navHostController = this.f36546z;
        Object g3 = composer.g();
        if (l2 || g3 == Composer.f14567a.a()) {
            g3 = new B(navHostController, str);
            composer.N(g3);
        }
        composer.M();
        FareMediaPassesScreenKt.c((FareMediaPassesViewModel) null, (Function0) g3, composer, 0, 1);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
