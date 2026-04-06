package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collection;

@ElementTypesAreNonnullByDefault
public final class ObjectArrays {
    public static Object a(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    public static Object[] c(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            a(objArr[i3], i3);
        }
        return objArr;
    }

    public static Object[] d(Object[] objArr, Object[] objArr2, Class cls) {
        Object[] f2 = f(cls, objArr.length + objArr2.length);
        System.arraycopy(objArr, 0, f2, 0, objArr.length);
        System.arraycopy(objArr2, 0, f2, objArr.length, objArr2.length);
        return f2;
    }

    public static Object[] e(Iterable iterable, Object[] objArr) {
        int i2 = 0;
        for (Object obj : iterable) {
            objArr[i2] = obj;
            i2++;
        }
        return objArr;
    }

    public static Object[] f(Class cls, int i2) {
        return (Object[]) Array.newInstance(cls, i2);
    }

    public static Object[] g(Object[] objArr, int i2) {
        return Platform.b(objArr, i2);
    }

    public static Object[] h(Collection collection) {
        return e(collection, new Object[collection.size()]);
    }

    public static Object[] i(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = g(objArr, size);
        }
        e(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static Object[] j(Object[] objArr, int i2, int i3, Object[] objArr2) {
        Preconditions.v(i2, i2 + i3, objArr.length);
        if (objArr2.length < i3) {
            objArr2 = g(objArr2, i3);
        } else if (objArr2.length > i3) {
            objArr2[i3] = null;
        }
        System.arraycopy(objArr, i2, objArr2, 0, i3);
        return objArr2;
    }
}
