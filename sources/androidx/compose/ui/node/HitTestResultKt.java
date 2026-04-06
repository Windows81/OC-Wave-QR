package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata
public final class HitTestResultKt {
    public static final long a(float f2, boolean z2, boolean z3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        long j2 = 0;
        long j3 = z2 ? 1 : 0;
        if (z3) {
            j2 = 2;
        }
        return DistanceAndFlags.b(((j3 | j2) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static /* synthetic */ long b(float f2, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return a(f2, z2, z3);
    }
}
