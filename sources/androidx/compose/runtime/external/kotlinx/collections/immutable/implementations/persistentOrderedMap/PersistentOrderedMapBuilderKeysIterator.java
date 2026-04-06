package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class PersistentOrderedMapBuilderKeysIterator<K, V> implements Iterator<K>, KMutableIterator {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f15095z;

    public PersistentOrderedMapBuilderKeysIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f15095z = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f(), persistentOrderedMapBuilder);
    }

    public boolean hasNext() {
        return this.f15095z.hasNext();
    }

    public Object next() {
        this.f15095z.next();
        return this.f15095z.g();
    }

    public void remove() {
        this.f15095z.remove();
    }
}
