package androidx.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$clearBackStackInternal$restored$1 extends Lambda implements Function1<NavOptionsBuilder, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavController$clearBackStackInternal$restored$1 f22239z = new NavController$clearBackStackInternal$restored$1();

    public NavController$clearBackStackInternal$restored$1() {
        super(1);
    }

    public final void b(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.k(true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavOptionsBuilder) obj);
        return Unit.f40552a;
    }
}
