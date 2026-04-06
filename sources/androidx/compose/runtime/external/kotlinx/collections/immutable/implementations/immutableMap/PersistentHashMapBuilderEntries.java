package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentHashMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMapBuilder f15049z;

    public PersistentHashMapBuilderEntries(PersistentHashMapBuilder persistentHashMapBuilder) {
        this.f15049z = persistentHashMapBuilder;
    }

    public void clear() {
        this.f15049z.clear();
    }

    public int e() {
        return this.f15049z.size();
    }

    public boolean h(Map.Entry entry) {
        Object obj = this.f15049z.get(entry.getKey());
        return obj != null ? Intrinsics.d(obj, entry.getValue()) : entry.getValue() == null && this.f15049z.containsKey(entry.getKey());
    }

    public Iterator iterator() {
        return new PersistentHashMapBuilderEntriesIterator(this.f15049z);
    }

    public boolean m(Map.Entry entry) {
        return this.f15049z.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: n */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}
