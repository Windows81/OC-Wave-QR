package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LookaheadScopeImpl implements LookaheadScope {

    /* renamed from: z  reason: collision with root package name */
    public Function0 f17100z;

    public LookaheadScopeImpl(Function0 function0) {
        this.f17100z = function0;
    }

    public final void a(Function0 function0) {
        this.f17100z = function0;
    }

    public LayoutCoordinates f(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates r2;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null) {
            return lookaheadLayoutCoordinates;
        }
        Intrinsics.g(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
        LookaheadDelegate Q2 = nodeCoordinator.Q2();
        return (Q2 == null || (r2 = Q2.r2()) == null) ? nodeCoordinator : r2;
    }

    public LayoutCoordinates u(Placeable.PlacementScope placementScope) {
        Function0 function0 = this.f17100z;
        Intrinsics.f(function0);
        return (LayoutCoordinates) function0.invoke();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LookaheadScopeImpl(Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : function0);
    }
}
