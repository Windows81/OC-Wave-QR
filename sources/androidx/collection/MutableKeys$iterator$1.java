package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

@Metadata
public final class MutableKeys$iterator$1 implements Iterator<K>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f1885A = -1;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableKeys f1886B;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f1887z;

    public MutableKeys$iterator$1(MutableKeys mutableKeys) {
        this.f1886B = mutableKeys;
        this.f1887z = SequencesKt.a(new MutableKeys$iterator$1$iterator$1(mutableKeys, (Continuation) null));
    }

    public boolean hasNext() {
        return this.f1887z.hasNext();
    }

    public Object next() {
        this.f1885A = ((Number) this.f1887z.next()).intValue();
        return this.f1886B.f1884z.f1960b[this.f1885A];
    }

    public void remove() {
        if (this.f1885A >= 0) {
            this.f1886B.f1884z.v(this.f1885A);
            this.f1885A = -1;
        }
    }
}
