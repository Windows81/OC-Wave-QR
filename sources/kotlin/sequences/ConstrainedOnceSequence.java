package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ConstrainedOnceSequence<T> implements Sequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f41008a;

    public ConstrainedOnceSequence(Sequence sequence) {
        Intrinsics.i(sequence, "sequence");
        this.f41008a = new AtomicReference(sequence);
    }

    public Iterator iterator() {
        Sequence sequence = (Sequence) this.f41008a.getAndSet((Object) null);
        if (sequence != null) {
            return sequence.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
