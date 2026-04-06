package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableObjectFloatMap<K> extends ObjectFloatMap<K> {

    /* renamed from: f  reason: collision with root package name */
    public int f1897f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableObjectFloatMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void g() {
        if (this.f1928d <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1929e) * 32), ULong.f(ULong.f((long) this.f1928d) * 25)) > 0) {
            p(ScatterMapKt.d(this.f1928d));
        } else {
            i();
        }
    }

    public final void h() {
        this.f1929e = 0;
        long[] jArr = this.f1925a;
        if (jArr != ScatterMapKt.f1964a) {
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f1925a;
            int i2 = this.f1928d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt.w(this.f1926b, (Object) null, 0, this.f1928d);
        l();
    }

    public final void i() {
        long[] jArr = this.f1925a;
        int i2 = this.f1928d;
        Object[] objArr = this.f1926b;
        float[] fArr = this.f1927c;
        int i3 = (i2 + 7) >> 3;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i5] & -9187201950435737472L;
            jArr[i5] = -72340172838076674L & ((~j2) + (j2 >>> 7));
        }
        int l0 = ArraysKt.l0(jArr);
        int i6 = l0 - 1;
        long j3 = 72057594037927935L;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | -72057594037927936L;
        jArr[l0] = jArr[0];
        int i7 = 0;
        while (i7 != i2) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j4 = (jArr[i8] >> i9) & 255;
            if (j4 != 128 && j4 == 254) {
                Object obj = objArr[i7];
                int hashCode = (obj != null ? obj.hashCode() : i4) * -862048943;
                int i10 = hashCode ^ (hashCode << 16);
                int i11 = i10 >>> 7;
                int j5 = j(i11);
                int i12 = i11 & i2;
                if (((j5 - i12) & i2) / 8 == ((i7 - i12) & i2) / 8) {
                    jArr[i8] = (((long) (i10 & 127)) << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[i4] & j3) | Long.MIN_VALUE;
                } else {
                    int i13 = j5 >> 3;
                    long j6 = jArr[i13];
                    int i14 = (j5 & 7) << 3;
                    if (((j6 >> i14) & 255) == 128) {
                        int i15 = i8;
                        jArr[i13] = ((~(255 << i14)) & j6) | (((long) (i10 & 127)) << i14);
                        jArr[i15] = (jArr[i15] & (~(255 << i9))) | (128 << i9);
                        objArr[j5] = objArr[i7];
                        objArr[i7] = null;
                        fArr[j5] = fArr[i7];
                        fArr[i7] = 0.0f;
                    } else {
                        jArr[i13] = (((long) (i10 & 127)) << i14) | ((~(255 << i14)) & j6);
                        Object obj2 = objArr[j5];
                        objArr[j5] = objArr[i7];
                        objArr[i7] = obj2;
                        float f2 = fArr[j5];
                        fArr[j5] = fArr[i7];
                        fArr[i7] = f2;
                        i7--;
                    }
                    j3 = 72057594037927935L;
                    jArr[ArraysKt.l0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i7++;
                    i4 = 0;
                }
            }
            i7++;
        }
        l();
    }

    public final int j(int i2) {
        int i3 = this.f1928d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1925a;
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

    public final int k(Object obj) {
        Object obj2 = obj;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1928d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1925a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (long) i4;
            int i10 = i4;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                if (Intrinsics.d(this.f1926b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & -9187201950435737472L) != 0) {
                int j6 = j(i3);
                if (this.f1897f == 0 && ((this.f1925a[j6 >> 3] >> ((j6 & 7) << 3)) & 255) != 254) {
                    g();
                    j6 = j(i3);
                }
                this.f1929e++;
                int i11 = this.f1897f;
                long[] jArr2 = this.f1925a;
                int i12 = j6 >> 3;
                long j7 = jArr2[i12];
                int i13 = (j6 & 7) << 3;
                this.f1897f = i11 - (((j7 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1928d;
                long j8 = ((~(255 << i13)) & j7) | (j3 << i13);
                jArr2[i12] = j8;
                jArr2[(((j6 - 7) & i14) + (i14 & 7)) >> 3] = j8;
                return ~j6;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
    }

    public final void l() {
        this.f1897f = ScatterMapKt.b(c()) - this.f1929e;
    }

    public final void m(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1925a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        l();
    }

    public final void n(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1928d = max;
        m(max);
        this.f1926b = new Object[max];
        this.f1927c = new float[max];
    }

    public final void o(ObjectFloatMap objectFloatMap) {
        Intrinsics.i(objectFloatMap, "from");
        Object[] objArr = objectFloatMap.f1926b;
        float[] fArr = objectFloatMap.f1927c;
        long[] jArr = objectFloatMap.f1925a;
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
                            q(objArr[i5], fArr[i5]);
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

    public final void p(int i2) {
        int i3;
        long[] jArr = this.f1925a;
        Object[] objArr = this.f1926b;
        float[] fArr = this.f1927c;
        int i4 = this.f1928d;
        n(i2);
        long[] jArr2 = this.f1925a;
        Object[] objArr2 = this.f1926b;
        float[] fArr2 = this.f1927c;
        int i5 = this.f1928d;
        int i6 = 0;
        while (i6 < i4) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i7 = hashCode ^ (hashCode << 16);
                int j2 = j(i7 >>> 7);
                i3 = i6;
                long j3 = (long) (i7 & 127);
                int i8 = j2 >> 3;
                int i9 = (j2 & 7) << 3;
                long j4 = (j3 << i9) | (jArr2[i8] & (~(255 << i9)));
                jArr2[i8] = j4;
                jArr2[(((j2 - 7) & i5) + (i5 & 7)) >> 3] = j4;
                objArr2[j2] = obj;
                fArr2[j2] = fArr[i3];
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
        }
    }

    public final void q(Object obj, float f2) {
        int k2 = k(obj);
        if (k2 < 0) {
            k2 = ~k2;
        }
        this.f1926b[k2] = obj;
        this.f1927c[k2] = f2;
    }

    public MutableObjectFloatMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        n(ScatterMapKt.f(i2));
    }
}
