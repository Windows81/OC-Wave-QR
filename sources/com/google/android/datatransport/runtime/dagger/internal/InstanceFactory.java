package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final InstanceFactory f24108b = new InstanceFactory((Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f24109a;

    public InstanceFactory(Object obj) {
        this.f24109a = obj;
    }

    public static Factory a(Object obj) {
        return new InstanceFactory(Preconditions.c(obj, "instance cannot be null"));
    }

    public Object get() {
        return this.f24109a;
    }
}
