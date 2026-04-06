package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata
public final class PersistentHashMapBuilderValues<K, V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMapBuilder f41279z;

    public PersistentHashMapBuilderValues(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.i(persistentHashMapBuilder, "builder");
        this.f41279z = persistentHashMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f41279z.clear();
    }

    public boolean contains(Object obj) {
        return this.f41279z.containsValue(obj);
    }

    public int e() {
        return this.f41279z.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapBuilderValuesIterator(this.f41279z);
    }
}
