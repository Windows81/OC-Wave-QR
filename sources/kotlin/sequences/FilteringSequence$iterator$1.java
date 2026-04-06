package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class FilteringSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41025A = -1;

    /* renamed from: B  reason: collision with root package name */
    public Object f41026B;
    public final /* synthetic */ FilteringSequence C;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41027z;

    public FilteringSequence$iterator$1(FilteringSequence filteringSequence) {
        this.C = filteringSequence;
        this.f41027z = filteringSequence.f41022a.iterator();
    }

    public final void b() {
        while (this.f41027z.hasNext()) {
            Object next = this.f41027z.next();
            if (((Boolean) this.C.f41024c.invoke(next)).booleanValue() == this.C.f41023b) {
                this.f41026B = next;
                this.f41025A = 1;
                return;
            }
        }
        this.f41025A = 0;
    }

    public boolean hasNext() {
        if (this.f41025A == -1) {
            b();
        }
        return this.f41025A == 1;
    }

    public Object next() {
        if (this.f41025A == -1) {
            b();
        }
        if (this.f41025A != 0) {
            Object obj = this.f41026B;
            this.f41026B = null;
            this.f41025A = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
