package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {

    /* renamed from: f  reason: collision with root package name */
    public int f1882f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableIntObjectMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void f() {
        if (this.f1795d <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1796e) * 32), ULong.f(ULong.f((long) this.f1795d) * 25)) > 0) {
            q(ScatterMapKt.d(this.f1795d));
        } else {
            h();
        }
    }

    public final void g() {
        this.f1796e = 0;
        long[] jArr = this.f1792a;
        if (jArr != ScatterMapKt.f1964a) {
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f1792a;
            int i2 = this.f1795d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt.w(this.f1794c, (Object) null, 0, this.f1795d);
        k();
    }

    public final void h() {
        long[] jArr = this.f1792a;
        int i2 = this.f1795d;
        int[] iArr = this.f1793b;
        Object[] objArr = this.f1794c;
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
                        iArr[j5] = iArr[i6];
                        iArr[i6] = 0;
                        objArr[j5] = objArr[i6];
                        objArr[i6] = null;
                    } else {
                        jArr[i12] = (((long) (i9 & 127)) << i13) | ((~(255 << i13)) & j6);
                        int i15 = iArr[j5];
                        iArr[j5] = iArr[i6];
                        iArr[i6] = i15;
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

    public final int i(int i2) {
        int hashCode = Integer.hashCode(i2) * -862048943;
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f1795d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f1792a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j2 = ((jArr[i9 + 1] << (64 - i10)) & ((-((long) i10)) >> 63)) | (jArr[i9] >>> i10);
            long j3 = (long) i5;
            int i11 = i8;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i6;
                if (this.f1793b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
            }
            int i12 = i2;
            if ((((~j2) << 6) & j2 & -9187201950435737472L) != 0) {
                int j6 = j(i4);
                if (this.f1882f == 0 && ((this.f1792a[j6 >> 3] >> ((j6 & 7) << 3)) & 255) != 254) {
                    f();
                    j6 = j(i4);
                }
                this.f1796e++;
                int i13 = this.f1882f;
                long[] jArr2 = this.f1792a;
                int i14 = j6 >> 3;
                long j7 = jArr2[i14];
                int i15 = (j6 & 7) << 3;
                this.f1882f = i13 - (((j7 >> i15) & 255) == 128 ? 1 : 0);
                int i16 = this.f1795d;
                long j8 = ((~(255 << i15)) & j7) | (j3 << i15);
                jArr2[i14] = j8;
                jArr2[(((j6 - 7) & i16) + (i16 & 7)) >> 3] = j8;
                return j6;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final int j(int i2) {
        int i3 = this.f1795d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1792a;
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
        this.f1882f = ScatterMapKt.b(c()) - this.f1796e;
    }

    public final void l(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1792a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        k();
    }

    public final void m(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1795d = max;
        l(max);
        this.f1793b = new int[max];
        this.f1794c = new Object[max];
    }

    public final Object n(int i2, Object obj) {
        int i3 = i(i2);
        Object[] objArr = this.f1794c;
        Object obj2 = objArr[i3];
        this.f1793b[i3] = i2;
        objArr[i3] = obj;
        return obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f1795d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0013:
            long[] r4 = r13.f1792a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x003f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x005a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f1793b
            r11 = r11[r10]
            if (r11 != r14) goto L_0x0054
            goto L_0x0064
        L_0x0054:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x003f
        L_0x005a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x006d
            r10 = -1
        L_0x0064:
            if (r10 < 0) goto L_0x006b
            java.lang.Object r14 = r13.p(r10)
            return r14
        L_0x006b:
            r14 = 0
            return r14
        L_0x006d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntObjectMap.o(int):java.lang.Object");
    }

    public final Object p(int i2) {
        this.f1796e--;
        long[] jArr = this.f1792a;
        int i3 = this.f1795d;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        Object[] objArr = this.f1794c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void q(int i2) {
        long[] jArr;
        MutableIntObjectMap mutableIntObjectMap = this;
        long[] jArr2 = mutableIntObjectMap.f1792a;
        int[] iArr = mutableIntObjectMap.f1793b;
        Object[] objArr = mutableIntObjectMap.f1794c;
        int i3 = mutableIntObjectMap.f1795d;
        m(i2);
        long[] jArr3 = mutableIntObjectMap.f1792a;
        int[] iArr2 = mutableIntObjectMap.f1793b;
        Object[] objArr2 = mutableIntObjectMap.f1794c;
        int i4 = mutableIntObjectMap.f1795d;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i6 = iArr[i5];
                int hashCode = Integer.hashCode(i6) * -862048943;
                int i7 = hashCode ^ (hashCode << 16);
                int j2 = mutableIntObjectMap.j(i7 >>> 7);
                long j3 = (long) (i7 & 127);
                int i8 = j2 >> 3;
                int i9 = (j2 & 7) << 3;
                jArr = jArr2;
                long j4 = (jArr3[i8] & (~(255 << i9))) | (j3 << i9);
                jArr3[i8] = j4;
                jArr3[(((j2 - 7) & i4) + (i4 & 7)) >> 3] = j4;
                iArr2[j2] = i6;
                objArr2[j2] = objArr[i5];
            } else {
                jArr = jArr2;
            }
            i5++;
            mutableIntObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void r(int i2, Object obj) {
        int i3 = i(i2);
        this.f1793b[i3] = i2;
        this.f1794c[i3] = obj;
    }

    public MutableIntObjectMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        m(ScatterMapKt.f(i2));
    }
}
