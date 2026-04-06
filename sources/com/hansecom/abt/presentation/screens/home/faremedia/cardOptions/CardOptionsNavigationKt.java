package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import androidx.navigation.compose.DialogNavigator;
import androidx.navigation.compose.DialogNavigatorDestinationBuilder;
import com.hansecom.abt.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class CardOptionsNavigationKt {
    public static final void a(NavGraphBuilder navGraphBuilder, NavHostController navHostController, Context context) {
        NavGraphBuilder navGraphBuilder2 = navGraphBuilder;
        NavHostController navHostController2 = navHostController;
        Context context2 = context;
        Intrinsics.i(navGraphBuilder2, "<this>");
        Intrinsics.i(navHostController2, "navController");
        Intrinsics.i(context2, "context");
        NavGraphBuilder navGraphBuilder3 = new NavGraphBuilder(navGraphBuilder.i(), (Object) new CardOptionsDestination(""), Reflection.b(CardOptionsGraph.class), MapsKt.h());
        String string = context2.getString(R.string.G1);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(2094599439, true, new CardOptionsNavigationKt$cardOptionsNavigation$1$1(navHostController2));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder3.i().d(cls), Reflection.b(CardOptionsDestination.class), h2, c2);
        composeNavigatorDestinationBuilder.e(string);
        for (NavDeepLink b2 : m2) {
            composeNavigatorDestinationBuilder.b(b2);
        }
        composeNavigatorDestinationBuilder.h((Function1) null);
        composeNavigatorDestinationBuilder.i((Function1) null);
        composeNavigatorDestinationBuilder.j((Function1) null);
        composeNavigatorDestinationBuilder.k((Function1) null);
        composeNavigatorDestinationBuilder.l((Function1) null);
        navGraphBuilder3.h(composeNavigatorDestinationBuilder);
        Unit unit = Unit.f40552a;
        navGraphBuilder2.h(navGraphBuilder3);
        String string2 = context2.getString(R.string.s0);
        Intrinsics.h(string2, "getString(...)");
        ComposableLambda c3 = ComposableLambdaKt.c(-341141782, true, new CardOptionsNavigationKt$cardOptionsNavigation$2(navHostController2));
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsAddValueDestination.class), h3, c3);
        composeNavigatorDestinationBuilder2.e(string2);
        for (NavDeepLink b3 : m3) {
            composeNavigatorDestinationBuilder2.b(b3);
        }
        composeNavigatorDestinationBuilder2.h((Function1) null);
        composeNavigatorDestinationBuilder2.i((Function1) null);
        composeNavigatorDestinationBuilder2.j((Function1) null);
        composeNavigatorDestinationBuilder2.k((Function1) null);
        composeNavigatorDestinationBuilder2.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder2);
        String string3 = context2.getString(R.string.v7);
        Intrinsics.h(string3, "getString(...)");
        ComposableLambda c4 = ComposableLambdaKt.c(-496004639, true, new CardOptionsNavigationKt$cardOptionsNavigation$3(navHostController2));
        Map h4 = MapsKt.h();
        List<NavDeepLink> m4 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder3 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsPassesDestination.class), h4, c4);
        composeNavigatorDestinationBuilder3.e(string3);
        for (NavDeepLink b4 : m4) {
            composeNavigatorDestinationBuilder3.b(b4);
        }
        composeNavigatorDestinationBuilder3.h((Function1) null);
        composeNavigatorDestinationBuilder3.i((Function1) null);
        composeNavigatorDestinationBuilder3.j((Function1) null);
        composeNavigatorDestinationBuilder3.k((Function1) null);
        composeNavigatorDestinationBuilder3.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder3);
        String string4 = context2.getString(R.string.D1);
        Intrinsics.h(string4, "getString(...)");
        ComposableLambda c5 = ComposableLambdaKt.c(-232307614, true, new CardOptionsNavigationKt$cardOptionsNavigation$4(navHostController2));
        Map h5 = MapsKt.h();
        List<NavDeepLink> m5 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder4 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsCardInformationDestination.class), h5, c5);
        composeNavigatorDestinationBuilder4.e(string4);
        for (NavDeepLink b5 : m5) {
            composeNavigatorDestinationBuilder4.b(b5);
        }
        composeNavigatorDestinationBuilder4.h((Function1) null);
        composeNavigatorDestinationBuilder4.i((Function1) null);
        composeNavigatorDestinationBuilder4.j((Function1) null);
        composeNavigatorDestinationBuilder4.k((Function1) null);
        composeNavigatorDestinationBuilder4.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder4);
        String string5 = context2.getString(R.string.O);
        Intrinsics.h(string5, "getString(...)");
        ComposableLambda c6 = ComposableLambdaKt.c(31389411, true, new CardOptionsNavigationKt$cardOptionsNavigation$5(navHostController2));
        Map h6 = MapsKt.h();
        List<NavDeepLink> m6 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder5 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsAddPassesDestination.class), h6, c6);
        composeNavigatorDestinationBuilder5.e(string5);
        for (NavDeepLink b6 : m6) {
            composeNavigatorDestinationBuilder5.b(b6);
        }
        composeNavigatorDestinationBuilder5.h((Function1) null);
        composeNavigatorDestinationBuilder5.i((Function1) null);
        composeNavigatorDestinationBuilder5.j((Function1) null);
        composeNavigatorDestinationBuilder5.k((Function1) null);
        composeNavigatorDestinationBuilder5.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder5);
        String string6 = context2.getString(R.string.P6);
        Intrinsics.h(string6, "getString(...)");
        ComposableLambda c7 = ComposableLambdaKt.c(295086436, true, new CardOptionsNavigationKt$cardOptionsNavigation$6(navHostController2));
        Map h7 = MapsKt.h();
        List<NavDeepLink> m7 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder6 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsInstitutionsDestination.class), h7, c7);
        composeNavigatorDestinationBuilder6.e(string6);
        for (NavDeepLink b7 : m7) {
            composeNavigatorDestinationBuilder6.b(b7);
        }
        composeNavigatorDestinationBuilder6.h((Function1) null);
        composeNavigatorDestinationBuilder6.i((Function1) null);
        composeNavigatorDestinationBuilder6.j((Function1) null);
        composeNavigatorDestinationBuilder6.k((Function1) null);
        composeNavigatorDestinationBuilder6.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder6);
        String string7 = context2.getString(R.string.T6);
        Intrinsics.h(string7, "getString(...)");
        ComposableLambda c8 = ComposableLambdaKt.c(558783461, true, new CardOptionsNavigationKt$cardOptionsNavigation$7(navHostController2));
        Map h8 = MapsKt.h();
        List<NavDeepLink> m8 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder7 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsSearchInstitutionsDestination.class), h8, c8);
        composeNavigatorDestinationBuilder7.e(string7);
        for (NavDeepLink b8 : m8) {
            composeNavigatorDestinationBuilder7.b(b8);
        }
        composeNavigatorDestinationBuilder7.h((Function1) null);
        composeNavigatorDestinationBuilder7.i((Function1) null);
        composeNavigatorDestinationBuilder7.j((Function1) null);
        composeNavigatorDestinationBuilder7.k((Function1) null);
        composeNavigatorDestinationBuilder7.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder7);
        String string8 = context2.getString(R.string.F);
        Intrinsics.h(string8, "getString(...)");
        ComposableLambda c9 = ComposableLambdaKt.c(822480486, true, new CardOptionsNavigationKt$cardOptionsNavigation$8(navHostController2));
        Map h9 = MapsKt.h();
        List<NavDeepLink> m9 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder8 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsAddInstitutionDestination.class), h9, c9);
        composeNavigatorDestinationBuilder8.e(string8);
        for (NavDeepLink b9 : m9) {
            composeNavigatorDestinationBuilder8.b(b9);
        }
        composeNavigatorDestinationBuilder8.h((Function1) null);
        composeNavigatorDestinationBuilder8.i((Function1) null);
        composeNavigatorDestinationBuilder8.j((Function1) null);
        composeNavigatorDestinationBuilder8.k((Function1) null);
        composeNavigatorDestinationBuilder8.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder8);
        String string9 = context2.getString(R.string.F6);
        Intrinsics.h(string9, "getString(...)");
        ComposableLambda c10 = ComposableLambdaKt.c(1086177511, true, new CardOptionsNavigationKt$cardOptionsNavigation$9(navHostController2));
        Map h10 = MapsKt.h();
        List<NavDeepLink> m10 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder9 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsInstitutionDetailsDestination.class), h10, c10);
        composeNavigatorDestinationBuilder9.e(string9);
        for (NavDeepLink b10 : m10) {
            composeNavigatorDestinationBuilder9.b(b10);
        }
        composeNavigatorDestinationBuilder9.h((Function1) null);
        composeNavigatorDestinationBuilder9.i((Function1) null);
        composeNavigatorDestinationBuilder9.j((Function1) null);
        composeNavigatorDestinationBuilder9.k((Function1) null);
        composeNavigatorDestinationBuilder9.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder9);
        String string10 = context2.getString(R.string.t1);
        Intrinsics.h(string10, "getString(...)");
        Function4 a2 = ComposableSingletons$CardOptionsNavigationKt.f36582a.a();
        Map h11 = MapsKt.h();
        List<NavDeepLink> m11 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder10 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsCardHistoryDestination.class), h11, a2);
        composeNavigatorDestinationBuilder10.e(string10);
        for (NavDeepLink b11 : m11) {
            composeNavigatorDestinationBuilder10.b(b11);
        }
        composeNavigatorDestinationBuilder10.h((Function1) null);
        composeNavigatorDestinationBuilder10.i((Function1) null);
        composeNavigatorDestinationBuilder10.j((Function1) null);
        composeNavigatorDestinationBuilder10.k((Function1) null);
        composeNavigatorDestinationBuilder10.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder10);
        String string11 = context2.getString(R.string.c4);
        Intrinsics.h(string11, "getString(...)");
        Function4 b12 = ComposableSingletons$CardOptionsNavigationKt.f36582a.b();
        Map h12 = MapsKt.h();
        List<NavDeepLink> m12 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder11 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsFareCappingDestination.class), h12, b12);
        composeNavigatorDestinationBuilder11.e(string11);
        for (NavDeepLink b13 : m12) {
            composeNavigatorDestinationBuilder11.b(b13);
        }
        composeNavigatorDestinationBuilder11.h((Function1) null);
        composeNavigatorDestinationBuilder11.i((Function1) null);
        composeNavigatorDestinationBuilder11.j((Function1) null);
        composeNavigatorDestinationBuilder11.k((Function1) null);
        composeNavigatorDestinationBuilder11.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder11);
        String string12 = context2.getString(R.string.X0);
        Intrinsics.h(string12, "getString(...)");
        ComposableLambda c11 = ComposableLambdaKt.c(-2072390699, true, new CardOptionsNavigationKt$cardOptionsNavigation$10(navHostController2));
        Map h13 = MapsKt.h();
        List<NavDeepLink> m13 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder12 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsAutoloadDestination.class), h13, c11);
        composeNavigatorDestinationBuilder12.e(string12);
        for (NavDeepLink b14 : m13) {
            composeNavigatorDestinationBuilder12.b(b14);
        }
        composeNavigatorDestinationBuilder12.h((Function1) null);
        composeNavigatorDestinationBuilder12.i((Function1) null);
        composeNavigatorDestinationBuilder12.j((Function1) null);
        composeNavigatorDestinationBuilder12.k((Function1) null);
        composeNavigatorDestinationBuilder12.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder12);
        String string13 = context2.getString(R.string.o1);
        Intrinsics.h(string13, "getString(...)");
        ComposableLambda c12 = ComposableLambdaKt.c(-1808693674, true, new CardOptionsNavigationKt$cardOptionsNavigation$11(navHostController2));
        Map h14 = MapsKt.h();
        List<NavDeepLink> m14 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder13 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsAutoloadSetupDestination.class), h14, c12);
        composeNavigatorDestinationBuilder13.e(string13);
        for (NavDeepLink b15 : m14) {
            composeNavigatorDestinationBuilder13.b(b15);
        }
        composeNavigatorDestinationBuilder13.h((Function1) null);
        composeNavigatorDestinationBuilder13.i((Function1) null);
        composeNavigatorDestinationBuilder13.j((Function1) null);
        composeNavigatorDestinationBuilder13.k((Function1) null);
        composeNavigatorDestinationBuilder13.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder13);
        String string14 = context2.getString(R.string.U2);
        Intrinsics.h(string14, "getString(...)");
        ComposableLambda c13 = ComposableLambdaKt.c(-1544996649, true, new CardOptionsNavigationKt$cardOptionsNavigation$12(navHostController2));
        Map h15 = MapsKt.h();
        List<NavDeepLink> m15 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder14 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsCheckoutDestination.class), h15, c13);
        composeNavigatorDestinationBuilder14.e(string14);
        for (NavDeepLink b16 : m15) {
            composeNavigatorDestinationBuilder14.b(b16);
        }
        composeNavigatorDestinationBuilder14.h((Function1) null);
        composeNavigatorDestinationBuilder14.i((Function1) null);
        composeNavigatorDestinationBuilder14.j((Function1) null);
        composeNavigatorDestinationBuilder14.k((Function1) null);
        composeNavigatorDestinationBuilder14.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder14);
        String string15 = context2.getString(R.string.ca);
        Intrinsics.h(string15, "getString(...)");
        ComposableLambda c14 = ComposableLambdaKt.c(-1281299624, true, new CardOptionsNavigationKt$cardOptionsNavigation$13(navHostController2));
        Map h16 = MapsKt.h();
        List<NavDeepLink> m16 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder15 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(CardOptionsTransferBalanceDestination.class), h16, c14);
        composeNavigatorDestinationBuilder15.e(string15);
        for (NavDeepLink b17 : m16) {
            composeNavigatorDestinationBuilder15.b(b17);
        }
        composeNavigatorDestinationBuilder15.h((Function1) null);
        composeNavigatorDestinationBuilder15.i((Function1) null);
        composeNavigatorDestinationBuilder15.j((Function1) null);
        composeNavigatorDestinationBuilder15.k((Function1) null);
        composeNavigatorDestinationBuilder15.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder15);
        ComposableLambda c15 = ComposableLambdaKt.c(-1178150452, true, new CardOptionsNavigationKt$cardOptionsNavigation$14(navHostController2));
        Map h17 = MapsKt.h();
        List<NavDeepLink> m17 = CollectionsKt.m();
        Class<DialogNavigator> cls2 = DialogNavigator.class;
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.i().d(cls2), Reflection.b(CardOptionsRemoveCardDestination.class), h17, new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null), c15);
        for (NavDeepLink b18 : m17) {
            dialogNavigatorDestinationBuilder.b(b18);
        }
        navGraphBuilder2.h(dialogNavigatorDestinationBuilder);
        ComposableLambda c16 = ComposableLambdaKt.c(-1702452157, true, new CardOptionsNavigationKt$cardOptionsNavigation$15(navHostController2));
        Map h18 = MapsKt.h();
        List<NavDeepLink> m18 = CollectionsKt.m();
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder2 = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.i().d(cls2), Reflection.b(CardOptionsConvertToVirtualDestination.class), h18, new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null), c16);
        for (NavDeepLink b19 : m18) {
            dialogNavigatorDestinationBuilder2.b(b19);
        }
        navGraphBuilder2.h(dialogNavigatorDestinationBuilder2);
        ComposableLambda c17 = ComposableLambdaKt.c(-1438755132, true, new CardOptionsNavigationKt$cardOptionsNavigation$16(navHostController2));
        Map h19 = MapsKt.h();
        List<NavDeepLink> m19 = CollectionsKt.m();
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder3 = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.i().d(cls2), Reflection.b(CardOptionsLockCardDestination.class), h19, new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null), c17);
        for (NavDeepLink b20 : m19) {
            dialogNavigatorDestinationBuilder3.b(b20);
        }
        navGraphBuilder2.h(dialogNavigatorDestinationBuilder3);
        ComposableLambda c18 = ComposableLambdaKt.c(-1175058107, true, new CardOptionsNavigationKt$cardOptionsNavigation$17(navHostController2));
        Map h20 = MapsKt.h();
        List<NavDeepLink> m20 = CollectionsKt.m();
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder4 = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.i().d(cls2), Reflection.b(CardOptionsUnlockCardDestination.class), h20, new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null), c18);
        for (NavDeepLink b21 : m20) {
            dialogNavigatorDestinationBuilder4.b(b21);
        }
        navGraphBuilder2.h(dialogNavigatorDestinationBuilder4);
    }
}
