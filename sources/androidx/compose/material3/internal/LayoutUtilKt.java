package androidx.compose.material3.internal;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class LayoutUtilKt {
    public static final int a(Placeable placeable) {
        if (placeable != null) {
            return placeable.C0();
        }
        return 0;
    }

    public static final Object b(IntrinsicMeasurable intrinsicMeasurable) {
        Object t2 = intrinsicMeasurable.t();
        LayoutIdParentData layoutIdParentData = t2 instanceof LayoutIdParentData ? (LayoutIdParentData) t2 : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.u0();
        }
        return null;
    }

    public static final int c(Placeable placeable) {
        if (placeable != null) {
            return placeable.L0();
        }
        return 0;
    }

    public static final int d(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : RangesKt.e(i2 - i3, 0);
    }
}
