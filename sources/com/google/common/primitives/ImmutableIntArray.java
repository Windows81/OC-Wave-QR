package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@Immutable
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray C = new ImmutableIntArray(new int[0]);

    /* renamed from: A  reason: collision with root package name */
    public final transient int f29154A;

    /* renamed from: B  reason: collision with root package name */
    public final int f29155B;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f29156z;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableIntArray f29157z;

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        /* renamed from: e */
        public Integer get(int i2) {
            return Integer.valueOf(this.f29157z.d(i2));
        }

        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.f29157z.equals(((AsList) obj).f29157z);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int b2 = this.f29157z.f29154A;
            for (Object next : list) {
                if (next instanceof Integer) {
                    int i2 = b2 + 1;
                    if (this.f29157z.f29156z[b2] == ((Integer) next).intValue()) {
                        b2 = i2;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f29157z.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f29157z.e(((Integer) obj).intValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f29157z.g(((Integer) obj).intValue());
            }
            return -1;
        }

        public int size() {
            return this.f29157z.h();
        }

        public List subList(int i2, int i3) {
            return this.f29157z.i(i2, i3).c();
        }

        public String toString() {
            return this.f29157z.toString();
        }

        public AsList(ImmutableIntArray immutableIntArray) {
            this.f29157z = immutableIntArray;
        }
    }

    public static final class Builder {
    }

    public ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public List c() {
        return new AsList();
    }

    public int d(int i2) {
        Preconditions.o(i2, h());
        return this.f29156z[this.f29154A + i2];
    }

    public int e(int i2) {
        for (int i3 = this.f29154A; i3 < this.f29155B; i3++) {
            if (this.f29156z[i3] == i2) {
                return i3 - this.f29154A;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (h() != immutableIntArray.h()) {
            return false;
        }
        for (int i2 = 0; i2 < h(); i2++) {
            if (d(i2) != immutableIntArray.d(i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return this.f29155B == this.f29154A;
    }

    public int g(int i2) {
        int i3 = this.f29155B;
        while (true) {
            i3--;
            int i4 = this.f29154A;
            if (i3 < i4) {
                return -1;
            }
            if (this.f29156z[i3] == i2) {
                return i3 - i4;
            }
        }
    }

    public int h() {
        return this.f29155B - this.f29154A;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.f29154A; i3 < this.f29155B; i3++) {
            i2 = (i2 * 31) + Ints.g(this.f29156z[i3]);
        }
        return i2;
    }

    public ImmutableIntArray i(int i2, int i3) {
        Preconditions.v(i2, i3, h());
        if (i2 == i3) {
            return C;
        }
        int[] iArr = this.f29156z;
        int i4 = this.f29154A;
        return new ImmutableIntArray(iArr, i2 + i4, i4 + i3);
    }

    public String toString() {
        if (f()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(h() * 5);
        sb.append('[');
        sb.append(this.f29156z[this.f29154A]);
        int i2 = this.f29154A;
        while (true) {
            i2++;
            if (i2 < this.f29155B) {
                sb.append(", ");
                sb.append(this.f29156z[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public ImmutableIntArray(int[] iArr, int i2, int i3) {
        this.f29156z = iArr;
        this.f29154A = i2;
        this.f29155B = i3;
    }
}
