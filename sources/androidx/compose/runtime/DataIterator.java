package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class DataIterator implements Iterable<Object>, Iterator<Object>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final int f14637A;

    /* renamed from: B  reason: collision with root package name */
    public int f14638B;

    /* renamed from: z  reason: collision with root package name */
    public final SlotTable f14639z;

    public boolean hasNext() {
        return this.f14638B < this.f14637A;
    }

    public Iterator iterator() {
        return this;
    }

    public Object next() {
        int i2 = this.f14638B;
        Object obj = (i2 < 0 || i2 >= this.f14639z.v().length) ? null : this.f14639z.v()[this.f14638B];
        this.f14638B++;
        return obj;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
