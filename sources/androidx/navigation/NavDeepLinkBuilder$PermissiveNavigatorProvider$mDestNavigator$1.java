package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1 extends Navigator<NavDestination> {
    public NavDestination a() {
        return new NavDestination("permissive");
    }

    public NavDestination d(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.i(navDestination, "destination");
        throw new IllegalStateException("navigate is not supported");
    }

    public boolean k() {
        throw new IllegalStateException("popBackStack is not supported");
    }
}
