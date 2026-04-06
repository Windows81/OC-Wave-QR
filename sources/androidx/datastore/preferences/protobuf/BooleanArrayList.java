package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final BooleanArrayList C = new BooleanArrayList(new boolean[0], 0, false);

    /* renamed from: A  reason: collision with root package name */
    public boolean[] f20764A;

    /* renamed from: B  reason: collision with root package name */
    public int f20765B;

    public BooleanArrayList(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.f20764A = zArr;
        this.f20765B = i2;
    }

    public boolean addAll(Collection collection) {
        e();
        Internal.a(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i2 = booleanArrayList.f20765B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f20765B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f20764A;
            if (i4 > zArr.length) {
                this.f20764A = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(booleanArrayList.f20764A, 0, this.f20764A, this.f20765B, booleanArrayList.f20765B);
            this.f20765B = i4;
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
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f20765B != booleanArrayList.f20765B) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f20764A;
        for (int i2 = 0; i2 < this.f20765B; i2++) {
            if (this.f20764A[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i2, Boolean bool) {
        i(i2, bool.booleanValue());
    }

    /* renamed from: h */
    public boolean add(Boolean bool) {
        m(bool.booleanValue());
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f20765B; i3++) {
            i2 = (i2 * 31) + Internal.c(this.f20764A[i3]);
        }
        return i2;
    }

    public final void i(int i2, boolean z2) {
        int i3;
        e();
        if (i2 < 0 || i2 > (i3 = this.f20765B)) {
            throw new IndexOutOfBoundsException(q(i2));
        }
        boolean[] zArr = this.f20764A;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f20764A, i2, zArr2, i2 + 1, this.f20765B - i2);
            this.f20764A = zArr2;
        }
        this.f20764A[i2] = z2;
        this.f20765B++;
        this.modCount++;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f20764A[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public void m(boolean z2) {
        e();
        int i2 = this.f20765B;
        boolean[] zArr = this.f20764A;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f20764A = zArr2;
        }
        boolean[] zArr3 = this.f20764A;
        int i3 = this.f20765B;
        this.f20765B = i3 + 1;
        zArr3[i3] = z2;
    }

    public final void n(int i2) {
        if (i2 < 0 || i2 >= this.f20765B) {
            throw new IndexOutOfBoundsException(q(i2));
        }
    }

    /* renamed from: o */
    public Boolean get(int i2) {
        return Boolean.valueOf(p(i2));
    }

    public boolean p(int i2) {
        n(i2);
        return this.f20764A[i2];
    }

    public final String q(int i2) {
        return "Index:" + i2 + ", Size:" + this.f20765B;
    }

    public void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            boolean[] zArr = this.f20764A;
            System.arraycopy(zArr, i3, zArr, i2, this.f20765B - i3);
            this.f20765B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Boolean remove(int i2) {
        e();
        n(i2);
        boolean[] zArr = this.f20764A;
        boolean z2 = zArr[i2];
        int i3 = this.f20765B;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f20765B--;
        this.modCount++;
        return Boolean.valueOf(z2);
    }

    public int size() {
        return this.f20765B;
    }

    /* renamed from: u */
    public Boolean set(int i2, Boolean bool) {
        return Boolean.valueOf(v(i2, bool.booleanValue()));
    }

    public boolean v(int i2, boolean z2) {
        e();
        n(i2);
        boolean[] zArr = this.f20764A;
        boolean z3 = zArr[i2];
        zArr[i2] = z2;
        return z3;
    }

    public Internal.BooleanList f(int i2) {
        if (i2 >= this.f20765B) {
            return new BooleanArrayList(Arrays.copyOf(this.f20764A, i2), this.f20765B, true);
        }
        throw new IllegalArgumentException();
    }
}
