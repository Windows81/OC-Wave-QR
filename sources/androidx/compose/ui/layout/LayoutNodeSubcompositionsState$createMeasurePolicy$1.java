package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class LayoutNodeSubcompositionsState$createMeasurePolicy$1 extends LayoutNode.NoIntrinsicsMeasurePolicy {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState f17090b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function2 f17091c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$createMeasurePolicy$1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Function2 function2, String str) {
        super(str);
        this.f17090b = layoutNodeSubcompositionsState;
        this.f17091c = function2;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        this.f17090b.G.q(measureScope.getLayoutDirection());
        this.f17090b.G.b(measureScope.getDensity());
        this.f17090b.G.f(measureScope.u1());
        if (measureScope.w1() || this.f17090b.f17063z.l0() == null) {
            this.f17090b.C = 0;
            MeasureResult measureResult = (MeasureResult) this.f17091c.m(this.f17090b.G, Constraints.a(j2));
            return new LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure3p2s80s$$inlined$createMeasureResult$2(measureResult, this.f17090b, this.f17090b.C, measureResult);
        }
        this.f17090b.D = 0;
        MeasureResult measureResult2 = (MeasureResult) this.f17091c.m(this.f17090b.H, Constraints.a(j2));
        return new LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure3p2s80s$$inlined$createMeasureResult$1(measureResult2, this.f17090b, this.f17090b.D, measureResult2);
    }
}
