package com.google.common.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public final class Throwables {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f27800a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f27801b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f27802c;

    /* renamed from: com.google.common.base.Throwables$1  reason: invalid class name */
    class AnonymousClass1 extends AbstractList<StackTraceElement> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Throwable f27803z;

        /* renamed from: e */
        public StackTraceElement get(int i2) {
            Method a2 = Throwables.f27801b;
            Objects.requireNonNull(a2);
            Object b2 = Throwables.f27800a;
            Objects.requireNonNull(b2);
            return (StackTraceElement) Throwables.i(a2, b2, this.f27803z, Integer.valueOf(i2));
        }

        public int size() {
            Method d2 = Throwables.f27802c;
            Objects.requireNonNull(d2);
            Object b2 = Throwables.f27800a;
            Objects.requireNonNull(b2);
            return ((Integer) Throwables.i(d2, b2, this.f27803z)).intValue();
        }
    }

    static {
        Object f2 = f();
        f27800a = f2;
        Method method = null;
        f27801b = f2 == null ? null : e();
        if (f2 != null) {
            method = h(f2);
        }
        f27802c = method;
    }

    public static Method e() {
        return g("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    public static Object f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method g(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method h(Object obj) {
        try {
            Method g2 = g("getStackTraceDepth", Throwable.class);
            if (g2 == null) {
                return null;
            }
            g2.invoke(obj, new Object[]{new Throwable()});
            return g2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object i(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw j(e3.getCause());
        }
    }

    public static RuntimeException j(Throwable th) {
        o(th);
        throw new RuntimeException(th);
    }

    public static void k(Throwable th, Class cls) {
        if (th != null) {
            n(th, cls);
        }
    }

    public static void l(Throwable th) {
        if (th != null) {
            o(th);
        }
    }

    public static void m(Throwable th, Class cls) {
        k(th, cls);
        l(th);
    }

    public static void n(Throwable th, Class cls) {
        Preconditions.q(th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void o(Throwable th) {
        Preconditions.q(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
