package androidx.navigation;

import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Navigator$navigate$1 extends Lambda implements Function1<NavBackStackEntry, NavBackStackEntry> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavOptions f22428A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Navigator.Extras f22429B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Navigator f22430z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Navigator$navigate$1(Navigator navigator, NavOptions navOptions, Navigator.Extras extras) {
        super(1);
        this.f22430z = navigator;
        this.f22428A = navOptions;
        this.f22429B = extras;
    }

    /* renamed from: b */
    public final NavBackStackEntry invoke(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "backStackEntry");
        NavDestination g2 = navBackStackEntry.g();
        if (g2 == null) {
            g2 = null;
        }
        if (g2 == null) {
            return null;
        }
        NavDestination d2 = this.f22430z.d(g2, navBackStackEntry.e(), this.f22428A, this.f22429B);
        if (d2 == null) {
            return null;
        }
        return Intrinsics.d(d2, g2) ? navBackStackEntry : this.f22430z.b().a(d2, d2.i(navBackStackEntry.e()));
    }
}
