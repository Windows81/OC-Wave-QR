package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@Immutable
public final class ImmutableLongArray implements Serializable {
    public static final ImmutableLongArray C = new ImmutableLongArray(new long[0]);

    /* renamed from: A  reason: collision with root package name */
    public final transient int f29158A;

    /* renamed from: B  reason: collision with root package name */
    public final int f29159B;

    /* renamed from: z  reason: collision with root package name */
    public final long[] f29160z;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableLongArray f29161z;

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        /* renamed from: e */
        public Long get(int i2) {
            return Long.valueOf(this.f29161z.d(i2));
        }

        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.f29161z.equals(((AsList) obj).f29161z);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int b2 = this.f29161z.f29158A;
            for (Object next : list) {
                if (next instanceof Long) {
                    int i2 = b2 + 1;
                    if (this.f29161z.f29160z[b2] == ((Long) next).longValue()) {
                        b2 = i2;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f29161z.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f29161z.e(((Long) obj).longValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f29161z.g(((Long) obj).longValue());
            }
            return -1;
        }

        public int size() {
            return this.f29161z.h();
        }

        public List subList(int i2, int i3) {
            return this.f29161z.i(i2, i3).c();
        }

        public String toString() {
            return this.f29161z.toString();
        }

        public AsList(ImmutableLongArray immutableLongArray) {
            this.f29161z = immutableLongArray;
        }
    }

    public static final class Builder {
    }

    public ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public List c() {
        return new AsList();
    }

    public long d(int i2) {
        Preconditions.o(i2, h());
        return this.f29160z[this.f29158A + i2];
    }

    public int e(long j2) {
        for (int i2 = this.f29158A; i2 < this.f29159B; i2++) {
            if (this.f29160z[i2] == j2) {
                return i2 - this.f29158A;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (h() != immutableLongArray.h()) {
            return false;
        }
        for (int i2 = 0; i2 < h(); i2++) {
            if (d(i2) != immutableLongArray.d(i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return this.f29159B == this.f29158A;
    }

    public int g(long j2) {
        int i2 = this.f29159B;
        while (true) {
            i2--;
            int i3 = this.f29158A;
            if (i2 < i3) {
                return -1;
            }
            if (this.f29160z[i2] == j2) {
                return i2 - i3;
            }
        }
    }

    public int h() {
        return this.f29159B - this.f29158A;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.f29158A; i3 < this.f29159B; i3++) {
            i2 = (i2 * 31) + Longs.e(this.f29160z[i3]);
        }
        return i2;
    }

    public ImmutableLongArray i(int i2, int i3) {
        Preconditions.v(i2, i3, h());
        if (i2 == i3) {
            return C;
        }
        long[] jArr = this.f29160z;
        int i4 = this.f29158A;
        return new ImmutableLongArray(jArr, i2 + i4, i4 + i3);
    }

    public String toString() {
        if (f()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(h() * 5);
        sb.append('[');
        sb.append(this.f29160z[this.f29158A]);
        int i2 = this.f29158A;
        while (true) {
            i2++;
            if (i2 < this.f29159B) {
                sb.append(", ");
                sb.append(this.f29160z[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public ImmutableLongArray(long[] jArr, int i2, int i3) {
        this.f29160z = jArr;
        this.f29158A = i2;
        this.f29159B = i3;
    }
}
