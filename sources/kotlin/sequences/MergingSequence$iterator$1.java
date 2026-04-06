package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class MergingSequence$iterator$1 implements Iterator<V>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Iterator f41046A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MergingSequence f41047B;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41048z;

    public MergingSequence$iterator$1(MergingSequence mergingSequence) {
        this.f41047B = mergingSequence;
        this.f41048z = mergingSequence.f41043a.iterator();
        this.f41046A = mergingSequence.f41044b.iterator();
    }

    public boolean hasNext() {
        return this.f41048z.hasNext() && this.f41046A.hasNext();
    }

    public Object next() {
        return this.f41047B.f41045c.m(this.f41048z.next(), this.f41046A.next());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
