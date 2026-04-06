package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class PersistentOrderedMapBuilderKeys<K, V> extends AbstractMutableSet<K> implements Set<K>, KMutableSet {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilder f15094z;

    public PersistentOrderedMapBuilderKeys(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f15094z = persistentOrderedMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f15094z.clear();
    }

    public boolean contains(Object obj) {
        return this.f15094z.containsKey(obj);
    }

    public int e() {
        return this.f15094z.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedMapBuilderKeysIterator(this.f15094z);
    }

    public boolean remove(Object obj) {
        if (!this.f15094z.containsKey(obj)) {
            return false;
        }
        this.f15094z.remove(obj);
        return true;
    }
}
