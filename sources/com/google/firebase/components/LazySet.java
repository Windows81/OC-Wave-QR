package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class LazySet<T> implements Provider<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    public volatile Set f29779a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    public volatile Set f29780b = null;

    public LazySet(Collection collection) {
        this.f29779a.addAll(collection);
    }

    public static LazySet b(Collection collection) {
        return new LazySet((Set) collection);
    }

    public synchronized void a(Provider provider) {
        try {
            if (this.f29780b == null) {
                this.f29779a.add(provider);
            } else {
                this.f29780b.add(provider.get());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public Set get() {
        if (this.f29780b == null) {
            synchronized (this) {
                try {
                    if (this.f29780b == null) {
                        this.f29780b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f29780b);
    }

    public final synchronized void d() {
        try {
            for (Provider provider : this.f29779a) {
                this.f29780b.add(provider.get());
            }
            this.f29779a = null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
