package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

@Metadata
public final class IntervalListKt {
    public static final int b(MutableVector mutableVector, int i2) {
        int p2 = mutableVector.p() - 1;
        int i3 = 0;
        while (i3 < p2) {
            int i4 = ((p2 - i3) / 2) + i3;
            int b2 = ((IntervalList.Interval) mutableVector.f15005z[i4]).b();
            if (b2 == i2) {
                return i4;
            }
            if (b2 < i2) {
                i3 = i4 + 1;
                if (i2 < ((IntervalList.Interval) mutableVector.f15005z[i3]).b()) {
                    return i4;
                }
            } else {
                p2 = i4 - 1;
            }
        }
        return i3;
    }
}
