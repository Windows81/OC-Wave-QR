package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MeasurePassDelegate$placeOuterCoordinatorBlock$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasurePassDelegate f17369z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasurePassDelegate$placeOuterCoordinatorBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.f17369z = measurePassDelegate;
    }

    public final void invoke() {
        Placeable.PlacementScope placementScope;
        NodeCoordinator W2 = this.f17369z.C1().W2();
        if (W2 == null || (placementScope = W2.i1()) == null) {
            placementScope = LayoutNodeKt.b(this.f17369z.X1()).getPlacementScope();
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        MeasurePassDelegate measurePassDelegate = this.f17369z;
        Function1 Z0 = measurePassDelegate.g0;
        GraphicsLayer Y0 = measurePassDelegate.h0;
        if (Y0 != null) {
            placementScope2.z(measurePassDelegate.C1(), measurePassDelegate.i0, Y0, measurePassDelegate.j0);
        } else if (Z0 == null) {
            placementScope2.k(measurePassDelegate.C1(), measurePassDelegate.i0, measurePassDelegate.j0);
        } else {
            placementScope2.y(measurePassDelegate.C1(), measurePassDelegate.i0, measurePassDelegate.j0, Z0);
        }
    }
}
