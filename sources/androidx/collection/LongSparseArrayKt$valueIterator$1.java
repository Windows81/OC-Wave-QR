package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class LongSparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f1847A;

    /* renamed from: z  reason: collision with root package name */
    public int f1848z;

    public boolean hasNext() {
        return this.f1848z < this.f1847A.o();
    }

    public Object next() {
        LongSparseArray longSparseArray = this.f1847A;
        int i2 = this.f1848z;
        this.f1848z = i2 + 1;
        return longSparseArray.p(i2);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
