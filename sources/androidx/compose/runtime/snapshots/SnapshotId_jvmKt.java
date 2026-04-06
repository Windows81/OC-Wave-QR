package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class SnapshotId_jvmKt {
    public static final int a(long[] jArr, long j2) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = (j2 > jArr[i3] ? 1 : (j2 == jArr[i3] ? 0 : -1));
            if (i4 > 0) {
                i2 = i3 + 1;
            } else if (i4 >= 0) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final long[] b(int i2) {
        return new long[i2];
    }

    public static final long c(int i2) {
        return (long) i2;
    }

    public static final long[] d(long[] jArr, int i2, long j2) {
        int length = jArr.length;
        long[] jArr2 = new long[(length + 1)];
        ArraysKt.k(jArr, jArr2, 0, 0, i2);
        ArraysKt.k(jArr, jArr2, i2 + 1, i2, length);
        jArr2[i2] = j2;
        return jArr2;
    }

    public static final long[] e(long[] jArr, int i2) {
        int length = jArr.length;
        int i3 = length - 1;
        if (i3 == 0) {
            return null;
        }
        long[] jArr2 = new long[i3];
        if (i2 > 0) {
            ArraysKt.k(jArr, jArr2, 0, 0, i2);
        }
        if (i2 < i3) {
            ArraysKt.k(jArr, jArr2, i2, i2 + 1, length);
        }
        return jArr2;
    }
}
