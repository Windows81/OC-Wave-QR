package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class HoverableKt {
    public static final Modifier a(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z2) {
        return modifier.o0(z2 ? new HoverableElement(mutableInteractionSource) : Modifier.f15489d);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return a(modifier, mutableInteractionSource, z2);
    }
}
