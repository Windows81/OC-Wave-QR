package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final LongArrayList C = new LongArrayList(new long[0], 0, false);

    /* renamed from: A  reason: collision with root package name */
    public long[] f21050A;

    /* renamed from: B  reason: collision with root package name */
    public int f21051B;

    public LongArrayList(long[] jArr, int i2, boolean z2) {
        super(z2);
        this.f21050A = jArr;
        this.f21051B = i2;
    }

    private void n(int i2) {
        if (i2 < 0 || i2 >= this.f21051B) {
            throw new IndexOutOfBoundsException(q(i2));
        }
    }

    private String q(int i2) {
        return "Index:" + i2 + ", Size:" + this.f21051B;
    }

    public boolean addAll(Collection collection) {
        e();
        Internal.a(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i2 = longArrayList.f21051B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21051B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f21050A;
            if (i4 > jArr.length) {
                this.f21050A = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(longArrayList.f21050A, 0, this.f21050A, this.f21051B, longArrayList.f21051B);
            this.f21051B = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f21051B != longArrayList.f21051B) {
            return false;
        }
        long[] jArr = longArrayList.f21050A;
        for (int i2 = 0; i2 < this.f21051B; i2++) {
            if (this.f21050A[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i2, Long l2) {
        i(i2, l2.longValue());
    }

    /* renamed from: h */
    public boolean add(Long l2) {
        m(l2.longValue());
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f21051B; i3++) {
            i2 = (i2 * 31) + Internal.f(this.f21050A[i3]);
        }
        return i2;
    }

    public final void i(int i2, long j2) {
        int i3;
        e();
        if (i2 < 0 || i2 > (i3 = this.f21051B)) {
            throw new IndexOutOfBoundsException(q(i2));
        }
        long[] jArr = this.f21050A;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f21050A, i2, jArr2, i2 + 1, this.f21051B - i2);
            this.f21050A = jArr2;
        }
        this.f21050A[i2] = j2;
        this.f21051B++;
        this.modCount++;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f21050A[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public void m(long j2) {
        e();
        int i2 = this.f21051B;
        long[] jArr = this.f21050A;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f21050A = jArr2;
        }
        long[] jArr3 = this.f21050A;
        int i3 = this.f21051B;
        this.f21051B = i3 + 1;
        jArr3[i3] = j2;
    }

    /* renamed from: o */
    public Long get(int i2) {
        return Long.valueOf(p(i2));
    }

    public long p(int i2) {
        n(i2);
        return this.f21050A[i2];
    }

    public void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            long[] jArr = this.f21050A;
            System.arraycopy(jArr, i3, jArr, i2, this.f21051B - i3);
            this.f21051B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Long remove(int i2) {
        e();
        n(i2);
        long[] jArr = this.f21050A;
        long j2 = jArr[i2];
        int i3 = this.f21051B;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f21051B--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public int size() {
        return this.f21051B;
    }

    /* renamed from: u */
    public Long set(int i2, Long l2) {
        return Long.valueOf(v(i2, l2.longValue()));
    }

    public long v(int i2, long j2) {
        e();
        n(i2);
        long[] jArr = this.f21050A;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    public Internal.LongList f(int i2) {
        if (i2 >= this.f21051B) {
            return new LongArrayList(Arrays.copyOf(this.f21050A, i2), this.f21051B, true);
        }
        throw new IllegalArgumentException();
    }
}
