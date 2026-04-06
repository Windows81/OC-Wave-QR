package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridIntervalContent$Companion$DefaultSpan$1 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyGridIntervalContent$Companion$DefaultSpan$1 f4586z = new LazyGridIntervalContent$Companion$DefaultSpan$1();

    public LazyGridIntervalContent$Companion$DefaultSpan$1() {
        super(2);
    }

    public final long b(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return LazyGridSpanKt.a(1);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return GridItemSpan.a(b((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }
}
