package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    public static Sequence e(Iterator it) {
        Intrinsics.i(it, "<this>");
        return f(new SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(it));
    }

    public static final Sequence f(Sequence sequence) {
        Intrinsics.i(sequence, "<this>");
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    public static Sequence g() {
        return EmptySequence.f41021a;
    }

    public static Sequence h(Object obj, Function1 function1) {
        Intrinsics.i(function1, "nextFunction");
        return obj == null ? EmptySequence.f41021a : new GeneratorSequence(new a(obj), function1);
    }

    public static Sequence i(Function0 function0) {
        Intrinsics.i(function0, "nextFunction");
        return f(new GeneratorSequence(function0, new b(function0)));
    }

    public static final Object j(Function0 function0, Object obj) {
        Intrinsics.i(obj, "it");
        return function0.invoke();
    }

    public static final Object k(Object obj) {
        return obj;
    }

    public static Sequence l(Object... objArr) {
        Intrinsics.i(objArr, "elements");
        return ArraysKt.T(objArr);
    }
}
