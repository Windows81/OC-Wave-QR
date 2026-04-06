package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavGraphBuilder$build$1$1 extends Lambda implements Function1<NavDestination, String> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavGraphBuilder$build$1$1 f22355z = new NavGraphBuilder$build$1$1();

    public NavGraphBuilder$build$1$1() {
        super(1);
    }

    /* renamed from: b */
    public final String invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "it");
        String w2 = navDestination.w();
        Intrinsics.f(w2);
        return w2;
    }
}
