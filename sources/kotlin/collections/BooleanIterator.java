package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class BooleanIterator implements Iterator<Boolean>, KMappedMarker {
    public abstract boolean b();

    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
