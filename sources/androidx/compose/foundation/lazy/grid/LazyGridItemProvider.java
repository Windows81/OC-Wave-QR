package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import kotlin.Metadata;

@Metadata
public interface LazyGridItemProvider extends LazyLayoutItemProvider {
    LazyLayoutKeyIndexMap a();

    IntList d();

    LazyGridSpanLayoutProvider j();
}
