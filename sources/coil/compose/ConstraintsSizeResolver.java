package coil.compose;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import coil.size.SizeResolver;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata
public final class ConstraintsSizeResolver implements SizeResolver, LayoutModifier {

    /* renamed from: z  reason: collision with root package name */
    public final MutableStateFlow f23301z = StateFlowKt.a(Constraints.a(UtilsKt.d()));

    public Object c(Continuation continuation) {
        return FlowKt.D(new ConstraintsSizeResolver$size$$inlined$mapNotNull$1(this.f23301z), continuation);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        this.f23301z.setValue(Constraints.a(j2));
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new ConstraintsSizeResolver$measure$1(c0), 4, (Object) null);
    }

    public final void l(long j2) {
        this.f23301z.setValue(Constraints.a(j2));
    }
}
