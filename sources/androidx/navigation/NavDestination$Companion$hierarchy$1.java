package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDestination$Companion$hierarchy$1 extends Lambda implements Function1<NavDestination, NavDestination> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavDestination$Companion$hierarchy$1 f22326z = new NavDestination$Companion$hierarchy$1();

    public NavDestination$Companion$hierarchy$1() {
        super(1);
    }

    /* renamed from: b */
    public final NavDestination invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "it");
        return navDestination.v();
    }
}
