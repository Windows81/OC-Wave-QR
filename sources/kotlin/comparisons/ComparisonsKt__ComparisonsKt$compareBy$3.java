package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ComparisonsKt__ComparisonsKt$compareBy$3<T> implements Comparator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f40685A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f40686z;

    public final int compare(Object obj, Object obj2) {
        Comparator comparator = this.f40686z;
        Function1 function1 = this.f40685A;
        return comparator.compare(function1.invoke(obj), function1.invoke(obj2));
    }
}
