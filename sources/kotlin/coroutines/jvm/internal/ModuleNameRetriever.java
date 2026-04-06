package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ModuleNameRetriever {

    /* renamed from: a  reason: collision with root package name */
    public static final ModuleNameRetriever f40738a = new ModuleNameRetriever();

    /* renamed from: b  reason: collision with root package name */
    public static final Cache f40739b = new Cache((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    public static Cache f40740c;

    @Metadata
    public static final class Cache {

        /* renamed from: a  reason: collision with root package name */
        public final Method f40741a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f40742b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f40743c;

        public Cache(Method method, Method method2, Method method3) {
            this.f40741a = method;
            this.f40742b = method2;
            this.f40743c = method3;
        }
    }

    public final Cache a(BaseContinuationImpl baseContinuationImpl) {
        try {
            Cache cache = new Cache(Class.class.getDeclaredMethod("getModule", (Class[]) null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
            f40740c = cache;
            return cache;
        } catch (Exception unused) {
            Cache cache2 = f40739b;
            f40740c = cache2;
            return cache2;
        }
    }

    public final String b(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Intrinsics.i(baseContinuationImpl, "continuation");
        Cache cache = f40740c;
        if (cache == null) {
            cache = a(baseContinuationImpl);
        }
        if (cache == f40739b || (method = cache.f40741a) == null || (invoke = method.invoke(baseContinuationImpl.getClass(), (Object[]) null)) == null || (method2 = cache.f40742b) == null || (invoke2 = method2.invoke(invoke, (Object[]) null)) == null) {
            return null;
        }
        Method method3 = cache.f40743c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, (Object[]) null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
