package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import kotlin.Metadata;

@Metadata
public interface LazyListPrefetchStrategy {
    void a(NestedPrefetchScope nestedPrefetchScope, int i2);

    PrefetchScheduler b() {
        return null;
    }

    void c(LazyListPrefetchScope lazyListPrefetchScope, float f2, LazyListLayoutInfo lazyListLayoutInfo);

    void d(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo);
}
