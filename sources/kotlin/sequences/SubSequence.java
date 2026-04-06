package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41076a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41077b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41078c;

    public SubSequence(Sequence sequence, int i2, int i3) {
        Intrinsics.i(sequence, "sequence");
        this.f41076a = sequence;
        this.f41077b = i2;
        this.f41078c = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i2).toString());
        } else if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i3).toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i3 + " < " + i2).toString());
        }
    }

    public Sequence a(int i2) {
        return i2 >= e() ? SequencesKt.g() : new SubSequence(this.f41076a, this.f41077b + i2, this.f41078c);
    }

    public final int e() {
        return this.f41078c - this.f41077b;
    }

    public Iterator iterator() {
        return new SubSequence$iterator$1(this);
    }
}
