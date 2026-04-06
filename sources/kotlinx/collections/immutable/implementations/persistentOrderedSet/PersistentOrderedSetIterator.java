package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class PersistentOrderedSetIterator<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Map f41352A;

    /* renamed from: B  reason: collision with root package name */
    public int f41353B;

    /* renamed from: z  reason: collision with root package name */
    public Object f41354z;

    public PersistentOrderedSetIterator(Object obj, Map map) {
        Intrinsics.i(map, "map");
        this.f41354z = obj;
        this.f41352A = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.f41353B;
    }

    public final void e(int i2) {
        this.f41353B = i2;
    }

    public boolean hasNext() {
        return this.f41353B < this.f41352A.size();
    }

    public Object next() {
        b();
        Object obj = this.f41354z;
        this.f41353B++;
        Object obj2 = this.f41352A.get(obj);
        if (obj2 != null) {
            this.f41354z = ((Links) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
