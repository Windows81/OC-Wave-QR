package androidx.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class NavController$popBackStackInternal$1 extends Lambda implements Function1<NavBackStackEntry, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavController$popBackStackInternal$1 f22261z = new NavController$popBackStackInternal$1();

    public NavController$popBackStackInternal$1() {
        super(1);
    }

    public final void b(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavBackStackEntry) obj);
        return Unit.f40552a;
    }
}
