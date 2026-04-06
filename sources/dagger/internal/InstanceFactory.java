package dagger.internal;

import dagger.Lazy;

public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final InstanceFactory f39765b = new InstanceFactory((Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f39766a;

    public InstanceFactory(Object obj) {
        this.f39766a = obj;
    }

    public static Factory a(Object obj) {
        return new InstanceFactory(Preconditions.c(obj, "instance cannot be null"));
    }

    public Object get() {
        return this.f39766a;
    }
}
