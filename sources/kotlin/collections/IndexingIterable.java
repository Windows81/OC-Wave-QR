package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class IndexingIterable<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f40620z;

    public IndexingIterable(Function0 function0) {
        Intrinsics.i(function0, "iteratorFactory");
        this.f40620z = function0;
    }

    public Iterator iterator() {
        return new IndexingIterator((Iterator) this.f40620z.invoke());
    }
}
