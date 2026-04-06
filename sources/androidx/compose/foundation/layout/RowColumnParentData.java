package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RowColumnParentData {

    /* renamed from: a  reason: collision with root package name */
    public float f4140a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4141b;

    /* renamed from: c  reason: collision with root package name */
    public CrossAxisAlignment f4142c;

    /* renamed from: d  reason: collision with root package name */
    public FlowLayoutData f4143d;

    public RowColumnParentData(float f2, boolean z2, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        this.f4140a = f2;
        this.f4141b = z2;
        this.f4142c = crossAxisAlignment;
        this.f4143d = flowLayoutData;
    }

    public final CrossAxisAlignment a() {
        return this.f4142c;
    }

    public final boolean b() {
        return this.f4141b;
    }

    public final FlowLayoutData c() {
        return this.f4143d;
    }

    public final float d() {
        return this.f4140a;
    }

    public final void e(CrossAxisAlignment crossAxisAlignment) {
        this.f4142c = crossAxisAlignment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.f4140a, rowColumnParentData.f4140a) == 0 && this.f4141b == rowColumnParentData.f4141b && Intrinsics.d(this.f4142c, rowColumnParentData.f4142c) && Intrinsics.d(this.f4143d, rowColumnParentData.f4143d);
    }

    public final void f(boolean z2) {
        this.f4141b = z2;
    }

    public final void g(FlowLayoutData flowLayoutData) {
        this.f4143d = flowLayoutData;
    }

    public final void h(float f2) {
        this.f4140a = f2;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.f4140a) * 31) + Boolean.hashCode(this.f4141b)) * 31;
        CrossAxisAlignment crossAxisAlignment = this.f4142c;
        int i2 = 0;
        int hashCode2 = (hashCode + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.f4143d;
        if (flowLayoutData != null) {
            i2 = flowLayoutData.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f4140a + ", fill=" + this.f4141b + ", crossAxisAlignment=" + this.f4142c + ", flowLayoutData=" + this.f4143d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RowColumnParentData(float f2, boolean z2, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? null : crossAxisAlignment, (i2 & 8) != 0 ? null : flowLayoutData);
    }
}
