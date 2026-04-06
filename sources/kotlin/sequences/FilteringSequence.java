package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FilteringSequence<T> implements Sequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41022a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f41023b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f41024c;

    public FilteringSequence(Sequence sequence, boolean z2, Function1 function1) {
        Intrinsics.i(sequence, "sequence");
        Intrinsics.i(function1, "predicate");
        this.f41022a = sequence;
        this.f41023b = z2;
        this.f41024c = function1;
    }

    public Iterator iterator() {
        return new FilteringSequence$iterator$1(this);
    }
}
