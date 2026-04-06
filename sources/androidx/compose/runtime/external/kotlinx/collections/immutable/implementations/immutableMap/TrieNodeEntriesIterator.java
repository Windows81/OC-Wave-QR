package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class TrieNodeEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    /* renamed from: o */
    public Map.Entry next() {
        CommonFunctionsKt.a(g());
        n(f() + 2);
        return new MapEntry(e()[f() - 2], e()[f() - 1]);
    }
}
