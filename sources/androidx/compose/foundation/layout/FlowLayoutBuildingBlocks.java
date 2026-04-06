package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FlowLayoutBuildingBlocks {

    /* renamed from: a  reason: collision with root package name */
    public final int f3924a;

    /* renamed from: b  reason: collision with root package name */
    public final FlowLayoutOverflowState f3925b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3926c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3927d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3928e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3929f;

    @Metadata
    public static final class WrapEllipsisInfo {

        /* renamed from: a  reason: collision with root package name */
        public final Measurable f3930a;

        /* renamed from: b  reason: collision with root package name */
        public final Placeable f3931b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3932c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3933d;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(measurable, placeable, j2, z2);
        }

        public final Measurable a() {
            return this.f3930a;
        }

        public final long b() {
            return this.f3932c;
        }

        public final boolean c() {
            return this.f3933d;
        }

        public final Placeable d() {
            return this.f3931b;
        }

        public final void e(boolean z2) {
            this.f3933d = z2;
        }

        public WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2) {
            this.f3930a = measurable;
            this.f3931b = placeable;
            this.f3932c = j2;
            this.f3933d = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(measurable, placeable, j2, (i2 & 8) != 0 ? true : z2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class WrapInfo {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3934a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3935b;

        public WrapInfo(boolean z2, boolean z3) {
            this.f3934a = z2;
            this.f3935b = z3;
        }

        public final boolean a() {
            return this.f3935b;
        }

        public final boolean b() {
            return this.f3934a;
        }
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, flowLayoutOverflowState, j2, i3, i4, i5);
    }

    public final WrapEllipsisInfo a(WrapInfo wrapInfo, boolean z2, int i2, int i3, int i4, int i5) {
        WrapEllipsisInfo e2;
        if (!wrapInfo.a() || (e2 = this.f3925b.e(z2, i2, i3)) == null) {
            return null;
        }
        e2.e(i2 >= 0 && (i5 == 0 || (i4 - IntIntPair.e(e2.b()) >= 0 && i5 < this.f3924a)));
        return e2;
    }

    public final WrapInfo b(boolean z2, int i2, long j2, IntIntPair intIntPair, int i3, int i4, int i5, boolean z3, boolean z4) {
        IntIntPair f2;
        int i6 = i2;
        int i7 = i3;
        int i8 = i5;
        int i9 = i4 + i8;
        if (intIntPair == null) {
            return new WrapInfo(true, true);
        }
        if (this.f3925b.l() != FlowLayoutOverflow.OverflowType.Visible && (i7 >= this.f3927d || IntIntPair.f(j2) - IntIntPair.f(intIntPair.i()) < 0)) {
            return new WrapInfo(true, true);
        }
        if (i6 == 0 || (i6 < this.f3924a && IntIntPair.e(j2) - IntIntPair.e(intIntPair.i()) >= 0)) {
            int max = i4 + Math.max(i8, IntIntPair.f(intIntPair.i()));
            if (z4) {
                f2 = null;
            } else {
                boolean z5 = z2;
                f2 = this.f3925b.f(z2, i7, max);
            }
            IntIntPair intIntPair2 = f2;
            if (intIntPair2 != null) {
                intIntPair2.i();
                if (i6 + 1 >= this.f3924a || ((IntIntPair.e(j2) - IntIntPair.e(intIntPair.i())) - this.f3928e) - IntIntPair.e(intIntPair2.i()) < 0) {
                    if (z4) {
                        return new WrapInfo(true, true);
                    }
                    WrapInfo b2 = b(false, 0, IntIntPair.b(Constraints.l(this.f3926c), (IntIntPair.f(j2) - this.f3929f) - Math.max(i8, IntIntPair.f(intIntPair.i()))), intIntPair2, i7 + 1, max, 0, true, true);
                    return new WrapInfo(b2.a(), b2.a());
                }
            }
            return new WrapInfo(false, false);
        } else if (z3) {
            return new WrapInfo(true, true);
        } else {
            int i10 = i7 + 1;
            return new WrapInfo(true, b(z2, 0, IntIntPair.b(Constraints.l(this.f3926c), (IntIntPair.f(j2) - this.f3929f) - i8), IntIntPair.a(IntIntPair.b(IntIntPair.e(intIntPair.i()) - this.f3928e, IntIntPair.f(intIntPair.i()))), i10, i9, 0, true, false).a());
        }
    }

    public FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i4, int i5) {
        this.f3924a = i2;
        this.f3925b = flowLayoutOverflowState;
        this.f3926c = j2;
        this.f3927d = i3;
        this.f3928e = i4;
        this.f3929f = i5;
    }
}
