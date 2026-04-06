package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;

@Metadata
public final class PersistentOrderedMapValues<K, V> extends AbstractCollection<V> implements ImmutableCollection<V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMap f15108z;

    public PersistentOrderedMapValues(PersistentOrderedMap persistentOrderedMap) {
        this.f15108z = persistentOrderedMap;
    }

    public boolean contains(Object obj) {
        return this.f15108z.containsValue(obj);
    }

    public int g() {
        return this.f15108z.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedMapValuesIterator(this.f15108z);
    }
}
