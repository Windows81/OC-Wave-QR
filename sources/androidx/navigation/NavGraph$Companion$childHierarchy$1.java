package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavGraph$Companion$childHierarchy$1 extends Lambda implements Function1<NavDestination, NavDestination> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavGraph$Companion$childHierarchy$1 f22343z = new NavGraph$Companion$childHierarchy$1();

    public NavGraph$Companion$childHierarchy$1() {
        super(1);
    }

    /* renamed from: b */
    public final NavDestination invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "it");
        if (!(navDestination instanceof NavGraph)) {
            return null;
        }
        NavGraph navGraph = (NavGraph) navDestination;
        return navGraph.P(navGraph.Y());
    }
}
