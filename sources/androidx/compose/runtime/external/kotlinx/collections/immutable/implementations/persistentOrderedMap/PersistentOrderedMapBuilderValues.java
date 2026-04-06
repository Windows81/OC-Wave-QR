package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata
public final class PersistentOrderedMapBuilderValues<K, V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilder f15099z;

    public PersistentOrderedMapBuilderValues(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f15099z = persistentOrderedMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f15099z.clear();
    }

    public boolean contains(Object obj) {
        return this.f15099z.containsValue(obj);
    }

    public int e() {
        return this.f15099z.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.f15099z);
    }
}
