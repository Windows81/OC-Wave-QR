package kotlin.collections;

import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 implements Function1<Object, Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Comparable f40609A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f40610z;

    /* renamed from: b */
    public final Integer invoke(Object obj) {
        return Integer.valueOf(ComparisonsKt.d((Comparable) this.f40610z.invoke(obj), this.f40609A));
    }
}
