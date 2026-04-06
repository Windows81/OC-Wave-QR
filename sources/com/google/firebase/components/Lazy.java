package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public class Lazy<T> implements Provider<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f29776c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f29777a = f29776c;

    /* renamed from: b  reason: collision with root package name */
    public volatile Provider f29778b;

    public Lazy(Provider provider) {
        this.f29778b = provider;
    }

    public Object get() {
        Object obj = this.f29777a;
        Object obj2 = f29776c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f29777a;
                    if (obj == obj2) {
                        obj = this.f29778b.get();
                        this.f29777a = obj;
                        this.f29778b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
