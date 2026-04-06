package com.google.common.cache;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final LoadingCache f27873z;

        /* renamed from: R */
        public final LoadingCache Q() {
            return this.f27873z;
        }
    }

    /* renamed from: R */
    public abstract LoadingCache Q();

    public Object apply(Object obj) {
        return Q().apply(obj);
    }
}
