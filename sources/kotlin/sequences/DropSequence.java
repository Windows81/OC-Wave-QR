package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41012a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41013b;

    public DropSequence(Sequence sequence, int i2) {
        Intrinsics.i(sequence, "sequence");
        this.f41012a = sequence;
        this.f41013b = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
        }
    }

    public Sequence a(int i2) {
        int i3 = this.f41013b + i2;
        return i3 < 0 ? new DropSequence(this, i2) : new DropSequence(this.f41012a, i3);
    }

    public Iterator iterator() {
        return new DropSequence$iterator$1(this);
    }
}
