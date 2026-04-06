package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class IntrinsicWidthElement extends ModifierNodeElement<IntrinsicWidthNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f4071A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f4072B;

    /* renamed from: z  reason: collision with root package name */
    public final IntrinsicSize f4073z;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize, boolean z2, Function1 function1) {
        this.f4073z = intrinsicSize;
        this.f4071A = z2;
        this.f4072B = function1;
    }

    /* renamed from: c */
    public IntrinsicWidthNode a() {
        return new IntrinsicWidthNode(this.f4073z, this.f4071A);
    }

    /* renamed from: d */
    public void b(IntrinsicWidthNode intrinsicWidthNode) {
        intrinsicWidthNode.c3(this.f4073z);
        intrinsicWidthNode.b3(this.f4071A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.f4073z == intrinsicWidthElement.f4073z && this.f4071A == intrinsicWidthElement.f4071A;
    }

    public int hashCode() {
        return (this.f4073z.hashCode() * 31) + Boolean.hashCode(this.f4071A);
    }
}
