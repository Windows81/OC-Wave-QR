package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class PersistentOrderedMapValuesIterator<K, V> implements Iterator<V>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f41340z;

    public PersistentOrderedMapValuesIterator(PersistentOrderedMap persistentOrderedMap) {
        Intrinsics.i(persistentOrderedMap, "map");
        this.f41340z = new PersistentOrderedMapLinksIterator(persistentOrderedMap.o(), persistentOrderedMap.p());
    }

    public boolean hasNext() {
        return this.f41340z.hasNext();
    }

    public Object next() {
        return this.f41340z.next().e();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
