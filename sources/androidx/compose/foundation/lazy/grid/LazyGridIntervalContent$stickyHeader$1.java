package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyGridIntervalContent$stickyHeader$1 extends Lambda implements Function1<LazyGridItemSpanScope, GridItemSpan> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyGridIntervalContent$stickyHeader$1 f4591z = new LazyGridIntervalContent$stickyHeader$1();

    public LazyGridIntervalContent$stickyHeader$1() {
        super(1);
    }

    public final long b(LazyGridItemSpanScope lazyGridItemSpanScope) {
        return LazyGridSpanKt.a(lazyGridItemSpanScope.a());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return GridItemSpan.a(b((LazyGridItemSpanScope) obj));
    }
}
