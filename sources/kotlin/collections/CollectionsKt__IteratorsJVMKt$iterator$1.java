package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class CollectionsKt__IteratorsJVMKt$iterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Enumeration f40612z;

    public boolean hasNext() {
        return this.f40612z.hasMoreElements();
    }

    public Object next() {
        return this.f40612z.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
