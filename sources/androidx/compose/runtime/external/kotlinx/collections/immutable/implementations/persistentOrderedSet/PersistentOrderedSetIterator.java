package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class PersistentOrderedSetIterator<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Map f15117A;

    /* renamed from: B  reason: collision with root package name */
    public int f15118B;

    /* renamed from: z  reason: collision with root package name */
    public Object f15119z;

    public PersistentOrderedSetIterator(Object obj, Map map) {
        this.f15119z = obj;
        this.f15117A = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.f15118B;
    }

    public final void e(int i2) {
        this.f15118B = i2;
    }

    public boolean hasNext() {
        return this.f15118B < this.f15117A.size();
    }

    public Object next() {
        b();
        Object obj = this.f15119z;
        this.f15118B++;
        Object obj2 = this.f15117A.get(obj);
        if (obj2 != null) {
            this.f15119z = ((Links) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
