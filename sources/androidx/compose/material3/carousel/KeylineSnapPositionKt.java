package androidx.compose.material3.carousel;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class KeylineSnapPositionKt {
    public static final int a(Strategy strategy, int i2, int i3) {
        if (!strategy.i()) {
            return 0;
        }
        int d2 = MathKt.d(strategy.b().m().f() - (strategy.d() / 2.0f));
        if (i2 <= CollectionsKt.o(strategy.h())) {
            d2 = MathKt.d(((KeylineList) strategy.h().get(RangesKt.o(CollectionsKt.o(strategy.h()) - i2, 0, CollectionsKt.o(strategy.h())))).m().f() - (strategy.d() / 2.0f));
        }
        int i4 = i3 - 1;
        if (i2 < i4 - CollectionsKt.o(strategy.c()) || i3 <= strategy.b().q()) {
            return d2;
        }
        return MathKt.d(((KeylineList) strategy.c().get(RangesKt.o(CollectionsKt.o(strategy.c()) - (i4 - i2), 0, CollectionsKt.o(strategy.c())))).m().f() - (strategy.d() / 2.0f));
    }
}
