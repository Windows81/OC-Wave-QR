package androidx.compose.ui.unit;

import kotlin.Metadata;

@Metadata
public final class ConstraintsKt {
    public static final long a(int i2, int i3, int i4, int i5) {
        boolean z2 = false;
        boolean z3 = (i3 >= i2) & (i5 >= i4) & (i2 >= 0);
        if (i4 >= 0) {
            z2 = true;
        }
        if (!z2 || !z3) {
            InlineClassHelperKt.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i2, i3, i4, i5);
    }

    public static /* synthetic */ long b(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return a(i2, i3, i4, i5);
    }

    public static final int c(int i2) {
        if (i2 < 8191) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        return i2 < 262143 ? 18 : 255;
    }

    public static final long d(long j2, long j3) {
        int i2 = (int) (j3 >> 32);
        int n2 = Constraints.n(j2);
        int l2 = Constraints.l(j2);
        if (i2 < n2) {
            i2 = n2;
        }
        if (i2 <= l2) {
            l2 = i2;
        }
        int i3 = (int) (j3 & 4294967295L);
        int m2 = Constraints.m(j2);
        int k2 = Constraints.k(j2);
        if (i3 < m2) {
            i3 = m2;
        }
        if (i3 <= k2) {
            k2 = i3;
        }
        return IntSize.c((((long) l2) << 32) | (((long) k2) & 4294967295L));
    }

    public static final long e(long j2, long j3) {
        int n2 = Constraints.n(j2);
        int l2 = Constraints.l(j2);
        int m2 = Constraints.m(j2);
        int k2 = Constraints.k(j2);
        int n3 = Constraints.n(j3);
        if (n3 < n2) {
            n3 = n2;
        }
        if (n3 > l2) {
            n3 = l2;
        }
        int l3 = Constraints.l(j3);
        if (l3 >= n2) {
            n2 = l3;
        }
        if (n2 <= l2) {
            l2 = n2;
        }
        int m3 = Constraints.m(j3);
        if (m3 < m2) {
            m3 = m2;
        }
        if (m3 > k2) {
            m3 = k2;
        }
        int k3 = Constraints.k(j3);
        if (k3 >= m2) {
            m2 = k3;
        }
        if (m2 <= k2) {
            k2 = m2;
        }
        return a(n3, l2, m3, k2);
    }

    public static final int f(long j2, int i2) {
        int m2 = Constraints.m(j2);
        int k2 = Constraints.k(j2);
        if (i2 < m2) {
            i2 = m2;
        }
        return i2 > k2 ? k2 : i2;
    }

    public static final int g(long j2, int i2) {
        int n2 = Constraints.n(j2);
        int l2 = Constraints.l(j2);
        if (i2 < n2) {
            i2 = n2;
        }
        return i2 > l2 ? l2 : i2;
    }

    public static final long h(int i2, int i3, int i4, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
        int c2 = c(i6);
        int i7 = i3 == Integer.MAX_VALUE ? i2 : i3;
        int c3 = c(i7);
        if (c2 + c3 > 31) {
            k(i7, i6);
        }
        int i8 = i3 + 1;
        int i9 = i5 + 1;
        int i10 = c3 - 13;
        return Constraints.b((((long) (i8 & (~(i8 >> 31)))) << 33) | ((long) ((i10 >> 1) + (i10 & 1))) | (((long) i2) << 2) | (((long) i4) << (c3 + 2)) | (((long) (i9 & (~(i9 >> 31)))) << (c3 + 33)));
    }

    public static final long i(long j2, int i2, int i3) {
        int n2 = Constraints.n(j2) + i2;
        int i4 = 0;
        if (n2 < 0) {
            n2 = 0;
        }
        int l2 = Constraints.l(j2);
        if (l2 != Integer.MAX_VALUE && (l2 = l2 + i2) < 0) {
            l2 = 0;
        }
        int m2 = Constraints.m(j2) + i3;
        if (m2 < 0) {
            m2 = 0;
        }
        int k2 = Constraints.k(j2);
        if (k2 == Integer.MAX_VALUE || (k2 = k2 + i3) >= 0) {
            i4 = k2;
        }
        return a(n2, l2, m2, i4);
    }

    public static /* synthetic */ long j(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return i(j2, i2, i3);
    }

    public static final void k(int i2, int i3) {
        throw new IllegalArgumentException("Can't represent a width of " + i2 + " and height of " + i3 + " in Constraints");
    }

    public static final Void l(int i2) {
        throw new IllegalArgumentException("Can't represent a size of " + i2 + " in Constraints");
    }
}
