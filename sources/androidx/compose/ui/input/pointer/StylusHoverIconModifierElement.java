package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StylusHoverIconModifierElement extends ModifierNodeElement<StylusHoverIconModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f16942A;

    /* renamed from: B  reason: collision with root package name */
    public final DpTouchBoundsExpansion f16943B;

    /* renamed from: z  reason: collision with root package name */
    public final PointerIcon f16944z;

    public StylusHoverIconModifierElement(PointerIcon pointerIcon, boolean z2, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.f16944z = pointerIcon;
        this.f16942A = z2;
        this.f16943B = dpTouchBoundsExpansion;
    }

    /* renamed from: c */
    public StylusHoverIconModifierNode a() {
        return new StylusHoverIconModifierNode(this.f16944z, this.f16942A, this.f16943B);
    }

    /* renamed from: d */
    public void b(StylusHoverIconModifierNode stylusHoverIconModifierNode) {
        stylusHoverIconModifierNode.n3(this.f16944z);
        stylusHoverIconModifierNode.o3(this.f16942A);
        stylusHoverIconModifierNode.m3(this.f16943B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return Intrinsics.d(this.f16944z, stylusHoverIconModifierElement.f16944z) && this.f16942A == stylusHoverIconModifierElement.f16942A && Intrinsics.d(this.f16943B, stylusHoverIconModifierElement.f16943B);
    }

    public int hashCode() {
        int hashCode = ((this.f16944z.hashCode() * 31) + Boolean.hashCode(this.f16942A)) * 31;
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.f16943B;
        return hashCode + (dpTouchBoundsExpansion == null ? 0 : dpTouchBoundsExpansion.hashCode());
    }

    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.f16944z + ", overrideDescendants=" + this.f16942A + ", touchBoundsExpansion=" + this.f16943B + ')';
    }
}
