package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BitVector {

    /* renamed from: a  reason: collision with root package name */
    public long f14536a;

    /* renamed from: b  reason: collision with root package name */
    public long f14537b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f14538c;

    public final boolean a(int i2) {
        int i3;
        if (i2 < 64) {
            return ((1 << i2) & this.f14536a) != 0;
        } else if (i2 < 128) {
            return ((1 << (i2 - 64)) & this.f14537b) != 0;
        } else {
            long[] jArr = this.f14538c;
            int length = jArr.length;
            if (length == 0 || (i2 / 64) - 2 >= length) {
                return false;
            }
            return ((1 << (i2 % 64)) & jArr[i3]) != 0;
        }
    }

    public final int b() {
        return (this.f14538c.length + 2) * 64;
    }

    public final int c(int i2) {
        int numberOfTrailingZeros;
        if (i2 < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.f14536a) >>> i2) << i2)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i2 < 128) {
            int i3 = i2 - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.f14537b) >>> i3) << i3);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i2, 128);
        int i4 = (max / 64) - 2;
        long[] jArr = this.f14538c;
        int length = jArr.length;
        for (int i5 = i4; i5 < length; i5++) {
            long j2 = ~jArr[i5];
            if (i5 == i4) {
                int i6 = max % 64;
                j2 = (j2 >>> i6) << i6;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j2);
            if (numberOfTrailingZeros3 < 64) {
                return (i5 * 64) + 128 + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitVector [");
        int b2 = b();
        boolean z2 = true;
        for (int i2 = 0; i2 < b2; i2++) {
            if (a(i2)) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(i2);
                z2 = false;
            }
        }
        sb.append(']');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }
}
