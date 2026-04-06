package androidx.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

@Metadata
public final class NavController$handleDeepLink$2 extends Lambda implements Function1<NavOptionsBuilder, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavController f22250A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDestination f22251z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$handleDeepLink$2(NavDestination navDestination, NavController navController) {
        super(1);
        this.f22251z = navDestination;
        this.f22250A = navController;
    }

    public final void b(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.a(AnonymousClass1.f22252z);
        NavDestination navDestination = this.f22251z;
        if (navDestination instanceof NavGraph) {
            Sequence<NavDestination> c2 = NavDestination.J.c(navDestination);
            NavController navController = this.f22250A;
            for (NavDestination navDestination2 : c2) {
                NavDestination I = navController.I();
                if (Intrinsics.d(navDestination2, I != null ? I.v() : null)) {
                    return;
                }
            }
            if (NavController.I) {
                navOptionsBuilder.c(NavGraph.P.b(this.f22250A.K()).q(), AnonymousClass2.f22253z);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavOptionsBuilder) obj);
        return Unit.f40552a;
    }
}
