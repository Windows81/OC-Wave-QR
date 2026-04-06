package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f24105c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Provider f24106a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f24107b = f24105c;

    public DoubleCheck(Provider provider) {
        this.f24106a = provider;
    }

    public static Provider a(Provider provider) {
        Preconditions.b(provider);
        return provider instanceof DoubleCheck ? provider : new DoubleCheck(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f24105c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public Object get() {
        Object obj = this.f24107b;
        Object obj2 = f24105c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f24107b;
                    if (obj == obj2) {
                        obj = this.f24106a.get();
                        this.f24107b = b(this.f24107b, obj);
                        this.f24106a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
