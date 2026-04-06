package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class SequencesKt___SequencesKt$minus$2 implements Sequence<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Sequence f41062a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object[] f41063b;

    public static final boolean c(Object[] objArr, Object obj) {
        return ArraysKt.Y(objArr, obj);
    }

    public Iterator iterator() {
        return SequencesKt___SequencesKt.r(this.f41062a, new e(this.f41063b)).iterator();
    }
}
