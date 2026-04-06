package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;

@Metadata
public final class LazyListLayoutInfoKt {
    public static final int a(LazyListLayoutInfo lazyListLayoutInfo) {
        List k2 = lazyListLayoutInfo.k();
        int size = k2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((LazyListItemInfo) k2.get(i3)).e();
        }
        return (i2 / k2.size()) + lazyListLayoutInfo.i();
    }
}
