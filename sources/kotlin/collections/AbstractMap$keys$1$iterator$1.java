package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class AbstractMap$keys$1$iterator$1 implements Iterator<K>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Iterator f40574z;

    public AbstractMap$keys$1$iterator$1(Iterator it) {
        this.f40574z = it;
    }

    public boolean hasNext() {
        return this.f40574z.hasNext();
    }

    public Object next() {
        return ((Map.Entry) this.f40574z.next()).getKey();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
