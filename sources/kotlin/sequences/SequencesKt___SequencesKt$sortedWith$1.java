package kotlin.sequences;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class SequencesKt___SequencesKt$sortedWith$1 implements Sequence<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Sequence f41073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f41074b;

    public Iterator iterator() {
        List E = SequencesKt___SequencesKt.E(this.f41073a);
        CollectionsKt.A(E, this.f41074b);
        return E.iterator();
    }
}
