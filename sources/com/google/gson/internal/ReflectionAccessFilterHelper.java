package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;

public class ReflectionAccessFilterHelper {

    public static abstract class AccessChecker {

        /* renamed from: a  reason: collision with root package name */
        public static final AccessChecker f31746a;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
        static {
            /*
                boolean r0 = com.google.gson.internal.JavaVersion.d()
                if (r0 == 0) goto L_0x001a
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch:{ NoSuchMethodException -> 0x001a }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x001a }
                com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$1 r1 = new com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$1     // Catch:{ NoSuchMethodException -> 0x001a }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x001a }
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r1 != 0) goto L_0x0022
                com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$2 r1 = new com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$2
                r1.<init>()
            L_0x0022:
                f31746a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.<clinit>():void");
        }

        public AccessChecker() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return AccessChecker.f31746a.a(accessibleObject, obj);
    }

    public static ReflectionAccessFilter.FilterResult b(List list, Class cls) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult a2 = ((ReflectionAccessFilter) it.next()).a(cls);
            if (a2 != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return a2;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static boolean c(Class cls) {
        return d(cls.getName());
    }

    public static boolean d(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || g(str);
    }

    public static boolean e(Class cls) {
        String name = cls.getName();
        return d(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean f(Class cls) {
        return g(cls.getName());
    }

    public static boolean g(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }
}
