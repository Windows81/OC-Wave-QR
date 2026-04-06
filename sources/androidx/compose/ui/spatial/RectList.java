package androidx.compose.ui.spatial;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RectList {

    /* renamed from: a  reason: collision with root package name */
    public long[] f18155a = new long[192];

    /* renamed from: b  reason: collision with root package name */
    public long[] f18156b = new long[192];

    /* renamed from: c  reason: collision with root package name */
    public int f18157c;

    public static /* synthetic */ void e(RectList rectList, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8, Object obj) {
        int i9 = i8;
        rectList.d(i2, i3, i4, i5, i6, (i9 & 32) != 0 ? -1 : i7, (i9 & 64) != 0 ? false : z2, (i9 & 128) != 0 ? false : z3);
    }

    public final void a() {
        long[] jArr = this.f18155a;
        int i2 = this.f18157c;
        int i3 = 0;
        while (i3 < jArr.length - 2 && i3 < i2) {
            int i4 = i3 + 2;
            jArr[i4] = jArr[i4] & -2305843009213693953L;
            i3 += 3;
        }
    }

    public final void b() {
        long[] jArr = this.f18155a;
        int i2 = this.f18157c;
        long[] jArr2 = this.f18156b;
        int i3 = 0;
        int i4 = 0;
        while (i3 < jArr.length - 2 && i4 < jArr2.length - 2 && i3 < i2) {
            int i5 = i3 + 2;
            if (jArr[i5] != 2305843009213693951L) {
                jArr2[i4] = jArr[i3];
                jArr2[i4 + 1] = jArr[i3 + 1];
                jArr2[i4 + 2] = jArr[i5];
                i4 += 3;
            }
            i3 += 3;
        }
        this.f18157c = i4;
        this.f18155a = jArr2;
        this.f18156b = jArr;
    }

    public final int c() {
        return this.f18157c / 3;
    }

    public final void d(int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        long[] jArr = this.f18155a;
        int i8 = this.f18157c;
        int i9 = i8 + 3;
        this.f18157c = i9;
        int length = jArr.length;
        if (length <= i9) {
            i(length, i8, jArr);
        }
        long[] jArr2 = this.f18155a;
        jArr2[i8] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
        jArr2[i8 + 1] = (((long) i5) << 32) | (((long) i6) & 4294967295L);
        int i10 = i7 & 67108863;
        jArr2[i8 + 2] = ((z3 ? 1 : 0) << 63) | ((z2 ? 1 : 0) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i10) << 26) | ((long) (i2 & 67108863));
        if (i7 >= 0) {
            for (int i11 = i8 - 3; i11 >= 0; i11 -= 3) {
                int i12 = i11 + 2;
                long j2 = jArr2[i12];
                if ((((int) j2) & 67108863) == i10) {
                    jArr2[i12] = (((long) ((i8 - i11) & 511)) << 52) | (-2301339409586323457L & j2);
                    return;
                }
            }
        }
    }

    public final void f(int i2) {
        int i3 = i2 & 67108863;
        long[] jArr = this.f18155a;
        int i4 = this.f18157c;
        int i5 = 0;
        while (i5 < jArr.length - 2 && i5 < i4) {
            int i6 = i5 + 2;
            long j2 = jArr[i6];
            if ((((int) j2) & 67108863) == i3) {
                jArr[i6] = 2305843009213693952L | j2;
                return;
            }
            i5 += 3;
        }
    }

    public final boolean g(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        int i8 = i4;
        int i9 = i2 & 67108863;
        long[] jArr = this.f18155a;
        int i10 = this.f18157c;
        int i11 = 0;
        while (i11 < jArr.length - 2 && i11 < i10) {
            int i12 = i11 + 2;
            long j2 = jArr[i12];
            if ((((int) j2) & 67108863) == i9) {
                long j3 = jArr[i11];
                jArr[i11] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                int i13 = i11;
                jArr[i11 + 1] = (((long) i6) & 4294967295L) | (((long) i5) << 32);
                jArr[i12] = 2305843009213693952L | j2;
                int i14 = i7 - ((int) (j3 >> 32));
                int i15 = i8 - ((int) j3);
                if ((i14 != 0) || (i15 != 0)) {
                    k((-4503599560261633L & j2) | (((long) ((i13 + 3) & 67108863)) << 26), i14, i15);
                }
                return true;
            }
            int i16 = i5;
            i11 += 3;
        }
        return false;
    }

    public final boolean h(int i2) {
        int i3 = i2 & 67108863;
        long[] jArr = this.f18155a;
        int i4 = this.f18157c;
        int i5 = 0;
        while (i5 < jArr.length - 2 && i5 < i4) {
            int i6 = i5 + 2;
            if ((((int) jArr[i6]) & 67108863) == i3) {
                jArr[i5] = -1;
                jArr[i5 + 1] = -1;
                jArr[i6] = 2305843009213693951L;
                return true;
            }
            i5 += 3;
        }
        return false;
    }

    public final void i(int i2, int i3, long[] jArr) {
        int max = Math.max(i2 * 2, i3 + 3);
        long[] copyOf = Arrays.copyOf(jArr, max);
        Intrinsics.h(copyOf, "copyOf(...)");
        this.f18155a = copyOf;
        long[] copyOf2 = Arrays.copyOf(this.f18156b, max);
        Intrinsics.h(copyOf2, "copyOf(...)");
        this.f18156b = copyOf2;
    }

    public final boolean j(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 & 67108863;
        long[] jArr = this.f18155a;
        int i8 = this.f18157c;
        int i9 = 0;
        while (i9 < jArr.length - 2 && i9 < i8) {
            int i10 = i9 + 2;
            long j2 = jArr[i10];
            if ((((int) j2) & 67108863) == i7) {
                jArr[i9] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
                jArr[i9 + 1] = (((long) i5) << 32) | (((long) i6) & 4294967295L);
                jArr[i10] = 2305843009213693952L | j2;
                return true;
            }
            i9 += 3;
        }
        return false;
    }

    public final void k(long j2, int i2, int i3) {
        int i4;
        int i5;
        char c2;
        char c3;
        long[] jArr = this.f18155a;
        long[] jArr2 = this.f18156b;
        int c4 = c();
        jArr2[0] = j2;
        int i6 = 1;
        while (i6 > 0) {
            i6--;
            long j3 = jArr2[i6];
            int i7 = 67108863;
            int i8 = ((int) j3) & 67108863;
            char c5 = 26;
            int i9 = ((int) (j3 >> 26)) & 67108863;
            char c6 = 511;
            int i10 = ((int) (j3 >> 52)) & 511;
            int i11 = i10 == 511 ? c4 : i10 + i9;
            if (i9 >= 0) {
                while (i9 < jArr.length - 2 && i9 < i11) {
                    int i12 = i9 + 2;
                    long j4 = jArr[i12];
                    int i13 = i12;
                    if ((((int) (j4 >> c5)) & i7) == i8) {
                        long j5 = jArr[i9];
                        int i14 = i9 + 1;
                        long j6 = jArr[i14];
                        i4 = i8;
                        jArr[i9] = (((long) (((int) j5) + i3)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i2)) << 32);
                        jArr[i14] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i13] = 2305843009213693952L | j4;
                        c3 = '4';
                        c2 = 511;
                        if ((((int) (j4 >> 52)) & 511) > 0) {
                            long j7 = -4503599560261633L & j4;
                            i5 = 67108863;
                            c5 = 26;
                            jArr2[i6] = j7 | (((long) ((i9 + 3) & 67108863)) << 26);
                            i6++;
                        } else {
                            c5 = 26;
                            i5 = 67108863;
                        }
                    } else {
                        i4 = i8;
                        i5 = i7;
                        c2 = c6;
                        c3 = '4';
                    }
                    i9 += 3;
                    char c7 = c3;
                    c6 = c2;
                    i7 = i5;
                    i8 = i4;
                }
            } else {
                return;
            }
        }
    }

    public final boolean l(int i2, Function4 function4) {
        int i3 = i2 & 67108863;
        long[] jArr = this.f18155a;
        int i4 = this.f18157c;
        int i5 = 0;
        while (i5 < jArr.length - 2 && i5 < i4) {
            if ((((int) jArr[i5 + 2]) & 67108863) == i3) {
                long j2 = jArr[i5];
                long j3 = jArr[i5 + 1];
                function4.j(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
                return true;
            }
            i5 += 3;
        }
        return false;
    }
}
