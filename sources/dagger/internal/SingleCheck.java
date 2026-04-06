package dagger.internal;

public final class SingleCheck<T> implements Provider<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f39779c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Provider f39780a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f39781b;

    public Object get() {
        Object obj = this.f39781b;
        if (obj != f39779c) {
            return obj;
        }
        Provider provider = this.f39780a;
        if (provider == null) {
            return this.f39781b;
        }
        Object obj2 = provider.get();
        this.f39781b = obj2;
        this.f39780a = null;
        return obj2;
    }
}
