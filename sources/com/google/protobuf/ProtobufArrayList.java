package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    public static final ProtobufArrayList C;

    /* renamed from: A  reason: collision with root package name */
    public Object[] f32269A;

    /* renamed from: B  reason: collision with root package name */
    public int f32270B;

    static {
        ProtobufArrayList protobufArrayList = new ProtobufArrayList(new Object[0], 0);
        C = protobufArrayList;
        protobufArrayList.r();
    }

    public ProtobufArrayList(Object[] objArr, int i2) {
        this.f32269A = objArr;
        this.f32270B = i2;
    }

    public static Object[] g(int i2) {
        return new Object[i2];
    }

    public static ProtobufArrayList h() {
        return C;
    }

    private void i(int i2) {
        if (i2 < 0 || i2 >= this.f32270B) {
            throw new IndexOutOfBoundsException(m(i2));
        }
    }

    private String m(int i2) {
        return "Index:" + i2 + ", Size:" + this.f32270B;
    }

    public boolean add(Object obj) {
        e();
        int i2 = this.f32270B;
        Object[] objArr = this.f32269A;
        if (i2 == objArr.length) {
            this.f32269A = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f32269A;
        int i3 = this.f32270B;
        this.f32270B = i3 + 1;
        objArr2[i3] = obj;
        this.modCount++;
        return true;
    }

    public Object get(int i2) {
        i(i2);
        return this.f32269A[i2];
    }

    /* renamed from: n */
    public ProtobufArrayList f(int i2) {
        if (i2 >= this.f32270B) {
            return new ProtobufArrayList(Arrays.copyOf(this.f32269A, i2), this.f32270B);
        }
        throw new IllegalArgumentException();
    }

    public Object remove(int i2) {
        e();
        i(i2);
        Object[] objArr = this.f32269A;
        Object obj = objArr[i2];
        int i3 = this.f32270B;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f32270B--;
        this.modCount++;
        return obj;
    }

    public Object set(int i2, Object obj) {
        e();
        i(i2);
        Object[] objArr = this.f32269A;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.f32270B;
    }

    public void add(int i2, Object obj) {
        int i3;
        e();
        if (i2 < 0 || i2 > (i3 = this.f32270B)) {
            throw new IndexOutOfBoundsException(m(i2));
        }
        Object[] objArr = this.f32269A;
        if (i3 < objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
        } else {
            Object[] g2 = g(((i3 * 3) / 2) + 1);
            System.arraycopy(this.f32269A, 0, g2, 0, i2);
            System.arraycopy(this.f32269A, i2, g2, i2 + 1, this.f32270B - i2);
            this.f32269A = g2;
        }
        this.f32269A[i2] = obj;
        this.f32270B++;
        this.modCount++;
    }
}
