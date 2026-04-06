package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class SpacerMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final SpacerMeasurePolicy f4194a = new SpacerMeasurePolicy();

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int i2 = 0;
        int l2 = Constraints.j(j2) ? Constraints.l(j2) : 0;
        if (Constraints.i(j2)) {
            i2 = Constraints.k(j2);
        }
        return MeasureScope.R1(measureScope, l2, i2, (Map) null, SpacerMeasurePolicy$measure$1$1.f4195z, 4, (Object) null);
    }
}
