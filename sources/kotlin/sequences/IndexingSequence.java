package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;

@Metadata
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41040a;

    public Iterator iterator() {
        return new IndexingSequence$iterator$1(this);
    }
}
