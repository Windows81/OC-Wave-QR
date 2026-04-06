package com.hansecom.abt.presentation.screens.main;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.serialization.RouteDeserializerKt;
import com.hansecom.abt.ui.webView.LocalWebViewScreenKt;
import com.hansecom.abt.ui.webView.WebViewScreenKt;
import com.hansecom.abt.util.CallDeviceOnBackButtonKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainNavigationKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$MainNavigationKt$lambda1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MainNavigationKt$lambda1$1 f37530z = new ComposableSingletons$MainNavigationKt$lambda1$1();

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1990786183, i2, -1, "com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainNavigationKt.lambda-1.<anonymous> (MainNavigation.kt:77)");
        }
        Bundle e2 = navBackStackEntry.e();
        if (e2 == null) {
            e2 = new Bundle();
        }
        Map o2 = navBackStackEntry.g().o();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.e(o2.size()));
        for (Map.Entry entry : o2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).a());
        }
        WebViewDestination webViewDestination = (WebViewDestination) RouteDeserializerKt.a(WebViewDestination.Companion.serializer(), e2, linkedHashMap);
        Uri parse = Uri.parse(webViewDestination.b());
        if (Intrinsics.d(parse.getHost(), "local")) {
            composer.X(-1884109197);
            String a2 = webViewDestination.a();
            Intrinsics.f(parse);
            LocalWebViewScreenKt.b(a2, parse, CallDeviceOnBackButtonKt.b(composer, 0), composer, 0, 0);
            composer.M();
        } else {
            composer.X(-1883881192);
            WebViewScreenKt.c(webViewDestination.a(), parse, CallDeviceOnBackButtonKt.b(composer, 0), composer, 0, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
