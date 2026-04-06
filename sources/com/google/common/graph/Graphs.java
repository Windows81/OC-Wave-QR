package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class Graphs {

    public enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    public static class TransposedGraph<N> extends ForwardingGraph<N> {

        /* renamed from: a  reason: collision with root package name */
        public final Graph f28772a;

        public Set c(Object obj) {
            return q().a(obj);
        }

        public int g(Object obj) {
            return q().i(obj);
        }

        public int i(Object obj) {
            return q().g(obj);
        }

        public Set k(Object obj) {
            return new IncidentEdgeSet<N>(this, obj) {
                public Iterator iterator() {
                    return Iterators.J(TransposedGraph.this.q().k(this.f28779z).iterator(), new Function<EndpointPair<N>, EndpointPair<N>>() {
                        /* renamed from: a */
                        public EndpointPair apply(EndpointPair endpointPair) {
                            return EndpointPair.n(TransposedGraph.this.q(), endpointPair.m(), endpointPair.i());
                        }
                    });
                }
            };
        }

        /* renamed from: r */
        public Graph q() {
            return this.f28772a;
        }

        public Set a(Object obj) {
            return q().c(obj);
        }
    }

    public static class TransposedNetwork<N, E> extends ForwardingNetwork<N, E> {

        /* renamed from: a  reason: collision with root package name */
        public final Network f28775a;

        public Set c(Object obj) {
            return p().a(obj);
        }

        public EndpointPair m(Object obj) {
            EndpointPair m2 = p().m(obj);
            return EndpointPair.o(this.f28775a, m2.m(), m2.i());
        }

        public Network p() {
            return this.f28775a;
        }

        public Set a(Object obj) {
            return p().c(obj);
        }
    }

    public static class TransposedValueGraph<N, V> extends ForwardingValueGraph<N, V> {

        /* renamed from: a  reason: collision with root package name */
        public final ValueGraph f28776a;

        public Set c(Object obj) {
            return r().a(obj);
        }

        public int g(Object obj) {
            return r().i(obj);
        }

        public int i(Object obj) {
            return r().g(obj);
        }

        public Object n(Object obj, Object obj2, Object obj3) {
            return r().n(obj2, obj, obj3);
        }

        public ValueGraph r() {
            return this.f28776a;
        }

        public Set a(Object obj) {
            return r().c(obj);
        }
    }
}
