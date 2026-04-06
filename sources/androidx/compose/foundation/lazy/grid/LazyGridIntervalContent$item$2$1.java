package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyGridIntervalContent$item$2$1 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f4588z;

    public final long b(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return ((GridItemSpan) this.f4588z.invoke(lazyGridItemSpanScope)).g();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return GridItemSpan.a(b((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }
}
