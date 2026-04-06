package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ComparisonsKt__ComparisonsKt$thenBy$2<T> implements Comparator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Comparator f40692A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f40693B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f40694z;

    public final int compare(Object obj, Object obj2) {
        int compare = this.f40694z.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        Comparator comparator = this.f40692A;
        Function1 function1 = this.f40693B;
        return comparator.compare(function1.invoke(obj), function1.invoke(obj2));
    }
}
