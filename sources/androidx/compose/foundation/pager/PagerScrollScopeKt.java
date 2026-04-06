package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;

@Metadata
public final class PagerScrollScopeKt {
    public static final LazyLayoutScrollScope a(PagerState pagerState, ScrollScope scrollScope) {
        return new PagerScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, pagerState);
    }
}
