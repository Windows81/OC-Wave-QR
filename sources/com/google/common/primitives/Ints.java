package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public final class Ints extends IntsMethodsForWeb {

    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29162A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29163B;

        /* renamed from: z  reason: collision with root package name */
        public final int[] f29164z;

        public IntArrayAsList(int[] iArr, int i2, int i3) {
            this.f29164z = iArr;
            this.f29162A = i2;
            this.f29163B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && Ints.h(this.f29164z, ((Integer) obj).intValue(), this.f29162A, this.f29163B) != -1;
        }

        /* renamed from: e */
        public Integer get(int i2) {
            Preconditions.o(i2, size());
            return Integer.valueOf(this.f29164z[this.f29162A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29164z[this.f29162A + i2] != intArrayAsList.f29164z[intArrayAsList.f29162A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Integer set(int i2, Integer num) {
            Preconditions.o(i2, size());
            int[] iArr = this.f29164z;
            int i3 = this.f29162A;
            int i4 = iArr[i3 + i2];
            iArr[i3 + i2] = ((Integer) Preconditions.q(num)).intValue();
            return Integer.valueOf(i4);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29162A; i3 < this.f29163B; i3++) {
                i2 = (i2 * 31) + Ints.g(this.f29164z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Integer) || (a2 = Ints.h(this.f29164z, ((Integer) obj).intValue(), this.f29162A, this.f29163B)) < 0) {
                return -1;
            }
            return a2 - this.f29162A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Integer) || (b2 = Ints.i(this.f29164z, ((Integer) obj).intValue(), this.f29162A, this.f29163B)) < 0) {
                return -1;
            }
            return b2 - this.f29162A;
        }

        public int size() {
            return this.f29163B - this.f29162A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            int[] iArr = this.f29164z;
            int i4 = this.f29162A;
            return new IntArrayAsList(iArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f29164z[this.f29162A]);
            int i2 = this.f29162A;
            while (true) {
                i2++;
                if (i2 < this.f29163B) {
                    sb.append(", ");
                    sb.append(this.f29164z[i2]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final IntConverter f29165A = new IntConverter();

        /* renamed from: h */
        public String d(Integer num) {
            return num.toString();
        }

        /* renamed from: i */
        public Integer e(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int d2 = Ints.d(iArr[i2], iArr2[i2]);
                if (d2 != 0) {
                    return d2;
                }
            }
            return iArr.length - iArr2.length;
        }

        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static int c(long j2) {
        int i2 = (int) j2;
        Preconditions.i(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int d(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    public static int e(int i2, int i3, int i4) {
        Preconditions.h(i3 <= i4, "min (%s) must be less than or equal to max (%s)", i3, i4);
        return Math.min(Math.max(i2, i3), i4);
    }

    public static int f(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int g(int i2) {
        return i2;
    }

    public static int h(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static int i(int[] iArr, int i2, int i3, int i4) {
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            if (iArr[i5] == i2) {
                return i5;
            }
        }
        return -1;
    }

    public static int j(int... iArr) {
        Preconditions.d(iArr.length > 0);
        int i2 = iArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public static int k(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }
}
