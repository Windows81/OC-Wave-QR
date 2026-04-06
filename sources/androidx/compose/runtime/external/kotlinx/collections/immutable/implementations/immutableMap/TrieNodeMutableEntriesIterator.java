package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class TrieNodeMutableEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<K, V>> {
    public final PersistentHashMapBuilderEntriesIterator C;

    public TrieNodeMutableEntriesIterator(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator) {
        this.C = persistentHashMapBuilderEntriesIterator;
    }

    /* renamed from: o */
    public Map.Entry next() {
        CommonFunctionsKt.a(g());
        n(f() + 2);
        return new MutableMapEntry(this.C, e()[f() - 2], e()[f() - 1]);
    }
}
