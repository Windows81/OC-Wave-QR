package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final RecordHelper f31874a;

    public static abstract class RecordHelper {
        public RecordHelper() {
        }

        public abstract Method a(Class cls, Field field);

        public abstract Constructor b(Class cls);

        public abstract String[] c(Class cls);

        public abstract boolean d(Class cls);
    }

    public static class RecordNotSupportedHelper extends RecordHelper {
        public RecordNotSupportedHelper() {
            super();
        }

        public Method a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        public Constructor b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        public String[] c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        public boolean d(Class cls) {
            return false;
        }
    }

    public static class RecordSupportedHelper extends RecordHelper {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31875a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f31876b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f31877c;

        /* renamed from: d  reason: collision with root package name */
        public final Method f31878d;

        public Method a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), (Class[]) null);
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.d(e2);
            }
        }

        public Constructor b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f31876b.invoke(cls, (Object[]) null);
                Class[] clsArr = new Class[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    clsArr[i2] = (Class) this.f31878d.invoke(objArr[i2], (Object[]) null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.d(e2);
            }
        }

        public String[] c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f31876b.invoke(cls, (Object[]) null);
                String[] strArr = new String[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    strArr[i2] = (String) this.f31877c.invoke(objArr[i2], (Object[]) null);
                }
                return strArr;
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.d(e2);
            }
        }

        public boolean d(Class cls) {
            try {
                return ((Boolean) this.f31875a.invoke(cls, (Object[]) null)).booleanValue();
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.d(e2);
            }
        }

        public RecordSupportedHelper() {
            super();
            Class<Class> cls = Class.class;
            this.f31875a = cls.getMethod("isRecord", (Class[]) null);
            Method method = cls.getMethod("getRecordComponents", (Class[]) null);
            this.f31876b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f31877c = componentType.getMethod("getName", (Class[]) null);
            this.f31878d = componentType.getMethod("getType", (Class[]) null);
        }
    }

    static {
        RecordHelper recordHelper;
        try {
            recordHelper = new RecordSupportedHelper();
        } catch (NoSuchMethodException unused) {
            recordHelper = new RecordNotSupportedHelper();
        }
        f31874a = recordHelper;
    }

    public static void b(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i2].getSimpleName());
        }
        sb.append(')');
    }

    public static String c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb);
        return sb.toString();
    }

    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z2) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z2 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method h(Class cls, Field field) {
        return f31874a.a(cls, field);
    }

    public static Constructor i(Class cls) {
        return f31874a.b(cls);
    }

    public static String[] j(Class cls) {
        return f31874a.c(cls);
    }

    public static boolean k(Class cls) {
        return f31874a.d(cls);
    }

    public static void l(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            String g2 = g(accessibleObject, false);
            throw new JsonIOException("Failed making " + g2 + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e2);
        }
    }

    public static String m(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e2) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage();
        }
    }
}
