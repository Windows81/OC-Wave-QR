package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TransformingIndexedSequence<T, R> implements Sequence<R> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41091a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f41092b;

    public Iterator iterator() {
        return new TransformingIndexedSequence$iterator$1(this);
    }
}
