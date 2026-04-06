package kotlin.sequences;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class SequencesKt___SequencesKt$minus$4 implements Sequence<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Sequence f41066a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Sequence f41067b;

    public static final boolean c(List list, Object obj) {
        return list.contains(obj);
    }

    public Iterator iterator() {
        List D = SequencesKt.D(this.f41066a);
        return D.isEmpty() ? this.f41067b.iterator() : SequencesKt___SequencesKt.r(this.f41067b, new g(D)).iterator();
    }
}
