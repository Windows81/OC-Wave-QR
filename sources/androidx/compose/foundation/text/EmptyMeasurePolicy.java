package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class EmptyMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final EmptyMeasurePolicy f5730a = new EmptyMeasurePolicy();

    /* renamed from: b  reason: collision with root package name */
    public static final Function1 f5731b = EmptyMeasurePolicy$placementBlock$1.f5732z;

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, f5731b, 4, (Object) null);
    }
}
