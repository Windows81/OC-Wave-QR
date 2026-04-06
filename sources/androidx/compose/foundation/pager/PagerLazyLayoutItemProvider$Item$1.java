package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerLazyLayoutItemProvider$Item$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5302A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerLazyLayoutItemProvider f5303z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerLazyLayoutItemProvider$Item$1(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2) {
        super(2);
        this.f5303z = pagerLazyLayoutItemProvider;
        this.f5302A = i2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1142237095, i2, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:212)");
            }
            LazyLayoutIntervalContent k2 = this.f5303z.f5299b;
            int i3 = this.f5302A;
            PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = this.f5303z;
            IntervalList.Interval interval = k2.h().get(i3);
            ((PagerIntervalContent) interval.c()).a().j(pagerLazyLayoutItemProvider.f5301d, Integer.valueOf(i3 - interval.b()), composer, 0);
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
