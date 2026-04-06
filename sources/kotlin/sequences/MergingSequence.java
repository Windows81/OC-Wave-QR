package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41043a;

    /* renamed from: b  reason: collision with root package name */
    public final Sequence f41044b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f41045c;

    public Iterator iterator() {
        return new MergingSequence$iterator$1(this);
    }
}
