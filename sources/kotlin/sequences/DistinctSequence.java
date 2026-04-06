package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DistinctSequence<T, K> implements Sequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41010a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f41011b;

    public Iterator iterator() {
        return new DistinctIterator(this.f41010a.iterator(), this.f41011b);
    }
}
