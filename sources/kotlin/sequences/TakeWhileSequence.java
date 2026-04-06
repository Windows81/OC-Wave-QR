package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TakeWhileSequence<T> implements Sequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41086a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f41087b;

    public TakeWhileSequence(Sequence sequence, Function1 function1) {
        Intrinsics.i(sequence, "sequence");
        Intrinsics.i(function1, "predicate");
        this.f41086a = sequence;
        this.f41087b = function1;
    }

    public Iterator iterator() {
        return new TakeWhileSequence$iterator$1(this);
    }
}
