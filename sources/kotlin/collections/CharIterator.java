package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class CharIterator implements Iterator<Character>, KMappedMarker {
    public abstract char b();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
