package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;

@Metadata
public final class LazyListScrollScopeKt {
    public static final LazyLayoutScrollScope a(LazyListState lazyListState, ScrollScope scrollScope) {
        return new LazyListScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, lazyListState);
    }
}
