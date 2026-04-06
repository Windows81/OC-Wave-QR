package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$executePopOperations$6 extends Lambda implements Function1<NavDestination, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavController f22246z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$6(NavController navController) {
        super(1);
        this.f22246z = navController;
    }

    /* renamed from: b */
    public final Boolean invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "destination");
        return Boolean.valueOf(!this.f22246z.f22221o.containsKey(Integer.valueOf(navDestination.q())));
    }
}
