package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class NavController$executeRestoreState$3 extends Lambda implements Function1<NavBackStackEntry, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f22247A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f22248B;
    public final /* synthetic */ NavController C;
    public final /* synthetic */ Bundle D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f22249z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$executeRestoreState$3(Ref.BooleanRef booleanRef, List list, Ref.IntRef intRef, NavController navController, Bundle bundle) {
        super(1);
        this.f22249z = booleanRef;
        this.f22247A = list;
        this.f22248B = intRef;
        this.C = navController;
        this.D = bundle;
    }

    public final void b(NavBackStackEntry navBackStackEntry) {
        List list;
        Intrinsics.i(navBackStackEntry, "entry");
        this.f22249z.f40901z = true;
        int indexOf = this.f22247A.indexOf(navBackStackEntry);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            list = this.f22247A.subList(this.f22248B.f40906z, i2);
            this.f22248B.f40906z = i2;
        } else {
            list = CollectionsKt.m();
        }
        this.C.p(navBackStackEntry.g(), this.D, navBackStackEntry, list);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NavBackStackEntry) obj);
        return Unit.f40552a;
    }
}
