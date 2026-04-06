package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SieveCache<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f1974a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f1975b;

    /* renamed from: c  reason: collision with root package name */
    public final Function4 f1976c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f1977d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f1978e;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f1979f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f1980g;

    /* renamed from: h  reason: collision with root package name */
    public int f1981h;

    /* renamed from: i  reason: collision with root package name */
    public int f1982i;

    /* renamed from: j  reason: collision with root package name */
    public int f1983j;

    /* renamed from: k  reason: collision with root package name */
    public int f1984k;

    /* renamed from: l  reason: collision with root package name */
    public int f1985l;

    /* renamed from: m  reason: collision with root package name */
    public int f1986m;

    /* renamed from: n  reason: collision with root package name */
    public int f1987n;

    /* renamed from: o  reason: collision with root package name */
    public int f1988o;

    public SieveCache(int i2, int i3, Function2 function2, Function1 function1, Function4 function4) {
        Intrinsics.i(function2, "sizeOf");
        Intrinsics.i(function1, "createValueFromKey");
        Intrinsics.i(function4, "onEntryRemoved");
        this.f1974a = function2;
        this.f1975b = function1;
        this.f1976c = function4;
        this.f1977d = ScatterMapKt.f1964a;
        Object[] objArr = ContainerHelpersKt.f2008c;
        this.f1978e = objArr;
        this.f1979f = objArr;
        this.f1980g = SieveCacheKt.a();
        this.f1986m = Integer.MAX_VALUE;
        this.f1987n = Integer.MAX_VALUE;
        this.f1988o = Integer.MAX_VALUE;
        if (!(i2 > 0)) {
            RuntimeHelpersKt.a("maxSize must be > 0");
        }
        this.f1984k = i2;
        n(ScatterMapKt.f(i3));
    }

    public final void a() {
        if (this.f1981h <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) j()) * 32), ULong.f(ULong.f((long) this.f1981h) * 25)) > 0) {
            q(ScatterMapKt.d(this.f1981h));
        } else {
            b();
        }
    }

    public final void b() {
        char c2;
        long[] jArr = this.f1977d;
        if (jArr != null) {
            int i2 = this.f1981h;
            Object[] objArr = this.f1978e;
            Object[] objArr2 = this.f1979f;
            long[] jArr2 = this.f1980g;
            long[] jArr3 = new long[i2];
            int i3 = 0;
            ArraysKt.v(jArr3, 9223372034707292159L, 0, i2);
            int i4 = (i2 + 7) >> 3;
            for (int i5 = 0; i5 < i4; i5++) {
                long j2 = jArr[i5] & -9187201950435737472L;
                jArr[i5] = -72340172838076674L & ((~j2) + (j2 >>> 7));
            }
            int l0 = ArraysKt.l0(jArr);
            int i6 = l0 - 1;
            jArr[i6] = (jArr[i6] & 72057594037927935L) | -72057594037927936L;
            jArr[l0] = jArr[0];
            int i7 = 0;
            while (i7 != i2) {
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j3 = (jArr[i8] >> i9) & 255;
                if (j3 != 128 && j3 == 254) {
                    Object obj = objArr[i7];
                    int hashCode = (obj != null ? obj.hashCode() : i3) * -862048943;
                    int i10 = hashCode ^ (hashCode << 16);
                    int i11 = i10 >>> 7;
                    int d2 = d(i11);
                    int i12 = i11 & i2;
                    if (((d2 - i12) & i2) / 8 == ((i7 - i12) & i2) / 8) {
                        Object[] objArr3 = objArr2;
                        long[] jArr4 = jArr2;
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (((long) (i10 & 127)) << i9);
                        if (jArr3[i7] == 9223372034707292159L) {
                            long j4 = (long) i7;
                            jArr3[i7] = j4 | (j4 << 32);
                        }
                        jArr[jArr.length - 1] = jArr[0];
                        i7++;
                        objArr2 = objArr3;
                        jArr2 = jArr4;
                        i3 = 0;
                    } else {
                        Object[] objArr4 = objArr2;
                        long[] jArr5 = jArr2;
                        int i13 = d2 >> 3;
                        long j5 = jArr[i13];
                        int i14 = (d2 & 7) << 3;
                        if (((j5 >> i14) & 255) == 128) {
                            int i15 = i9;
                            jArr[i13] = (((long) (i10 & 127)) << i14) | (j5 & (~(255 << i14)));
                            jArr[i8] = (jArr[i8] & (~(255 << i15))) | (128 << i15);
                            objArr[d2] = objArr[i7];
                            objArr[i7] = null;
                            objArr4[d2] = objArr4[i7];
                            objArr4[i7] = null;
                            jArr5[d2] = jArr5[i7];
                            jArr5[i7] = 4611686018427387903L;
                            int i16 = (int) ((jArr3[i7] >> 32) & 4294967295L);
                            if (i16 != Integer.MAX_VALUE) {
                                jArr3[i16] = (jArr3[i16] & -4294967296L) | ((long) d2);
                                jArr3[i7] = (jArr3[i7] & 4294967295L) | -4294967296L;
                                c2 = ' ';
                            } else {
                                c2 = ' ';
                                jArr3[i7] = (((long) Integer.MAX_VALUE) << 32) | ((long) d2);
                            }
                            jArr3[d2] = ((long) Integer.MAX_VALUE) | (((long) i7) << c2);
                        } else {
                            jArr[i13] = (((long) (i10 & 127)) << i14) | (j5 & (~(255 << i14)));
                            Object obj2 = objArr[d2];
                            objArr[d2] = objArr[i7];
                            objArr[i7] = obj2;
                            Object obj3 = objArr4[d2];
                            objArr4[d2] = objArr4[i7];
                            objArr4[i7] = obj3;
                            long j6 = jArr5[d2];
                            jArr5[d2] = jArr5[i7];
                            jArr5[i7] = j6;
                            int i17 = (int) ((jArr3[i7] >> 32) & 4294967295L);
                            if (i17 != Integer.MAX_VALUE) {
                                long j7 = (long) d2;
                                jArr3[i17] = (jArr3[i17] & -4294967296L) | j7;
                                jArr3[i7] = (jArr3[i7] & 4294967295L) | (j7 << 32);
                            } else {
                                long j8 = (long) d2;
                                jArr3[i7] = j8 | (j8 << 32);
                                i17 = i7;
                            }
                            jArr3[d2] = (((long) i17) << 32) | ((long) i7);
                            i7--;
                        }
                        jArr[jArr.length - 1] = jArr[0];
                        i7++;
                        i3 = 0;
                        objArr2 = objArr4;
                        jArr2 = jArr5;
                    }
                } else {
                    i7++;
                }
            }
            l();
            h(jArr3);
        }
    }

    public final int c() {
        int i2;
        long[] jArr = this.f1980g;
        int i3 = this.f1988o;
        int i4 = Integer.MAX_VALUE;
        if (i3 == Integer.MAX_VALUE) {
            i3 = this.f1987n;
        }
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2];
            if (((int) ((j2 >> 62) & 1)) == 0) {
                break;
            }
            int i5 = (int) (2147483647L & (j2 >> 31));
            jArr[i2] = 4611686018427387903L & j2;
            i2 = i5 != Integer.MAX_VALUE ? i5 : this.f1987n;
        }
        int i6 = (int) (2147483647L & (jArr[i2] >> 31));
        if (i6 != Integer.MAX_VALUE) {
            i4 = i6;
        }
        this.f1988o = i4;
        return i2;
    }

    public final int d(int i2) {
        int i3 = this.f1981h;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1977d;
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

    public final int e(Object obj) {
        Object obj2 = obj;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1981h;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1977d;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (long) i4;
            int i10 = i4;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                if (Intrinsics.d(this.f1978e[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & -9187201950435737472L) != 0) {
                int d2 = d(i3);
                if (this.f1982i == 0 && ((this.f1977d[d2 >> 3] >> ((d2 & 7) << 3)) & 255) != 254) {
                    a();
                    d2 = d(i3);
                }
                this.f1983j++;
                int i11 = this.f1982i;
                long[] jArr2 = this.f1977d;
                int i12 = d2 >> 3;
                long j6 = jArr2[i12];
                int i13 = (d2 & 7) << 3;
                this.f1982i = i11 - (((j6 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1981h;
                long j7 = ((~(255 << i13)) & j6) | (j3 << i13);
                jArr2[i12] = j7;
                jArr2[(((d2 - 7) & i14) + (i14 & 7)) >> 3] = j7;
                return ~d2;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.SieveCache
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.SieveCache r1 = (androidx.collection.SieveCache) r1
            int r3 = r1.k()
            int r5 = r18.k()
            if (r3 != r5) goto L_0x007f
            int r3 = r1.f1983j
            int r5 = r0.f1983j
            if (r3 == r5) goto L_0x0021
            goto L_0x007f
        L_0x0021:
            java.lang.Object[] r3 = r0.f1978e
            java.lang.Object[] r5 = r0.f1979f
            long[] r6 = r0.f1977d
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0076
            r8 = r4
        L_0x002d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0078
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0047:
            if (r13 >= r11) goto L_0x0073
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x006e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            java.lang.String r2 = "null cannot be cast to non-null type K of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.g(r15, r2)
            r2 = r5[r14]
            java.lang.String r14 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.g(r2, r14)
            java.lang.Object r14 = r1.i(r15)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r14)
            if (r2 != 0) goto L_0x006e
            return r4
        L_0x006e:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = 1
            goto L_0x0047
        L_0x0073:
            if (r11 != r12) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x007e
        L_0x0078:
            if (r8 == r7) goto L_0x0076
            int r8 = r8 + 1
            r2 = 1
            goto L_0x002d
        L_0x007e:
            return r1
        L_0x007f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.equals(java.lang.Object):boolean");
    }

    public final int f(Object obj) {
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.f1981h;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f1977d;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L; j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i5;
                if (Intrinsics.d(this.f1978e[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
    }

    public final void g(int[] iArr) {
        long[] jArr = this.f1980g;
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
        int i6 = this.f1986m;
        if (i6 != Integer.MAX_VALUE) {
            this.f1986m = iArr[i6];
        }
        int i7 = this.f1987n;
        if (i7 != Integer.MAX_VALUE) {
            this.f1987n = iArr[i7];
        }
        int i8 = this.f1988o;
        if (i8 != Integer.MAX_VALUE) {
            this.f1988o = iArr[i8];
        }
    }

    public final void h(long[] jArr) {
        long[] jArr2 = this.f1980g;
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
        int i6 = this.f1986m;
        if (i6 != Integer.MAX_VALUE) {
            this.f1986m = (int) (jArr[i6] & 4294967295L);
        }
        int i7 = this.f1987n;
        if (i7 != Integer.MAX_VALUE) {
            this.f1987n = (int) (jArr[i7] & 4294967295L);
        }
        int i8 = this.f1988o;
        if (i8 != Integer.MAX_VALUE) {
            this.f1988o = (int) (jArr[i8] & 4294967295L);
        }
    }

    public int hashCode() {
        Object[] objArr = this.f1978e;
        Object[] objArr2 = this.f1979f;
        long[] jArr = this.f1977d;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            Intrinsics.g(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                            Object obj2 = objArr2[i7];
                            Intrinsics.g(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                            i4 += obj2.hashCode() ^ obj.hashCode();
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final Object i(Object obj) {
        Intrinsics.i(obj, "key");
        int f2 = f(obj);
        if (f2 >= 0) {
            long[] jArr = this.f1980g;
            jArr[f2] = (jArr[f2] & 4611686018427387903L) | 4611686018427387904L;
            return this.f1979f[f2];
        }
        Object invoke = this.f1975b.invoke(obj);
        if (invoke == null) {
            return null;
        }
        o(obj, invoke);
        return invoke;
    }

    public final int j() {
        return this.f1983j;
    }

    public final int k() {
        return this.f1985l;
    }

    public final void l() {
        this.f1982i = ScatterMapKt.b(this.f1981h) - j();
    }

    public final void m(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            long[] jArr2 = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
            jArr = jArr2;
        }
        this.f1977d = jArr;
        l();
    }

    public final void n(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1981h = max;
        m(max);
        this.f1978e = max == 0 ? ContainerHelpersKt.f2008c : new Object[max];
        this.f1979f = max == 0 ? ContainerHelpersKt.f2008c : new Object[max];
        if (max == 0) {
            jArr = SieveCacheKt.a();
        } else {
            jArr = new long[max];
            ArraysKt.y(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
        }
        this.f1980g = jArr;
    }

    public final Object o(Object obj, Object obj2) {
        Intrinsics.i(obj, "key");
        Intrinsics.i(obj2, "value");
        int e2 = e(obj);
        if (e2 < 0) {
            e2 = ~e2;
        }
        Object[] objArr = this.f1979f;
        Object obj3 = objArr[e2];
        objArr[e2] = obj2;
        this.f1978e[e2] = obj;
        int intValue = this.f1985l + ((Number) this.f1974a.m(obj, obj2)).intValue();
        this.f1985l = intValue;
        if (obj3 != null) {
            this.f1985l = intValue - ((Number) this.f1974a.m(obj, obj3)).intValue();
            this.f1976c.j(obj, obj3, obj2, Boolean.FALSE);
            r(this.f1984k);
            return obj3;
        }
        r(this.f1984k);
        long[] jArr = this.f1980g;
        int i2 = this.f1986m;
        jArr[e2] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & -4611686016279904257L) | ((2147483647L & ((long) e2)) << 31);
        }
        this.f1986m = e2;
        if (this.f1987n == Integer.MAX_VALUE) {
            this.f1987n = e2;
        }
        return obj3;
    }

    public final Object p(int i2) {
        this.f1983j--;
        long[] jArr = this.f1977d;
        int i3 = this.f1981h;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        this.f1978e[i2] = null;
        Object[] objArr = this.f1979f;
        Object obj = objArr[i2];
        objArr[i2] = null;
        long[] jArr2 = this.f1980g;
        long j3 = jArr2[i2];
        int i6 = (int) ((j3 >> 31) & 2147483647L);
        int i7 = (int) (j3 & 2147483647L);
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (jArr2[i6] & -2147483648L) | (((long) i7) & 2147483647L);
        } else {
            this.f1986m = i7;
        }
        if (i7 != Integer.MAX_VALUE) {
            jArr2[i7] = ((((long) i6) & 2147483647L) << 31) | (jArr2[i7] & -4611686016279904257L);
        } else {
            this.f1987n = i6;
        }
        if (this.f1988o == i2) {
            this.f1988o = i6;
        }
        jArr2[i2] = 4611686018427387903L;
        return obj;
    }

    public final void q(int i2) {
        int[] iArr;
        int i3;
        Object[] objArr;
        long[] jArr;
        long[] jArr2 = this.f1977d;
        Object[] objArr2 = this.f1978e;
        Object[] objArr3 = this.f1979f;
        long[] jArr3 = this.f1980g;
        int i4 = this.f1981h;
        int[] iArr2 = new int[i4];
        n(i2);
        long[] jArr4 = this.f1977d;
        Object[] objArr4 = this.f1978e;
        Object[] objArr5 = this.f1979f;
        long[] jArr5 = this.f1980g;
        int i5 = this.f1981h;
        int i6 = 0;
        while (i6 < i4) {
            if (((jArr2[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i7 = hashCode ^ (hashCode << 16);
                int d2 = d(i7 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j2 = (long) (i7 & 127);
                int i8 = d2 >> 3;
                int i9 = (d2 & 7) << 3;
                i3 = i4;
                iArr = iArr2;
                long j3 = (j2 << i9) | (jArr4[i8] & (~(255 << i9)));
                jArr4[i8] = j3;
                jArr4[(((d2 - 7) & i5) + (i5 & 7)) >> 3] = j3;
                objArr4[d2] = obj;
                objArr5[d2] = objArr3[i6];
                jArr5[d2] = jArr3[i6];
                iArr[i6] = d2;
            } else {
                jArr = jArr2;
                objArr = objArr2;
                i3 = i4;
                iArr = iArr2;
            }
            i6++;
            jArr2 = jArr;
            objArr2 = objArr;
            i4 = i3;
            iArr2 = iArr;
        }
        g(iArr2);
    }

    public final void r(int i2) {
        int c2;
        while (this.f1985l > i2 && j() != 0 && (c2 = c()) != Integer.MAX_VALUE) {
            Object obj = this.f1978e[c2];
            Intrinsics.g(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            Object p2 = p(c2);
            if (p2 != null) {
                this.f1985l -= ((Number) this.f1974a.m(obj, p2)).intValue();
                this.f1976c.j(obj, p2, (Object) null, Boolean.TRUE);
            }
        }
    }

    public String toString() {
        return "SieveCache[maxSize=" + this.f1984k + ", size=" + this.f1985l + ", capacity=" + this.f1981h + ", count=" + this.f1983j + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SieveCache(int i2, int i3, Function2 function2, Function1 function1, Function4 function4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i4 & 2) != 0 ? 6 : i3, (i4 & 4) != 0 ? AnonymousClass1.f1989z : function2, (i4 & 8) != 0 ? AnonymousClass2.f1990z : function1, (i4 & 16) != 0 ? AnonymousClass3.f1991z : function4);
    }
}
