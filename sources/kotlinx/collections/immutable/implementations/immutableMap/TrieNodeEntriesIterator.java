package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;

@Metadata
public final class TrieNodeEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    /* renamed from: o */
    public Map.Entry next() {
        CommonFunctionsKt.a(g());
        n(f() + 2);
        return new MapEntry(e()[f() - 2], e()[f() - 1]);
    }
}
