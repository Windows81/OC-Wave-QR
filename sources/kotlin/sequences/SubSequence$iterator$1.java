package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SubSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41079A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SubSequence f41080B;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41081z;

    public SubSequence$iterator$1(SubSequence subSequence) {
        this.f41080B = subSequence;
        this.f41081z = subSequence.f41076a.iterator();
    }

    private final void b() {
        while (this.f41079A < this.f41080B.f41077b && this.f41081z.hasNext()) {
            this.f41081z.next();
            this.f41079A++;
        }
    }

    public boolean hasNext() {
        b();
        return this.f41079A < this.f41080B.f41078c && this.f41081z.hasNext();
    }

    public Object next() {
        b();
        if (this.f41079A < this.f41080B.f41078c) {
            this.f41079A++;
            return this.f41081z.next();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
