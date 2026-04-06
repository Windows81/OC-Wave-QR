package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata
class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final String A0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        return ((StringBuilder) x0(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String B0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return z0(bArr, charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
    }

    public static /* synthetic */ String C0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return A0(objArr, charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
    }

    public static Object D0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[ArraysKt.m0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int E0(byte[] bArr, byte b2) {
        Intrinsics.i(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (b2 == bArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final int F0(char[] cArr, char c2) {
        Intrinsics.i(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (c2 == cArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static int G0(int[] iArr, int i2) {
        Intrinsics.i(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (i2 == iArr[length]) {
                    return length;
                }
                if (i3 < 0) {
                    break;
                }
                length = i3;
            }
        }
        return -1;
    }

    public static int H0(long[] jArr, long j2) {
        Intrinsics.i(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (j2 == jArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static int I0(Object[] objArr, Object obj) {
        Intrinsics.i(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (Intrinsics.d(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
        }
        return -1;
    }

    public static int J0(short[] sArr, short s2) {
        Intrinsics.i(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (s2 == sArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final int K0(boolean[] zArr, boolean z2) {
        Intrinsics.i(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (z2 == zArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static Float L0(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static Object M0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static Float N0(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int j0 = ArraysKt.j0(fArr);
        int i2 = 1;
        if (1 <= j0) {
            while (true) {
                f2 = Math.max(f2, fArr[i2]);
                if (i2 == j0) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    public static int O0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int k0 = ArraysKt.k0(iArr);
            int i3 = 1;
            if (1 <= k0) {
                while (true) {
                    int i4 = iArr[i3];
                    if (i2 < i4) {
                        i2 = i4;
                    }
                    if (i3 == k0) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    public static Float P0(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int j0 = ArraysKt.j0(fArr);
        int i2 = 1;
        if (1 <= j0) {
            while (true) {
                f2 = Math.min(f2, fArr[i2]);
                if (i2 == j0) {
                    break;
                }
                i2++;
            }
        }
        return Float.valueOf(f2);
    }

    public static Integer Q0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int k0 = ArraysKt.k0(iArr);
        int i3 = 1;
        if (1 <= k0) {
            while (true) {
                int i4 = iArr[i3];
                if (i2 > i4) {
                    i2 = i4;
                }
                if (i3 == k0) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    public static int R0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        if (iArr.length != 0) {
            int i2 = iArr[0];
            int k0 = ArraysKt.k0(iArr);
            int i3 = 1;
            if (1 <= k0) {
                while (true) {
                    int i4 = iArr[i3];
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    if (i3 == k0) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
        throw new NoSuchElementException();
    }

    public static Iterable S(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return objArr.length == 0 ? CollectionsKt.m() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(objArr);
    }

    public static char S0(char[] cArr) {
        Intrinsics.i(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static Sequence T(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return objArr.length == 0 ? SequencesKt.g() : new ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1(objArr);
    }

    public static Object T0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static boolean U(byte[] bArr, byte b2) {
        Intrinsics.i(bArr, "<this>");
        return ArraysKt.p0(bArr, b2) >= 0;
    }

    public static int U0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public static final boolean V(char[] cArr, char c2) {
        Intrinsics.i(cArr, "<this>");
        return q0(cArr, c2) >= 0;
    }

    public static final Collection V0(Object[] objArr, Collection collection) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(collection, "destination");
        for (Object add : objArr) {
            collection.add(add);
        }
        return collection;
    }

    public static boolean W(int[] iArr, int i2) {
        Intrinsics.i(iArr, "<this>");
        return ArraysKt.r0(iArr, i2) >= 0;
    }

    public static List W0(double[] dArr) {
        Intrinsics.i(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? c1(dArr) : CollectionsKt.e(Double.valueOf(dArr[0])) : CollectionsKt.m();
    }

    public static boolean X(long[] jArr, long j2) {
        Intrinsics.i(jArr, "<this>");
        return ArraysKt.s0(jArr, j2) >= 0;
    }

    public static List X0(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? d1(fArr) : CollectionsKt.e(Float.valueOf(fArr[0])) : CollectionsKt.m();
    }

    public static boolean Y(Object[] objArr, Object obj) {
        Intrinsics.i(objArr, "<this>");
        return ArraysKt.t0(objArr, obj) >= 0;
    }

    public static List Y0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? ArraysKt.e1(iArr) : CollectionsKt.e(Integer.valueOf(iArr[0])) : CollectionsKt.m();
    }

    public static boolean Z(short[] sArr, short s2) {
        Intrinsics.i(sArr, "<this>");
        return ArraysKt.u0(sArr, s2) >= 0;
    }

    public static List Z0(long[] jArr) {
        Intrinsics.i(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? f1(jArr) : CollectionsKt.e(Long.valueOf(jArr[0])) : CollectionsKt.m();
    }

    public static final boolean a0(boolean[] zArr, boolean z2) {
        Intrinsics.i(zArr, "<this>");
        return v0(zArr, z2) >= 0;
    }

    public static List a1(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? ArraysKt.g1(objArr) : CollectionsKt.e(objArr[0]) : CollectionsKt.m();
    }

    public static List b0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return (List) c0(objArr, new ArrayList());
    }

    public static List b1(boolean[] zArr) {
        Intrinsics.i(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? h1(zArr) : CollectionsKt.e(Boolean.valueOf(zArr[0])) : CollectionsKt.m();
    }

    public static final Collection c0(Object[] objArr, Collection collection) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final List c1(double[] dArr) {
        Intrinsics.i(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    public static int d0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List d1(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public static Object e0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List e1(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static Float f0(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final List f1(long[] jArr) {
        Intrinsics.i(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static Object g0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static List g1(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.h(objArr));
    }

    public static IntRange h0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        return new IntRange(0, ArraysKt.k0(iArr));
    }

    public static final List h1(boolean[] zArr) {
        Intrinsics.i(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    public static IntRange i0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return new IntRange(0, ArraysKt.m0(objArr));
    }

    public static final Set i1(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) V0(objArr, new LinkedHashSet(MapsKt.e(objArr.length))) : SetsKt.c(objArr[0]) : SetsKt.d();
    }

    public static int j0(float[] fArr) {
        Intrinsics.i(fArr, "<this>");
        return fArr.length - 1;
    }

    public static Iterable j1(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return new IndexingIterable(new c(objArr));
    }

    public static int k0(int[] iArr) {
        Intrinsics.i(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final Iterator k1(Object[] objArr) {
        return ArrayIteratorKt.a(objArr);
    }

    public static int l0(long[] jArr) {
        Intrinsics.i(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int m0(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Integer n0(int[] iArr, int i2) {
        Intrinsics.i(iArr, "<this>");
        if (i2 < 0 || i2 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i2]);
    }

    public static Object o0(Object[] objArr, int i2) {
        Intrinsics.i(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static int p0(byte[] bArr, byte b2) {
        Intrinsics.i(bArr, "<this>");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b2 == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int q0(char[] cArr, char c2) {
        Intrinsics.i(cArr, "<this>");
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c2 == cArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int r0(int[] iArr, int i2) {
        Intrinsics.i(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static int s0(long[] jArr, long j2) {
        Intrinsics.i(jArr, "<this>");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int t0(Object[] objArr, Object obj) {
        Intrinsics.i(objArr, "<this>");
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (Intrinsics.d(obj, objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int u0(short[] sArr, short s2) {
        Intrinsics.i(sArr, "<this>");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (s2 == sArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int v0(boolean[] zArr, boolean z2) {
        Intrinsics.i(zArr, "<this>");
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (z2 == zArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final Appendable w0(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(bArr, "<this>");
        Intrinsics.i(appendable, "buffer");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i3 = 0;
        for (byte b2 : bArr) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (function1 != null) {
                appendable.append((CharSequence) function1.invoke(Byte.valueOf(b2)));
            } else {
                appendable.append(String.valueOf(b2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Appendable x0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(objArr, "<this>");
        Intrinsics.i(appendable, "buffer");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            StringsKt.a(appendable, obj, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable y0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        String str = (i3 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return x0(objArr, appendable, str, charSequence6, charSequence5, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : charSequence4, (i3 & 64) != 0 ? null : function1);
    }

    public static final String z0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1) {
        Intrinsics.i(bArr, "<this>");
        Intrinsics.i(charSequence, "separator");
        Intrinsics.i(charSequence2, "prefix");
        Intrinsics.i(charSequence3, "postfix");
        Intrinsics.i(charSequence4, "truncated");
        return ((StringBuilder) w0(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }
}
