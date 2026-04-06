package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListItemProviderImpl$Item$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4371A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListItemProviderImpl f4372z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderImpl$Item$1(LazyListItemProviderImpl lazyListItemProviderImpl, int i2) {
        super(2);
        this.f4372z = lazyListItemProviderImpl;
        this.f4371A = i2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-824725566, i2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:82)");
            }
            LazyListIntervalContent k2 = this.f4372z.f4368b;
            int i3 = this.f4371A;
            LazyListItemProviderImpl lazyListItemProviderImpl = this.f4372z;
            IntervalList.Interval interval = k2.h().get(i3);
            ((LazyListInterval) interval.c()).a().j(lazyListItemProviderImpl.h(), Integer.valueOf(i3 - interval.b()), composer, 0);
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
