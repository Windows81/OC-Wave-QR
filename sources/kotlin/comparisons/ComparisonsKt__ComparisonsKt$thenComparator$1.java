package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f40700A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f40701z;

    public final int compare(Object obj, Object obj2) {
        int compare = this.f40701z.compare(obj, obj2);
        return compare != 0 ? compare : ((Number) this.f40700A.m(obj, obj2)).intValue();
    }
}
