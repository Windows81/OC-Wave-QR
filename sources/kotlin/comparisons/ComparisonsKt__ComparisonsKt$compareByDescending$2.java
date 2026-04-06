package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ComparisonsKt__ComparisonsKt$compareByDescending$2<T> implements Comparator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f40688A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f40689z;

    public final int compare(Object obj, Object obj2) {
        Comparator comparator = this.f40689z;
        Function1 function1 = this.f40688A;
        return comparator.compare(function1.invoke(obj2), function1.invoke(obj));
    }
}
