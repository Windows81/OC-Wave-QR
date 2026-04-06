package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowMeasureLazyPolicy$measure$2 extends Lambda implements Function2<Boolean, Integer, Measurable> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f4006A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FlowMeasureLazyPolicy f4007z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowMeasureLazyPolicy$measure$2(FlowMeasureLazyPolicy flowMeasureLazyPolicy, SubcomposeMeasureScope subcomposeMeasureScope) {
        super(2);
        this.f4007z = flowMeasureLazyPolicy;
        this.f4006A = subcomposeMeasureScope;
    }

    public final Measurable b(boolean z2, int i2) {
        Function2 function2 = (Function2) CollectionsKt.h0(this.f4007z.f4002k, z2 ^ true ? 1 : 0);
        if (function2 == null) {
            return null;
        }
        SubcomposeMeasureScope subcomposeMeasureScope = this.f4006A;
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.f4007z;
        StringBuilder sb = new StringBuilder();
        sb.append(z2);
        sb.append(flowMeasureLazyPolicy.f3998g);
        sb.append(i2);
        return (Measurable) CollectionsKt.h0(subcomposeMeasureScope.j0(sb.toString(), function2), 0);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), ((Number) obj2).intValue());
    }
}
