package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Map f41336A;

    /* renamed from: B  reason: collision with root package name */
    public int f41337B;

    /* renamed from: z  reason: collision with root package name */
    public Object f41338z;

    public PersistentOrderedMapLinksIterator(Object obj, Map map) {
        Intrinsics.i(map, "hashMap");
        this.f41338z = obj;
        this.f41336A = map;
    }

    public final Object b() {
        return this.f41338z;
    }

    /* renamed from: c */
    public LinkedValue next() {
        if (hasNext()) {
            Object obj = this.f41336A.get(this.f41338z);
            if (obj != null) {
                LinkedValue linkedValue = (LinkedValue) obj;
                this.f41337B++;
                this.f41338z = linkedValue.c();
                return linkedValue;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.f41338z + ") has changed after it was added to the persistent map.");
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return this.f41337B < this.f41336A.size();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
