package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class TransformingIndexedSequence$iterator$1 implements Iterator<R>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41093A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TransformingIndexedSequence f41094B;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41095z;

    public TransformingIndexedSequence$iterator$1(TransformingIndexedSequence transformingIndexedSequence) {
        this.f41094B = transformingIndexedSequence;
        this.f41095z = transformingIndexedSequence.f41091a.iterator();
    }

    public boolean hasNext() {
        return this.f41095z.hasNext();
    }

    public Object next() {
        Function2 c2 = this.f41094B.f41092b;
        int i2 = this.f41093A;
        this.f41093A = i2 + 1;
        if (i2 < 0) {
            CollectionsKt.w();
        }
        return c2.m(Integer.valueOf(i2), this.f41095z.next());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
