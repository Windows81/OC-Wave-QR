package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class StandardNetwork<N, E> extends AbstractNetwork<N, E> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28793a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28794b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28795c;

    /* renamed from: d  reason: collision with root package name */
    public final MapIteratorCache f28796d;

    /* renamed from: e  reason: collision with root package name */
    public final MapIteratorCache f28797e;

    public Set b() {
        return this.f28797e.g();
    }

    public Set c(Object obj) {
        return p(obj).c();
    }

    public boolean d() {
        return this.f28793a;
    }

    public boolean e() {
        return this.f28795c;
    }

    public Set f() {
        return this.f28796d.g();
    }

    public Set h(Object obj) {
        return p(obj).a();
    }

    public boolean l() {
        return this.f28794b;
    }

    public EndpointPair m(Object obj) {
        Object q2 = q(obj);
        NetworkConnections networkConnections = (NetworkConnections) this.f28796d.d(q2);
        Objects.requireNonNull(networkConnections);
        return EndpointPair.o(this, q2, networkConnections.d(obj));
    }

    public final NetworkConnections p(Object obj) {
        NetworkConnections networkConnections = (NetworkConnections) this.f28796d.d(obj);
        if (networkConnections != null) {
            return networkConnections;
        }
        Preconditions.q(obj);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", new Object[]{obj}));
    }

    public final Object q(Object obj) {
        Object d2 = this.f28797e.d(obj);
        if (d2 != null) {
            return d2;
        }
        Preconditions.q(obj);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", new Object[]{obj}));
    }

    public Set a(Object obj) {
        return p(obj).b();
    }
}
