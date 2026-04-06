package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentOrderedMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilder f15092z;

    public PersistentOrderedMapBuilderEntries(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f15092z = persistentOrderedMapBuilder;
    }

    public void clear() {
        this.f15092z.clear();
    }

    public int e() {
        return this.f15092z.size();
    }

    public boolean h(Map.Entry entry) {
        Object obj = this.f15092z.get(entry.getKey());
        return obj != null ? Intrinsics.d(obj, entry.getValue()) : entry.getValue() == null && this.f15092z.containsKey(entry.getKey());
    }

    public Iterator iterator() {
        return new PersistentOrderedMapBuilderEntriesIterator(this.f15092z);
    }

    public boolean m(Map.Entry entry) {
        return this.f15092z.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: n */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}
