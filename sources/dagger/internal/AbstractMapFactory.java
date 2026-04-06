package dagger.internal;

import java.util.Map;

abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map f39760a;

    public static abstract class Builder<K, V, V2> {
    }

    public final Map a() {
        return this.f39760a;
    }
}
