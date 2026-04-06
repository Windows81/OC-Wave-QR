package org.bson.codecs.pojo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;

final class PropertyReflectionUtils {

    public static class PropertyMethods {

        /* renamed from: a  reason: collision with root package name */
        public final Collection f43871a;

        /* renamed from: b  reason: collision with root package name */
        public final Collection f43872b;

        public PropertyMethods(Collection collection, Collection collection2) {
            this.f43871a = collection;
            this.f43872b = collection2;
        }

        public Collection a() {
            return this.f43871a;
        }

        public Collection b() {
            return this.f43872b;
        }
    }

    public static PropertyMethods a(Class cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isPublic(method.getModifiers()) && !method.isBridge()) {
                if (b(method)) {
                    arrayList2.add(method);
                } else if (c(method)) {
                    arrayList.add(method);
                }
            }
        }
        return new PropertyMethods(arrayList2, arrayList);
    }

    public static boolean b(Method method) {
        if (method.getParameterTypes().length > 0) {
            return false;
        }
        if (method.getName().startsWith("get") && method.getName().length() > 3) {
            return Character.isUpperCase(method.getName().charAt(3));
        }
        if (!method.getName().startsWith("is") || method.getName().length() <= 2) {
            return false;
        }
        return Character.isUpperCase(method.getName().charAt(2));
    }

    public static boolean c(Method method) {
        if (!method.getName().startsWith("set") || method.getName().length() <= 3 || method.getParameterTypes().length != 1) {
            return false;
        }
        return Character.isUpperCase(method.getName().charAt(3));
    }

    public static String d(Method method) {
        String name = method.getName();
        char[] charArray = name.substring(name.startsWith("is") ? 2 : 3, name.length()).toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }
}
