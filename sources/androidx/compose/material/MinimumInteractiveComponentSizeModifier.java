package androidx.compose.material;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpSize;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {

    /* renamed from: z  reason: collision with root package name */
    public final long f7974z;

    public boolean equals(Object obj) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier = obj instanceof MinimumInteractiveComponentSizeModifier ? (MinimumInteractiveComponentSizeModifier) obj : null;
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.h(this.f7974z, minimumInteractiveComponentSizeModifier.f7974z);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        int max = Math.max(c0.L0(), measureScope.P1(DpSize.j(this.f7974z)));
        int max2 = Math.max(c0.C0(), measureScope.P1(DpSize.i(this.f7974z)));
        return MeasureScope.R1(measureScope, max, max2, (Map) null, new MinimumInteractiveComponentSizeModifier$measure$1(max, c0, max2), 4, (Object) null);
    }

    public int hashCode() {
        return DpSize.k(this.f7974z);
    }
}
