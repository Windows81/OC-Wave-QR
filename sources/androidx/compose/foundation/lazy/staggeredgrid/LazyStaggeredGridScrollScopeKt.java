package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;

@Metadata
public final class LazyStaggeredGridScrollScopeKt {
    public static final LazyLayoutScrollScope a(LazyStaggeredGridState lazyStaggeredGridState, ScrollScope scrollScope) {
        return new LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, lazyStaggeredGridState);
    }
}
