package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f16861A;

    /* renamed from: z  reason: collision with root package name */
    public final PointerIcon f16862z;

    public PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z2) {
        this.f16862z = pointerIcon;
        this.f16861A = z2;
    }

    /* renamed from: c */
    public PointerHoverIconModifierNode a() {
        return new PointerHoverIconModifierNode(this.f16862z, this.f16861A);
    }

    /* renamed from: d */
    public void b(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.n3(this.f16862z);
        pointerHoverIconModifierNode.o3(this.f16861A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return Intrinsics.d(this.f16862z, pointerHoverIconModifierElement.f16862z) && this.f16861A == pointerHoverIconModifierElement.f16861A;
    }

    public int hashCode() {
        return (this.f16862z.hashCode() * 31) + Boolean.hashCode(this.f16861A);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f16862z + ", overrideDescendants=" + this.f16861A + ')';
    }
}
