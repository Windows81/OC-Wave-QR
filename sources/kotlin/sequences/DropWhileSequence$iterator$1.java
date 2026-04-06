package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class DropWhileSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41018A = -1;

    /* renamed from: B  reason: collision with root package name */
    public Object f41019B;
    public final /* synthetic */ DropWhileSequence C;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41020z;

    public DropWhileSequence$iterator$1(DropWhileSequence dropWhileSequence) {
        this.C = dropWhileSequence;
        this.f41020z = dropWhileSequence.f41016a.iterator();
    }

    private final void b() {
        while (this.f41020z.hasNext()) {
            Object next = this.f41020z.next();
            if (!((Boolean) this.C.f41017b.invoke(next)).booleanValue()) {
                this.f41019B = next;
                this.f41018A = 1;
                return;
            }
        }
        this.f41018A = 0;
    }

    public boolean hasNext() {
        if (this.f41018A == -1) {
            b();
        }
        return this.f41018A == 1 || this.f41020z.hasNext();
    }

    public Object next() {
        if (this.f41018A == -1) {
            b();
        }
        if (this.f41018A != 1) {
            return this.f41020z.next();
        }
        Object obj = this.f41019B;
        this.f41019B = null;
        this.f41018A = 0;
        return obj;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
