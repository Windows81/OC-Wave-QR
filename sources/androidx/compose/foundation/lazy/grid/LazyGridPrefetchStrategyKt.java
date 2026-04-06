package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

@Metadata
public final class LazyGridPrefetchStrategyKt {
    public static final LazyGridPrefetchStrategy a(int i2) {
        return new DefaultLazyGridPrefetchStrategy(i2);
    }

    public static /* synthetic */ LazyGridPrefetchStrategy b(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return a(i2);
    }
}
