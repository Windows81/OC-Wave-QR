package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class DropSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41014A;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41015z;

    public DropSequence$iterator$1(DropSequence dropSequence) {
        this.f41015z = dropSequence.f41012a.iterator();
        this.f41014A = dropSequence.f41013b;
    }

    public final void b() {
        while (this.f41014A > 0 && this.f41015z.hasNext()) {
            this.f41015z.next();
            this.f41014A--;
        }
    }

    public boolean hasNext() {
        b();
        return this.f41015z.hasNext();
    }

    public Object next() {
        b();
        return this.f41015z.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
