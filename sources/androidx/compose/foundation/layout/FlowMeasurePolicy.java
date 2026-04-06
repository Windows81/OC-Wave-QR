package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4013a;

    /* renamed from: b  reason: collision with root package name */
    public final Arrangement.Horizontal f4014b;

    /* renamed from: c  reason: collision with root package name */
    public final Arrangement.Vertical f4015c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4016d;

    /* renamed from: e  reason: collision with root package name */
    public final CrossAxisAlignment f4017e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4018f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4019g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4020h;

    /* renamed from: i  reason: collision with root package name */
    public final FlowLayoutOverflowState f4021i;

    public /* synthetic */ FlowMeasurePolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, flowLayoutOverflowState);
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        List list2 = list;
        if (this.f4020h == 0 || this.f4019g == 0 || list.isEmpty() || (Constraints.k(j2) == 0 && this.f4021i.l() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.R1(measureScope, 0, 0, (Map) null, FlowMeasurePolicy$measure$1.f4022z, 4, (Object) null);
        }
        List list3 = (List) CollectionsKt.e0(list);
        if (list3.isEmpty()) {
            return MeasureScope.R1(measureScope, 0, 0, (Map) null, FlowMeasurePolicy$measure$2.f4023z, 4, (Object) null);
        }
        List list4 = (List) CollectionsKt.h0(list2, 1);
        Measurable measurable = list4 != null ? (Measurable) CollectionsKt.g0(list4) : null;
        List list5 = (List) CollectionsKt.h0(list2, 2);
        Measurable measurable2 = list5 != null ? (Measurable) CollectionsKt.g0(list5) : null;
        this.f4021i.m(list3.size());
        this.f4021i.o(this, measurable, measurable2, j2);
        return FlowLayoutKt.f(measureScope, this, list3.iterator(), this.f4016d, this.f4018f, OrientationIndependentConstraints.c(j2, o() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.f4019g, this.f4020h, this.f4021i);
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f4021i;
        List list2 = (List) CollectionsKt.h0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = null;
        IntrinsicMeasurable intrinsicMeasurable2 = list2 != null ? (IntrinsicMeasurable) CollectionsKt.g0(list2) : null;
        List list3 = (List) CollectionsKt.h0(list, 2);
        if (list3 != null) {
            intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.g0(list3);
        }
        flowLayoutOverflowState.p(intrinsicMeasurable2, intrinsicMeasurable, o(), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null));
        if (o()) {
            List list4 = (List) CollectionsKt.g0(list);
            if (list4 == null) {
                list4 = CollectionsKt.m();
            }
            return r(list4, i2, intrinsicMeasureScope.P1(this.f4016d));
        }
        List list5 = (List) CollectionsKt.g0(list);
        if (list5 == null) {
            list5 = CollectionsKt.m();
        }
        return q(list5, i2, intrinsicMeasureScope.P1(this.f4016d), intrinsicMeasureScope.P1(this.f4018f), this.f4019g, this.f4020h, this.f4021i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.f4013a == flowMeasurePolicy.f4013a && Intrinsics.d(this.f4014b, flowMeasurePolicy.f4014b) && Intrinsics.d(this.f4015c, flowMeasurePolicy.f4015c) && Dp.o(this.f4016d, flowMeasurePolicy.f4016d) && Intrinsics.d(this.f4017e, flowMeasurePolicy.f4017e) && Dp.o(this.f4018f, flowMeasurePolicy.f4018f) && this.f4019g == flowMeasurePolicy.f4019g && this.f4020h == flowMeasurePolicy.f4020h && Intrinsics.d(this.f4021i, flowMeasurePolicy.f4021i);
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f4021i;
        List list2 = (List) CollectionsKt.h0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = null;
        IntrinsicMeasurable intrinsicMeasurable2 = list2 != null ? (IntrinsicMeasurable) CollectionsKt.g0(list2) : null;
        List list3 = (List) CollectionsKt.h0(list, 2);
        if (list3 != null) {
            intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.g0(list3);
        }
        flowLayoutOverflowState.p(intrinsicMeasurable2, intrinsicMeasurable, o(), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null));
        if (o()) {
            List list4 = (List) CollectionsKt.g0(list);
            if (list4 == null) {
                list4 = CollectionsKt.m();
            }
            return q(list4, i2, intrinsicMeasureScope.P1(this.f4016d), intrinsicMeasureScope.P1(this.f4018f), this.f4019g, this.f4020h, this.f4021i);
        }
        List list5 = (List) CollectionsKt.g0(list);
        if (list5 == null) {
            list5 = CollectionsKt.m();
        }
        return u(list5, i2, intrinsicMeasureScope.P1(this.f4016d), intrinsicMeasureScope.P1(this.f4018f), this.f4019g, this.f4020h, this.f4021i);
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f4021i;
        List list2 = (List) CollectionsKt.h0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = null;
        IntrinsicMeasurable intrinsicMeasurable2 = list2 != null ? (IntrinsicMeasurable) CollectionsKt.g0(list2) : null;
        List list3 = (List) CollectionsKt.h0(list, 2);
        if (list3 != null) {
            intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.g0(list3);
        }
        flowLayoutOverflowState.p(intrinsicMeasurable2, intrinsicMeasurable, o(), ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null));
        if (o()) {
            List list4 = (List) CollectionsKt.g0(list);
            if (list4 == null) {
                list4 = CollectionsKt.m();
            }
            return u(list4, i2, intrinsicMeasureScope.P1(this.f4016d), intrinsicMeasureScope.P1(this.f4018f), this.f4019g, this.f4020h, this.f4021i);
        }
        List list5 = (List) CollectionsKt.g0(list);
        if (list5 == null) {
            list5 = CollectionsKt.m();
        }
        return q(list5, i2, intrinsicMeasureScope.P1(this.f4016d), intrinsicMeasureScope.P1(this.f4018f), this.f4019g, this.f4020h, this.f4021i);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f4013a) * 31) + this.f4014b.hashCode()) * 31) + this.f4015c.hashCode()) * 31) + Dp.p(this.f4016d)) * 31) + this.f4017e.hashCode()) * 31) + Dp.p(this.f4018f)) * 31) + Integer.hashCode(this.f4019g)) * 31) + Integer.hashCode(this.f4020h)) * 31) + this.f4021i.hashCode();
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f4021i;
        List list2 = (List) CollectionsKt.h0(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = null;
        IntrinsicMeasurable intrinsicMeasurable2 = list2 != null ? (IntrinsicMeasurable) CollectionsKt.g0(list2) : null;
        List list3 = (List) CollectionsKt.h0(list, 2);
        if (list3 != null) {
            intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.g0(list3);
        }
        flowLayoutOverflowState.p(intrinsicMeasurable2, intrinsicMeasurable, o(), ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null));
        if (o()) {
            List list4 = (List) CollectionsKt.g0(list);
            if (list4 == null) {
                list4 = CollectionsKt.m();
            }
            return q(list4, i2, intrinsicMeasureScope.P1(this.f4016d), intrinsicMeasureScope.P1(this.f4018f), this.f4019g, this.f4020h, this.f4021i);
        }
        List list5 = (List) CollectionsKt.g0(list);
        if (list5 == null) {
            list5 = CollectionsKt.m();
        }
        return r(list5, i2, intrinsicMeasureScope.P1(this.f4016d));
    }

    public CrossAxisAlignment k() {
        return this.f4017e;
    }

    public Arrangement.Horizontal m() {
        return this.f4014b;
    }

    public Arrangement.Vertical n() {
        return this.f4015c;
    }

    public boolean o() {
        return this.f4013a;
    }

    public final int q(List list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        long j2;
        int i7;
        List list2 = list;
        int i8 = i2;
        if (list.isEmpty()) {
            j2 = IntIntPair.b(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i5, flowLayoutOverflowState, OrientationIndependentConstraints.a(0, i8, 0, Integer.MAX_VALUE), i6, i3, i4, (DefaultConstructorMarker) null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.h0(list2, 0);
            int t2 = intrinsicMeasurable != null ? t(intrinsicMeasurable, i8) : 0;
            int v2 = intrinsicMeasurable != null ? v(intrinsicMeasurable, t2) : 0;
            boolean z2 = true;
            int i9 = 0;
            int i10 = 0;
            if (flowLayoutBuildingBlocks.b(list.size() > 1, 0, IntIntPair.b(i8, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.a(IntIntPair.b(v2, t2)), 0, 0, 0, false, false).a()) {
                FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
                if (intrinsicMeasurable == null) {
                    z2 = false;
                }
                IntIntPair f2 = flowLayoutOverflowState2.f(z2, 0, 0);
                j2 = IntIntPair.b(f2 != null ? IntIntPair.f(f2.i()) : 0, 0);
            } else {
                int size = list2.size();
                int i11 = i8;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    int i16 = i11 - v2;
                    int i17 = i12 + 1;
                    int max = Math.max(i14, t2);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.h0(list2, i17);
                    int t3 = intrinsicMeasurable2 != null ? t(intrinsicMeasurable2, i8) : 0;
                    int v3 = intrinsicMeasurable2 != null ? v(intrinsicMeasurable2, t3) + i3 : 0;
                    int i18 = i17 - i15;
                    int i19 = v3;
                    IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable2;
                    int i20 = t3;
                    int i21 = i17;
                    FlowLayoutBuildingBlocks.WrapInfo b2 = flowLayoutBuildingBlocks.b(i12 + 2 < list.size(), i18, IntIntPair.b(i16, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.a(IntIntPair.b(v3, t3)), i9, i10, max, false, false);
                    if (b2.b()) {
                        i10 += max + i4;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo a2 = flowLayoutBuildingBlocks.a(b2, intrinsicMeasurable3 != null, i9, i10, i16, i18);
                        int i22 = i19 - i3;
                        i9++;
                        if (b2.a()) {
                            if (a2 != null) {
                                long b3 = a2.b();
                                if (!a2.c()) {
                                    i10 += IntIntPair.f(b3) + i4;
                                }
                            }
                            i13 = i21;
                        } else {
                            i14 = 0;
                            i7 = i22;
                            i15 = i21;
                            i11 = i8;
                        }
                    } else {
                        i14 = max;
                        i11 = i16;
                        i7 = i19;
                    }
                    t2 = i20;
                    i12 = i21;
                    i13 = i12;
                }
                j2 = IntIntPair.b(i10 - i4, i13);
            }
        }
        return IntIntPair.e(j2);
    }

    public final int r(List list, int i2, int i3) {
        int i4 = this.f4019g;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < size) {
            int s2 = s((IntrinsicMeasurable) list.get(i5), i2) + i3;
            int i9 = i5 + 1;
            if (i9 - i7 == i4 || i9 == list.size()) {
                i6 = Math.max(i6, (i8 + s2) - i3);
                i8 = 0;
                i7 = i5;
            } else {
                i8 += s2;
            }
            i5 = i9;
        }
        return i6;
    }

    public final int s(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return o() ? intrinsicMeasurable.a0(i2) : intrinsicMeasurable.C(i2);
    }

    public final int t(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return o() ? intrinsicMeasurable.q0(i2) : intrinsicMeasurable.Z(i2);
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.f4013a + ", horizontalArrangement=" + this.f4014b + ", verticalArrangement=" + this.f4015c + ", mainAxisSpacing=" + Dp.r(this.f4016d) + ", crossAxisAlignment=" + this.f4017e + ", crossAxisArrangementSpacing=" + Dp.r(this.f4018f) + ", maxItemsInMainAxis=" + this.f4019g + ", maxLines=" + this.f4020h + ", overflow=" + this.f4021i + ')';
    }

    public final int u(List list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        List list2 = list;
        int i7 = i2;
        int i8 = i5;
        int i9 = i6;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list2.get(i10);
            int v2 = v(intrinsicMeasurable, i7);
            iArr[i10] = v2;
            iArr2[i10] = t(intrinsicMeasurable, v2);
        }
        int i11 = Integer.MAX_VALUE;
        if (!(i9 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE)) {
            i11 = i8 * i9;
        }
        int min = Math.min(i11 - (((i11 >= list.size() || !(flowLayoutOverflowState.l() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.l() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i11 < list.size() || i9 < flowLayoutOverflowState.i() || flowLayoutOverflowState.l() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int U0 = ArraysKt.U0(iArr) + ((list.size() - 1) * i3);
        if (size2 != 0) {
            int i12 = iArr2[0];
            IntIterator q2 = new IntRange(1, ArraysKt.k0(iArr2)).iterator();
            while (q2.hasNext()) {
                int i13 = iArr2[q2.b()];
                if (i12 < i13) {
                    i12 = i13;
                }
            }
            if (size != 0) {
                int i14 = iArr[0];
                IntIterator q3 = new IntRange(1, ArraysKt.k0(iArr)).iterator();
                while (q3.hasNext()) {
                    int i15 = iArr[q3.b()];
                    if (i14 < i15) {
                        i14 = i15;
                    }
                }
                int i16 = i14;
                int i17 = U0;
                int i18 = i17;
                while (i16 <= i18 && i12 != i7) {
                    int i19 = (i16 + i18) / 2;
                    int i20 = i18;
                    int i21 = i16;
                    int i22 = min;
                    long e2 = FlowLayoutKt.i(list, iArr, iArr2, i19, i3, i4, i5, i6, flowLayoutOverflowState);
                    i12 = IntIntPair.e(e2);
                    int f2 = IntIntPair.f(e2);
                    if (i12 > i7 || f2 < i22) {
                        i16 = i19 + 1;
                        if (i16 > i20) {
                            return i16;
                        }
                        i18 = i20;
                        min = i22;
                        i17 = i19;
                    } else if (i12 >= i7) {
                        return i19;
                    } else {
                        i18 = i19 - 1;
                        min = i22;
                        i17 = i19;
                        i16 = i21;
                    }
                    List list3 = list;
                }
                return i17;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final int v(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return o() ? intrinsicMeasurable.Z(i2) : intrinsicMeasurable.q0(i2);
    }

    public FlowMeasurePolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f4013a = z2;
        this.f4014b = horizontal;
        this.f4015c = vertical;
        this.f4016d = f2;
        this.f4017e = crossAxisAlignment;
        this.f4018f = f3;
        this.f4019g = i2;
        this.f4020h = i3;
        this.f4021i = flowLayoutOverflowState;
    }
}
