package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

@Metadata
public final class MutableOrderedSetWrapper$iterator$1 implements Iterator<E>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public final Iterator f1909A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableOrderedSetWrapper f1910B;

    /* renamed from: z  reason: collision with root package name */
    public int f1911z = -1;

    public MutableOrderedSetWrapper$iterator$1(MutableOrderedSetWrapper mutableOrderedSetWrapper) {
        this.f1910B = mutableOrderedSetWrapper;
        this.f1909A = SequencesKt.a(new MutableOrderedSetWrapper$iterator$1$iterator$1(mutableOrderedSetWrapper, this, (Continuation) null));
    }

    public final void b(int i2) {
        this.f1911z = i2;
    }

    public boolean hasNext() {
        return this.f1909A.hasNext();
    }

    public Object next() {
        return this.f1909A.next();
    }

    public void remove() {
        if (this.f1911z != -1) {
            this.f1910B.f1908A.z(this.f1911z);
            this.f1911z = -1;
        }
    }
}
