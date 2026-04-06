package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {

    /* renamed from: B  reason: collision with root package name */
    public final BaseGraph f28766B;
    public final Iterator C;
    public Object D;
    public Iterator E;

    public static final class Directed<N> extends EndpointPairIterator<N> {
        /* renamed from: g */
        public EndpointPair b() {
            while (!this.E.hasNext()) {
                if (!e()) {
                    return (EndpointPair) c();
                }
            }
            Object obj = this.D;
            Objects.requireNonNull(obj);
            return EndpointPair.p(obj, this.E.next());
        }

        public Directed(BaseGraph baseGraph) {
            super(baseGraph);
        }
    }

    public static final class Undirected<N> extends EndpointPairIterator<N> {
        public Set F;

        /* renamed from: g */
        public EndpointPair b() {
            do {
                Objects.requireNonNull(this.F);
                while (this.E.hasNext()) {
                    Object next = this.E.next();
                    if (!this.F.contains(next)) {
                        Object obj = this.D;
                        Objects.requireNonNull(obj);
                        return EndpointPair.u(obj, next);
                    }
                }
                this.F.add(this.D);
            } while (e());
            this.F = null;
            return (EndpointPair) c();
        }

        public Undirected(BaseGraph baseGraph) {
            super(baseGraph);
            this.F = Sets.i(baseGraph.f().size() + 1);
        }
    }

    public static EndpointPairIterator f(BaseGraph baseGraph) {
        return baseGraph.d() ? new Directed(baseGraph) : new Undirected(baseGraph);
    }

    public final boolean e() {
        Preconditions.w(!this.E.hasNext());
        if (!this.C.hasNext()) {
            return false;
        }
        Object next = this.C.next();
        this.D = next;
        this.E = this.f28766B.a(next).iterator();
        return true;
    }

    public EndpointPairIterator(BaseGraph baseGraph) {
        this.D = null;
        this.E = ImmutableSet.D().iterator();
        this.f28766B = baseGraph;
        this.C = baseGraph.f().iterator();
    }
}
