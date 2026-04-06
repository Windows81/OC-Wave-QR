package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ComparisonsKt__ComparisonsKt$compareBy$2<T> implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f40684z;

    public final int compare(Object obj, Object obj2) {
        Function1 function1 = this.f40684z;
        return ComparisonsKt.d((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
    }
}
