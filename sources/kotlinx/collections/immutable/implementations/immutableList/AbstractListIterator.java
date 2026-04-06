package kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class AbstractListIterator<E> implements ListIterator<E>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41241A;

    /* renamed from: z  reason: collision with root package name */
    public int f41242z;

    public AbstractListIterator(int i2, int i3) {
        this.f41242z = i2;
        this.f41241A = i3;
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void c() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int e() {
        return this.f41242z;
    }

    public final int f() {
        return this.f41241A;
    }

    public final void g(int i2) {
        this.f41242z = i2;
    }

    public final void h(int i2) {
        this.f41241A = i2;
    }

    public boolean hasNext() {
        return this.f41242z < this.f41241A;
    }

    public boolean hasPrevious() {
        return this.f41242z > 0;
    }

    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int nextIndex() {
        return this.f41242z;
    }

    public int previousIndex() {
        return this.f41242z - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
