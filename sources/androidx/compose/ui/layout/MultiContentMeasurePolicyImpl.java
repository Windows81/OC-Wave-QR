package androidx.compose.ui.layout;

import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MultiContentMeasurePolicyImpl implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final MultiContentMeasurePolicy f17129a;

    public MultiContentMeasurePolicyImpl(MultiContentMeasurePolicy multiContentMeasurePolicy) {
        this.f17129a = multiContentMeasurePolicy;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        return this.f17129a.b(measureScope, MeasureScopeWithLayoutNodeKt.a(measureScope), j2);
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f17129a.c(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiContentMeasurePolicyImpl) && Intrinsics.d(this.f17129a, ((MultiContentMeasurePolicyImpl) obj).f17129a);
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f17129a.f(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f17129a.h(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    public int hashCode() {
        return this.f17129a.hashCode();
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f17129a.i(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f17129a + ')';
    }
}
