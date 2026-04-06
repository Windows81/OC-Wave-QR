package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class LazyGridLayoutInfoKt {
    public static final int a(LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z2 = lazyGridLayoutInfo.e() == Orientation.Vertical;
        List k2 = lazyGridLayoutInfo.k();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < k2.size()) {
            int b2 = b(z2, lazyGridLayoutInfo, i2);
            if (b2 == -1) {
                i2++;
            } else {
                int i5 = 0;
                while (i2 < k2.size() && b(z2, lazyGridLayoutInfo, i2) == b2) {
                    i5 = Math.max(i5, (int) (z2 ? ((LazyGridItemInfo) k2.get(i2)).a() & 4294967295L : ((LazyGridItemInfo) k2.get(i2)).a() >> 32));
                    i2++;
                }
                i3 += i5;
                i4++;
            }
        }
        return (i3 / i4) + lazyGridLayoutInfo.i();
    }

    public static final int b(boolean z2, LazyGridLayoutInfo lazyGridLayoutInfo, int i2) {
        return z2 ? ((LazyGridItemInfo) lazyGridLayoutInfo.k().get(i2)).f() : ((LazyGridItemInfo) lazyGridLayoutInfo.k().get(i2)).n();
    }
}
