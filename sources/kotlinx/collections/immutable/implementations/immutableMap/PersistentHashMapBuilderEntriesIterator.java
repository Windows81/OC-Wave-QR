package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class PersistentHashMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMapBuilderBaseIterator f41277z;

    public PersistentHashMapBuilderEntriesIterator(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.i(persistentHashMapBuilder, "builder");
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i2 = 0; i2 < 8; i2++) {
            trieNodeBaseIteratorArr[i2] = new TrieNodeMutableEntriesIterator(this);
        }
        this.f41277z = new PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }

    /* renamed from: b */
    public Map.Entry next() {
        return (Map.Entry) this.f41277z.next();
    }

    public final void c(Object obj, Object obj2) {
        this.f41277z.m(obj, obj2);
    }

    public boolean hasNext() {
        return this.f41277z.hasNext();
    }

    public void remove() {
        this.f41277z.remove();
    }
}
