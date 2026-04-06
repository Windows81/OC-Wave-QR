package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$items$8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f4549A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f4550z;

    public final long b(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return ((GridItemSpan) this.f4550z.m(lazyGridItemSpanScope, this.f4549A[i2])).g();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return GridItemSpan.a(b((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }
}
