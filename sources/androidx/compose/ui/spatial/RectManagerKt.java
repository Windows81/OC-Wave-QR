package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

@Metadata
public final class RectManagerKt {
    public static final int c(float[] fArr) {
        int i2 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i3 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i2 = 1;
        }
        return (i3 << 1) | i2;
    }

    public static final boolean d(long j2) {
        return !IntOffset.j(j2, IntOffset.f19160b.a());
    }
}
