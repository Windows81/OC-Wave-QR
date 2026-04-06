package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class PersistentHashMapBuilderKeys<K, V> extends AbstractMutableSet<K> implements Set<K>, KMutableSet {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMapBuilder f15051z;

    public PersistentHashMapBuilderKeys(PersistentHashMapBuilder persistentHashMapBuilder) {
        this.f15051z = persistentHashMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f15051z.clear();
    }

    public boolean contains(Object obj) {
        return this.f15051z.containsKey(obj);
    }

    public int e() {
        return this.f15051z.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapBuilderKeysIterator(this.f15051z);
    }

    public boolean remove(Object obj) {
        if (!this.f15051z.containsKey(obj)) {
            return false;
        }
        this.f15051z.remove(obj);
        return true;
    }
}
