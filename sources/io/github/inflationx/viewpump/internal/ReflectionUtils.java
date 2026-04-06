package io.github.inflationx.viewpump.internal;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: io.github.inflationx.viewpump.internal.-ReflectionUtils  reason: invalid class name */
public final class ReflectionUtils {
    public static final Method a(Class cls, String str) {
        Intrinsics.j(cls, "receiver$0");
        Intrinsics.j(str, "methodName");
        for (Method method : cls.getMethods()) {
            Intrinsics.e(method, "method");
            if (Intrinsics.d(method.getName(), str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static final void b(Method method, Object obj, Object... objArr) {
        Intrinsics.j(obj, "target");
        Intrinsics.j(objArr, "args");
        if (method != null) {
            try {
                method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException e2) {
                Log.d("ReflectionUtils", "Can't access method using reflection", e2);
            } catch (InvocationTargetException e3) {
                Log.d("ReflectionUtils", "Can't invoke method using reflection", e3);
            }
        }
    }

    public static final void c(Field field, Object obj, Object obj2) {
        Intrinsics.j(field, "receiver$0");
        Intrinsics.j(obj, "obj");
        Intrinsics.j(obj2, "value");
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException unused) {
        }
    }
}
