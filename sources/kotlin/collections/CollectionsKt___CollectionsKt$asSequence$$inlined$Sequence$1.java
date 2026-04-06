package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
public final class CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 implements Sequence<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterable f40613a;

    public CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(Iterable iterable) {
        this.f40613a = iterable;
    }

    public Iterator iterator() {
        return this.f40613a.iterator();
    }
}
