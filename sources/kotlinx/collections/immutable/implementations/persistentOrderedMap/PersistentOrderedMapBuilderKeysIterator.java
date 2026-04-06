package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class PersistentOrderedMapBuilderKeysIterator<K, V> implements Iterator<K>, KMutableIterator {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f41326z;

    public PersistentOrderedMapBuilderKeysIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        Intrinsics.i(persistentOrderedMapBuilder, "map");
        this.f41326z = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f(), persistentOrderedMapBuilder);
    }

    public boolean hasNext() {
        return this.f41326z.hasNext();
    }

    public Object next() {
        this.f41326z.next();
        return this.f41326z.g();
    }

    public void remove() {
        this.f41326z.remove();
    }
}
