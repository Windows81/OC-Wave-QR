package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f4077A;

    /* renamed from: z  reason: collision with root package name */
    public final float f4078z;

    public LayoutWeightElement(float f2, boolean z2) {
        this.f4078z = f2;
        this.f4077A = z2;
    }

    /* renamed from: c */
    public LayoutWeightNode a() {
        return new LayoutWeightNode(this.f4078z, this.f4077A);
    }

    /* renamed from: d */
    public void b(LayoutWeightNode layoutWeightNode) {
        layoutWeightNode.b3(this.f4078z);
        layoutWeightNode.a3(this.f4077A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f4078z == layoutWeightElement.f4078z && this.f4077A == layoutWeightElement.f4077A;
    }

    public int hashCode() {
        return (Float.hashCode(this.f4078z) * 31) + Boolean.hashCode(this.f4077A);
    }
}
