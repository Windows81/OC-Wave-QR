package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {
    public static double[] A(double[] dArr, double[] dArr2) {
        Intrinsics.i(dArr, "<this>");
        Intrinsics.i(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static float[] B(float[] fArr, float[] fArr2) {
        Intrinsics.i(fArr, "<this>");
        Intrinsics.i(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static int[] C(int[] iArr, int i2) {
        Intrinsics.i(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i2;
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static int[] D(int[] iArr, int[] iArr2) {
        Intrinsics.i(iArr, "<this>");
        Intrinsics.i(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static long[] E(long[] jArr, long[] jArr2) {
        Intrinsics.i(jArr, "<this>");
        Intrinsics.i(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static Object[] F(Object[] objArr, Object obj) {
        Intrinsics.i(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static Object[] G(Object[] objArr, Object[] objArr2) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static boolean[] H(boolean[] zArr, boolean[] zArr2) {
        Intrinsics.i(zArr, "<this>");
        Intrinsics.i(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static void I(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void J(int[] iArr, int i2, int i3) {
        Intrinsics.i(iArr, "<this>");
        Arrays.sort(iArr, i2, i3);
    }

    public static final void K(Object[] objArr, Comparator comparator) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void L(Object[] objArr, Comparator comparator, int i2, int i3) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(comparator, "comparator");
        Arrays.sort(objArr, i2, i3, comparator);
    }

    public static Boolean[] M(boolean[] zArr) {
        Intrinsics.i(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolArr[i2] = Boolean.valueOf(zArr[i2]);
        }
        return boolArr;
    }

    public static Double[] N(double[] dArr) {
        Intrinsics.i(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    public static Float[] O(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    public static Integer[] P(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static Long[] Q(long[] jArr) {
        Intrinsics.i(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static List d(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        List a2 = ArraysUtilJVM.a(objArr);
        Intrinsics.h(a2, "asList(...)");
        return a2;
    }

    public static final int e(float[] fArr, float f2, int i2, int i3) {
        Intrinsics.i(fArr, "<this>");
        return Arrays.binarySearch(fArr, i2, i3, f2);
    }

    public static /* synthetic */ int f(float[] fArr, float f2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = fArr.length;
        }
        return e(fArr, f2, i2, i3);
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        Intrinsics.i(bArr, "<this>");
        Intrinsics.i(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static char[] h(char[] cArr, char[] cArr2, int i2, int i3, int i4) {
        Intrinsics.i(cArr, "<this>");
        Intrinsics.i(cArr2, "destination");
        System.arraycopy(cArr, i3, cArr2, i2, i4 - i3);
        return cArr2;
    }

    public static float[] i(float[] fArr, float[] fArr2, int i2, int i3, int i4) {
        Intrinsics.i(fArr, "<this>");
        Intrinsics.i(fArr2, "destination");
        System.arraycopy(fArr, i3, fArr2, i2, i4 - i3);
        return fArr2;
    }

    public static int[] j(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        Intrinsics.i(iArr, "<this>");
        Intrinsics.i(iArr2, "destination");
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
        return iArr2;
    }

    public static long[] k(long[] jArr, long[] jArr2, int i2, int i3, int i4) {
        Intrinsics.i(jArr, "<this>");
        Intrinsics.i(jArr2, "destination");
        System.arraycopy(jArr, i3, jArr2, i2, i4 - i3);
        return jArr2;
    }

    public static Object[] l(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
        return objArr2;
    }

    public static /* synthetic */ byte[] m(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        return ArraysKt.g(bArr, bArr2, i2, i3, i4);
    }

    public static /* synthetic */ float[] n(float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = fArr.length;
        }
        return ArraysKt.i(fArr, fArr2, i2, i3, i4);
    }

    public static /* synthetic */ int[] o(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = iArr.length;
        }
        return ArraysKt.j(iArr, iArr2, i2, i3, i4);
    }

    public static /* synthetic */ long[] p(long[] jArr, long[] jArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = jArr.length;
        }
        return ArraysKt.k(jArr, jArr2, i2, i3, i4);
    }

    public static /* synthetic */ Object[] q(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        return ArraysKt.l(objArr, objArr2, i2, i3, i4);
    }

    public static byte[] r(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "<this>");
        ArraysKt__ArraysJVMKt.b(i3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        Intrinsics.h(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static float[] s(float[] fArr, int i2, int i3) {
        Intrinsics.i(fArr, "<this>");
        ArraysKt__ArraysJVMKt.b(i3, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i2, i3);
        Intrinsics.h(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] t(Object[] objArr, int i2, int i3) {
        Intrinsics.i(objArr, "<this>");
        ArraysKt__ArraysJVMKt.b(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        Intrinsics.h(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void u(int[] iArr, int i2, int i3, int i4) {
        Intrinsics.i(iArr, "<this>");
        Arrays.fill(iArr, i3, i4, i2);
    }

    public static void v(long[] jArr, long j2, int i2, int i3) {
        Intrinsics.i(jArr, "<this>");
        Arrays.fill(jArr, i2, i3, j2);
    }

    public static void w(Object[] objArr, Object obj, int i2, int i3) {
        Intrinsics.i(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, obj);
    }

    public static /* synthetic */ void x(int[] iArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = iArr.length;
        }
        ArraysKt.u(iArr, i2, i3, i4);
    }

    public static /* synthetic */ void y(long[] jArr, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = jArr.length;
        }
        ArraysKt.v(jArr, j2, i2, i3);
    }

    public static /* synthetic */ void z(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        ArraysKt.w(objArr, obj, i2, i3);
    }
}
