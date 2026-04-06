package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {
    public Set b() {
        return new AbstractSet<EndpointPair<N>>() {
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                return AbstractBaseGraph.this.p(endpointPair) && AbstractBaseGraph.this.f().contains(endpointPair.i()) && AbstractBaseGraph.this.a(endpointPair.i()).contains(endpointPair.m());
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                return EndpointPairIterator.f(AbstractBaseGraph.this);
            }

            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            public int size() {
                return Ints.k(AbstractBaseGraph.this.o());
            }
        };
    }

    public int g(Object obj) {
        return d() ? a(obj).size() : j(obj);
    }

    public int i(Object obj) {
        return d() ? c(obj).size() : j(obj);
    }

    public int j(Object obj) {
        if (d()) {
            return IntMath.i(c(obj).size(), a(obj).size());
        }
        Set h2 = h(obj);
        return IntMath.i(h2.size(), (!e() || !h2.contains(obj)) ? 0 : 1);
    }

    public Set k(Object obj) {
        Preconditions.q(obj);
        Preconditions.j(f().contains(obj), "Node %s is not an element of this graph.", obj);
        return new IncidentEdgeSet<N>(this, this, obj) {
            /* renamed from: i */
            public UnmodifiableIterator iterator() {
                return this.f28778A.d() ? Iterators.K(Iterators.g(Iterators.J(this.f28778A.c(this.f28779z).iterator(), new a(this)), Iterators.J(Sets.a(this.f28778A.a(this.f28779z), ImmutableSet.E(this.f28779z)).iterator(), new b(this)))) : Iterators.K(Iterators.J(this.f28778A.h(this.f28779z).iterator(), new c(this)));
            }

            public final /* synthetic */ EndpointPair m(Object obj) {
                return EndpointPair.p(obj, this.f28779z);
            }

            public final /* synthetic */ EndpointPair n(Object obj) {
                return EndpointPair.p(this.f28779z, obj);
            }

            public final /* synthetic */ EndpointPair o(Object obj) {
                return EndpointPair.u(this.f28779z, obj);
            }
        };
    }

    public long o() {
        long j2 = 0;
        for (Object j3 : f()) {
            j2 += (long) j(j3);
        }
        Preconditions.w((1 & j2) == 0);
        return j2 >>> 1;
    }

    public final boolean p(EndpointPair endpointPair) {
        return endpointPair.g() || !d();
    }
}
