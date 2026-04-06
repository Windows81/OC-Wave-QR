package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class TransformingSequence$iterator$1 implements Iterator<R>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TransformingSequence f41098A;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41099z;

    public TransformingSequence$iterator$1(TransformingSequence transformingSequence) {
        this.f41098A = transformingSequence;
        this.f41099z = transformingSequence.f41096a.iterator();
    }

    public boolean hasNext() {
        return this.f41099z.hasNext();
    }

    public Object next() {
        return this.f41098A.f41097b.invoke(this.f41099z.next());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
