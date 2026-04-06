package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
final class ClassesInfoCache {

    /* renamed from: c  reason: collision with root package name */
    public static ClassesInfoCache f21866c = new ClassesInfoCache();

    /* renamed from: a  reason: collision with root package name */
    public final Map f21867a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f21868b = new HashMap();

    @Deprecated
    public static class CallbackInfo {

        /* renamed from: a  reason: collision with root package name */
        public final Map f21869a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map f21870b;

        public CallbackInfo(Map map) {
            this.f21870b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.f21869a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f21869a.put(event, list);
                }
                list.add((MethodReference) entry.getKey());
            }
        }

        public static void b(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((MethodReference) list.get(size)).a(lifecycleOwner, event, obj);
                }
            }
        }

        public void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            b((List) this.f21869a.get(event), lifecycleOwner, event, obj);
            b((List) this.f21869a.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }
    }

    @Deprecated
    public static final class MethodReference {

        /* renamed from: a  reason: collision with root package name */
        public final int f21871a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f21872b;

        public MethodReference(int i2, Method method) {
            this.f21871a = i2;
            this.f21872b = method;
            method.setAccessible(true);
        }

        public void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            try {
                int i2 = this.f21871a;
                if (i2 == 0) {
                    this.f21872b.invoke(obj, (Object[]) null);
                } else if (i2 == 1) {
                    this.f21872b.invoke(obj, new Object[]{lifecycleOwner});
                } else if (i2 == 2) {
                    this.f21872b.invoke(obj, new Object[]{lifecycleOwner, event});
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.f21871a == methodReference.f21871a && this.f21872b.getName().equals(methodReference.f21872b.getName());
        }

        public int hashCode() {
            return (this.f21871a * 31) + this.f21872b.getName().hashCode();
        }
    }

    public final CallbackInfo a(Class cls, Method[] methodArr) {
        int i2;
        CallbackInfo c2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c2 = c(superclass)) == null)) {
            hashMap.putAll(c2.f21870b);
        }
        for (Class c3 : cls.getInterfaces()) {
            for (Map.Entry entry : c(c3).f21870b.entrySet()) {
                e(hashMap, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new MethodReference(i2, method), value, cls);
                    z2 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(hashMap);
        this.f21867a.put(cls, callbackInfo);
        this.f21868b.put(cls, Boolean.valueOf(z2));
        return callbackInfo;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    public CallbackInfo c(Class cls) {
        CallbackInfo callbackInfo = (CallbackInfo) this.f21867a.get(cls);
        return callbackInfo != null ? callbackInfo : a(cls, (Method[]) null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f21868b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method annotation : b2) {
            if (((OnLifecycleEvent) annotation.getAnnotation(OnLifecycleEvent.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.f21868b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(methodReference);
        if (event2 != null && event != event2) {
            Method method = methodReference.f21872b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(methodReference, event);
        }
    }
}
