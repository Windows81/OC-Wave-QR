package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class IndexingSequence$iterator$1 implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41041A;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41042z;

    public IndexingSequence$iterator$1(IndexingSequence indexingSequence) {
        this.f41042z = indexingSequence.f41040a.iterator();
    }

    /* renamed from: b */
    public IndexedValue next() {
        int i2 = this.f41041A;
        this.f41041A = i2 + 1;
        if (i2 < 0) {
            CollectionsKt.w();
        }
        return new IndexedValue(i2, this.f41042z.next());
    }

    public boolean hasNext() {
        return this.f41042z.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
