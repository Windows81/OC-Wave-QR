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
public final class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Arrangement.Vertical f3810a;

    /* renamed from: b  reason: collision with root package name */
    public final Alignment.Horizontal f3811b;

    public ColumnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        this.f3810a = vertical;
        this.f3811b = horizontal;
    }

    public void a(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.f3810a.b(measureScope, i2, iArr, iArr2);
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        MeasureScope measureScope2 = measureScope;
        return RowColumnMeasurePolicyKt.b(this, Constraints.m(j2), Constraints.n(j2), Constraints.k(j2), Constraints.l(j2), measureScope2.P1(this.f3810a.a()), measureScope2, list, new Placeable[list.size()], 0, list.size(), (int[]) null, 0, 3072, (Object) null);
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.f(list, i2, intrinsicMeasureScope.P1(this.f3810a.a()));
    }

    public MeasureResult d(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        return MeasureScope.R1(measureScope, i4, i3, (Map) null, new ColumnMeasurePolicy$placeHelper$1$1(placeableArr, this, i4, i2, measureScope, iArr), 4, (Object) null);
    }

    public long e(int i2, int i3, int i4, int i5, boolean z2) {
        return ColumnKt.b(z2, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj;
        return Intrinsics.d(this.f3810a, columnMeasurePolicy.f3810a) && Intrinsics.d(this.f3811b, columnMeasurePolicy.f3811b);
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.g(list, i2, intrinsicMeasureScope.P1(this.f3810a.a()));
    }

    public int g(Placeable placeable) {
        return placeable.C0();
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.h(list, i2, intrinsicMeasureScope.P1(this.f3810a.a()));
    }

    public int hashCode() {
        return (this.f3810a.hashCode() * 31) + this.f3811b.hashCode();
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return IntrinsicMeasureBlocks.f4066a.e(list, i2, intrinsicMeasureScope.P1(this.f3810a.a()));
    }

    public int j(Placeable placeable) {
        return placeable.L0();
    }

    public final int r(Placeable placeable, RowColumnParentData rowColumnParentData, int i2, int i3, LayoutDirection layoutDirection) {
        CrossAxisAlignment a2 = rowColumnParentData != null ? rowColumnParentData.a() : null;
        return a2 != null ? a2.a(i2 - placeable.L0(), layoutDirection, placeable, i3) : this.f3811b.a(0, i2 - placeable.L0(), layoutDirection);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f3810a + ", horizontalAlignment=" + this.f3811b + ')';
    }
}
