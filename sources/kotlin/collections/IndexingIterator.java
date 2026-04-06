package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f40621A;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f40622z;

    public IndexingIterator(Iterator it) {
        Intrinsics.i(it, "iterator");
        this.f40622z = it;
    }

    /* renamed from: b */
    public final IndexedValue next() {
        int i2 = this.f40621A;
        this.f40621A = i2 + 1;
        if (i2 < 0) {
            CollectionsKt.w();
        }
        return new IndexedValue(i2, this.f40622z.next());
    }

    public final boolean hasNext() {
        return this.f40622z.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
