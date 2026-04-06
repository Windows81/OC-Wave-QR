package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SlotTableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f14862a = new long[0];

    public static final int m(int[] iArr, int i2) {
        int i3 = i2 * 5;
        if (i3 >= iArr.length) {
            return iArr.length;
        }
        return Integer.bitCount(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
    }

    public static final Anchor n(ArrayList arrayList, int i2, int i3) {
        int s2 = s(arrayList, i2, i3);
        if (s2 >= 0) {
            return (Anchor) arrayList.get(s2);
        }
        return null;
    }

    public static final int o(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    public static final void p(int[] iArr, int i2, int i3, boolean z2, boolean z3, boolean z4, int i4, int i5) {
        int i6 = i2 * 5;
        iArr[i6] = i3;
        iArr[i6 + 1] = ((z2 ? 1 : 0) << true) | ((z3 ? 1 : 0) << true) | ((z4 ? 1 : 0) << true);
        iArr[i6 + 2] = i4;
        iArr[i6 + 3] = 0;
        iArr[i6 + 4] = i5;
    }

    public static final int q(ArrayList arrayList, int i2, int i3) {
        int s2 = s(arrayList, i2, i3);
        return s2 >= 0 ? s2 : -(s2 + 1);
    }

    public static final int r(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 30);
    }

    public static final int s(ArrayList arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int a2 = ((Anchor) arrayList.get(i5)).a();
            if (a2 < 0) {
                a2 += i3;
            }
            int k2 = Intrinsics.k(a2, i2);
            if (k2 < 0) {
                i4 = i5 + 1;
            } else if (k2 <= 0) {
                return i5;
            } else {
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int t(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 28);
    }

    public static final void u() {
        throw new ConcurrentModificationException();
    }

    public static final void v(int[] iArr, int i2, boolean z2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = ((z2 ? 1 : 0) << true) | (iArr[i3] & -67108865);
    }

    public static final void w(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 3] = i3;
    }

    public static final void x(int[] iArr, int i2, boolean z2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = ((z2 ? 1 : 0) << true) | (iArr[i3] & -134217729);
    }

    public static final void y(int[] iArr, int i2, int i3) {
        if (i3 >= 0) {
        }
        int i4 = (i2 * 5) + 1;
        iArr[i4] = i3 | (iArr[i4] & -67108864);
    }
}
