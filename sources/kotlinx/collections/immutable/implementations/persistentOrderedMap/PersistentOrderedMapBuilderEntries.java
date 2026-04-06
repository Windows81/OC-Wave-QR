package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries;
import kotlinx.collections.immutable.internal.MapImplementation;

@Metadata
public final class PersistentOrderedMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilder f41323z;

    public PersistentOrderedMapBuilderEntries(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        Intrinsics.i(persistentOrderedMapBuilder, "builder");
        this.f41323z = persistentOrderedMapBuilder;
    }

    public void clear() {
        this.f41323z.clear();
    }

    public int e() {
        return this.f41323z.size();
    }

    public boolean h(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return MapImplementation.f41358a.a(this.f41323z, entry);
    }

    public Iterator iterator() {
        return new PersistentOrderedMapBuilderEntriesIterator(this.f41323z);
    }

    public boolean m(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return this.f41323z.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: n */
    public boolean add(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        throw new UnsupportedOperationException();
    }
}
