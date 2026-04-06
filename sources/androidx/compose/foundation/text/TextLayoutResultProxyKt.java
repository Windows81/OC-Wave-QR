package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata
public final class TextLayoutResultProxyKt {
    public static final long b(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) < rect.o() ? rect.o() : Float.intBitsToFloat(i2) > rect.p() ? rect.p() : Float.intBitsToFloat(i2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) < rect.r() ? rect.r() : Float.intBitsToFloat(i3) > rect.i() ? rect.i() : Float.intBitsToFloat(i3))) & 4294967295L));
    }
}
