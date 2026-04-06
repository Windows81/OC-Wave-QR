package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;

@Metadata
public final class FlowLayoutOverflowState {

    /* renamed from: a  reason: collision with root package name */
    public final FlowLayoutOverflow.OverflowType f3967a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3968b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3969c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3970d = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";

    /* renamed from: e  reason: collision with root package name */
    public int f3971e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f3972f;

    /* renamed from: g  reason: collision with root package name */
    public Measurable f3973g;

    /* renamed from: h  reason: collision with root package name */
    public Placeable f3974h;

    /* renamed from: i  reason: collision with root package name */
    public Measurable f3975i;

    /* renamed from: j  reason: collision with root package name */
    public Placeable f3976j;

    /* renamed from: k  reason: collision with root package name */
    public IntIntPair f3977k;

    /* renamed from: l  reason: collision with root package name */
    public IntIntPair f3978l;

    /* renamed from: m  reason: collision with root package name */
    public Function2 f3979m;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3980a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType[] r0 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r1 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r1 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Clip     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r1 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandIndicator     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r1 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f3980a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutOverflowState.WhenMappings.<clinit>():void");
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3) {
        this.f3967a = overflowType;
        this.f3968b = i2;
        this.f3969c = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo e(boolean r12, int r13, int r14) {
        /*
            r11 = this;
            androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r0 = r11.f3967a
            int[] r1 = androidx.compose.foundation.layout.FlowLayoutOverflowState.WhenMappings.f3980a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0086
            r3 = 2
            if (r0 == r3) goto L_0x0086
            r3 = 3
            if (r0 == r3) goto L_0x001e
            r3 = 4
            if (r0 != r3) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x001e:
            if (r12 == 0) goto L_0x0046
            kotlin.jvm.functions.Function2 r12 = r11.f3979m
            if (r12 == 0) goto L_0x0036
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            int r14 = r11.j()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r12 = r12.m(r13, r14)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            if (r12 != 0) goto L_0x0038
        L_0x0036:
            androidx.compose.ui.layout.Measurable r12 = r11.f3973g
        L_0x0038:
            androidx.collection.IntIntPair r13 = r11.f3977k
            kotlin.jvm.functions.Function2 r14 = r11.f3979m
            if (r14 != 0) goto L_0x0043
            androidx.compose.ui.layout.Placeable r14 = r11.f3974h
        L_0x0040:
            r4 = r12
            r5 = r14
            goto L_0x0072
        L_0x0043:
            r4 = r12
            r5 = r2
            goto L_0x0072
        L_0x0046:
            int r12 = r11.f3968b
            int r12 = r12 - r1
            if (r13 < r12) goto L_0x0068
            int r12 = r11.f3969c
            if (r14 < r12) goto L_0x0068
            kotlin.jvm.functions.Function2 r12 = r11.f3979m
            if (r12 == 0) goto L_0x0065
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            int r14 = r11.j()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r12 = r12.m(r13, r14)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            if (r12 != 0) goto L_0x0069
        L_0x0065:
            androidx.compose.ui.layout.Measurable r12 = r11.f3975i
            goto L_0x0069
        L_0x0068:
            r12 = r2
        L_0x0069:
            androidx.collection.IntIntPair r13 = r11.f3978l
            kotlin.jvm.functions.Function2 r14 = r11.f3979m
            if (r14 != 0) goto L_0x0043
            androidx.compose.ui.layout.Placeable r14 = r11.f3976j
            goto L_0x0040
        L_0x0072:
            if (r4 != 0) goto L_0x0075
            return r2
        L_0x0075:
            androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo r2 = new androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo
            kotlin.jvm.internal.Intrinsics.f(r13)
            long r6 = r13.i()
            r9 = 8
            r10 = 0
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r8, r9, r10)
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutOverflowState.e(boolean, int, int):androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.f3967a == flowLayoutOverflowState.f3967a && this.f3968b == flowLayoutOverflowState.f3968b && this.f3969c == flowLayoutOverflowState.f3969c;
    }

    public final IntIntPair f(boolean z2, int i2, int i3) {
        int i4 = WhenMappings.f3980a[this.f3967a.ordinal()];
        if (i4 == 1 || i4 == 2) {
            return null;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (z2) {
                return this.f3977k;
            } else {
                if (i2 + 1 < this.f3968b || i3 < this.f3969c) {
                    return null;
                }
                return this.f3978l;
            }
        } else if (z2) {
            return this.f3977k;
        } else {
            return null;
        }
    }

    public final int g() {
        return this.f3972f;
    }

    public final int h() {
        return this.f3971e;
    }

    public int hashCode() {
        return (((this.f3967a.hashCode() * 31) + Integer.hashCode(this.f3968b)) * 31) + Integer.hashCode(this.f3969c);
    }

    public final int i() {
        return this.f3968b;
    }

    public final int j() {
        int i2 = this.f3971e;
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalStateException(this.f3970d);
    }

    public final String k() {
        return this.f3970d;
    }

    public final FlowLayoutOverflow.OverflowType l() {
        return this.f3967a;
    }

    public final void m(int i2) {
        this.f3972f = i2;
    }

    public final void n(int i2) {
        this.f3971e = i2;
    }

    public final void o(FlowLineMeasurePolicy flowLineMeasurePolicy, Measurable measurable, Measurable measurable2, long j2) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.o() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long h2 = OrientationIndependentConstraints.h(OrientationIndependentConstraints.e(OrientationIndependentConstraints.c(j2, layoutOrientation), 0, 0, 0, 0, 10, (Object) null), layoutOrientation);
        if (measurable != null) {
            FlowLayoutKt.k(measurable, flowLineMeasurePolicy, h2, new FlowLayoutOverflowState$setOverflowMeasurables$3$1(this, flowLineMeasurePolicy));
            this.f3973g = measurable;
        }
        if (measurable2 != null) {
            FlowLayoutKt.k(measurable2, flowLineMeasurePolicy, h2, new FlowLayoutOverflowState$setOverflowMeasurables$4$1(this, flowLineMeasurePolicy));
            this.f3975i = measurable2;
        }
    }

    public final void p(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z2, long j2) {
        long c2 = OrientationIndependentConstraints.c(j2, z2 ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (intrinsicMeasurable != null) {
            int j3 = FlowLayoutKt.j(intrinsicMeasurable, z2, Constraints.k(c2));
            this.f3977k = IntIntPair.a(IntIntPair.b(j3, FlowLayoutKt.h(intrinsicMeasurable, z2, j3)));
            this.f3973g = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.f3974h = null;
        }
        if (intrinsicMeasurable2 != null) {
            int j4 = FlowLayoutKt.j(intrinsicMeasurable2, z2, Constraints.k(c2));
            this.f3978l = IntIntPair.a(IntIntPair.b(j4, FlowLayoutKt.h(intrinsicMeasurable2, z2, j4)));
            this.f3975i = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.f3976j = null;
        }
    }

    public final void q(FlowLineMeasurePolicy flowLineMeasurePolicy, long j2, Function2 function2) {
        this.f3971e = 0;
        this.f3979m = function2;
        o(flowLineMeasurePolicy, (Measurable) function2.m(Boolean.TRUE, 0), (Measurable) function2.m(Boolean.FALSE, 0), j2);
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.f3967a + ", minLinesToShowCollapse=" + this.f3968b + ", minCrossAxisSizeToShowCollapse=" + this.f3969c + ')';
    }
}
