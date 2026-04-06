package com.hansecom.abt.presentation.screens.home.more;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class MoreNavigationKt {
    public static final void a(NavGraphBuilder navGraphBuilder, NavHostController navHostController, Context context) {
        Intrinsics.i(navGraphBuilder, "<this>");
        Intrinsics.i(navHostController, "navController");
        Intrinsics.i(context, "context");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), (Object) new MoreDestination(false, false, 3, (DefaultConstructorMarker) null), Reflection.b(MoreGraph.class), MapsKt.h());
        String string = context.getString(R.string.h7);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(1235422206, true, new MoreNavigationKt$moreNavigation$1$1(navHostController));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(ComposeNavigator.class), Reflection.b(MoreDestination.class), h2, c2);
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
        HelpNavigationKt.a(navGraphBuilder2, context);
        navGraphBuilder.h(navGraphBuilder2);
    }
}
