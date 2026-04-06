package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public Object f40562A;

    /* renamed from: z  reason: collision with root package name */
    public int f40563z;

    public abstract void b();

    public final void c() {
        this.f40563z = 2;
    }

    public final void e(Object obj) {
        this.f40562A = obj;
        this.f40563z = 1;
    }

    public final boolean f() {
        this.f40563z = 3;
        b();
        return this.f40563z == 1;
    }

    public boolean hasNext() {
        int i2 = this.f40563z;
        if (i2 == 0) {
            return f();
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    public Object next() {
        int i2 = this.f40563z;
        if (i2 == 1) {
            this.f40563z = 0;
            return this.f40562A;
        } else if (i2 == 2 || !f()) {
            throw new NoSuchElementException();
        } else {
            this.f40563z = 0;
            return this.f40562A;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
