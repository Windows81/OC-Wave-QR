package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

@Metadata
public final class IntSizeKt {
    public static final long a(int i2, int i3) {
        return IntSize.c((((long) i3) & 4294967295L) | (((long) i2) << 32));
    }

    public static final long b(long j2) {
        return IntOffset.f((((j2 << 32) >> 33) & 4294967295L) | ((j2 >> 33) << 32));
    }

    public static final long c(long j2) {
        int round = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return IntSize.c((((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) round) << 32));
    }

    public static final long d(long j2) {
        return IntSize.c((((long) ((int) Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (j2 >> 32)))) << 32));
    }

    public static final long e(long j2) {
        return Size.d((((long) Float.floatToRawIntBits((float) ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (j2 >> 32)))) << 32));
    }
}
