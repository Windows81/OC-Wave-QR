package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class AbstractMap$values$1$iterator$1 implements Iterator<V>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Iterator f40576z;

    public AbstractMap$values$1$iterator$1(Iterator it) {
        this.f40576z = it;
    }

    public boolean hasNext() {
        return this.f40576z.hasNext();
    }

    public Object next() {
        return ((Map.Entry) this.f40576z.next()).getValue();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
