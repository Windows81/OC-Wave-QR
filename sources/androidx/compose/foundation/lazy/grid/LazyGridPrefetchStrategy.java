package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import kotlin.Metadata;

@Metadata
public interface LazyGridPrefetchStrategy {
    void a(NestedPrefetchScope nestedPrefetchScope, int i2);

    PrefetchScheduler b() {
        return null;
    }

    void c(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo);

    void d(LazyGridPrefetchScope lazyGridPrefetchScope, float f2, LazyGridLayoutInfo lazyGridLayoutInfo);
}
