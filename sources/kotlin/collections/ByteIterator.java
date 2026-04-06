package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class ByteIterator implements Iterator<Byte>, KMappedMarker {
    public /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(p());
    }

    public abstract byte p();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
