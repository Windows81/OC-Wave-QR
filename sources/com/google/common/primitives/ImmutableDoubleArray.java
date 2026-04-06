package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@Immutable
public final class ImmutableDoubleArray implements Serializable {
    public static final ImmutableDoubleArray C = new ImmutableDoubleArray(new double[0]);

    /* renamed from: A  reason: collision with root package name */
    public final transient int f29150A;

    /* renamed from: B  reason: collision with root package name */
    public final int f29151B;

    /* renamed from: z  reason: collision with root package name */
    public final double[] f29152z;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableDoubleArray f29153z;

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        /* renamed from: e */
        public Double get(int i2) {
            return Double.valueOf(this.f29153z.f(i2));
        }

        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.f29153z.equals(((AsList) obj).f29153z);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int b2 = this.f29153z.f29150A;
            for (Object next : list) {
                if (next instanceof Double) {
                    int i2 = b2 + 1;
                    if (ImmutableDoubleArray.d(this.f29153z.f29152z[b2], ((Double) next).doubleValue())) {
                        b2 = i2;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f29153z.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f29153z.g(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f29153z.i(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int size() {
            return this.f29153z.j();
        }

        public List subList(int i2, int i3) {
            return this.f29153z.k(i2, i3).e();
        }

        public String toString() {
            return this.f29153z.toString();
        }

        public AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.f29153z = immutableDoubleArray;
        }
    }

    public static final class Builder {
    }

    public ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static boolean d(double d2, double d3) {
        return Double.doubleToLongBits(d2) == Double.doubleToLongBits(d3);
    }

    public List e() {
        return new AsList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (j() != immutableDoubleArray.j()) {
            return false;
        }
        for (int i2 = 0; i2 < j(); i2++) {
            if (!d(f(i2), immutableDoubleArray.f(i2))) {
                return false;
            }
        }
        return true;
    }

    public double f(int i2) {
        Preconditions.o(i2, j());
        return this.f29152z[this.f29150A + i2];
    }

    public int g(double d2) {
        for (int i2 = this.f29150A; i2 < this.f29151B; i2++) {
            if (d(this.f29152z[i2], d2)) {
                return i2 - this.f29150A;
            }
        }
        return -1;
    }

    public boolean h() {
        return this.f29151B == this.f29150A;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.f29150A; i3 < this.f29151B; i3++) {
            i2 = (i2 * 31) + Doubles.d(this.f29152z[i3]);
        }
        return i2;
    }

    public int i(double d2) {
        int i2 = this.f29151B;
        while (true) {
            i2--;
            if (i2 < this.f29150A) {
                return -1;
            }
            if (d(this.f29152z[i2], d2)) {
                return i2 - this.f29150A;
            }
        }
    }

    public int j() {
        return this.f29151B - this.f29150A;
    }

    public ImmutableDoubleArray k(int i2, int i3) {
        Preconditions.v(i2, i3, j());
        if (i2 == i3) {
            return C;
        }
        double[] dArr = this.f29152z;
        int i4 = this.f29150A;
        return new ImmutableDoubleArray(dArr, i2 + i4, i4 + i3);
    }

    public String toString() {
        if (h()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(j() * 5);
        sb.append('[');
        sb.append(this.f29152z[this.f29150A]);
        int i2 = this.f29150A;
        while (true) {
            i2++;
            if (i2 < this.f29151B) {
                sb.append(", ");
                sb.append(this.f29152z[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public ImmutableDoubleArray(double[] dArr, int i2, int i3) {
        this.f29152z = dArr;
        this.f29150A = i2;
        this.f29151B = i3;
    }
}
