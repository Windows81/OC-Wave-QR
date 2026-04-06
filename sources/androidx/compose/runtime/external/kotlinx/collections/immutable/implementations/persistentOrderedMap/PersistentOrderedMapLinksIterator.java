package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Map f15105A;

    /* renamed from: B  reason: collision with root package name */
    public int f15106B;

    /* renamed from: z  reason: collision with root package name */
    public Object f15107z;

    public PersistentOrderedMapLinksIterator(Object obj, Map map) {
        this.f15107z = obj;
        this.f15105A = map;
    }

    public final Object b() {
        return this.f15107z;
    }

    /* renamed from: c */
    public LinkedValue next() {
        if (hasNext()) {
            Object obj = this.f15105A.get(this.f15107z);
            if (obj != null) {
                LinkedValue linkedValue = (LinkedValue) obj;
                this.f15106B++;
                this.f15107z = linkedValue.c();
                return linkedValue;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.f15107z + ") has changed after it was added to the persistent map.");
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return this.f15106B < this.f15105A.size();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
