package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3992a;

    /* renamed from: b  reason: collision with root package name */
    public final Arrangement.Horizontal f3993b;

    /* renamed from: c  reason: collision with root package name */
    public final Arrangement.Vertical f3994c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3995d;

    /* renamed from: e  reason: collision with root package name */
    public final CrossAxisAlignment f3996e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3997f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3998g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3999h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4000i;

    /* renamed from: j  reason: collision with root package name */
    public final FlowLayoutOverflowState f4001j;

    /* renamed from: k  reason: collision with root package name */
    public final List f4002k;

    /* renamed from: l  reason: collision with root package name */
    public final Function4 f4003l;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List list, Function4 function4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, i4, flowLayoutOverflowState, list, function4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.f3992a == flowMeasureLazyPolicy.f3992a && Intrinsics.d(this.f3993b, flowMeasureLazyPolicy.f3993b) && Intrinsics.d(this.f3994c, flowMeasureLazyPolicy.f3994c) && Dp.o(this.f3995d, flowMeasureLazyPolicy.f3995d) && Intrinsics.d(this.f3996e, flowMeasureLazyPolicy.f3996e) && Dp.o(this.f3997f, flowMeasureLazyPolicy.f3997f) && this.f3998g == flowMeasureLazyPolicy.f3998g && this.f3999h == flowMeasureLazyPolicy.f3999h && this.f4000i == flowMeasureLazyPolicy.f4000i && Intrinsics.d(this.f4001j, flowMeasureLazyPolicy.f4001j) && Intrinsics.d(this.f4002k, flowMeasureLazyPolicy.f4002k) && Intrinsics.d(this.f4003l, flowMeasureLazyPolicy.f4003l);
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.f3992a) * 31) + this.f3993b.hashCode()) * 31) + this.f3994c.hashCode()) * 31) + Dp.p(this.f3995d)) * 31) + this.f3996e.hashCode()) * 31) + Dp.p(this.f3997f)) * 31) + Integer.hashCode(this.f3998g)) * 31) + Integer.hashCode(this.f3999h)) * 31) + Integer.hashCode(this.f4000i)) * 31) + this.f4001j.hashCode()) * 31) + this.f4002k.hashCode()) * 31) + this.f4003l.hashCode();
    }

    public final Function2 i() {
        return new FlowMeasureLazyPolicy$getMeasurePolicy$1(this);
    }

    public CrossAxisAlignment k() {
        return this.f3996e;
    }

    public Arrangement.Horizontal m() {
        return this.f3993b;
    }

    public Arrangement.Vertical n() {
        return this.f3994c;
    }

    public boolean o() {
        return this.f3992a;
    }

    public final MeasureResult q(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        if (this.f3998g <= 0 || this.f3999h == 0 || this.f4000i == 0 || (Constraints.k(j2) == 0 && this.f4001j.l() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.R1(subcomposeMeasureScope, 0, 0, (Map) null, FlowMeasureLazyPolicy$measure$1.f4005z, 4, (Object) null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.f3998g, new FlowMeasureLazyPolicy$measure$measurablesIterator$1(subcomposeMeasureScope, this));
        this.f4001j.m(this.f3998g);
        this.f4001j.q(this, j2, new FlowMeasureLazyPolicy$measure$2(this, subcomposeMeasureScope));
        return FlowLayoutKt.f(subcomposeMeasureScope, this, contextualFlowItemIterator, this.f3995d, this.f3997f, OrientationIndependentConstraints.c(j2, o() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.f4000i, this.f3999h, this.f4001j);
    }

    public String toString() {
        return "FlowMeasureLazyPolicy(isHorizontal=" + this.f3992a + ", horizontalArrangement=" + this.f3993b + ", verticalArrangement=" + this.f3994c + ", mainAxisSpacing=" + Dp.r(this.f3995d) + ", crossAxisAlignment=" + this.f3996e + ", crossAxisArrangementSpacing=" + Dp.r(this.f3997f) + ", itemCount=" + this.f3998g + ", maxLines=" + this.f3999h + ", maxItemsInMainAxis=" + this.f4000i + ", overflow=" + this.f4001j + ", overflowComposables=" + this.f4002k + ", getComposable=" + this.f4003l + ')';
    }

    public FlowMeasureLazyPolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List list, Function4 function4) {
        this.f3992a = z2;
        this.f3993b = horizontal;
        this.f3994c = vertical;
        this.f3995d = f2;
        this.f3996e = crossAxisAlignment;
        this.f3997f = f3;
        this.f3998g = i2;
        this.f3999h = i3;
        this.f4000i = i4;
        this.f4001j = flowLayoutOverflowState;
        this.f4002k = list;
        this.f4003l = function4;
    }
}
