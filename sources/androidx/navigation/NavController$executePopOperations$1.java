package androidx.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class NavController$executePopOperations$1 extends Lambda implements Function1<NavBackStackEntry, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f22240A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavController f22241B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ ArrayDeque D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f22242z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$1(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, NavController navController, boolean z2, ArrayDeque arrayDeque) {
        super(1);
        this.f22242z = booleanRef;
        this.f22240A = booleanRef2;
        this.f22241B = navController;
        this.C = z2;
        this.D = arrayDeque;
    }

    public final void b(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "entry");
        this.f22242z.f40901z = true;
        this.f22240A.f40901z = true;
        this.f22241B.l0(navBackStackEntry, this.C, this.D);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavBackStackEntry) obj);
        return Unit.f40552a;
    }
}
