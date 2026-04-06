package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata
public final class PersistentHashMapBuilderValues<K, V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMapBuilder f15052z;

    public PersistentHashMapBuilderValues(PersistentHashMapBuilder persistentHashMapBuilder) {
        this.f15052z = persistentHashMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f15052z.clear();
    }

    public boolean contains(Object obj) {
        return this.f15052z.containsValue(obj);
    }

    public int e() {
        return this.f15052z.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapBuilderValuesIterator(this.f15052z);
    }
}
