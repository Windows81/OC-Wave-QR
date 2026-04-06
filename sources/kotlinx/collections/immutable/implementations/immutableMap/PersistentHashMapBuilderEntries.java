package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.internal.MapImplementation;

@Metadata
public final class PersistentHashMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMapBuilder f41276z;

    public PersistentHashMapBuilderEntries(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.i(persistentHashMapBuilder, "builder");
        this.f41276z = persistentHashMapBuilder;
    }

    public void clear() {
        this.f41276z.clear();
    }

    public int e() {
        return this.f41276z.size();
    }

    public boolean h(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return MapImplementation.f41358a.a(this.f41276z, entry);
    }

    public Iterator iterator() {
        return new PersistentHashMapBuilderEntriesIterator(this.f41276z);
    }

    public boolean m(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return this.f41276z.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: n */
    public boolean add(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        throw new UnsupportedOperationException();
    }
}
