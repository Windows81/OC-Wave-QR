package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableIntIntMap extends IntIntMap {

    /* renamed from: f  reason: collision with root package name */
    public int f1880f;

    public MutableIntIntMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        o(ScatterMapKt.f(i2));
    }

    public final void h() {
        if (this.f1779d <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1780e) * 32), ULong.f(ULong.f((long) this.f1779d) * 25)) > 0) {
            p(ScatterMapKt.d(this.f1779d));
        } else {
            j();
        }
    }

    public final void i() {
        this.f1780e = 0;
        long[] jArr = this.f1776a;
        if (jArr != ScatterMapKt.f1964a) {
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f1776a;
            int i2 = this.f1779d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        m();
    }

    public final void j() {
        long[] jArr = this.f1776a;
        int i2 = this.f1779d;
        int[] iArr = this.f1777b;
        int[] iArr2 = this.f1778c;
        int i3 = (i2 + 7) >> 3;
        char c2 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            long j2 = jArr[i4] & -9187201950435737472L;
            jArr[i4] = -72340172838076674L & ((~j2) + (j2 >>> 7));
        }
        int l0 = ArraysKt.l0(jArr);
        int i5 = l0 - 1;
        long j3 = 72057594037927935L;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | -72057594037927936L;
        jArr[l0] = jArr[0];
        int i6 = 0;
        while (i6 != i2) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j4 = (jArr[i7] >> i8) & 255;
            if (j4 != 128 && j4 == 254) {
                int hashCode = Integer.hashCode(iArr[i6]) * -862048943;
                int i9 = hashCode ^ (hashCode << 16);
                int i10 = i9 >>> 7;
                int k2 = k(i10);
                int i11 = i10 & i2;
                if (((k2 - i11) & i2) / 8 == ((i6 - i11) & i2) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[c2] & j3) | Long.MIN_VALUE;
                } else {
                    int i12 = k2 >> 3;
                    long j5 = jArr[i12];
                    int i13 = (k2 & 7) << 3;
                    if (((j5 >> i13) & 255) == 128) {
                        int i14 = i7;
                        jArr[i12] = ((~(255 << i13)) & j5) | (((long) (i9 & 127)) << i13);
                        jArr[i14] = (jArr[i14] & (~(255 << i8))) | (128 << i8);
                        iArr[k2] = iArr[i6];
                        iArr[i6] = 0;
                        iArr2[k2] = iArr2[i6];
                        iArr2[i6] = 0;
                    } else {
                        jArr[i12] = (((long) (i9 & 127)) << i13) | ((~(255 << i13)) & j5);
                        int i15 = iArr[k2];
                        iArr[k2] = iArr[i6];
                        iArr[i6] = i15;
                        int i16 = iArr2[k2];
                        iArr2[k2] = iArr2[i6];
                        iArr2[i6] = i16;
                        i6--;
                    }
                    j3 = 72057594037927935L;
                    jArr[ArraysKt.l0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i6++;
                    c2 = 0;
                }
            }
            i6++;
        }
        m();
    }

    public final int k(int i2) {
        int i3 = this.f1779d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1776a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-((long) i7)) >> 63)) | (jArr[i6] >>> i7);
            long j3 = j2 & ((~j2) << 7) & -9187201950435737472L;
            if (j3 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j3) >> 3)) & i3;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int l(int i2) {
        int hashCode = Integer.hashCode(i2) * -862048943;
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f1779d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f1776a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j2 = ((jArr[i9 + 1] << (64 - i10)) & ((-((long) i10)) >> 63)) | (jArr[i9] >>> i10);
            long j3 = (long) i5;
            int i11 = i8;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i6;
                if (this.f1777b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
            }
            int i12 = i2;
            if ((((~j2) << 6) & j2 & -9187201950435737472L) != 0) {
                int k2 = k(i4);
                if (this.f1880f == 0 && ((this.f1776a[k2 >> 3] >> ((k2 & 7) << 3)) & 255) != 254) {
                    h();
                    k2 = k(i4);
                }
                this.f1780e++;
                int i13 = this.f1880f;
                long[] jArr2 = this.f1776a;
                int i14 = k2 >> 3;
                long j6 = jArr2[i14];
                int i15 = (k2 & 7) << 3;
                this.f1880f = i13 - (((j6 >> i15) & 255) == 128 ? 1 : 0);
                int i16 = this.f1779d;
                long j7 = ((~(255 << i15)) & j6) | (j3 << i15);
                jArr2[i14] = j7;
                jArr2[(((k2 - 7) & i16) + (i16 & 7)) >> 3] = j7;
                return ~k2;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final void m() {
        this.f1880f = ScatterMapKt.b(d()) - this.f1780e;
    }

    public final void n(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1776a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        m();
    }

    public final void o(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1779d = max;
        n(max);
        this.f1777b = new int[max];
        this.f1778c = new int[max];
    }

    public final void p(int i2) {
        long[] jArr;
        MutableIntIntMap mutableIntIntMap = this;
        long[] jArr2 = mutableIntIntMap.f1776a;
        int[] iArr = mutableIntIntMap.f1777b;
        int[] iArr2 = mutableIntIntMap.f1778c;
        int i3 = mutableIntIntMap.f1779d;
        o(i2);
        long[] jArr3 = mutableIntIntMap.f1776a;
        int[] iArr3 = mutableIntIntMap.f1777b;
        int[] iArr4 = mutableIntIntMap.f1778c;
        int i4 = mutableIntIntMap.f1779d;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i6 = iArr[i5];
                int hashCode = Integer.hashCode(i6) * -862048943;
                int i7 = hashCode ^ (hashCode << 16);
                int k2 = mutableIntIntMap.k(i7 >>> 7);
                long j2 = (long) (i7 & 127);
                int i8 = k2 >> 3;
                int i9 = (k2 & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr3[i8] & (~(255 << i9))) | (j2 << i9);
                jArr3[i8] = j3;
                jArr3[(((k2 - 7) & i4) + (i4 & 7)) >> 3] = j3;
                iArr3[k2] = i6;
                iArr4[k2] = iArr2[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableIntIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void q(int i2, int i3) {
        int l2 = l(i2);
        if (l2 < 0) {
            l2 = ~l2;
        }
        this.f1777b[l2] = i2;
        this.f1778c[l2] = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableIntIntMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }
}
