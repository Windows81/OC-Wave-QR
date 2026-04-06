package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class ShortIterator implements Iterator<Short>, KMappedMarker {
    public abstract short b();

    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
