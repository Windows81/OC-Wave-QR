package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$executePopOperations$5 extends Lambda implements Function1<NavDestination, NavDestination> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavController$executePopOperations$5 f22245z = new NavController$executePopOperations$5();

    public NavController$executePopOperations$5() {
        super(1);
    }

    /* renamed from: b */
    public final NavDestination invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "destination");
        NavGraph v2 = navDestination.v();
        if (v2 == null || v2.Y() != navDestination.q()) {
            return null;
        }
        return navDestination.v();
    }
}
