package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class SequencesKt___SequencesKt$minus$3 implements Sequence<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterable f41064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Sequence f41065b;

    public static final boolean c(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    public Iterator iterator() {
        Collection D = CollectionsKt.D(this.f41064a);
        return D.isEmpty() ? this.f41065b.iterator() : SequencesKt___SequencesKt.r(this.f41065b, new f(D)).iterator();
    }
}
