package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$items$3 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f4540A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f4541z;

    public final long b(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return ((GridItemSpan) this.f4541z.m(lazyGridItemSpanScope, this.f4540A.get(i2))).g();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return GridItemSpan.a(b((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }
}
