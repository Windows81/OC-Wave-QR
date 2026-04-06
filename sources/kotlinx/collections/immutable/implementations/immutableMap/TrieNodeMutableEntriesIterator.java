package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;

@Metadata
public final class TrieNodeMutableEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<K, V>> {
    public final PersistentHashMapBuilderEntriesIterator C;

    public TrieNodeMutableEntriesIterator(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator) {
        Intrinsics.i(persistentHashMapBuilderEntriesIterator, "parentIterator");
        this.C = persistentHashMapBuilderEntriesIterator;
    }

    /* renamed from: o */
    public Map.Entry next() {
        CommonFunctionsKt.a(g());
        n(f() + 2);
        return new MutableMapEntry(this.C, e()[f() - 2], e()[f() - 1]);
    }
}
