package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
final class BoxMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Alignment f3788a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3789b;

    public BoxMeasurePolicy(Alignment alignment, boolean z2) {
        this.f3788a = alignment;
        this.f3789b = z2;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int n2;
        int m2;
        Placeable c0;
        List list2 = list;
        if (list.isEmpty()) {
            return MeasureScope.R1(measureScope, Constraints.n(j2), Constraints.m(j2), (Map) null, BoxMeasurePolicy$measure$1.f3790z, 4, (Object) null);
        }
        long b2 = this.f3789b ? j2 : Constraints.b(j2 & -8589934589L);
        if (list.size() == 1) {
            Measurable measurable = (Measurable) list2.get(0);
            if (!BoxKt.f(measurable)) {
                c0 = measurable.c0(b2);
                n2 = Math.max(Constraints.n(j2), c0.L0());
                m2 = Math.max(Constraints.m(j2), c0.C0());
            } else {
                n2 = Constraints.n(j2);
                m2 = Constraints.m(j2);
                c0 = measurable.c0(Constraints.f19137b.c(Constraints.n(j2), Constraints.m(j2)));
            }
            int i2 = n2;
            int i3 = m2;
            return MeasureScope.R1(measureScope, i2, i3, (Map) null, new BoxMeasurePolicy$measure$2(c0, measurable, measureScope, i2, i3, this), 4, (Object) null);
        }
        Placeable[] placeableArr = new Placeable[list.size()];
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = Constraints.n(j2);
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.f40906z = Constraints.m(j2);
        Collection collection = list2;
        int size = collection.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            Measurable measurable2 = (Measurable) list2.get(i4);
            if (!BoxKt.f(measurable2)) {
                Placeable c02 = measurable2.c0(b2);
                placeableArr[i4] = c02;
                intRef.f40906z = Math.max(intRef.f40906z, c02.L0());
                intRef2.f40906z = Math.max(intRef2.f40906z, c02.C0());
            } else {
                z2 = true;
            }
        }
        if (z2) {
            int i5 = intRef.f40906z;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = intRef2.f40906z;
            long a2 = ConstraintsKt.a(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = collection.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Measurable measurable3 = (Measurable) list2.get(i8);
                if (BoxKt.f(measurable3)) {
                    placeableArr[i8] = measurable3.c0(a2);
                }
            }
        }
        return MeasureScope.R1(measureScope, intRef.f40906z, intRef2.f40906z, (Map) null, new BoxMeasurePolicy$measure$5(placeableArr, list, measureScope, intRef, intRef2, this), 4, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return Intrinsics.d(this.f3788a, boxMeasurePolicy.f3788a) && this.f3789b == boxMeasurePolicy.f3789b;
    }

    public int hashCode() {
        return (this.f3788a.hashCode() * 31) + Boolean.hashCode(this.f3789b);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f3788a + ", propagateMinConstraints=" + this.f3789b + ')';
    }
}
