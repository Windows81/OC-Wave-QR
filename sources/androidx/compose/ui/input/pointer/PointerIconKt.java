package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.Metadata;

@Metadata
public final class PointerIconKt {
    public static final Modifier a(Modifier modifier, PointerIcon pointerIcon, boolean z2) {
        return modifier.o0(new PointerHoverIconModifierElement(pointerIcon, z2));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, PointerIcon pointerIcon, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return a(modifier, pointerIcon, z2);
    }

    public static final Modifier c(Modifier modifier, PointerIcon pointerIcon, boolean z2, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.o0(new StylusHoverIconModifierElement(pointerIcon, z2, dpTouchBoundsExpansion));
    }
}
