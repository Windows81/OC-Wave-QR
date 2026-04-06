package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

class OptionalProvider<T> implements Provider<T>, Deferred<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Deferred.DeferredHandler f29781c = new k();

    /* renamed from: d  reason: collision with root package name */
    public static final Provider f29782d = new l();

    /* renamed from: a  reason: collision with root package name */
    public Deferred.DeferredHandler f29783a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Provider f29784b;

    public OptionalProvider(Deferred.DeferredHandler deferredHandler, Provider provider) {
        this.f29783a = deferredHandler;
        this.f29784b = provider;
    }

    public static OptionalProvider e() {
        return new OptionalProvider(f29781c, f29782d);
    }

    public static /* synthetic */ void f(Provider provider) {
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.a(provider);
        deferredHandler2.a(provider);
    }

    public static OptionalProvider i(Provider provider) {
        return new OptionalProvider((Deferred.DeferredHandler) null, provider);
    }

    public void a(Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.f29784b;
        Provider provider4 = f29782d;
        if (provider3 != provider4) {
            deferredHandler.a(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f29784b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                this.f29783a = new m(this.f29783a, deferredHandler);
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.a(provider);
        }
    }

    public Object get() {
        return this.f29784b.get();
    }

    public void j(Provider provider) {
        Deferred.DeferredHandler deferredHandler;
        if (this.f29784b == f29782d) {
            synchronized (this) {
                deferredHandler = this.f29783a;
                this.f29783a = null;
                this.f29784b = provider;
            }
            deferredHandler.a(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
