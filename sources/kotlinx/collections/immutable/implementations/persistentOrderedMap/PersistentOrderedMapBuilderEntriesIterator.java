package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f41324z;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        Intrinsics.i(persistentOrderedMapBuilder, "map");
        this.f41324z = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f(), persistentOrderedMapBuilder);
    }

    /* renamed from: b */
    public Map.Entry next() {
        return new MutableMapEntry(this.f41324z.f().g(), this.f41324z.g(), this.f41324z.next());
    }

    public boolean hasNext() {
        return this.f41324z.hasNext();
    }

    public void remove() {
        this.f41324z.remove();
    }
}
