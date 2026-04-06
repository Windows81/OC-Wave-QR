package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public final class Chars {

    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29132A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29133B;

        /* renamed from: z  reason: collision with root package name */
        public final char[] f29134z;

        public CharArrayAsList(char[] cArr, int i2, int i3) {
            this.f29134z = cArr;
            this.f29132A = i2;
            this.f29133B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Character) && Chars.e(this.f29134z, ((Character) obj).charValue(), this.f29132A, this.f29133B) != -1;
        }

        /* renamed from: e */
        public Character get(int i2) {
            Preconditions.o(i2, size());
            return Character.valueOf(this.f29134z[this.f29132A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29134z[this.f29132A + i2] != charArrayAsList.f29134z[charArrayAsList.f29132A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Character set(int i2, Character ch) {
            Preconditions.o(i2, size());
            char[] cArr = this.f29134z;
            int i3 = this.f29132A;
            char c2 = cArr[i3 + i2];
            cArr[i3 + i2] = ((Character) Preconditions.q(ch)).charValue();
            return Character.valueOf(c2);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29132A; i3 < this.f29133B; i3++) {
                i2 = (i2 * 31) + Chars.d(this.f29134z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Character) || (a2 = Chars.e(this.f29134z, ((Character) obj).charValue(), this.f29132A, this.f29133B)) < 0) {
                return -1;
            }
            return a2 - this.f29132A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Character) || (b2 = Chars.f(this.f29134z, ((Character) obj).charValue(), this.f29132A, this.f29133B)) < 0) {
                return -1;
            }
            return b2 - this.f29132A;
        }

        public int size() {
            return this.f29133B - this.f29132A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            char[] cArr = this.f29134z;
            int i4 = this.f29132A;
            return new CharArrayAsList(cArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append('[');
            sb.append(this.f29134z[this.f29132A]);
            int i2 = this.f29132A;
            while (true) {
                i2++;
                if (i2 < this.f29133B) {
                    sb.append(", ");
                    sb.append(this.f29134z[i2]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int c2 = Chars.c(cArr[i2], cArr2[i2]);
                if (c2 != 0) {
                    return c2;
                }
            }
            return cArr.length - cArr2.length;
        }

        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    public static int c(char c2, char c3) {
        return c2 - c3;
    }

    public static int d(char c2) {
        return c2;
    }

    public static int e(char[] cArr, char c2, int i2, int i3) {
        while (i2 < i3) {
            if (cArr[i2] == c2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(char[] cArr, char c2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (cArr[i4] == c2) {
                return i4;
            }
        }
        return -1;
    }
}
