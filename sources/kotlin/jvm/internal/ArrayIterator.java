package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class ArrayIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f40877A;

    /* renamed from: z  reason: collision with root package name */
    public final Object[] f40878z;

    public ArrayIterator(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        this.f40878z = objArr;
    }

    public boolean hasNext() {
        return this.f40877A < this.f40878z.length;
    }

    public Object next() {
        try {
            Object[] objArr = this.f40878z;
            int i2 = this.f40877A;
            this.f40877A = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40877A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
