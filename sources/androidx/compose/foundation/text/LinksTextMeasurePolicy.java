package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class LinksTextMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f5818a;

    public LinksTextMeasurePolicy(Function0 function0) {
        this.f5818a = function0;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, new LinksTextMeasurePolicy$measure$1(list, this), 4, (Object) null);
    }
}
