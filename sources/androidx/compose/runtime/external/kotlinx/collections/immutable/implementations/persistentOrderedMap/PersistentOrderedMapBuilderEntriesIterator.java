package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f15093z;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f15093z = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f(), persistentOrderedMapBuilder);
    }

    /* renamed from: b */
    public Map.Entry next() {
        return new MutableMapEntry(this.f15093z.f().g(), this.f15093z.g(), this.f15093z.next());
    }

    public boolean hasNext() {
        return this.f15093z.hasNext();
    }

    public void remove() {
        this.f15093z.remove();
    }
}
