package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

@Metadata
public final class MutableValues$iterator$1 implements Iterator<V>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f1921A = -1;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableValues f1922B;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f1923z;

    public MutableValues$iterator$1(MutableValues mutableValues) {
        this.f1922B = mutableValues;
        this.f1923z = SequencesKt.a(new MutableValues$iterator$1$iterator$1(mutableValues, (Continuation) null));
    }

    public boolean hasNext() {
        return this.f1923z.hasNext();
    }

    public Object next() {
        this.f1921A = ((Number) this.f1923z.next()).intValue();
        return this.f1922B.f1920z.f1961c[this.f1921A];
    }

    public void remove() {
        if (this.f1921A >= 0) {
            this.f1922B.f1920z.v(this.f1921A);
            this.f1921A = -1;
        }
    }
}
