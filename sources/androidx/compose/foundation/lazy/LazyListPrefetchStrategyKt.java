package androidx.compose.foundation.lazy;

import kotlin.Metadata;

@Metadata
public final class LazyListPrefetchStrategyKt {
    public static final LazyListPrefetchStrategy a(int i2) {
        return new DefaultLazyListPrefetchStrategy(i2);
    }

    public static /* synthetic */ LazyListPrefetchStrategy b(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return a(i2);
    }
}
