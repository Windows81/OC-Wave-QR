package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class FloatIterator implements Iterator<Float>, KMappedMarker {
    public abstract float b();

    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
