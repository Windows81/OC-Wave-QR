package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;

@Metadata
public interface CheckboxColors {
    State a(ToggleableState toggleableState, Composer composer, int i2);

    State b(boolean z2, ToggleableState toggleableState, Composer composer, int i2);

    State c(boolean z2, ToggleableState toggleableState, Composer composer, int i2);
}
