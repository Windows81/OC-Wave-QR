package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
public final class Doubles extends DoublesMethodsForWeb {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f29137a = c();

    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29138A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29139B;

        /* renamed from: z  reason: collision with root package name */
        public final double[] f29140z;

        public DoubleArrayAsList(double[] dArr, int i2, int i3) {
            this.f29140z = dArr;
            this.f29138A = i2;
            this.f29139B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Double) && Doubles.e(this.f29140z, ((Double) obj).doubleValue(), this.f29138A, this.f29139B) != -1;
        }

        /* renamed from: e */
        public Double get(int i2) {
            Preconditions.o(i2, size());
            return Double.valueOf(this.f29140z[this.f29138A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29140z[this.f29138A + i2] != doubleArrayAsList.f29140z[doubleArrayAsList.f29138A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Double set(int i2, Double d2) {
            Preconditions.o(i2, size());
            double[] dArr = this.f29140z;
            int i3 = this.f29138A;
            double d3 = dArr[i3 + i2];
            dArr[i3 + i2] = ((Double) Preconditions.q(d2)).doubleValue();
            return Double.valueOf(d3);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29138A; i3 < this.f29139B; i3++) {
                i2 = (i2 * 31) + Doubles.d(this.f29140z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Double) || (a2 = Doubles.e(this.f29140z, ((Double) obj).doubleValue(), this.f29138A, this.f29139B)) < 0) {
                return -1;
            }
            return a2 - this.f29138A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Double) || (b2 = Doubles.f(this.f29140z, ((Double) obj).doubleValue(), this.f29138A, this.f29139B)) < 0) {
                return -1;
            }
            return b2 - this.f29138A;
        }

        public int size() {
            return this.f29139B - this.f29138A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            double[] dArr = this.f29140z;
            int i4 = this.f29138A;
            return new DoubleArrayAsList(dArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f29140z[this.f29138A]);
            int i2 = this.f29138A;
            while (true) {
                i2++;
                if (i2 < this.f29139B) {
                    sb.append(", ");
                    sb.append(this.f29140z[i2]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final DoubleConverter f29141A = new DoubleConverter();

        /* renamed from: h */
        public String d(Double d2) {
            return d2.toString();
        }

        /* renamed from: i */
        public Double e(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(double[] dArr, double[] dArr2) {
            int min = Math.min(dArr.length, dArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int compare = Double.compare(dArr[i2], dArr2[i2]);
                if (compare != 0) {
                    return compare;
                }
            }
            return dArr.length - dArr2.length;
        }

        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    public static Pattern c() {
        String concat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb.append("0[xX]");
        sb.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        sb.append("[pP][+-]?\\d+#[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 23 + String.valueOf(sb2).length());
        sb3.append("[+-]?(?:NaN|Infinity|");
        sb3.append(concat);
        sb3.append("|");
        sb3.append(sb2);
        sb3.append(")");
        return Pattern.compile(sb3.toString().replace("#", "+"));
    }

    public static int d(double d2) {
        return Double.valueOf(d2).hashCode();
    }

    public static int e(double[] dArr, double d2, int i2, int i3) {
        while (i2 < i3) {
            if (dArr[i2] == d2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(double[] dArr, double d2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (dArr[i4] == d2) {
                return i4;
            }
        }
        return -1;
    }
}
