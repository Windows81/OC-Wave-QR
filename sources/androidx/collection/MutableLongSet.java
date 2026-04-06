package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableLongSet extends LongSet {

    /* renamed from: e  reason: collision with root package name */
    public int f1893e;

    public MutableLongSet(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        k(ScatterMapKt.f(i2));
    }

    public final void e() {
        if (this.f1837c <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1838d) * 32), ULong.f(ULong.f((long) this.f1837c) * 25)) > 0) {
            o(ScatterMapKt.d(this.f1837c));
        } else {
            f();
        }
    }

    public final void f() {
        long[] jArr = this.f1835a;
        int i2 = this.f1837c;
        long[] jArr2 = this.f1836b;
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
                    } else {
                        jArr[i12] = (((long) (i9 & 127)) << i13) | ((~(255 << i13)) & j5);
                        long j6 = jArr2[h2];
                        jArr2[h2] = jArr2[i6];
                        jArr2[i6] = j6;
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
        i();
    }

    public final int g(long j2) {
        int hashCode = Long.hashCode(j2) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1837c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1835a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (long) i4;
            int i10 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & -9187201950435737472L; j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i6) & i5;
                if (this.f1836b[numberOfTrailingZeros] == j2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & -9187201950435737472L) != 0) {
                int h2 = h(i3);
                if (this.f1893e == 0 && ((this.f1835a[h2 >> 3] >> ((h2 & 7) << 3)) & 255) != 254) {
                    e();
                    h2 = h(i3);
                }
                this.f1838d++;
                int i11 = this.f1893e;
                long[] jArr2 = this.f1835a;
                int i12 = h2 >> 3;
                long j7 = jArr2[i12];
                int i13 = (h2 & 7) << 3;
                this.f1893e = i11 - (((j7 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1837c;
                long j8 = ((~(255 << i13)) & j7) | (j4 << i13);
                jArr2[i12] = j8;
                jArr2[(((h2 - 7) & i14) + (i14 & 7)) >> 3] = j8;
                return h2;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int h(int i2) {
        int i3 = this.f1837c;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1835a;
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

    public final void i() {
        this.f1893e = ScatterMapKt.b(b()) - this.f1838d;
    }

    public final void j(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1835a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        i();
    }

    public final void k(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1837c = max;
        j(max);
        this.f1836b = new long[max];
    }

    public final void l(long j2) {
        this.f1836b[g(j2)] = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f1837c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.f1835a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L_0x0042:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x005f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f1836b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x0059
            goto L_0x0069
        L_0x0059:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L_0x0042
        L_0x005f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            r10 = -1
        L_0x0069:
            if (r10 < 0) goto L_0x006c
            r4 = r11
        L_0x006c:
            if (r4 == 0) goto L_0x0071
            r0.n(r10)
        L_0x0071:
            return r4
        L_0x0072:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.m(long):boolean");
    }

    public final void n(int i2) {
        this.f1838d--;
        long[] jArr = this.f1835a;
        int i3 = this.f1837c;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
    }

    public final void o(int i2) {
        long[] jArr = this.f1835a;
        long[] jArr2 = this.f1836b;
        int i3 = this.f1837c;
        k(i2);
        long[] jArr3 = this.f1835a;
        long[] jArr4 = this.f1836b;
        int i4 = this.f1837c;
        for (int i5 = 0; i5 < i3; i5++) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j2 = jArr2[i5];
                int hashCode = Long.hashCode(j2) * -862048943;
                int i6 = hashCode ^ (hashCode << 16);
                int h2 = h(i6 >>> 7);
                long j3 = (long) (i6 & 127);
                int i7 = h2 >> 3;
                int i8 = (h2 & 7) << 3;
                long j4 = (jArr3[i7] & (~(255 << i8))) | (j3 << i8);
                jArr3[i7] = j4;
                jArr3[(((h2 - 7) & i4) + (i4 & 7)) >> 3] = j4;
                jArr4[h2] = j2;
            }
        }
    }
}
