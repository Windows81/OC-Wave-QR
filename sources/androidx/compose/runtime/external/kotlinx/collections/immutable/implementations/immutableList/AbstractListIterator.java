package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class AbstractListIterator<E> implements ListIterator<E>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f15025A;

    /* renamed from: z  reason: collision with root package name */
    public int f15026z;

    public AbstractListIterator(int i2, int i3) {
        this.f15026z = i2;
        this.f15025A = i3;
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
        return this.f15026z;
    }

    public final int f() {
        return this.f15025A;
    }

    public final void g(int i2) {
        this.f15026z = i2;
    }

    public final void h(int i2) {
        this.f15025A = i2;
    }

    public boolean hasNext() {
        return this.f15026z < this.f15025A;
    }

    public boolean hasPrevious() {
        return this.f15026z > 0;
    }

    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int nextIndex() {
        return this.f15026z;
    }

    public int previousIndex() {
        return this.f15026z - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
