package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DistinctIterator<T, K> extends AbstractIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public final Iterator f41009B;
    public final Function1 C;
    public final HashSet D = new HashSet();

    public DistinctIterator(Iterator it, Function1 function1) {
        Intrinsics.i(it, "source");
        Intrinsics.i(function1, "keySelector");
        this.f41009B = it;
        this.C = function1;
    }

    public void b() {
        while (this.f41009B.hasNext()) {
            Object next = this.f41009B.next();
            if (this.D.add(this.C.invoke(next))) {
                e(next);
                return;
            }
        }
        c();
    }
}
