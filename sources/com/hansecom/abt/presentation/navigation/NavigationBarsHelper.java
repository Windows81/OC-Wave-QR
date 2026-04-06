package com.hansecom.abt.presentation.navigation;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavigationBarsHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final NavigationBarsHelper f34208a = new NavigationBarsHelper();

    public final boolean a(NavBackStackEntry navBackStackEntry) {
        Bundle e2;
        if (navBackStackEntry == null || (e2 = navBackStackEntry.e()) == null || !e2.containsKey("showBottomBar")) {
            return true;
        }
        Bundle e3 = navBackStackEntry.e();
        Intrinsics.f(e3);
        return e3.getBoolean("showBottomBar");
    }

    public final boolean b(NavBackStackEntry navBackStackEntry) {
        Bundle e2;
        if (navBackStackEntry == null || (e2 = navBackStackEntry.e()) == null || !e2.containsKey("showTopBar")) {
            return true;
        }
        Bundle e3 = navBackStackEntry.e();
        Intrinsics.f(e3);
        return e3.getBoolean("showTopBar");
    }

    public final boolean c(NavDestination navDestination) {
        Intrinsics.i(navDestination, "<this>");
        return Intrinsics.d(navDestination.u(), "dialog");
    }
}
