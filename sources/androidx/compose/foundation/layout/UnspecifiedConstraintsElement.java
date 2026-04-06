package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {

    /* renamed from: A  reason: collision with root package name */
    public final float f4200A;

    /* renamed from: z  reason: collision with root package name */
    public final float f4201z;

    public /* synthetic */ UnspecifiedConstraintsElement(float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3);
    }

    /* renamed from: c */
    public UnspecifiedConstraintsNode a() {
        return new UnspecifiedConstraintsNode(this.f4201z, this.f4200A, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.a3(this.f4201z);
        unspecifiedConstraintsNode.Z2(this.f4200A);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Dp.o(this.f4201z, unspecifiedConstraintsElement.f4201z) && Dp.o(this.f4200A, unspecifiedConstraintsElement.f4200A);
    }

    public int hashCode() {
        return (Dp.p(this.f4201z) * 31) + Dp.p(this.f4200A);
    }

    public UnspecifiedConstraintsElement(float f2, float f3) {
        this.f4201z = f2;
        this.f4200A = f3;
    }
}
