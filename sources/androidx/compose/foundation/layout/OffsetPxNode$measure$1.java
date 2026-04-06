package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OffsetPxNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f4100A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f4101B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetPxNode f4102z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetPxNode$measure$1(OffsetPxNode offsetPxNode, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.f4102z = offsetPxNode;
        this.f4100A = measureScope;
        this.f4101B = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        long r2 = ((IntOffset) this.f4102z.Z2().invoke(this.f4100A)).r();
        if (this.f4102z.a3()) {
            Placeable.PlacementScope.r(placementScope, this.f4101B, IntOffset.k(r2), IntOffset.l(r2), 0.0f, (Function1) null, 12, (Object) null);
            return;
        }
        Placeable.PlacementScope.x(placementScope, this.f4101B, IntOffset.k(r2), IntOffset.l(r2), 0.0f, (Function1) null, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
