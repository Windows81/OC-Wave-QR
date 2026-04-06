package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class PersistentOrderedMapEntriesIterator<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f15102z;

    public PersistentOrderedMapEntriesIterator(PersistentOrderedMap persistentOrderedMap) {
        this.f15102z = new PersistentOrderedMapLinksIterator(persistentOrderedMap.o(), persistentOrderedMap.p());
    }

    /* renamed from: b */
    public Map.Entry next() {
        return new MapEntry(this.f15102z.b(), this.f15102z.next().e());
    }

    public boolean hasNext() {
        return this.f15102z.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
