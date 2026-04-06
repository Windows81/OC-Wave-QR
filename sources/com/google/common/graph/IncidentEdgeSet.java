package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class IncidentEdgeSet<N> extends AbstractSet<EndpointPair<N>> {

    /* renamed from: A  reason: collision with root package name */
    public final BaseGraph f28778A;

    /* renamed from: z  reason: collision with root package name */
    public final Object f28779z;

    public IncidentEdgeSet(BaseGraph baseGraph, Object obj) {
        this.f28778A = baseGraph;
        this.f28779z = obj;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.f28778A.d()) {
            if (!endpointPair.g()) {
                return false;
            }
            Object q2 = endpointPair.q();
            Object s2 = endpointPair.s();
            return (this.f28779z.equals(q2) && this.f28778A.a(this.f28779z).contains(s2)) || (this.f28779z.equals(s2) && this.f28778A.c(this.f28779z).contains(q2));
        } else if (endpointPair.g()) {
            return false;
        } else {
            Set h2 = this.f28778A.h(this.f28779z);
            Object i2 = endpointPair.i();
            Object m2 = endpointPair.m();
            return (this.f28779z.equals(m2) && h2.contains(i2)) || (this.f28779z.equals(i2) && h2.contains(m2));
        }
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f28778A.d() ? (this.f28778A.i(this.f28779z) + this.f28778A.g(this.f28779z)) - (this.f28778A.a(this.f28779z).contains(this.f28779z) ? 1 : 0) : this.f28778A.h(this.f28779z).size();
    }
}
