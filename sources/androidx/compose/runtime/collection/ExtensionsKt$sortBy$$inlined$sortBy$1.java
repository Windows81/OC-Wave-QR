package androidx.compose.runtime.collection;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ExtensionsKt$sortBy$$inlined$sortBy$1<T> implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15001z;

    public ExtensionsKt$sortBy$$inlined$sortBy$1(Function1 function1) {
        this.f15001z = function1;
    }

    public final int compare(Object obj, Object obj2) {
        Function1 function1 = this.f15001z;
        return ComparisonsKt.d((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
    }
}
