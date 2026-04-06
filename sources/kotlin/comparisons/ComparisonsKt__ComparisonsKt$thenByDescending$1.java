package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ComparisonsKt__ComparisonsKt$thenByDescending$1<T> implements Comparator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f40695A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f40696z;

    public final int compare(Object obj, Object obj2) {
        int compare = this.f40696z.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        Function1 function1 = this.f40695A;
        return ComparisonsKt.d((Comparable) function1.invoke(obj2), (Comparable) function1.invoke(obj));
    }
}
