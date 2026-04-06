package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Brush f2986A;

    /* renamed from: B  reason: collision with root package name */
    public final Shape f2987B;

    /* renamed from: z  reason: collision with root package name */
    public final float f2988z;

    public /* synthetic */ BorderModifierNodeElement(float f2, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, brush, shape);
    }

    /* renamed from: c */
    public BorderModifierNode a() {
        return new BorderModifierNode(this.f2988z, this.f2986A, this.f2987B, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(BorderModifierNode borderModifierNode) {
        borderModifierNode.n3(this.f2988z);
        borderModifierNode.m3(this.f2986A);
        borderModifierNode.s1(this.f2987B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.o(this.f2988z, borderModifierNodeElement.f2988z) && Intrinsics.d(this.f2986A, borderModifierNodeElement.f2986A) && Intrinsics.d(this.f2987B, borderModifierNodeElement.f2987B);
    }

    public int hashCode() {
        return (((Dp.p(this.f2988z) * 31) + this.f2986A.hashCode()) * 31) + this.f2987B.hashCode();
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + Dp.r(this.f2988z) + ", brush=" + this.f2986A + ", shape=" + this.f2987B + ')';
    }

    public BorderModifierNodeElement(float f2, Brush brush, Shape shape) {
        this.f2988z = f2;
        this.f2986A = brush;
        this.f2987B = shape;
    }
}
