package com.google.common.cache;

import com.google.common.collect.ForwardingObject;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final Cache f27872z;

        /* renamed from: Q */
        public final Cache M() {
            return this.f27872z;
        }
    }

    /* renamed from: Q */
    public abstract Cache M();
}
