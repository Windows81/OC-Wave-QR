package com.hansecom.abt.presentation.screens.guest;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.helpRequest.HelpNavigationKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class GuestNavigationKt {
    public static final void a(NavGraphBuilder navGraphBuilder, NavHostController navHostController, Context context) {
        Intrinsics.i(navGraphBuilder, "<this>");
        Intrinsics.i(navHostController, "navController");
        Intrinsics.i(context, "context");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), (Object) GuestDestination.INSTANCE, Reflection.b(GuestGraph.class), MapsKt.h());
        String string = context.getString(R.string.F5);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(589877034, true, new GuestNavigationKt$guestNavigation$1$1(navHostController));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(GuestDestination.class), h2, c2);
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
        String string2 = context.getString(R.string.G2);
        Intrinsics.h(string2, "getString(...)");
        Function4 a2 = ComposableSingletons$GuestNavigationKt.f34681a.a();
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(GuestCheckFareMediaBalanceDestination.class), h3, a2);
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
        HelpNavigationKt.a(navGraphBuilder2, context);
        navGraphBuilder.h(navGraphBuilder2);
    }
}
