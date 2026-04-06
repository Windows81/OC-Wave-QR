package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class PersistentOrderedMapBuilderKeys<K, V> extends AbstractMutableSet<K> implements Set<K>, KMutableSet {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilder f41325z;

    public PersistentOrderedMapBuilderKeys(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        Intrinsics.i(persistentOrderedMapBuilder, "builder");
        this.f41325z = persistentOrderedMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f41325z.clear();
    }

    public boolean contains(Object obj) {
        return this.f41325z.containsKey(obj);
    }

    public int e() {
        return this.f41325z.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedMapBuilderKeysIterator(this.f41325z);
    }

    public boolean remove(Object obj) {
        if (!this.f41325z.containsKey(obj)) {
            return false;
        }
        this.f41325z.remove(obj);
        return true;
    }
}
