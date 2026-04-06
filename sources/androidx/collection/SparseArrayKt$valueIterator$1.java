package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseArrayCompat f2002A;

    /* renamed from: z  reason: collision with root package name */
    public int f2003z;

    public SparseArrayKt$valueIterator$1(SparseArrayCompat sparseArrayCompat) {
        this.f2002A = sparseArrayCompat;
    }

    public boolean hasNext() {
        return this.f2003z < this.f2002A.o();
    }

    public Object next() {
        SparseArrayCompat sparseArrayCompat = this.f2002A;
        int i2 = this.f2003z;
        this.f2003z = i2 + 1;
        return sparseArrayCompat.p(i2);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
