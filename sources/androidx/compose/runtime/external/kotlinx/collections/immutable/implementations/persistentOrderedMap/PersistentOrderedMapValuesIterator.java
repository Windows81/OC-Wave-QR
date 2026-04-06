package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class PersistentOrderedMapValuesIterator<K, V> implements Iterator<V>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f15109z;

    public PersistentOrderedMapValuesIterator(PersistentOrderedMap persistentOrderedMap) {
        this.f15109z = new PersistentOrderedMapLinksIterator(persistentOrderedMap.o(), persistentOrderedMap.p());
    }

    public boolean hasNext() {
        return this.f15109z.hasNext();
    }

    public Object next() {
        return this.f15109z.next().e();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
