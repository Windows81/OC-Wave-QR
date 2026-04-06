package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f39762c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Provider f39763a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f39764b = f39762c;

    public DoubleCheck(Provider provider) {
        this.f39763a = provider;
    }

    public static Lazy b(Provider provider) {
        return provider instanceof Lazy ? (Lazy) provider : new DoubleCheck((Provider) Preconditions.b(provider));
    }

    public static Provider c(Provider provider) {
        Preconditions.b(provider);
        return provider instanceof DoubleCheck ? provider : new DoubleCheck(provider);
    }

    public static Provider d(Provider provider) {
        return c(Providers.a(provider));
    }

    private static Object e(Object obj, Object obj2) {
        if (obj == f39762c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.f39764b;
        if (obj == f39762c) {
            obj = this.f39763a.get();
            this.f39764b = e(this.f39764b, obj);
            this.f39763a = null;
        }
        return obj;
    }

    public Object get() {
        Object obj = this.f39764b;
        return obj == f39762c ? a() : obj;
    }
}
