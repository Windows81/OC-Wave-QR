package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata
public final class SlidingWindowKt {
    public static final void a(int i2, int i3) {
        String str;
        if (i2 <= 0 || i3 <= 0) {
            if (i2 != i3) {
                str = "Both size " + i2 + " and step " + i3 + " must be greater than zero.";
            } else {
                str = "size " + i2 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator it, int i2, int i3, boolean z2, boolean z3) {
        Intrinsics.i(it, "iterator");
        return !it.hasNext() ? EmptyIterator.f40614z : SequencesKt.a(new SlidingWindowKt$windowedIterator$1(i2, i3, it, z3, z2, (Continuation) null));
    }
}
