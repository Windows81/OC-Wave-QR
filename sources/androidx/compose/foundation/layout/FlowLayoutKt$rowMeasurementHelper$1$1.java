package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
final class FlowLayoutKt$rowMeasurementHelper$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MultiContentMeasurePolicy f3957a;

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        return this.f3957a.b(measureScope, CollectionsKt.e(list), j2);
    }
}
