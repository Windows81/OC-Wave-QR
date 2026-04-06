package com.hansecom.abt.presentation.screens.home.faremedia;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsNavigationKt;
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
public final class FareMediaNavigationKt {
    public static final void a(NavGraphBuilder navGraphBuilder, NavHostController navHostController, Context context) {
        Intrinsics.i(navGraphBuilder, "<this>");
        Intrinsics.i(navHostController, "navController");
        Intrinsics.i(context, "context");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), (Object) new FareMediaDestination(false, false, 3, (DefaultConstructorMarker) null), Reflection.b(FareMediaGraph.class), MapsKt.h());
        String string = context.getString(R.string.m5);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(897892943, true, new FareMediaNavigationKt$fareMediaNavigation$1$1(navHostController));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(FareMediaDestination.class), h2, c2);
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
        String string2 = context.getString(R.string.s4);
        Intrinsics.h(string2, "getString(...)");
        ComposableLambda c3 = ComposableLambdaKt.c(1163290310, true, new FareMediaNavigationKt$fareMediaNavigation$1$2(navHostController));
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(FareMediaLinkCardDestination.class), h3, c3);
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
        String string3 = context.getString(R.string.F3);
        Intrinsics.h(string3, "getString(...)");
        ComposableLambda c4 = ComposableLambdaKt.c(-1865606201, true, new FareMediaNavigationKt$fareMediaNavigation$1$3(navHostController));
        Map h4 = MapsKt.h();
        List<NavDeepLink> m4 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder3 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(FareMediaCreateVirtualCardDestination.class), h4, c4);
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
        CardOptionsNavigationKt.a(navGraphBuilder2, navHostController, context);
        String string4 = context.getString(R.string.J7);
        Intrinsics.h(string4, "getString(...)");
        ComposableLambda c5 = ComposableLambdaKt.c(-599535416, true, new FareMediaNavigationKt$fareMediaNavigation$1$4(navHostController));
        Map h5 = MapsKt.h();
        List<NavDeepLink> m5 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder4 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(FareMediaAddValuePaymentCashBarcodeDestination.class), h5, c5);
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
        String string5 = context.getString(R.string.B7);
        Intrinsics.h(string5, "getString(...)");
        ComposableLambda c6 = ComposableLambdaKt.c(666535369, true, new FareMediaNavigationKt$fareMediaNavigation$1$5(navHostController));
        Map h6 = MapsKt.h();
        List<NavDeepLink> m6 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder5 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(FareMediaAddValuePaymentCashInstructionsDestination.class), h6, c6);
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
        navGraphBuilder.h(navGraphBuilder2);
    }
}
