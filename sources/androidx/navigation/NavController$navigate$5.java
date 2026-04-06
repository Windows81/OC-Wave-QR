package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class NavController$navigate$5 extends Lambda implements Function1<NavBackStackEntry, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavController f22256A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavDestination f22257B;
    public final /* synthetic */ Bundle C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f22258z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$navigate$5(Ref.BooleanRef booleanRef, NavController navController, NavDestination navDestination, Bundle bundle) {
        super(1);
        this.f22258z = booleanRef;
        this.f22256A = navController;
        this.f22257B = navDestination;
        this.C = bundle;
    }

    public final void b(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "it");
        this.f22258z.f40901z = true;
        NavController.q(this.f22256A, this.f22257B, this.C, navBackStackEntry, (List) null, 8, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavBackStackEntry) obj);
        return Unit.f40552a;
    }
}
