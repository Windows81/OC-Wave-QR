package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableLongIntMap extends LongIntMap {

    /* renamed from: f  reason: collision with root package name */
    public int f1890f;

    public MutableLongIntMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        l(ScatterMapKt.f(i2));
    }

    public final void f() {
        if (this.f1815d <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1816e) * 32), ULong.f(ULong.f((long) this.f1815d) * 25)) > 0) {
            m(ScatterMapKt.d(this.f1815d));
        } else {
            g();
        }
    }

    public final void g() {
        long[] jArr = this.f1812a;
        int i2 = this.f1815d;
        long[] jArr2 = this.f1813b;
        int[] iArr = this.f1814c;
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
                int hashCode = Long.hashCode(jArr2[i6]) * -862048943;
                int i9 = hashCode ^ (hashCode << 16);
                int i10 = i9 >>> 7;
                int h2 = h(i10);
                int i11 = i10 & i2;
                if (((h2 - i11) & i2) / 8 == ((i6 - i11) & i2) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[c2] & j3) | Long.MIN_VALUE;
                } else {
                    int i12 = h2 >> 3;
                    long j5 = jArr[i12];
                    int i13 = (h2 & 7) << 3;
                    if (((j5 >> i13) & 255) == 128) {
                        int i14 = i7;
                        jArr[i12] = ((~(255 << i13)) & j5) | (((long) (i9 & 127)) << i13);
                        jArr[i14] = (jArr[i14] & (~(255 << i8))) | (128 << i8);
                        jArr2[h2] = jArr2[i6];
                        jArr2[i6] = 0;
                        iArr[h2] = iArr[i6];
                        iArr[i6] = 0;
                    } else {
                        jArr[i12] = (((long) (i9 & 127)) << i13) | ((~(255 << i13)) & j5);
                        long j6 = jArr2[h2];
                        jArr2[h2] = jArr2[i6];
                        jArr2[i6] = j6;
                        int i15 = iArr[h2];
                        iArr[h2] = iArr[i6];
                        iArr[i6] = i15;
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
        j();
    }

    public final int h(int i2) {
        int i3 = this.f1815d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1812a;
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

    public final int i(long j2) {
        int hashCode = Long.hashCode(j2) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1815d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1812a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (long) i4;
            int i10 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & -9187201950435737472L; j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i6) & i5;
                if (this.f1813b[numberOfTrailingZeros] == j2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & -9187201950435737472L) != 0) {
                int h2 = h(i3);
                if (this.f1890f == 0 && ((this.f1812a[h2 >> 3] >> ((h2 & 7) << 3)) & 255) != 254) {
                    f();
                    h2 = h(i3);
                }
                this.f1816e++;
                int i11 = this.f1890f;
                long[] jArr2 = this.f1812a;
                int i12 = h2 >> 3;
                long j7 = jArr2[i12];
                int i13 = (h2 & 7) << 3;
                this.f1890f = i11 - (((j7 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1815d;
                long j8 = ((~(255 << i13)) & j7) | (j4 << i13);
                jArr2[i12] = j8;
                jArr2[(((h2 - 7) & i14) + (i14 & 7)) >> 3] = j8;
                return ~h2;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final void j() {
        this.f1890f = ScatterMapKt.b(c()) - this.f1816e;
    }

    public final void k(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1812a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        j();
    }

    public final void l(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1815d = max;
        k(max);
        this.f1813b = new long[max];
        this.f1814c = new int[max];
    }

    public final void m(int i2) {
        long[] jArr;
        MutableLongIntMap mutableLongIntMap = this;
        long[] jArr2 = mutableLongIntMap.f1812a;
        long[] jArr3 = mutableLongIntMap.f1813b;
        int[] iArr = mutableLongIntMap.f1814c;
        int i3 = mutableLongIntMap.f1815d;
        l(i2);
        long[] jArr4 = mutableLongIntMap.f1812a;
        long[] jArr5 = mutableLongIntMap.f1813b;
        int[] iArr2 = mutableLongIntMap.f1814c;
        int i4 = mutableLongIntMap.f1815d;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j2 = jArr3[i5];
                int hashCode = Long.hashCode(j2) * -862048943;
                int i6 = hashCode ^ (hashCode << 16);
                int h2 = mutableLongIntMap.h(i6 >>> 7);
                long j3 = (long) (i6 & 127);
                int i7 = h2 >> 3;
                int i8 = (h2 & 7) << 3;
                jArr = jArr2;
                long j4 = (jArr4[i7] & (~(255 << i8))) | (j3 << i8);
                jArr4[i7] = j4;
                jArr4[(((h2 - 7) & i4) + (i4 & 7)) >> 3] = j4;
                jArr5[h2] = j2;
                iArr2[h2] = iArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableLongIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void n(long j2, int i2) {
        int i3 = i(j2);
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.f1813b[i3] = j2;
        this.f1814c[i3] = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableLongIntMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }
}
