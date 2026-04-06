package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {

    /* renamed from: h  reason: collision with root package name */
    public int f1907h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableOrderedScatterSet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void A(int i2) {
        Object[] objArr;
        long[] jArr;
        long[] jArr2 = this.f1948a;
        Object[] objArr2 = this.f1949b;
        long[] jArr3 = this.f1950c;
        int i3 = this.f1953f;
        int[] iArr = new int[i3];
        s(i2);
        long[] jArr4 = this.f1948a;
        Object[] objArr3 = this.f1949b;
        long[] jArr5 = this.f1950c;
        int i4 = this.f1953f;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i5];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i6 = hashCode ^ (hashCode << 16);
                int n2 = n(i6 >>> 7);
                long j2 = (long) (i6 & 127);
                int i7 = n2 >> 3;
                int i8 = (n2 & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j3 = (jArr4[i7] & (~(255 << i8))) | (j2 << i8);
                jArr4[i7] = j3;
                jArr4[(((n2 - 7) & i4) + (i4 & 7)) >> 3] = j3;
                objArr3[n2] = obj;
                jArr5[n2] = jArr3[i5];
                iArr[i5] = n2;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i5++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        o(iArr);
    }

    public final boolean B(Collection collection) {
        Collection collection2 = collection;
        Intrinsics.i(collection2, "elements");
        Object[] objArr = this.f1949b;
        int i2 = this.f1954g;
        long[] jArr = this.f1948a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!CollectionsKt.W(collection2, objArr[i6])) {
                                z(i6);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != this.f1954g;
    }

    public final void C(int i2) {
        long[] jArr = this.f1950c;
        for (int i3 = this.f1951d; i3 != Integer.MAX_VALUE && (r2 = this.f1954g) > i2 && r2 != 0; i3 = (int) (jArr[i3] & 2147483647L)) {
            z(i3);
        }
    }

    public final boolean g(Object obj) {
        int c2 = c();
        int m2 = m(obj);
        this.f1949b[m2] = obj;
        long[] jArr = this.f1950c;
        int i2 = this.f1951d;
        jArr[m2] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) m2) & 2147483647L) << 31) | (jArr[i2] & -4611686016279904257L);
        }
        this.f1951d = m2;
        if (this.f1952e == Integer.MAX_VALUE) {
            this.f1952e = m2;
        }
        return c() != c2;
    }

    public final boolean h(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        int c2 = c();
        v(iterable);
        return c2 != c();
    }

    public final void i() {
        if (this.f1953f <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1954g) * 32), ULong.f(ULong.f((long) this.f1953f) * 25)) > 0) {
            A(ScatterMapKt.d(this.f1953f));
        } else {
            l();
        }
    }

    public final Set j() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void k() {
        this.f1954g = 0;
        long[] jArr = this.f1948a;
        if (jArr != ScatterMapKt.f1964a) {
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f1948a;
            int i2 = this.f1953f;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt.w(this.f1949b, (Object) null, 0, this.f1953f);
        ArraysKt.y(this.f1950c, 4611686018427387903L, 0, 0, 6, (Object) null);
        this.f1951d = Integer.MAX_VALUE;
        this.f1952e = Integer.MAX_VALUE;
        q();
    }

    public final void l() {
        long[] jArr;
        long[] jArr2;
        char c2;
        long[] jArr3 = this.f1948a;
        if (jArr3 != null) {
            int i2 = this.f1953f;
            Object[] objArr = this.f1949b;
            long[] jArr4 = this.f1950c;
            long[] jArr5 = new long[i2];
            int i3 = 0;
            ArraysKt.v(jArr5, 9223372034707292159L, 0, i2);
            int i4 = (i2 + 7) >> 3;
            for (int i5 = 0; i5 < i4; i5++) {
                long j2 = jArr3[i5] & -9187201950435737472L;
                jArr3[i5] = -72340172838076674L & ((~j2) + (j2 >>> 7));
            }
            int l0 = ArraysKt.l0(jArr3);
            int i6 = l0 - 1;
            jArr3[i6] = (jArr3[i6] & 72057594037927935L) | -72057594037927936L;
            jArr3[l0] = jArr3[0];
            int i7 = 0;
            while (i7 != i2) {
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j3 = (jArr3[i8] >> i9) & 255;
                if (j3 != 128 && j3 == 254) {
                    Object obj = objArr[i7];
                    int hashCode = (obj != null ? obj.hashCode() : i3) * -862048943;
                    int i10 = hashCode ^ (hashCode << 16);
                    int i11 = i10 >>> 7;
                    int n2 = n(i11);
                    int i12 = i11 & i2;
                    if (((n2 - i12) & i2) / 8 == ((i7 - i12) & i2) / 8) {
                        jArr3[i8] = (((long) (i10 & 127)) << i9) | (jArr3[i8] & (~(255 << i9)));
                        if (jArr5[i7] == 9223372034707292159L) {
                            long j4 = (long) i7;
                            jArr5[i7] = j4 | (j4 << 32);
                        }
                        jArr3[jArr3.length - 1] = jArr3[0];
                        i7++;
                        i3 = 0;
                    } else {
                        int i13 = n2 >> 3;
                        long j5 = jArr3[i13];
                        int i14 = (n2 & 7) << 3;
                        if (((j5 >> i14) & 255) == 128) {
                            int i15 = i9;
                            jArr2 = jArr4;
                            jArr = jArr5;
                            jArr3[i13] = (j5 & (~(255 << i14))) | (((long) (i10 & 127)) << i14);
                            jArr3[i8] = (jArr3[i8] & (~(255 << i15))) | (128 << i15);
                            objArr[n2] = objArr[i7];
                            objArr[i7] = null;
                            jArr2[n2] = jArr2[i7];
                            jArr2[i7] = 4611686018427387903L;
                            int i16 = (int) ((jArr[i7] >> 32) & 4294967295L);
                            if (i16 != Integer.MAX_VALUE) {
                                jArr[i16] = (jArr[i16] & -4294967296L) | ((long) n2);
                                jArr[i7] = (jArr[i7] & 4294967295L) | -4294967296L;
                                c2 = ' ';
                            } else {
                                c2 = ' ';
                                jArr[i7] = (((long) Integer.MAX_VALUE) << 32) | ((long) n2);
                            }
                            jArr[n2] = ((long) Integer.MAX_VALUE) | (((long) i7) << c2);
                        } else {
                            jArr2 = jArr4;
                            jArr = jArr5;
                            jArr3[i13] = (((long) (i10 & 127)) << i14) | (j5 & (~(255 << i14)));
                            Object obj2 = objArr[n2];
                            objArr[n2] = objArr[i7];
                            objArr[i7] = obj2;
                            long j6 = jArr2[n2];
                            jArr2[n2] = jArr2[i7];
                            jArr2[i7] = j6;
                            int i17 = (int) ((jArr[i7] >> 32) & 4294967295L);
                            if (i17 != Integer.MAX_VALUE) {
                                long j7 = (long) n2;
                                jArr[i17] = (jArr[i17] & -4294967296L) | j7;
                                jArr[i7] = (jArr[i7] & 4294967295L) | (j7 << 32);
                            } else {
                                long j8 = (long) n2;
                                jArr[i7] = j8 | (j8 << 32);
                                i17 = i7;
                            }
                            jArr[n2] = (((long) i17) << 32) | ((long) i7);
                            i7--;
                        }
                        jArr3[jArr3.length - 1] = jArr3[0];
                        i7++;
                        i3 = 0;
                        jArr4 = jArr2;
                        jArr5 = jArr;
                    }
                } else {
                    i7++;
                }
            }
            q();
            p(jArr5);
        }
    }

    public final int m(Object obj) {
        Object obj2 = obj;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1953f;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1948a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (long) i4;
            int i10 = i4;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                if (Intrinsics.d(this.f1949b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & -9187201950435737472L) != 0) {
                int n2 = n(i3);
                if (this.f1907h == 0 && ((this.f1948a[n2 >> 3] >> ((n2 & 7) << 3)) & 255) != 254) {
                    i();
                    n2 = n(i3);
                }
                this.f1954g++;
                int i11 = this.f1907h;
                long[] jArr2 = this.f1948a;
                int i12 = n2 >> 3;
                long j6 = jArr2[i12];
                int i13 = (n2 & 7) << 3;
                this.f1907h = i11 - (((j6 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1953f;
                long j7 = ((~(255 << i13)) & j6) | (j3 << i13);
                jArr2[i12] = j7;
                jArr2[(((n2 - 7) & i14) + (i14 & 7)) >> 3] = j7;
                return n2;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
    }

    public final int n(int i2) {
        int i3 = this.f1953f;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1948a;
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

    public final void o(int[] iArr) {
        long[] jArr = this.f1950c;
        int length = jArr.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            if (i2 >= length) {
                break;
            }
            long j2 = jArr[i2];
            int i4 = (int) ((j2 >> 31) & 2147483647L);
            int i5 = (int) (j2 & 2147483647L);
            long j3 = ((j2 & -4611686018427387904L) | ((long) (i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i4]))) << 31;
            if (i5 != Integer.MAX_VALUE) {
                i3 = iArr[i5];
            }
            jArr[i2] = j3 | ((long) i3);
            i2++;
        }
        int i6 = this.f1951d;
        if (i6 != Integer.MAX_VALUE) {
            this.f1951d = iArr[i6];
        }
        int i7 = this.f1952e;
        if (i7 != Integer.MAX_VALUE) {
            this.f1952e = iArr[i7];
        }
    }

    public final void p(long[] jArr) {
        long[] jArr2 = this.f1950c;
        int length = jArr2.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            if (i2 >= length) {
                break;
            }
            long j2 = jArr2[i2];
            int i4 = (int) ((j2 >> 31) & 2147483647L);
            int i5 = (int) (j2 & 2147483647L);
            long j3 = ((j2 & -4611686018427387904L) | ((long) (i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i4] & 4294967295L)))) << 31;
            if (i5 != Integer.MAX_VALUE) {
                i3 = (int) (4294967295L & jArr[i5]);
            }
            jArr2[i2] = ((long) i3) | j3;
            i2++;
        }
        int i6 = this.f1951d;
        if (i6 != Integer.MAX_VALUE) {
            this.f1951d = (int) (jArr[i6] & 4294967295L);
        }
        int i7 = this.f1952e;
        if (i7 != Integer.MAX_VALUE) {
            this.f1952e = (int) (jArr[i7] & 4294967295L);
        }
    }

    public final void q() {
        this.f1907h = ScatterMapKt.b(b()) - this.f1954g;
    }

    public final void r(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1948a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        q();
    }

    public final void s(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1953f = max;
        r(max);
        this.f1949b = max == 0 ? ContainerHelpersKt.f2008c : new Object[max];
        if (max == 0) {
            jArr = SieveCacheKt.a();
        } else {
            jArr = new long[max];
            ArraysKt.y(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
        }
        this.f1950c = jArr;
    }

    public final void t(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        for (Object u2 : iterable) {
            u(u2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f1953f
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.f1948a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x0043:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0062
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f1949b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r14)
            if (r11 == 0) goto L_0x005c
            goto L_0x006c
        L_0x005c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0043
        L_0x0062:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            r10 = -1
        L_0x006c:
            if (r10 < 0) goto L_0x0071
            r13.z(r10)
        L_0x0071:
            return
        L_0x0072:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.u(java.lang.Object):void");
    }

    public final void v(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        for (Object w2 : iterable) {
            w(w2);
        }
    }

    public final void w(Object obj) {
        int m2 = m(obj);
        this.f1949b[m2] = obj;
        long[] jArr = this.f1950c;
        int i2 = this.f1951d;
        jArr[m2] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) m2) & 2147483647L) << 31) | (jArr[i2] & -4611686016279904257L);
        }
        this.f1951d = m2;
        if (this.f1952e == Integer.MAX_VALUE) {
            this.f1952e = m2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f1953f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.f1948a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0048:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0067
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f1949b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.d(r15, r1)
            if (r15 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0048
        L_0x0067:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x007a
            r11 = -1
        L_0x0071:
            if (r11 < 0) goto L_0x0074
            r2 = r12
        L_0x0074:
            if (r2 == 0) goto L_0x0079
            r0.z(r11)
        L_0x0079:
            return r2
        L_0x007a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.x(java.lang.Object):boolean");
    }

    public final boolean y(Iterable iterable) {
        Intrinsics.i(iterable, "elements");
        int c2 = c();
        t(iterable);
        return c2 != c();
    }

    public final void z(int i2) {
        this.f1954g--;
        long[] jArr = this.f1948a;
        int i3 = this.f1953f;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        this.f1949b[i2] = null;
        long[] jArr2 = this.f1950c;
        long j3 = jArr2[i2];
        int i6 = (int) ((j3 >> 31) & 2147483647L);
        int i7 = (int) (j3 & 2147483647L);
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (jArr2[i6] & -2147483648L) | (((long) i7) & 2147483647L);
        } else {
            this.f1951d = i7;
        }
        if (i7 != Integer.MAX_VALUE) {
            jArr2[i7] = ((((long) i6) & 2147483647L) << 31) | (jArr2[i7] & -4611686016279904257L);
        } else {
            this.f1952e = i6;
        }
        jArr2[i2] = 4611686018427387903L;
    }

    public MutableOrderedScatterSet(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        s(ScatterMapKt.f(i2));
    }
}
