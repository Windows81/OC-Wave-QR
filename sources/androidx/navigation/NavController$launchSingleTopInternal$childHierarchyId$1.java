package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$launchSingleTopInternal$childHierarchyId$1 extends Lambda implements Function1<NavDestination, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavController$launchSingleTopInternal$childHierarchyId$1 f22254z = new NavController$launchSingleTopInternal$childHierarchyId$1();

    public NavController$launchSingleTopInternal$childHierarchyId$1() {
        super(1);
    }

    /* renamed from: b */
    public final Integer invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "it");
        return Integer.valueOf(navDestination.q());
    }
}
