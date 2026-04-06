package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import kotlin.Metadata;

@Metadata
public interface LazyStaggeredGridItemProvider extends LazyLayoutItemProvider {
    LazyLayoutKeyIndexMap a();

    LazyStaggeredGridSpanProvider g();
}
