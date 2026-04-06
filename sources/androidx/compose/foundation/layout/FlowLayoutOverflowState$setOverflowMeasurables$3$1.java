package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowLayoutOverflowState$setOverflowMeasurables$3$1 extends Lambda implements Function1<Placeable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FlowLineMeasurePolicy f3981A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FlowLayoutOverflowState f3982z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutOverflowState$setOverflowMeasurables$3$1(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy) {
        super(1);
        this.f3982z = flowLayoutOverflowState;
        this.f3981A = flowLineMeasurePolicy;
    }

    public final void b(Placeable placeable) {
        int i2;
        int i3;
        if (placeable != null) {
            FlowLineMeasurePolicy flowLineMeasurePolicy = this.f3981A;
            i2 = flowLineMeasurePolicy.g(placeable);
            i3 = flowLineMeasurePolicy.j(placeable);
        } else {
            i2 = 0;
            i3 = 0;
        }
        this.f3982z.f3977k = IntIntPair.a(IntIntPair.b(i2, i3));
        this.f3982z.f3974h = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable) obj);
        return Unit.f40552a;
    }
}
