package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
@Navigator.Name("navigation")
public class NavGraphNavigator extends Navigator<NavGraph> {

    /* renamed from: c  reason: collision with root package name */
    public final NavigatorProvider f22356c;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        Intrinsics.i(navigatorProvider, "navigatorProvider");
        this.f22356c = navigatorProvider;
    }

    public void e(List list, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.i(list, "entries");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m((NavBackStackEntry) it.next(), navOptions, extras);
        }
    }

    /* renamed from: l */
    public NavGraph a() {
        return new NavGraph(this);
    }

    public final void m(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination g2 = navBackStackEntry.g();
        Intrinsics.g(g2, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) g2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = navBackStackEntry.e();
        int Y = navGraph.Y();
        String Z = navGraph.Z();
        if (Y == 0 && Z == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.p()).toString());
        }
        NavDestination R = Z != null ? navGraph.R(Z, false) : (NavDestination) navGraph.V().g(Y);
        if (R != null) {
            if (Z != null) {
                if (!Intrinsics.d(Z, R.w())) {
                    NavDestination.DeepLinkMatch C = R.C(Z);
                    Bundle h2 = C != null ? C.h() : null;
                    if (h2 != null && !h2.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putAll(h2);
                        Object obj = objectRef.f40908z;
                        if (((Bundle) obj) != null) {
                            bundle.putAll((Bundle) obj);
                        }
                        objectRef.f40908z = bundle;
                    }
                }
                if (!R.o().isEmpty()) {
                    List a2 = NavArgumentKt.a(R.o(), new NavGraphNavigator$navigate$missingRequiredArgs$1(objectRef));
                    if (!a2.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + R + ". Missing required arguments [" + a2 + ']').toString());
                    }
                }
            }
            this.f22356c.e(R.u()).e(CollectionsKt.e(b().a(R, R.i((Bundle) objectRef.f40908z))), navOptions, extras);
            return;
        }
        String W = navGraph.W();
        throw new IllegalArgumentException("navigation destination " + W + " is not a direct child of this NavGraph");
    }
}
