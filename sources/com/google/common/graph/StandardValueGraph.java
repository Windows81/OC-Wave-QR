package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends AbstractValueGraph<N, V> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28798a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28799b;

    /* renamed from: c  reason: collision with root package name */
    public final MapIteratorCache f28800c;

    /* renamed from: d  reason: collision with root package name */
    public long f28801d;

    public Set c(Object obj) {
        return r(obj).c();
    }

    public boolean d() {
        return this.f28798a;
    }

    public boolean e() {
        return this.f28799b;
    }

    public Set f() {
        return this.f28800c.g();
    }

    public Set h(Object obj) {
        return r(obj).a();
    }

    public Set k(Object obj) {
        final GraphConnections r2 = r(obj);
        return new IncidentEdgeSet<N>(this, this, obj) {
            public Iterator iterator() {
                return r2.e(this.f28779z);
            }
        };
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return s(Preconditions.q(obj), Preconditions.q(obj2), obj3);
    }

    public long o() {
        return this.f28801d;
    }

    public final GraphConnections r(Object obj) {
        GraphConnections graphConnections = (GraphConnections) this.f28800c.d(obj);
        if (graphConnections != null) {
            return graphConnections;
        }
        Preconditions.q(obj);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + 38);
        sb.append("Node ");
        sb.append(valueOf);
        sb.append(" is not an element of this graph.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Object s(Object obj, Object obj2, Object obj3) {
        GraphConnections graphConnections = (GraphConnections) this.f28800c.d(obj);
        Object d2 = graphConnections == null ? null : graphConnections.d(obj2);
        return d2 == null ? obj3 : d2;
    }

    public Set a(Object obj) {
        return r(obj).b();
    }
}
