package com.hansecom.abt.presentation.screens.auth;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
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
public final class AuthNavigationKt {
    public static final void a(NavGraphBuilder navGraphBuilder, NavHostController navHostController, Object obj, Context context) {
        Intrinsics.i(navGraphBuilder, "<this>");
        Intrinsics.i(navHostController, "navController");
        Intrinsics.i(obj, "startDestination");
        Intrinsics.i(context, "context");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), obj, Reflection.b(AuthGraph.class), MapsKt.h());
        ComposableLambda c2 = ComposableLambdaKt.c(910516647, true, new AuthNavigationKt$authNavigation$1$1(navHostController));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(WelcomeDestination.class), h2, c2);
        for (NavDeepLink b2 : m2) {
            composeNavigatorDestinationBuilder.b(b2);
        }
        composeNavigatorDestinationBuilder.h((Function1) null);
        composeNavigatorDestinationBuilder.i((Function1) null);
        composeNavigatorDestinationBuilder.j((Function1) null);
        composeNavigatorDestinationBuilder.k((Function1) null);
        composeNavigatorDestinationBuilder.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder);
        ComposableLambda c3 = ComposableLambdaKt.c(52301918, true, new AuthNavigationKt$authNavigation$1$2(navHostController));
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(LoginDestination.class), h3, c3);
        for (NavDeepLink b3 : m3) {
            composeNavigatorDestinationBuilder2.b(b3);
        }
        composeNavigatorDestinationBuilder2.h((Function1) null);
        composeNavigatorDestinationBuilder2.i((Function1) null);
        composeNavigatorDestinationBuilder2.j((Function1) null);
        composeNavigatorDestinationBuilder2.k((Function1) null);
        composeNavigatorDestinationBuilder2.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder2);
        ComposableLambda c4 = ComposableLambdaKt.c(1215883103, true, new AuthNavigationKt$authNavigation$1$3(navHostController));
        Map h4 = MapsKt.h();
        List<NavDeepLink> m4 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder3 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(RegisterDestination.class), h4, c4);
        for (NavDeepLink b4 : m4) {
            composeNavigatorDestinationBuilder3.b(b4);
        }
        composeNavigatorDestinationBuilder3.h((Function1) null);
        composeNavigatorDestinationBuilder3.i((Function1) null);
        composeNavigatorDestinationBuilder3.j((Function1) null);
        composeNavigatorDestinationBuilder3.k((Function1) null);
        composeNavigatorDestinationBuilder3.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder3);
        ComposableLambda c5 = ComposableLambdaKt.c(-1915503008, true, new AuthNavigationKt$authNavigation$1$4(navHostController));
        Map h5 = MapsKt.h();
        List<NavDeepLink> m5 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder4 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(ResetPasswordDestination.class), h5, c5);
        for (NavDeepLink b5 : m5) {
            composeNavigatorDestinationBuilder4.b(b5);
        }
        composeNavigatorDestinationBuilder4.h((Function1) null);
        composeNavigatorDestinationBuilder4.i((Function1) null);
        composeNavigatorDestinationBuilder4.j((Function1) null);
        composeNavigatorDestinationBuilder4.k((Function1) null);
        composeNavigatorDestinationBuilder4.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder4);
        ComposableLambda c6 = ComposableLambdaKt.c(-751921823, true, new AuthNavigationKt$authNavigation$1$5(navHostController));
        Map h6 = MapsKt.h();
        List<NavDeepLink> m6 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder5 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(ResetPasswordSuccessDestination.class), h6, c6);
        for (NavDeepLink b6 : m6) {
            composeNavigatorDestinationBuilder5.b(b6);
        }
        composeNavigatorDestinationBuilder5.h((Function1) null);
        composeNavigatorDestinationBuilder5.i((Function1) null);
        composeNavigatorDestinationBuilder5.j((Function1) null);
        composeNavigatorDestinationBuilder5.k((Function1) null);
        composeNavigatorDestinationBuilder5.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder5);
        String string = context.getString(R.string.M8);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c7 = ComposableLambdaKt.c(1629938979, true, new AuthNavigationKt$authNavigation$1$6(navHostController));
        Map h7 = MapsKt.h();
        List<NavDeepLink> m7 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder6 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(RegisterResultNeedsActivationDestination.class), h7, c7);
        composeNavigatorDestinationBuilder6.e(string);
        for (NavDeepLink b7 : m7) {
            composeNavigatorDestinationBuilder6.b(b7);
        }
        composeNavigatorDestinationBuilder6.h((Function1) null);
        composeNavigatorDestinationBuilder6.i((Function1) null);
        composeNavigatorDestinationBuilder6.j((Function1) null);
        composeNavigatorDestinationBuilder6.k((Function1) null);
        composeNavigatorDestinationBuilder6.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder6);
        String string2 = context.getString(R.string.D8);
        Intrinsics.h(string2, "getString(...)");
        ComposableLambda c8 = ComposableLambdaKt.c(-1501447132, true, new AuthNavigationKt$authNavigation$1$7(navHostController));
        Map h8 = MapsKt.h();
        List<NavDeepLink> m8 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder7 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(RegisterResultExitingAccountNeedsActivationDestination.class), h8, c8);
        composeNavigatorDestinationBuilder7.e(string2);
        for (NavDeepLink b8 : m8) {
            composeNavigatorDestinationBuilder7.b(b8);
        }
        composeNavigatorDestinationBuilder7.h((Function1) null);
        composeNavigatorDestinationBuilder7.i((Function1) null);
        composeNavigatorDestinationBuilder7.j((Function1) null);
        composeNavigatorDestinationBuilder7.k((Function1) null);
        composeNavigatorDestinationBuilder7.l((Function1) null);
        navGraphBuilder2.h(composeNavigatorDestinationBuilder7);
        String string3 = context.getString(R.string.H8);
        Intrinsics.h(string3, "getString(...)");
        ComposableLambda c9 = ComposableLambdaKt.c(-337865947, true, new AuthNavigationKt$authNavigation$1$8(navHostController));
        Map h9 = MapsKt.h();
        List<NavDeepLink> m9 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder8 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder2.i().d(cls), Reflection.b(RegisterResultExitingAccountDestination.class), h9, c9);
        composeNavigatorDestinationBuilder8.e(string3);
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
