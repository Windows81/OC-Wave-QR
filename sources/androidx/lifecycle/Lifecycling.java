package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class Lifecycling {

    /* renamed from: a  reason: collision with root package name */
    public static final Lifecycling f21921a = new Lifecycling();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f21922b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final Map f21923c = new HashMap();

    public static final String c(String str) {
        Intrinsics.i(str, "className");
        return StringsKt.K(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    public static final LifecycleEventObserver f(Object obj) {
        Intrinsics.i(obj, "object");
        boolean z2 = obj instanceof LifecycleEventObserver;
        boolean z3 = obj instanceof DefaultLifecycleObserver;
        if (z2 && z3) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) obj);
        }
        if (z3) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) null);
        }
        if (z2) {
            return (LifecycleEventObserver) obj;
        }
        Class<?> cls = obj.getClass();
        Lifecycling lifecycling = f21921a;
        if (lifecycling.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = f21923c.get(cls);
        Intrinsics.f(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.a((Constructor) list.get(0), obj));
        }
        int size = list.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i2 = 0; i2 < size; i2++) {
            generatedAdapterArr[i2] = f21921a.a((Constructor) list.get(i2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    public final GeneratedAdapter a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            Intrinsics.f(newInstance);
            return (GeneratedAdapter) newInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            Intrinsics.f(name);
            if (name.length() != 0) {
                Intrinsics.f(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.h(canonicalName, "substring(...)");
            }
            Intrinsics.f(canonicalName);
            String c2 = c(canonicalName);
            if (name.length() != 0) {
                c2 = name + '.' + c2;
            }
            Class<?> cls2 = Class.forName(c2);
            Intrinsics.g(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int d(Class cls) {
        Map map = f21922b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g2 = g(cls);
        map.put(cls, Integer.valueOf(g2));
        return g2;
    }

    public final boolean e(Class cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b2 = b(cls);
        if (b2 != null) {
            f21923c.put(cls, CollectionsKt.e(b2));
            return 2;
        } else if (ClassesInfoCache.f21866c.d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (e(superclass)) {
                Intrinsics.f(superclass);
                if (d(superclass) == 1) {
                    return 1;
                }
                Object obj = f21923c.get(superclass);
                Intrinsics.f(obj);
                arrayList = new ArrayList((Collection) obj);
            } else {
                arrayList = null;
            }
            Iterator a2 = ArrayIteratorKt.a(cls.getInterfaces());
            while (a2.hasNext()) {
                Class cls2 = (Class) a2.next();
                if (e(cls2)) {
                    Intrinsics.f(cls2);
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj2 = f21923c.get(cls2);
                    Intrinsics.f(obj2);
                    arrayList.addAll((Collection) obj2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f21923c.put(cls, arrayList);
            return 2;
        }
    }
}
