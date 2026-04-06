package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2<T> implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutKeyIndexMap f4840z;

    public LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2(LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.f4840z = lazyLayoutKeyIndexMap;
    }

    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(Integer.valueOf(this.f4840z.e(((LazyLayoutMeasuredItem) obj).getKey())), Integer.valueOf(this.f4840z.e(((LazyLayoutMeasuredItem) obj2).getKey())));
    }
}
