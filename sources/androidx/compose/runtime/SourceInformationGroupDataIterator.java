package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final int f14907A;

    /* renamed from: B  reason: collision with root package name */
    public final int f14908B;
    public final BitVector C;
    public int D;

    /* renamed from: z  reason: collision with root package name */
    public final SlotTable f14909z;

    public boolean hasNext() {
        return this.D < this.f14908B;
    }

    public Iterator iterator() {
        return this;
    }

    public Object next() {
        int i2 = this.f14908B;
        int i3 = this.D;
        Object obj = (i3 < 0 || i3 >= i2) ? null : this.f14909z.v()[this.f14907A + this.D];
        this.D = this.C.c(this.D + 1);
        return obj;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
