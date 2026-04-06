package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata
public abstract class Navigator<D extends NavDestination> {

    /* renamed from: a  reason: collision with root package name */
    public NavigatorState f22426a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22427b;

    @Metadata
    public interface Extras {
    }

    @Target
    @Retention
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    public abstract NavDestination a();

    public final NavigatorState b() {
        NavigatorState navigatorState = this.f22426a;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean c() {
        return this.f22427b;
    }

    public NavDestination d(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Extras extras) {
        Intrinsics.i(navDestination, "destination");
        return navDestination;
    }

    public void e(List list, NavOptions navOptions, Extras extras) {
        Intrinsics.i(list, "entries");
        for (NavBackStackEntry j2 : SequencesKt.s(SequencesKt.z(CollectionsKt.V(list), new Navigator$navigate$1(this, navOptions, extras)))) {
            b().j(j2);
        }
    }

    public void f(NavigatorState navigatorState) {
        Intrinsics.i(navigatorState, "state");
        this.f22426a = navigatorState;
        this.f22427b = true;
    }

    public void g(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "backStackEntry");
        NavDestination g2 = navBackStackEntry.g();
        if (g2 == null) {
            g2 = null;
        }
        if (g2 != null) {
            d(g2, (Bundle) null, NavOptionsBuilderKt.a(Navigator$onLaunchSingleTop$1.f22431z), (Extras) null);
            b().f(navBackStackEntry);
        }
    }

    public void h(Bundle bundle) {
        Intrinsics.i(bundle, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(NavBackStackEntry navBackStackEntry, boolean z2) {
        Intrinsics.i(navBackStackEntry, "popUpTo");
        List list = (List) b().b().getValue();
        if (list.contains(navBackStackEntry)) {
            ListIterator listIterator = list.listIterator(list.size());
            NavBackStackEntry navBackStackEntry2 = null;
            while (k()) {
                navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
                if (Intrinsics.d(navBackStackEntry2, navBackStackEntry)) {
                    break;
                }
            }
            if (navBackStackEntry2 != null) {
                b().g(navBackStackEntry2, z2);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + list).toString());
    }

    public boolean k() {
        return true;
    }
}
