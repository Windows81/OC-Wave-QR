package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$items$9$1 extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f5022A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f5023z;

    public final StaggeredGridItemSpan b(int i2) {
        return (StaggeredGridItemSpan) this.f5023z.invoke(this.f5022A[i2]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
