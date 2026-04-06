package androidx.compose.ui.state;

import kotlin.Metadata;

@Metadata
public final class ToggleableStateKt {
    public static final ToggleableState a(boolean z2) {
        return z2 ? ToggleableState.On : ToggleableState.Off;
    }
}
