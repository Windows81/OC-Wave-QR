package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public abstract class SequenceScope<T> {
    public abstract Object c(Object obj, Continuation continuation);

    public abstract Object e(Iterator it, Continuation continuation);

    public final Object g(Sequence sequence, Continuation continuation) {
        Object e2 = e(sequence.iterator(), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
