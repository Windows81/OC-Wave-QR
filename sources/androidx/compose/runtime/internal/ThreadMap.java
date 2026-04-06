package androidx.compose.runtime.internal;

import kotlin.Metadata;

@Metadata
public final class ThreadMap {

    /* renamed from: a  reason: collision with root package name */
    public final int f15152a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f15153b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f15154c;

    public ThreadMap(int i2, long[] jArr, Object[] objArr) {
        this.f15152a = i2;
        this.f15153b = jArr;
        this.f15154c = objArr;
    }

    public final int a(long j2) {
        int i2 = this.f15152a - 1;
        if (i2 == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 != 0) {
            while (i3 <= i2) {
                int i4 = (i3 + i2) >>> 1;
                int i5 = ((this.f15153b[i4] - j2) > 0 ? 1 : ((this.f15153b[i4] - j2) == 0 ? 0 : -1));
                if (i5 < 0) {
                    i3 = i4 + 1;
                } else if (i5 <= 0) {
                    return i4;
                } else {
                    i2 = i4 - 1;
                }
            }
            return -(i3 + 1);
        }
        long j3 = this.f15153b[0];
        if (j3 == j2) {
            return 0;
        }
        return j3 > j2 ? -2 : -1;
    }

    public final Object b(long j2) {
        int a2 = a(j2);
        if (a2 >= 0) {
            return this.f15154c[a2];
        }
        return null;
    }

    public final ThreadMap c(long j2, Object obj) {
        int i2 = this.f15152a;
        int i3 = 0;
        int i4 = 0;
        for (Object obj2 : this.f15154c) {
            if (obj2 != null) {
                i4++;
            }
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i3 >= i5 || i6 >= i2) {
                    break;
                }
                long j3 = this.f15153b[i6];
                Object obj3 = this.f15154c[i6];
                if (j3 > j2) {
                    jArr[i3] = j2;
                    objArr[i3] = obj;
                    i3++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i3] = j3;
                    objArr[i3] = obj3;
                    i3++;
                }
                i6++;
            }
            if (i6 == i2) {
                jArr[i4] = j2;
                objArr[i4] = obj;
            } else {
                while (i3 < i5) {
                    long j4 = this.f15153b[i6];
                    Object obj4 = this.f15154c[i6];
                    if (obj4 != null) {
                        jArr[i3] = j4;
                        objArr[i3] = obj4;
                        i3++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j2;
            objArr[0] = obj;
        }
        return new ThreadMap(i5, jArr, objArr);
    }

    public final boolean d(long j2, Object obj) {
        int a2 = a(j2);
        if (a2 < 0) {
            return false;
        }
        this.f15154c[a2] = obj;
        return true;
    }
}
