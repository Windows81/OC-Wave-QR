package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {

    /* renamed from: f  reason: collision with root package name */
    public int f1898f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableObjectIntMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public final void i() {
        if (this.f1934d <= 8 || Long.compareUnsigned(ULong.f(ULong.f((long) this.f1935e) * 32), ULong.f(ULong.f((long) this.f1934d) * 25)) > 0) {
            t(ScatterMapKt.d(this.f1934d));
        } else {
            k();
        }
    }

    public final void j() {
        this.f1935e = 0;
        long[] jArr = this.f1931a;
        if (jArr != ScatterMapKt.f1964a) {
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f1931a;
            int i2 = this.f1934d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt.w(this.f1932b, (Object) null, 0, this.f1934d);
        n();
    }

    public final void k() {
        long[] jArr = this.f1931a;
        int i2 = this.f1934d;
        Object[] objArr = this.f1932b;
        int[] iArr = this.f1933c;
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
                int l2 = l(i11);
                int i12 = i11 & i2;
                if (((l2 - i12) & i2) / 8 == ((i7 - i12) & i2) / 8) {
                    jArr[i8] = (((long) (i10 & 127)) << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[ArraysKt.l0(jArr)] = (jArr[i4] & j3) | Long.MIN_VALUE;
                } else {
                    int i13 = l2 >> 3;
                    long j5 = jArr[i13];
                    int i14 = (l2 & 7) << 3;
                    if (((j5 >> i14) & 255) == 128) {
                        int i15 = i8;
                        jArr[i13] = ((~(255 << i14)) & j5) | (((long) (i10 & 127)) << i14);
                        jArr[i15] = (jArr[i15] & (~(255 << i9))) | (128 << i9);
                        objArr[l2] = objArr[i7];
                        objArr[i7] = null;
                        iArr[l2] = iArr[i7];
                        iArr[i7] = 0;
                    } else {
                        jArr[i13] = (((long) (i10 & 127)) << i14) | ((~(255 << i14)) & j5);
                        Object obj2 = objArr[l2];
                        objArr[l2] = objArr[i7];
                        objArr[i7] = obj2;
                        int i16 = iArr[l2];
                        iArr[l2] = iArr[i7];
                        iArr[i7] = i16;
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
        n();
    }

    public final int l(int i2) {
        int i3 = this.f1934d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1931a;
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

    public final int m(Object obj) {
        Object obj2 = obj;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f1934d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1931a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (long) i4;
            int i10 = i4;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                if (Intrinsics.d(this.f1932b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & -9187201950435737472L) != 0) {
                int l2 = l(i3);
                if (this.f1898f == 0 && ((this.f1931a[l2 >> 3] >> ((l2 & 7) << 3)) & 255) != 254) {
                    i();
                    l2 = l(i3);
                }
                this.f1935e++;
                int i11 = this.f1898f;
                long[] jArr2 = this.f1931a;
                int i12 = l2 >> 3;
                long j6 = jArr2[i12];
                int i13 = (l2 & 7) << 3;
                this.f1898f = i11 - (((j6 >> i13) & 255) == 128 ? 1 : 0);
                int i14 = this.f1934d;
                long j7 = ((~(255 << i13)) & j6) | (j3 << i13);
                jArr2[i12] = j7;
                jArr2[(((l2 - 7) & i14) + (i14 & 7)) >> 3] = j7;
                return ~l2;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
    }

    public final void n() {
        this.f1898f = ScatterMapKt.b(d()) - this.f1935e;
    }

    public final void o(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1931a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        n();
    }

    public final void p(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1934d = max;
        o(max);
        this.f1932b = new Object[max];
        this.f1933c = new int[max];
    }

    public final int q(Object obj, int i2, int i3) {
        int m2 = m(obj);
        if (m2 < 0) {
            m2 = ~m2;
        } else {
            i3 = this.f1933c[m2];
        }
        this.f1932b[m2] = obj;
        this.f1933c[m2] = i2;
        return i3;
    }

    public final void r(Object obj) {
        int b2 = b(obj);
        if (b2 >= 0) {
            s(b2);
        }
    }

    public final void s(int i2) {
        this.f1935e--;
        long[] jArr = this.f1931a;
        int i3 = this.f1934d;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        this.f1932b[i2] = null;
    }

    public final void t(int i2) {
        int i3;
        long[] jArr = this.f1931a;
        Object[] objArr = this.f1932b;
        int[] iArr = this.f1933c;
        int i4 = this.f1934d;
        p(i2);
        long[] jArr2 = this.f1931a;
        Object[] objArr2 = this.f1932b;
        int[] iArr2 = this.f1933c;
        int i5 = this.f1934d;
        int i6 = 0;
        while (i6 < i4) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i7 = hashCode ^ (hashCode << 16);
                int l2 = l(i7 >>> 7);
                i3 = i6;
                long j2 = (long) (i7 & 127);
                int i8 = l2 >> 3;
                int i9 = (l2 & 7) << 3;
                long j3 = (j2 << i9) | (jArr2[i8] & (~(255 << i9)));
                jArr2[i8] = j3;
                jArr2[(((l2 - 7) & i5) + (i5 & 7)) >> 3] = j3;
                objArr2[l2] = obj;
                iArr2[l2] = iArr[i3];
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
        }
    }

    public final void u(Object obj, int i2) {
        int m2 = m(obj);
        if (m2 < 0) {
            m2 = ~m2;
        }
        this.f1932b[m2] = obj;
        this.f1933c[m2] = i2;
    }

    public MutableObjectIntMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        p(ScatterMapKt.f(i2));
    }
}
