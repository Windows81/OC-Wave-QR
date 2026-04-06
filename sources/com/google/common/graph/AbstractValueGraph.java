package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class AbstractValueGraph<N, V> extends AbstractBaseGraph<N> implements ValueGraph<N, V> {

    /* renamed from: com.google.common.graph.AbstractValueGraph$1  reason: invalid class name */
    class AnonymousClass1 extends AbstractGraph<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbstractValueGraph f28734a;

        public Set b() {
            return this.f28734a.b();
        }

        public Set c(Object obj) {
            return this.f28734a.c(obj);
        }

        public boolean d() {
            return this.f28734a.d();
        }

        public boolean e() {
            return this.f28734a.e();
        }

        public Set f() {
            return this.f28734a.f();
        }

        public int g(Object obj) {
            return this.f28734a.g(obj);
        }

        public Set h(Object obj) {
            return this.f28734a.h(obj);
        }

        public int i(Object obj) {
            return this.f28734a.i(obj);
        }

        public int j(Object obj) {
            return this.f28734a.j(obj);
        }

        public Set a(Object obj) {
            return this.f28734a.a(obj);
        }
    }

    public static Map q(final ValueGraph valueGraph) {
        return Maps.h(valueGraph.b(), new Function<EndpointPair<Object>, Object>() {
            /* renamed from: a */
            public Object apply(EndpointPair endpointPair) {
                Object n2 = ValueGraph.this.n(endpointPair.i(), endpointPair.m(), (Object) null);
                Objects.requireNonNull(n2);
                return n2;
            }
        });
    }

    public /* bridge */ /* synthetic */ Set b() {
        return super.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueGraph)) {
            return false;
        }
        ValueGraph valueGraph = (ValueGraph) obj;
        return d() == valueGraph.d() && f().equals(valueGraph.f()) && q(this).equals(q(valueGraph));
    }

    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    public final int hashCode() {
        return q(this).hashCode();
    }

    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return super.j(obj);
    }

    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    public String toString() {
        boolean d2 = d();
        boolean e2 = e();
        String valueOf = String.valueOf(f());
        String valueOf2 = String.valueOf(q(this));
        StringBuilder sb = new StringBuilder(valueOf.length() + 59 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(d2);
        sb.append(", allowsSelfLoops: ");
        sb.append(e2);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
