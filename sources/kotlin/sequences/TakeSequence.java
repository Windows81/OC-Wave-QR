package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata
public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41082a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41083b;

    public Sequence a(int i2) {
        int i3 = this.f41083b;
        return i2 >= i3 ? SequencesKt.g() : new SubSequence(this.f41082a, i2, i3);
    }

    public Iterator iterator() {
        return new TakeSequence$iterator$1(this);
    }
}
