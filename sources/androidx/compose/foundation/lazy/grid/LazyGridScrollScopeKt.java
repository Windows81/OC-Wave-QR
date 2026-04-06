package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;

@Metadata
public final class LazyGridScrollScopeKt {
    public static final LazyLayoutScrollScope a(LazyGridState lazyGridState, ScrollScope scrollScope) {
        return new LazyGridScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, lazyGridState);
    }
}
