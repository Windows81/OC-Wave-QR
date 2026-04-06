package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public final class Booleans {

    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29121A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29122B;

        /* renamed from: z  reason: collision with root package name */
        public final boolean[] f29123z;

        public BooleanArrayAsList(boolean[] zArr, int i2, int i3) {
            this.f29123z = zArr;
            this.f29121A = i2;
            this.f29122B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && Booleans.e(this.f29123z, ((Boolean) obj).booleanValue(), this.f29121A, this.f29122B) != -1;
        }

        /* renamed from: e */
        public Boolean get(int i2) {
            Preconditions.o(i2, size());
            return Boolean.valueOf(this.f29123z[this.f29121A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29123z[this.f29121A + i2] != booleanArrayAsList.f29123z[booleanArrayAsList.f29121A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Boolean set(int i2, Boolean bool) {
            Preconditions.o(i2, size());
            boolean[] zArr = this.f29123z;
            int i3 = this.f29121A;
            boolean z2 = zArr[i3 + i2];
            zArr[i3 + i2] = ((Boolean) Preconditions.q(bool)).booleanValue();
            return Boolean.valueOf(z2);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29121A; i3 < this.f29122B; i3++) {
                i2 = (i2 * 31) + Booleans.d(this.f29123z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Boolean) || (a2 = Booleans.e(this.f29123z, ((Boolean) obj).booleanValue(), this.f29121A, this.f29122B)) < 0) {
                return -1;
            }
            return a2 - this.f29121A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Boolean) || (b2 = Booleans.f(this.f29123z, ((Boolean) obj).booleanValue(), this.f29121A, this.f29122B)) < 0) {
                return -1;
            }
            return b2 - this.f29121A;
        }

        public int size() {
            return this.f29122B - this.f29121A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f29123z;
            int i4 = this.f29121A;
            return new BooleanArrayAsList(zArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.f29123z[this.f29121A] ? "[true" : "[false");
            int i2 = this.f29121A;
            while (true) {
                i2++;
                if (i2 < this.f29122B) {
                    sb.append(this.f29123z[i2] ? ", true" : ", false");
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");
        

        /* renamed from: A  reason: collision with root package name */
        public final String f29125A;

        /* renamed from: z  reason: collision with root package name */
        public final int f29126z;

        /* access modifiers changed from: public */
        BooleanComparator(int i2, String str) {
            this.f29126z = i2;
            this.f29125A = str;
        }

        /* renamed from: f */
        public int compare(Boolean bool, Boolean bool2) {
            int i2 = 0;
            int i3 = bool.booleanValue() ? this.f29126z : 0;
            if (bool2.booleanValue()) {
                i2 = this.f29126z;
            }
            return i2 - i3;
        }

        public String toString() {
            return this.f29125A;
        }
    }

    public enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int c2 = Booleans.c(zArr[i2], zArr2[i2]);
                if (c2 != 0) {
                    return c2;
                }
            }
            return zArr.length - zArr2.length;
        }

        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    public static int c(boolean z2, boolean z3) {
        if (z2 == z3) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    public static int d(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int e(boolean[] zArr, boolean z2, int i2, int i3) {
        while (i2 < i3) {
            if (zArr[i2] == z2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(boolean[] zArr, boolean z2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (zArr[i4] == z2) {
                return i4;
            }
        }
        return -1;
    }
}
