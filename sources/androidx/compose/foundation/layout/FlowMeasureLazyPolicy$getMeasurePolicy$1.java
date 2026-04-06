package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowMeasureLazyPolicy$getMeasurePolicy$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FlowMeasureLazyPolicy f4004z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowMeasureLazyPolicy$getMeasurePolicy$1(FlowMeasureLazyPolicy flowMeasureLazyPolicy) {
        super(2);
        this.f4004z = flowMeasureLazyPolicy;
    }

    public final MeasureResult b(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        return this.f4004z.q(subcomposeMeasureScope, j2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SubcomposeMeasureScope) obj, ((Constraints) obj2).r());
    }
}
