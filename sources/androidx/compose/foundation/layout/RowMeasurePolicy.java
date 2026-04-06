package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Arrangement.Horizontal f4145a;

    /* renamed from: b  reason: collision with root package name */
    public final Alignment.Vertical f4146b;

    public RowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical) {
        this.f4145a = horizontal;
        this.f4146b = vertical;
    }

    public void a(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.f4145a.c(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        return RowColumnMeasurePolicyKt.b(this, Constraints.n(j2), Constraints.m(j2), Constraints.l(j2), Constraints.k(j2), measureScope2.P1(this.f4145a.a()), measureScope2, list, new Placeable[list.size()], 0, list.size(), (int[]) null, 0, 3072, (Object) null);
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.b(list, i2, intrinsicMeasureScope.P1(this.f4145a.a()));
    }

    public MeasureResult d(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        return MeasureScope.R1(measureScope, i3, i4, (Map) null, new RowMeasurePolicy$placeHelper$1$1(placeableArr, this, i4, i2, iArr), 4, (Object) null);
    }

    public long e(int i2, int i3, int i4, int i5, boolean z2) {
        return RowKt.a(z2, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return Intrinsics.d(this.f4145a, rowMeasurePolicy.f4145a) && Intrinsics.d(this.f4146b, rowMeasurePolicy.f4146b);
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.c(list, i2, intrinsicMeasureScope.P1(this.f4145a.a()));
    }

    public int g(Placeable placeable) {
        return placeable.L0();
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.d(list, i2, intrinsicMeasureScope.P1(this.f4145a.a()));
    }

    public int hashCode() {
        return (this.f4145a.hashCode() * 31) + this.f4146b.hashCode();
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.a(list, i2, intrinsicMeasureScope.P1(this.f4145a.a()));
    }

    public int j(Placeable placeable) {
        return placeable.C0();
    }

    public final int r(Placeable placeable, RowColumnParentData rowColumnParentData, int i2, int i3) {
        CrossAxisAlignment a2 = rowColumnParentData != null ? rowColumnParentData.a() : null;
        return a2 != null ? a2.a(i2 - placeable.C0(), LayoutDirection.Ltr, placeable, i3) : this.f4146b.a(0, i2 - placeable.C0());
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f4145a + ", verticalAlignment=" + this.f4146b + ')';
    }
}
