package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavGraph$setStartDestination$1 extends Lambda implements Function1<NavDestination, String> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavGraph$setStartDestination$1 f22347z = new NavGraph$setStartDestination$1();

    public NavGraph$setStartDestination$1() {
        super(1);
    }

    /* renamed from: b */
    public final String invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "startDestination");
        String w2 = navDestination.w();
        Intrinsics.f(w2);
        return w2;
    }
}
