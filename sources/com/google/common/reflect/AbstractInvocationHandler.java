package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
public abstract class AbstractInvocationHandler implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f29205a = new Object[0];

    public static boolean b(Object obj, Class cls) {
        return cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()));
    }

    public abstract Object a(Object obj, Method method, Object[] objArr);

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = f29205a;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        boolean z2 = true;
        if (objArr.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (objArr.length != 0 || !method.getName().equals("toString")) ? a(obj, method, objArr) : toString();
        }
        Object obj2 = objArr[0];
        if (obj2 == null) {
            return Boolean.FALSE;
        }
        if (obj == obj2) {
            return Boolean.TRUE;
        }
        if (!b(obj2, obj.getClass()) || !equals(Proxy.getInvocationHandler(obj2))) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public String toString() {
        return super.toString();
    }
}
