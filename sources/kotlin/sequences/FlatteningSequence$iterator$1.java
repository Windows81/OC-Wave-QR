package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class FlatteningSequence$iterator$1 implements Iterator<E>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public Iterator f41032A;

    /* renamed from: B  reason: collision with root package name */
    public int f41033B;
    public final /* synthetic */ FlatteningSequence C;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f41034z;

    public FlatteningSequence$iterator$1(FlatteningSequence flatteningSequence) {
        this.C = flatteningSequence;
        this.f41034z = flatteningSequence.f41028a.iterator();
    }

    public final boolean b() {
        Iterator it = this.f41032A;
        if (it == null || !it.hasNext()) {
            while (this.f41034z.hasNext()) {
                Iterator it2 = (Iterator) this.C.f41030c.invoke(this.C.f41029b.invoke(this.f41034z.next()));
                if (it2.hasNext()) {
                    this.f41032A = it2;
                    this.f41033B = 1;
                    return true;
                }
            }
            this.f41033B = 2;
            this.f41032A = null;
            return false;
        }
        this.f41033B = 1;
        return true;
    }

    public boolean hasNext() {
        int i2 = this.f41033B;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        return b();
    }

    public Object next() {
        int i2 = this.f41033B;
        if (i2 == 2) {
            throw new NoSuchElementException();
        } else if (i2 != 0 || b()) {
            this.f41033B = 0;
            Iterator it = this.f41032A;
            Intrinsics.f(it);
            return it.next();
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
