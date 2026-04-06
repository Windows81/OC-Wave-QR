package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.implementations.immutableMap.MapEntry;

@Metadata
public final class PersistentOrderedMapEntriesIterator<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f41333z;

    public PersistentOrderedMapEntriesIterator(PersistentOrderedMap persistentOrderedMap) {
        Intrinsics.i(persistentOrderedMap, "map");
        this.f41333z = new PersistentOrderedMapLinksIterator(persistentOrderedMap.o(), persistentOrderedMap.p());
    }

    /* renamed from: b */
    public Map.Entry next() {
        return new MapEntry(this.f41333z.b(), this.f41333z.next().e());
    }

    public boolean hasNext() {
        return this.f41333z.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
