package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class DoubleIterator implements Iterator<Double>, KMappedMarker {
    public abstract double b();

    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
