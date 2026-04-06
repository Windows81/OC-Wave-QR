package com.hansecom.abt.presentation.screens.helpRequest;

import android.content.Context;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.hansecom.abt.R;
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
public final class HelpNavigationKt {
    public static final void a(NavGraphBuilder navGraphBuilder, Context context) {
        Intrinsics.i(navGraphBuilder, "<this>");
        Intrinsics.i(context, "context");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), (Object) new HelpRequestDestination(false, false, false, false, 15, (DefaultConstructorMarker) null), Reflection.b(HelpGraph.class), MapsKt.h());
        String string = context.getString(R.string.t6);
        Intrinsics.h(string, "getString(...)");
        Function4 a2 = ComposableSingletons$HelpNavigationKt.f34807a.a();
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(ComposeNavigator.class), Reflection.b(HelpRequestDestination.class), h2, a2);
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
        navGraphBuilder.h(navGraphBuilder2);
    }
}
