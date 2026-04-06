package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableCollection;

@Metadata
public final class PersistentOrderedMapValues<K, V> extends AbstractCollection<V> implements ImmutableCollection<V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMap f41339z;

    public PersistentOrderedMapValues(PersistentOrderedMap persistentOrderedMap) {
        Intrinsics.i(persistentOrderedMap, "map");
        this.f41339z = persistentOrderedMap;
    }

    public boolean contains(Object obj) {
        return this.f41339z.containsValue(obj);
    }

    public int g() {
        return this.f41339z.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedMapValuesIterator(this.f41339z);
    }
}
