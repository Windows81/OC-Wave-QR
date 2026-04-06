package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class TakeWhileSequence$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41088A = -1;

    /* renamed from: B  reason: collision with root package name */
    public Object f41089B;
    public final /* synthetic */ TakeWhileSequence C;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41090z;

    public TakeWhileSequence$iterator$1(TakeWhileSequence takeWhileSequence) {
        this.C = takeWhileSequence;
        this.f41090z = takeWhileSequence.f41086a.iterator();
    }

    private final void b() {
        if (this.f41090z.hasNext()) {
            Object next = this.f41090z.next();
            if (((Boolean) this.C.f41087b.invoke(next)).booleanValue()) {
                this.f41088A = 1;
                this.f41089B = next;
                return;
            }
        }
        this.f41088A = 0;
    }

    public boolean hasNext() {
        if (this.f41088A == -1) {
            b();
        }
        return this.f41088A == 1;
    }

    public Object next() {
        if (this.f41088A == -1) {
            b();
        }
        if (this.f41088A != 0) {
            Object obj = this.f41089B;
            this.f41089B = null;
            this.f41088A = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
