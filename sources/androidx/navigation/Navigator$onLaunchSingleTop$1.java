package androidx.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Navigator$onLaunchSingleTop$1 extends Lambda implements Function1<NavOptionsBuilder, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final Navigator$onLaunchSingleTop$1 f22431z = new Navigator$onLaunchSingleTop$1();

    public Navigator$onLaunchSingleTop$1() {
        super(1);
    }

    public final void b(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.g(true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavOptionsBuilder) obj);
        return Unit.f40552a;
    }
}
