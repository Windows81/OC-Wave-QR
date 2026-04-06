package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41096a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f41097b;

    public TransformingSequence(Sequence sequence, Function1 function1) {
        Intrinsics.i(sequence, "sequence");
        Intrinsics.i(function1, "transformer");
        this.f41096a = sequence;
        this.f41097b = function1;
    }

    public Iterator iterator() {
        return new TransformingSequence$iterator$1(this);
    }
}
