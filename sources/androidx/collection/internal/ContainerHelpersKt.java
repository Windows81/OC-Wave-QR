package androidx.collection.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContainerHelpersKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2006a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f2007b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f2008c = new Object[0];

    public static final int a(int[] iArr, int i2, int i3) {
        Intrinsics.i(iArr, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 <= i3) {
                return i6;
            } else {
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int b(long[] jArr, int i2, long j2) {
        Intrinsics.i(jArr, "array");
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = (jArr[i5] > j2 ? 1 : (jArr[i5] == j2 ? 0 : -1));
            if (i6 < 0) {
                i4 = i5 + 1;
            } else if (i6 <= 0) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    public static final int d(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                return i4;
            }
        }
        return i2;
    }

    public static final int e(int i2) {
        return d(i2 * 4) / 4;
    }

    public static final int f(int i2) {
        return d(i2 * 8) / 8;
    }
}
