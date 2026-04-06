package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class FocusableKt {
    public static final Modifier a(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource) {
        return modifier.o0(z2 ? new FocusableElement(mutableInteractionSource) : Modifier.f15489d);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return a(modifier, z2, mutableInteractionSource);
    }
}
