package com.google.common.eventbus;

import java.lang.reflect.Method;

@ElementTypesAreNonnullByDefault
class Subscriber {

    /* renamed from: a  reason: collision with root package name */
    public final Object f28715a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f28716b;

    public static final class SynchronizedSubscriber extends Subscriber {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscriber)) {
            return false;
        }
        Subscriber subscriber = (Subscriber) obj;
        return this.f28715a == subscriber.f28715a && this.f28716b.equals(subscriber.f28716b);
    }

    public final int hashCode() {
        return ((this.f28716b.hashCode() + 31) * 31) + System.identityHashCode(this.f28715a);
    }
}
