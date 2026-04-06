package androidx.compose.ui.node;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LookaheadPassDelegate$placeSelf$2 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Owner f17345A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f17346B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LookaheadPassDelegate f17347z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadPassDelegate$placeSelf$2(LookaheadPassDelegate lookaheadPassDelegate, Owner owner, long j2) {
        super(0);
        this.f17347z = lookaheadPassDelegate;
        this.f17345A = owner;
        this.f17346B = j2;
    }

    public final void invoke() {
        LookaheadDelegate Q2;
        Placeable.PlacementScope placementScope = null;
        if (LayoutNodeLayoutDelegateKt.a(this.f17347z.X1()) || this.f17347z.E.i()) {
            NodeCoordinator W2 = this.f17347z.x1().W2();
            if (W2 != null) {
                placementScope = W2.i1();
            }
        } else {
            NodeCoordinator W22 = this.f17347z.x1().W2();
            if (!(W22 == null || (Q2 = W22.Q2()) == null)) {
                placementScope = Q2.i1();
            }
        }
        if (placementScope == null) {
            placementScope = this.f17345A.getPlacementScope();
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f17347z;
        long j2 = this.f17346B;
        LookaheadDelegate Q22 = lookaheadPassDelegate.x1().Q2();
        Intrinsics.f(Q22);
        Placeable.PlacementScope.l(placementScope, Q22, j2, 0.0f, 2, (Object) null);
    }
}
