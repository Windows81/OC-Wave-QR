package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;

@Metadata
public final class PagerLayoutInfoKt {
    public static final int a(PagerLayoutInfo pagerLayoutInfo) {
        return (int) (pagerLayoutInfo.e() == Orientation.Vertical ? pagerLayoutInfo.c() & 4294967295L : pagerLayoutInfo.c() >> 32);
    }
}
