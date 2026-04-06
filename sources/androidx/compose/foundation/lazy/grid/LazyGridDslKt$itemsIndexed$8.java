package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$itemsIndexed$8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f4567A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f4568z;

    public final long b(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return ((GridItemSpan) this.f4568z.d(lazyGridItemSpanScope, Integer.valueOf(i2), this.f4567A[i2])).g();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return GridItemSpan.a(b((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }
}
