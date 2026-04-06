package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public int f1913f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableScatterMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void j() {
        if (this.f1962d <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1963e) * 32), ULong.f(ULong.f((long) this.f1962d) * 25)) > 0) {
            w(ScatterMapKt.d(this.f1962d));
        } else {
            l();
        }
    }

    public final void k() {
        this.f1963e = 0;
        long[] jArr = this.f1959a;
        if (jArr != ScatterMapKt.f1964a) {
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f1959a;
            int i2 = this.f1962d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt.w(this.f1961c, (Object) null, 0, this.f1962d);
        ArraysKt.w(this.f1960b, (Object) null, 0, this.f1962d);
        o();
    }

    public final void l() {
        Object[] objArr;
        int i2;
        long[] jArr = this.f1959a;
        int i3 = this.f1962d;
        Object[] objArr2 = this.f1960b;
        Object[] objArr3 = this.f1961c;
        int i4 = (i3 + 7) >> 3;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            long j2 = jArr[i6] & -9187201950435737472L;
            jArr[i6] = -72340172838076674L & ((~j2) + (j2 >>> 7));
        }
        int l0 = ArraysKt.l0(jArr);
        int i7 = l0 - 1;
        jArr[i7] = (jArr[i7] & 72057594037927935L) | -72057594037927936L;
        jArr[l0] = jArr[0];
        int i8 = 0;
        while (i8 != i3) {
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j3 = (jArr[i9] >> i10) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr2[i8];
                int hashCode = (obj != null ? obj.hashCode() : i5) * -862048943;
                int i11 = hashCode ^ (hashCode << 16);
                int i12 = i11 >>> 7;
                int m2 = m(i12);
                int i13 = i12 & i3;
                if (((m2 - i13) & i3) / 8 == ((i8 - i13) & i3) / 8) {
                    jArr[i9] = (((long) (i11 & 127)) << i10) | ((~(255 << i10)) & jArr[i9]);
                    jArr[ArraysKt.l0(jArr)] = jArr[i5];
                } else {
                    int i14 = m2 >> 3;
                    long j4 = jArr[i14];
                    int i15 = (m2 & 7) << 3;
                    if (((j4 >> i15) & 255) == 128) {
                        int i16 = i9;
                        i2 = i3;
                        objArr = objArr2;
                        jArr[i14] = ((~(255 << i15)) & j4) | (((long) (i11 & 127)) << i15);
                        jArr[i16] = (jArr[i16] & (~(255 << i10))) | (128 << i10);
                        objArr[m2] = objArr[i8];
                        objArr[i8] = null;
                        objArr3[m2] = objArr3[i8];
                        objArr3[i8] = null;
                    } else {
                        i2 = i3;
                        objArr = objArr2;
                        jArr[i14] = (((long) (i11 & 127)) << i15) | ((~(255 << i15)) & j4);
                        Object obj2 = objArr[m2];
                        objArr[m2] = objArr[i8];
                        objArr[i8] = obj2;
                        Object obj3 = objArr3[m2];
                        objArr3[m2] = objArr3[i8];
                        objArr3[i8] = obj3;
                        i8--;
                    }
                    jArr[ArraysKt.l0(jArr)] = jArr[0];
                    i8++;
                    i5 = 0;
                    i3 = i2;
                    objArr2 = objArr;
                }
            }
            i8++;
        }
        o();
    }

    public final int m(int i2) {
        int i3 = this.f1962d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1959a;
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

    public final int n(Object obj) {
        Object obj2 = obj;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1962d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1959a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (long) i4;
            int i10 = i4;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                if (Intrinsics.d(this.f1960b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & -9187201950435737472L) != 0) {
                int m2 = m(i3);
                if (this.f1913f == 0 && ((this.f1959a[m2 >> 3] >> ((m2 & 7) << 3)) & 255) != 254) {
                    j();
                    m2 = m(i3);
                }
                this.f1963e++;
                int i11 = this.f1913f;
                long[] jArr2 = this.f1959a;
                int i12 = m2 >> 3;
                long j6 = jArr2[i12];
                int i13 = (m2 & 7) << 3;
                this.f1913f = i11 - (((j6 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1962d;
                long j7 = ((~(255 << i13)) & j6) | (j3 << i13);
                jArr2[i12] = j7;
                jArr2[(((m2 - 7) & i14) + (i14 & 7)) >> 3] = j7;
                return ~m2;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
    }

    public final void o() {
        this.f1913f = ScatterMapKt.b(f()) - this.f1963e;
    }

    public final void p(int i2) {
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
        this.f1959a = jArr;
        o();
    }

    public final void q(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1962d = max;
        p(max);
        this.f1960b = max == 0 ? ContainerHelpersKt.f2008c : new Object[max];
        this.f1961c = max == 0 ? ContainerHelpersKt.f2008c : new Object[max];
    }

    public final Object r(Object obj, Object obj2) {
        int n2 = n(obj);
        if (n2 < 0) {
            n2 = ~n2;
        }
        Object[] objArr = this.f1961c;
        Object obj3 = objArr[n2];
        this.f1960b[n2] = obj;
        objArr[n2] = obj2;
        return obj3;
    }

    public final void s(ScatterMap scatterMap) {
        Intrinsics.i(scatterMap, "from");
        Object[] objArr = scatterMap.f1960b;
        Object[] objArr2 = scatterMap.f1961c;
        long[] jArr = scatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            x(objArr[i5], objArr2[i5]);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void t(Map map) {
        Intrinsics.i(map, "from");
        for (Map.Entry entry : map.entrySet()) {
            x(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(java.lang.Object r14) {
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
            int r3 = r13.f1962d
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.f1959a
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
            java.lang.Object[] r11 = r13.f1960b
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
            if (r4 == 0) goto L_0x0075
            r10 = -1
        L_0x006c:
            if (r10 < 0) goto L_0x0073
            java.lang.Object r14 = r13.v(r10)
            return r14
        L_0x0073:
            r14 = 0
            return r14
        L_0x0075:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.u(java.lang.Object):java.lang.Object");
    }

    public final Object v(int i2) {
        this.f1963e--;
        long[] jArr = this.f1959a;
        int i3 = this.f1962d;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        this.f1960b[i2] = null;
        Object[] objArr = this.f1961c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void w(int i2) {
        int i3;
        long[] jArr = this.f1959a;
        Object[] objArr = this.f1960b;
        Object[] objArr2 = this.f1961c;
        int i4 = this.f1962d;
        q(i2);
        long[] jArr2 = this.f1959a;
        Object[] objArr3 = this.f1960b;
        Object[] objArr4 = this.f1961c;
        int i5 = this.f1962d;
        int i6 = 0;
        while (i6 < i4) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i7 = hashCode ^ (hashCode << 16);
                int m2 = m(i7 >>> 7);
                i3 = i6;
                long j2 = (long) (i7 & 127);
                int i8 = m2 >> 3;
                int i9 = (m2 & 7) << 3;
                long j3 = (j2 << i9) | (jArr2[i8] & (~(255 << i9)));
                jArr2[i8] = j3;
                jArr2[(((m2 - 7) & i5) + (i5 & 7)) >> 3] = j3;
                objArr3[m2] = obj;
                objArr4[m2] = objArr2[i3];
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
        }
    }

    public final void x(Object obj, Object obj2) {
        int n2 = n(obj);
        if (n2 < 0) {
            n2 = ~n2;
        }
        this.f1960b[n2] = obj;
        this.f1961c[n2] = obj2;
    }

    public MutableScatterMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        q(ScatterMapKt.f(i2));
    }
}
