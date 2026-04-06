package androidx.navigation;

import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$NavControllerNavigatorState$pop$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22235A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f22236B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavController.NavControllerNavigatorState f22237z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$NavControllerNavigatorState$pop$1(NavController.NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z2) {
        super(0);
        this.f22237z = navControllerNavigatorState;
        this.f22235A = navBackStackEntry;
        this.f22236B = z2;
    }

    public final void invoke() {
        NavController$NavControllerNavigatorState$pop$1.super.g(this.f22235A, this.f22236B);
    }
}
