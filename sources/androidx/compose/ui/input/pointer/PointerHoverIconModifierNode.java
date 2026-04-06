package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PointerHoverIconModifierNode extends HoverIconModifierNode {
    public final String R = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z2) {
        super(pointerIcon, z2, (DpTouchBoundsExpansion) null, 4, (DefaultConstructorMarker) null);
    }

    public void b3(PointerIcon pointerIcon) {
        PointerIconService i3 = i3();
        if (i3 != null) {
            i3.c(pointerIcon);
        }
    }

    public boolean j3(int i2) {
        PointerType.Companion companion = PointerType.f16933b;
        return !PointerType.h(i2, companion.c()) && !PointerType.h(i2, companion.a());
    }

    /* renamed from: p3 */
    public String i0() {
        return this.R;
    }
}
