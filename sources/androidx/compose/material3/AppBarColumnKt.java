package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.Metadata;

@Metadata
public final class AppBarColumnKt {
    public static final AppBarColumnScopeImpl a(State state) {
        return (AppBarColumnScopeImpl) state.getValue();
    }
}
