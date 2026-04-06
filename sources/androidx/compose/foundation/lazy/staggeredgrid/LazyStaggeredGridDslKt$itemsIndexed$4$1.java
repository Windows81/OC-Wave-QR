package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$itemsIndexed$4$1 extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f5031A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f5032z;

    public final StaggeredGridItemSpan b(int i2) {
        return (StaggeredGridItemSpan) this.f5032z.m(Integer.valueOf(i2), this.f5031A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
