package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

@Metadata
public final class MutableSetWrapper$iterator$1 implements Iterator<E>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public final Iterator f1916A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableSetWrapper f1917B;

    /* renamed from: z  reason: collision with root package name */
    public int f1918z = -1;

    public MutableSetWrapper$iterator$1(MutableSetWrapper mutableSetWrapper) {
        this.f1917B = mutableSetWrapper;
        this.f1916A = SequencesKt.a(new MutableSetWrapper$iterator$1$iterator$1(mutableSetWrapper, this, (Continuation) null));
    }

    public final void b(int i2) {
        this.f1918z = i2;
    }

    public boolean hasNext() {
        return this.f1916A.hasNext();
    }

    public Object next() {
        return this.f1916A.next();
    }

    public void remove() {
        if (this.f1918z != -1) {
            this.f1917B.f1915A.A(this.f1918z);
            this.f1918z = -1;
        }
    }
}
