package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class TakeSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Iterator f41084A;

    /* renamed from: z  reason: collision with root package name */
    public int f41085z;

    public TakeSequence$iterator$1(TakeSequence takeSequence) {
        this.f41085z = takeSequence.f41083b;
        this.f41084A = takeSequence.f41082a.iterator();
    }

    public boolean hasNext() {
        return this.f41085z > 0 && this.f41084A.hasNext();
    }

    public Object next() {
        int i2 = this.f41085z;
        if (i2 != 0) {
            this.f41085z = i2 - 1;
            return this.f41084A.next();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
