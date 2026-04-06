package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import kotlin.Metadata;

@Metadata
public interface LazyListItemProvider extends LazyLayoutItemProvider {
    LazyLayoutKeyIndexMap a();

    IntList d();

    LazyItemScopeImpl h();
}
