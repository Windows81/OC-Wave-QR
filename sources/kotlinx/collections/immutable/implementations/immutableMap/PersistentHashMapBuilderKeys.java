package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class PersistentHashMapBuilderKeys<K, V> extends AbstractMutableSet<K> implements Set<K>, KMutableSet {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMapBuilder f41278z;

    public PersistentHashMapBuilderKeys(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.i(persistentHashMapBuilder, "builder");
        this.f41278z = persistentHashMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f41278z.clear();
    }

    public boolean contains(Object obj) {
        return this.f41278z.containsKey(obj);
    }

    public int e() {
        return this.f41278z.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapBuilderKeysIterator(this.f41278z);
    }

    public boolean remove(Object obj) {
        if (!this.f41278z.containsKey(obj)) {
            return false;
        }
        this.f41278z.remove(obj);
        return true;
    }
}
