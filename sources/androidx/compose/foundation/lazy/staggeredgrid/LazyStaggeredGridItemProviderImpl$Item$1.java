package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridItemProviderImpl$Item$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5061A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridItemProviderImpl f5062z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderImpl$Item$1(LazyStaggeredGridItemProviderImpl lazyStaggeredGridItemProviderImpl, int i2) {
        super(2);
        this.f5062z = lazyStaggeredGridItemProviderImpl;
        this.f5061A = i2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(608834466, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:79)");
            }
            LazyStaggeredGridIntervalContent k2 = this.f5062z.f5059b;
            int i3 = this.f5061A;
            IntervalList.Interval interval = k2.h().get(i3);
            ((LazyStaggeredGridInterval) interval.c()).a().j(LazyStaggeredGridItemScopeImpl.f5066a, Integer.valueOf(i3 - interval.b()), composer, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
