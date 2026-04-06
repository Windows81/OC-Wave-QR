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
public final class Shorts extends ShortsMethodsForWeb {

    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int c2 = Shorts.c(sArr[i2], sArr2[i2]);
                if (c2 != 0) {
                    return c2;
                }
            }
            return sArr.length - sArr2.length;
        }

        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29179A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29180B;

        /* renamed from: z  reason: collision with root package name */
        public final short[] f29181z;

        public ShortArrayAsList(short[] sArr, int i2, int i3) {
            this.f29181z = sArr;
            this.f29179A = i2;
            this.f29180B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Short) && Shorts.e(this.f29181z, ((Short) obj).shortValue(), this.f29179A, this.f29180B) != -1;
        }

        /* renamed from: e */
        public Short get(int i2) {
            Preconditions.o(i2, size());
            return Short.valueOf(this.f29181z[this.f29179A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29181z[this.f29179A + i2] != shortArrayAsList.f29181z[shortArrayAsList.f29179A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Short set(int i2, Short sh) {
            Preconditions.o(i2, size());
            short[] sArr = this.f29181z;
            int i3 = this.f29179A;
            short s2 = sArr[i3 + i2];
            sArr[i3 + i2] = ((Short) Preconditions.q(sh)).shortValue();
            return Short.valueOf(s2);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29179A; i3 < this.f29180B; i3++) {
                i2 = (i2 * 31) + Shorts.d(this.f29181z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Short) || (a2 = Shorts.e(this.f29181z, ((Short) obj).shortValue(), this.f29179A, this.f29180B)) < 0) {
                return -1;
            }
            return a2 - this.f29179A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Short) || (b2 = Shorts.f(this.f29181z, ((Short) obj).shortValue(), this.f29179A, this.f29180B)) < 0) {
                return -1;
            }
            return b2 - this.f29179A;
        }

        public int size() {
            return this.f29180B - this.f29179A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            short[] sArr = this.f29181z;
            int i4 = this.f29179A;
            return new ShortArrayAsList(sArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append(this.f29181z[this.f29179A]);
            int i2 = this.f29179A;
            while (true) {
                i2++;
                if (i2 < this.f29180B) {
                    sb.append(", ");
                    sb.append(this.f29181z[i2]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final ShortConverter f29182A = new ShortConverter();

        /* renamed from: h */
        public String d(Short sh) {
            return sh.toString();
        }

        /* renamed from: i */
        public Short e(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    public static int c(short s2, short s3) {
        return s2 - s3;
    }

    public static int d(short s2) {
        return s2;
    }

    public static int e(short[] sArr, short s2, int i2, int i3) {
        while (i2 < i3) {
            if (sArr[i2] == s2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(short[] sArr, short s2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (sArr[i4] == s2) {
                return i4;
            }
        }
        return -1;
    }
}
