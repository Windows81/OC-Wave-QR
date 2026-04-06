package com.hansecom.abt.presentation.screens.home.account.payment.add;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class AddPaymentMethodsGraphKt {
    public static final void a(NavGraphBuilder navGraphBuilder, NavController navController, Context context) {
        Intrinsics.i(navGraphBuilder, "<this>");
        Intrinsics.i(navController, "navController");
        Intrinsics.i(context, "context");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), (Object) AddPaymentMethodDestination.INSTANCE, Reflection.b(AddPaymentMethodGraph.class), MapsKt.h());
        String string = context.getString(R.string.h0);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(766385852, true, new AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$1(navController));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AddPaymentMethodDestination.class), h2, c2);
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
        String string2 = context.getString(R.string.Q);
        Intrinsics.h(string2, "getString(...)");
        ComposableLambda c3 = ComposableLambdaKt.c(583129573, true, new AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$2(navController));
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AddPaymentMethodChooseCountryDestination.class), h3, c3);
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
        String string3 = context.getString(R.string.T);
        Intrinsics.h(string3, "getString(...)");
        ComposableLambda c4 = ComposableLambdaKt.c(-752244156, true, new AddPaymentMethodsGraphKt$addPaymentMethodGraph$1$3(navController));
        Map h4 = MapsKt.h();
        List<NavDeepLink> m4 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder3 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(AddPaymentMethodChooseStateDestination.class), h4, c4);
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
        navGraphBuilder.h(navGraphBuilder2);
    }
}
