package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class PersistentOrderedMapKeysIterator<K, V> implements Iterator<K>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f15104z;

    public PersistentOrderedMapKeysIterator(PersistentOrderedMap persistentOrderedMap) {
        this.f15104z = new PersistentOrderedMapLinksIterator(persistentOrderedMap.o(), persistentOrderedMap.p());
    }

    public boolean hasNext() {
        return this.f15104z.hasNext();
    }

    public Object next() {
        Object b2 = this.f15104z.b();
        this.f15104z.next();
        return b2;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
