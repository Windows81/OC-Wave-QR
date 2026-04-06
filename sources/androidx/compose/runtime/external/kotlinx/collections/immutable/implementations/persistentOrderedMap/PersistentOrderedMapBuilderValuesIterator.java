package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class PersistentOrderedMapBuilderValuesIterator<K, V> implements Iterator<V>, KMutableIterator {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f15100z;

    public PersistentOrderedMapBuilderValuesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f15100z = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f(), persistentOrderedMapBuilder);
    }

    public boolean hasNext() {
        return this.f15100z.hasNext();
    }

    public Object next() {
        return this.f15100z.next().e();
    }

    public void remove() {
        this.f15100z.remove();
    }
}
