package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Navigator.Name("NoOp")
public final class NoOpNavigator extends Navigator<NavDestination> {
    public NavDestination a() {
        return new NavDestination((Navigator) this);
    }

    public NavDestination d(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.i(navDestination, "destination");
        return navDestination;
    }

    public boolean k() {
        return true;
    }
}
