package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Shapes {

    /* renamed from: a  reason: collision with root package name */
    public final CornerBasedShape f8328a;

    /* renamed from: b  reason: collision with root package name */
    public final CornerBasedShape f8329b;

    /* renamed from: c  reason: collision with root package name */
    public final CornerBasedShape f8330c;

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3) {
        this.f8328a = cornerBasedShape;
        this.f8329b = cornerBasedShape2;
        this.f8330c = cornerBasedShape3;
    }

    public final CornerBasedShape a() {
        return this.f8330c;
    }

    public final CornerBasedShape b() {
        return this.f8329b;
    }

    public final CornerBasedShape c() {
        return this.f8328a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return Intrinsics.d(this.f8328a, shapes.f8328a) && Intrinsics.d(this.f8329b, shapes.f8329b) && Intrinsics.d(this.f8330c, shapes.f8330c);
    }

    public int hashCode() {
        return (((this.f8328a.hashCode() * 31) + this.f8329b.hashCode()) * 31) + this.f8330c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f8328a + ", medium=" + this.f8329b + ", large=" + this.f8330c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? RoundedCornerShapeKt.d(Dp.m((float) 4)) : cornerBasedShape, (i2 & 2) != 0 ? RoundedCornerShapeKt.d(Dp.m((float) 4)) : cornerBasedShape2, (i2 & 4) != 0 ? RoundedCornerShapeKt.d(Dp.m((float) 0)) : cornerBasedShape3);
    }
}
