package androidx.compose.ui.spatial;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class EmptyFillMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final EmptyFillMeasurePolicy f18153a = new EmptyFillMeasurePolicy();

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, EmptyFillMeasurePolicy$measure$1.f18154z, 4, (Object) null);
    }
}
