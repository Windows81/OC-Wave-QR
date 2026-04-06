package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class LongIterator implements Iterator<Long>, KMappedMarker {
    public abstract long b();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
