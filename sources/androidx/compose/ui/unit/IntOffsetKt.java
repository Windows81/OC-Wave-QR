package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Metadata
public final class IntOffsetKt {
    public static final long a(int i2, int i3) {
        return IntOffset.f((((long) i3) & 4294967295L) | (((long) i2) << 32));
    }

    public static final long b(long j2, long j3) {
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - ((float) IntOffset.k(j3)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - ((float) IntOffset.l(j3)))) & 4294967295L));
    }

    public static final long c(long j2, long j3) {
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((float) IntOffset.k(j3)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((float) IntOffset.l(j3)))) & 4294967295L));
    }

    public static final long d(long j2) {
        int round = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return IntOffset.f((((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) round) << 32));
    }
}
