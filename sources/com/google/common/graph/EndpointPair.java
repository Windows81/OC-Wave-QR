package com.google.common.graph;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@Immutable
public abstract class EndpointPair<N> implements Iterable<N> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f28764A;

    /* renamed from: z  reason: collision with root package name */
    public final Object f28765z;

    public static final class Ordered<N> extends EndpointPair<N> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (g() != endpointPair.g()) {
                return false;
            }
            return q().equals(endpointPair.q()) && s().equals(endpointPair.s());
        }

        public boolean g() {
            return true;
        }

        public int hashCode() {
            return Objects.b(q(), s());
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return EndpointPair.super.iterator();
        }

        public Object q() {
            return i();
        }

        public Object s() {
            return m();
        }

        public String toString() {
            String valueOf = String.valueOf(q());
            String valueOf2 = String.valueOf(s());
            StringBuilder sb = new StringBuilder(valueOf.length() + 6 + valueOf2.length());
            sb.append("<");
            sb.append(valueOf);
            sb.append(" -> ");
            sb.append(valueOf2);
            sb.append(">");
            return sb.toString();
        }

        public Ordered(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    public static final class Unordered<N> extends EndpointPair<N> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (g() != endpointPair.g()) {
                return false;
            }
            return i().equals(endpointPair.i()) ? m().equals(endpointPair.m()) : i().equals(endpointPair.m()) && m().equals(endpointPair.i());
        }

        public boolean g() {
            return false;
        }

        public int hashCode() {
            return i().hashCode() + m().hashCode();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return EndpointPair.super.iterator();
        }

        public Object q() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public Object s() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            String valueOf = String.valueOf(i());
            String valueOf2 = String.valueOf(m());
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb.append("[");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append("]");
            return sb.toString();
        }

        public Unordered(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    public static EndpointPair n(Graph graph, Object obj, Object obj2) {
        return graph.d() ? p(obj, obj2) : u(obj, obj2);
    }

    public static EndpointPair o(Network network, Object obj, Object obj2) {
        return network.d() ? p(obj, obj2) : u(obj, obj2);
    }

    public static EndpointPair p(Object obj, Object obj2) {
        return new Ordered(obj, obj2);
    }

    public static EndpointPair u(Object obj, Object obj2) {
        return new Unordered(obj2, obj);
    }

    public final Object e(Object obj) {
        if (obj.equals(this.f28765z)) {
            return this.f28764A;
        }
        if (obj.equals(this.f28764A)) {
            return this.f28765z;
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36 + valueOf2.length());
        sb.append("EndpointPair ");
        sb.append(valueOf);
        sb.append(" does not contain node ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract boolean g();

    /* renamed from: h */
    public final UnmodifiableIterator iterator() {
        return Iterators.s(this.f28765z, this.f28764A);
    }

    public final Object i() {
        return this.f28765z;
    }

    public final Object m() {
        return this.f28764A;
    }

    public abstract Object q();

    public abstract Object s();

    public EndpointPair(Object obj, Object obj2) {
        this.f28765z = Preconditions.q(obj);
        this.f28764A = Preconditions.q(obj2);
    }
}
