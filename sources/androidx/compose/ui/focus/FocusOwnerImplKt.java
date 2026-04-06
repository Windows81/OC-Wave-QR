package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;
import kotlin.Metadata;

@Metadata
public final class FocusOwnerImplKt {
    public static final boolean a(int i2) {
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.e())) {
            return true;
        }
        return FocusDirection.l(i2, companion.f());
    }
}
