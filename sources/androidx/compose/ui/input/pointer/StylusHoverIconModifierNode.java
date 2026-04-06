package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.Metadata;

@Metadata
public final class StylusHoverIconModifierNode extends HoverIconModifierNode {
    public final String R = "androidx.compose.ui.input.pointer.StylusHoverIcon";

    public StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z2, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        super(pointerIcon, z2, dpTouchBoundsExpansion);
    }

    public void b3(PointerIcon pointerIcon) {
        PointerIconService i3 = i3();
        if (i3 != null) {
            i3.b(pointerIcon);
        }
    }

    public boolean j3(int i2) {
        PointerType.Companion companion = PointerType.f16933b;
        return PointerType.h(i2, companion.c()) || PointerType.h(i2, companion.a());
    }

    /* renamed from: p3 */
    public String i0() {
        return this.R;
    }
}
