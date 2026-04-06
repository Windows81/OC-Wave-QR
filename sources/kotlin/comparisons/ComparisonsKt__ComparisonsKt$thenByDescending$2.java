package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ComparisonsKt__ComparisonsKt$thenByDescending$2<T> implements Comparator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Comparator f40697A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f40698B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f40699z;

    public final int compare(Object obj, Object obj2) {
        int compare = this.f40699z.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        Comparator comparator = this.f40697A;
        Function1 function1 = this.f40698B;
        return comparator.compare(function1.invoke(obj2), function1.invoke(obj));
    }
}
