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
public final class Floats extends FloatsMethodsForWeb {

    public static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29144A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29145B;

        /* renamed from: z  reason: collision with root package name */
        public final float[] f29146z;

        public FloatArrayAsList(float[] fArr, int i2, int i3) {
            this.f29146z = fArr;
            this.f29144A = i2;
            this.f29145B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Float) && Floats.d(this.f29146z, ((Float) obj).floatValue(), this.f29144A, this.f29145B) != -1;
        }

        /* renamed from: e */
        public Float get(int i2) {
            Preconditions.o(i2, size());
            return Float.valueOf(this.f29146z[this.f29144A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29146z[this.f29144A + i2] != floatArrayAsList.f29146z[floatArrayAsList.f29144A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Float set(int i2, Float f2) {
            Preconditions.o(i2, size());
            float[] fArr = this.f29146z;
            int i3 = this.f29144A;
            float f3 = fArr[i3 + i2];
            fArr[i3 + i2] = ((Float) Preconditions.q(f2)).floatValue();
            return Float.valueOf(f3);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29144A; i3 < this.f29145B; i3++) {
                i2 = (i2 * 31) + Floats.c(this.f29146z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Float) || (a2 = Floats.d(this.f29146z, ((Float) obj).floatValue(), this.f29144A, this.f29145B)) < 0) {
                return -1;
            }
            return a2 - this.f29144A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Float) || (b2 = Floats.e(this.f29146z, ((Float) obj).floatValue(), this.f29144A, this.f29145B)) < 0) {
                return -1;
            }
            return b2 - this.f29144A;
        }

        public int size() {
            return this.f29145B - this.f29144A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            float[] fArr = this.f29146z;
            int i4 = this.f29144A;
            return new FloatArrayAsList(fArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f29146z[this.f29144A]);
            int i2 = this.f29144A;
            while (true) {
                i2++;
                if (i2 < this.f29145B) {
                    sb.append(", ");
                    sb.append(this.f29146z[i2]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static final class FloatConverter extends Converter<String, Float> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final FloatConverter f29147A = new FloatConverter();

        /* renamed from: h */
        public String d(Float f2) {
            return f2.toString();
        }

        /* renamed from: i */
        public Float e(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int compare = Float.compare(fArr[i2], fArr2[i2]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }

        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    public static int c(float f2) {
        return Float.valueOf(f2).hashCode();
    }

    public static int d(float[] fArr, float f2, int i2, int i3) {
        while (i2 < i3) {
            if (fArr[i2] == f2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int e(float[] fArr, float f2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (fArr[i4] == f2) {
                return i4;
            }
        }
        return -1;
    }
}
