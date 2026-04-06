package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {

    /* renamed from: f  reason: collision with root package name */
    public int f1892f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableLongObjectMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void f() {
        if (this.f1832d <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1833e) * 32), ULong.f(ULong.f((long) this.f1832d) * 25)) > 0) {
            q(ScatterMapKt.d(this.f1832d));
        } else {
            h();
        }
    }

    public final void g() {
        this.f1833e = 0;
        long[] jArr = this.f1829a;
        if (jArr != ScatterMapKt.f1964a) {
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f1829a;
            int i2 = this.f1832d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt.w(this.f1831c, (Object) null, 0, this.f1832d);
        k();
    }

    public final void h() {
        long[] jArr = this.f1829a;
        int i2 = this.f1832d;
        long[] jArr2 = this.f1830b;
        Object[] objArr = this.f1831c;
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
                int j5 = j(i10);
                int i11 = i10 & i2;
                if (((j5 - i11) & i2) / 8 == ((i6 - i11) & i2) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[c2] & j3) | Long.MIN_VALUE;
                } else {
                    int i12 = j5 >> 3;
                    long j6 = jArr[i12];
                    int i13 = (j5 & 7) << 3;
                    if (((j6 >> i13) & 255) == 128) {
                        int i14 = i7;
                        jArr[i12] = ((~(255 << i13)) & j6) | (((long) (i9 & 127)) << i13);
                        jArr[i14] = (jArr[i14] & (~(255 << i8))) | (128 << i8);
                        jArr2[j5] = jArr2[i6];
                        jArr2[i6] = 0;
                        objArr[j5] = objArr[i6];
                        objArr[i6] = null;
                    } else {
                        jArr[i12] = (((long) (i9 & 127)) << i13) | ((~(255 << i13)) & j6);
                        long j7 = jArr2[j5];
                        jArr2[j5] = jArr2[i6];
                        jArr2[i6] = j7;
                        Object obj = objArr[j5];
                        objArr[j5] = objArr[i6];
                        objArr[i6] = obj;
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
        k();
    }

    public final int i(long j2) {
        int hashCode = Long.hashCode(j2) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1832d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1829a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (long) i4;
            int i10 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & -9187201950435737472L; j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i6) & i5;
                if (this.f1830b[numberOfTrailingZeros] == j2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & -9187201950435737472L) != 0) {
                int j7 = j(i3);
                if (this.f1892f == 0 && ((this.f1829a[j7 >> 3] >> ((j7 & 7) << 3)) & 255) != 254) {
                    f();
                    j7 = j(i3);
                }
                this.f1833e++;
                int i11 = this.f1892f;
                long[] jArr2 = this.f1829a;
                int i12 = j7 >> 3;
                long j8 = jArr2[i12];
                int i13 = (j7 & 7) << 3;
                this.f1892f = i11 - (((j8 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1832d;
                long j9 = ((~(255 << i13)) & j8) | (j4 << i13);
                jArr2[i12] = j9;
                jArr2[(((j7 - 7) & i14) + (i14 & 7)) >> 3] = j9;
                return j7;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int j(int i2) {
        int i3 = this.f1832d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1829a;
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

    public final void k() {
        this.f1892f = ScatterMapKt.b(c()) - this.f1833e;
    }

    public final void l(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1829a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        k();
    }

    public final void m(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1832d = max;
        l(max);
        this.f1830b = new long[max];
        this.f1831c = new Object[max];
    }

    public final Object n(long j2, Object obj) {
        int i2 = i(j2);
        Object[] objArr = this.f1831c;
        Object obj2 = objArr[i2];
        this.f1830b[i2] = j2;
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
        if (((r5 & ((~r5) << 6)) & -9187201950435737472L) == 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = java.lang.Long.hashCode(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f1832d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L_0x0014:
            long[] r5 = r0.f1829a
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L_0x0040:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x005d
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.f1830b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0040
        L_0x005d:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0070
            r11 = -1
        L_0x0067:
            if (r11 < 0) goto L_0x006e
            java.lang.Object r1 = r15.p(r11)
            return r1
        L_0x006e:
            r1 = 0
            return r1
        L_0x0070:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.o(long):java.lang.Object");
    }

    public final Object p(int i2) {
        this.f1833e--;
        long[] jArr = this.f1829a;
        int i3 = this.f1832d;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        Object[] objArr = this.f1831c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void q(int i2) {
        long[] jArr;
        MutableLongObjectMap mutableLongObjectMap = this;
        long[] jArr2 = mutableLongObjectMap.f1829a;
        long[] jArr3 = mutableLongObjectMap.f1830b;
        Object[] objArr = mutableLongObjectMap.f1831c;
        int i3 = mutableLongObjectMap.f1832d;
        m(i2);
        long[] jArr4 = mutableLongObjectMap.f1829a;
        long[] jArr5 = mutableLongObjectMap.f1830b;
        Object[] objArr2 = mutableLongObjectMap.f1831c;
        int i4 = mutableLongObjectMap.f1832d;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j2 = jArr3[i5];
                int hashCode = Long.hashCode(j2) * -862048943;
                int i6 = hashCode ^ (hashCode << 16);
                int j3 = mutableLongObjectMap.j(i6 >>> 7);
                long j4 = (long) (i6 & 127);
                int i7 = j3 >> 3;
                int i8 = (j3 & 7) << 3;
                jArr = jArr2;
                long j5 = (jArr4[i7] & (~(255 << i8))) | (j4 << i8);
                jArr4[i7] = j5;
                jArr4[(((j3 - 7) & i4) + (i4 & 7)) >> 3] = j5;
                jArr5[j3] = j2;
                objArr2[j3] = objArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableLongObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void r(long j2, Object obj) {
        int i2 = i(j2);
        this.f1830b[i2] = j2;
        this.f1831c[i2] = obj;
    }

    public MutableLongObjectMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        m(ScatterMapKt.f(i2));
    }
}
