package com.hansecom.abt.presentation.screens.home.account;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddresNavGraphKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class AccountNavigationKt {
    public static final void a(NavGraphBuilder navGraphBuilder, NavHostController navHostController, Context context) {
        Intrinsics.i(navGraphBuilder, "<this>");
        Intrinsics.i(navHostController, "navController");
        Intrinsics.i(context, "context");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), (Object) new AccountDestination(false, false, 3, (DefaultConstructorMarker) null), Reflection.b(AccountGraph.class), MapsKt.h());
        String string = context.getString(R.string.C);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(1408093990, true, new AccountNavigationKt$accountNavigation$1$1(navHostController));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AccountDestination.class), h2, c2);
        composeNavigatorDestinationBuilder.e(string);
        for (NavDeepLink b2 : m2) {
            composeNavigatorDestinationBuilder.b(b2);
        }
        composeNavigatorDestinationBuilder.h((Function1) null);
        composeNavigatorDestinationBuilder.i((Function1) null);
        composeNavigatorDestinationBuilder.j((Function1) null);
        composeNavigatorDestinationBuilder.k((Function1) null);
        composeNavigatorDestinationBuilder.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder);
        String string2 = context.getString(R.string.f33062o);
        Intrinsics.h(string2, "getString(...)");
        ComposableLambda c3 = ComposableLambdaKt.c(-116008739, true, new AccountNavigationKt$accountNavigation$1$2(navHostController));
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AccountInformationDestination.class), h3, c3);
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
        ChangeAddresNavGraphKt.a(navGraphBuilder2, navHostController, context);
        NavGraphBuilder navGraphBuilder3 = new NavGraphBuilder(navGraphBuilder2.i(), (Object) AccountPaymentMethodsDestination.INSTANCE, Reflection.b(PaymentMethodsGraph.class), MapsKt.h());
        String string3 = context.getString(R.string.Y7);
        Intrinsics.h(string3, "getString(...)");
        ComposableLambda c4 = ComposableLambdaKt.c(297238923, true, new AccountNavigationKt$accountNavigation$1$3$1(navHostController));
        Map h4 = MapsKt.h();
        List<NavDeepLink> m4 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder3 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder3.i().d(cls), Reflection.b(AccountPaymentMethodsDestination.class), h4, c4);
        composeNavigatorDestinationBuilder3.e(string3);
        for (NavDeepLink b4 : m4) {
            composeNavigatorDestinationBuilder3.b(b4);
        }
        composeNavigatorDestinationBuilder3.h((Function1) null);
        composeNavigatorDestinationBuilder3.i((Function1) null);
        composeNavigatorDestinationBuilder3.j((Function1) null);
        composeNavigatorDestinationBuilder3.k((Function1) null);
        composeNavigatorDestinationBuilder3.l((Function1) null);
        navGraphBuilder3.h(composeNavigatorDestinationBuilder3);
        String string4 = context.getString(R.string.Y7);
        Intrinsics.h(string4, "getString(...)");
        Function4 a2 = ComposableSingletons$AccountNavigationKt.f35082a.a();
        Map h5 = MapsKt.h();
        List<NavDeepLink> m5 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder4 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder3.i().d(cls), Reflection.b(AccountPaymentMethodDetailsDestination.class), h5, a2);
        composeNavigatorDestinationBuilder4.e(string4);
        for (NavDeepLink b5 : m5) {
            composeNavigatorDestinationBuilder4.b(b5);
        }
        composeNavigatorDestinationBuilder4.h((Function1) null);
        composeNavigatorDestinationBuilder4.i((Function1) null);
        composeNavigatorDestinationBuilder4.j((Function1) null);
        composeNavigatorDestinationBuilder4.k((Function1) null);
        composeNavigatorDestinationBuilder4.l((Function1) null);
        navGraphBuilder3.h(composeNavigatorDestinationBuilder4);
        navGraphBuilder2.h(navGraphBuilder3);
        String string5 = context.getString(R.string.c2);
        Intrinsics.h(string5, "getString(...)");
        ComposableLambda c5 = ComposableLambdaKt.c(2096407198, true, new AccountNavigationKt$accountNavigation$1$4(navHostController));
        Map h6 = MapsKt.h();
        List<NavDeepLink> m6 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder5 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AccountChangePasswordDestination.class), h6, c5);
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
        String string6 = context.getString(R.string.m2);
        Intrinsics.h(string6, "getString(...)");
        ComposableLambda c6 = ComposableLambdaKt.c(13855839, true, new AccountNavigationKt$accountNavigation$1$5(navHostController));
        Map h7 = MapsKt.h();
        List<NavDeepLink> m7 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder6 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AccountChangePinDestination.class), h7, c6);
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
        NavGraphBuilder navGraphBuilder4 = new NavGraphBuilder(navGraphBuilder2.i(), (Object) AccountChangeQuestionsDestination.INSTANCE, Reflection.b(AccountChangeQuestionsGraph.class), MapsKt.h());
        String string7 = context.getString(R.string.y2);
        Intrinsics.h(string7, "getString(...)");
        ComposableLambda c7 = ComposableLambdaKt.c(1799128578, true, new AccountNavigationKt$accountNavigation$1$6$1(navHostController));
        Map h8 = MapsKt.h();
        List<NavDeepLink> m8 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder7 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder4.i().d(cls), Reflection.b(AccountChangeQuestionsDestination.class), h8, c7);
        composeNavigatorDestinationBuilder7.e(string7);
        for (NavDeepLink b8 : m8) {
            composeNavigatorDestinationBuilder7.b(b8);
        }
        composeNavigatorDestinationBuilder7.h((Function1) null);
        composeNavigatorDestinationBuilder7.i((Function1) null);
        composeNavigatorDestinationBuilder7.j((Function1) null);
        composeNavigatorDestinationBuilder7.k((Function1) null);
        composeNavigatorDestinationBuilder7.l((Function1) null);
        navGraphBuilder4.h(composeNavigatorDestinationBuilder7);
        navGraphBuilder2.h(navGraphBuilder4);
        String string8 = context.getString(R.string.p2);
        Intrinsics.h(string8, "getString(...)");
        ComposableLambda c8 = ComposableLambdaKt.c(-2068695520, true, new AccountNavigationKt$accountNavigation$1$7(navHostController));
        Map h9 = MapsKt.h();
        List<NavDeepLink> m9 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder8 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AccountChooseQuestionsDestination.class), h9, c8);
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
        navGraphBuilder.h(navGraphBuilder2);
    }
}
