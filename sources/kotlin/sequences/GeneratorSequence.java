package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class GeneratorSequence<T> implements Sequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f41035a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f41036b;

    public GeneratorSequence(Function0 function0, Function1 function1) {
        Intrinsics.i(function0, "getInitialValue");
        Intrinsics.i(function1, "getNextValue");
        this.f41035a = function0;
        this.f41036b = function1;
    }

    public Iterator iterator() {
        return new GeneratorSequence$iterator$1(this);
    }
}
