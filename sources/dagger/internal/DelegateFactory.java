package dagger.internal;

public final class DelegateFactory<T> implements Factory<T> {

    /* renamed from: a  reason: collision with root package name */
    public Provider f39761a;

    public Object get() {
        Provider provider = this.f39761a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
