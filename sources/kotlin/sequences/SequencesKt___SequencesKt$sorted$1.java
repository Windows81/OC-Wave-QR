package kotlin.sequences;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class SequencesKt___SequencesKt$sorted$1 implements Sequence<Comparable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Sequence f41072a;

    public Iterator iterator() {
        List E = SequencesKt___SequencesKt.E(this.f41072a);
        CollectionsKt.z(E);
        return E.iterator();
    }
}
