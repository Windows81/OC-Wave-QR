package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$1  reason: invalid class name */
    class AnonymousClass1 extends AbstractGraph<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbstractNetwork f28726a;

        public Set b() {
            return this.f28726a.l() ? super.b() : new AbstractSet<EndpointPair<Object>>() {
                public boolean contains(Object obj) {
                    if (!(obj instanceof EndpointPair)) {
                        return false;
                    }
                    EndpointPair endpointPair = (EndpointPair) obj;
                    return AnonymousClass1.this.p(endpointPair) && AnonymousClass1.this.f().contains(endpointPair.i()) && AnonymousClass1.this.a(endpointPair.i()).contains(endpointPair.m());
                }

                public Iterator iterator() {
                    return Iterators.J(AnonymousClass1.this.f28726a.b().iterator(), new Function<Object, EndpointPair<Object>>() {
                        /* renamed from: a */
                        public EndpointPair apply(Object obj) {
                            return AnonymousClass1.this.f28726a.m(obj);
                        }
                    });
                }

                public int size() {
                    return AnonymousClass1.this.f28726a.b().size();
                }
            };
        }

        public Set c(Object obj) {
            return this.f28726a.c(obj);
        }

        public boolean d() {
            return this.f28726a.d();
        }

        public boolean e() {
            return this.f28726a.e();
        }

        public Set f() {
            return this.f28726a.f();
        }

        public Set h(Object obj) {
            return this.f28726a.h(obj);
        }

        public Set a(Object obj) {
            return this.f28726a.a(obj);
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$2  reason: invalid class name */
    class AnonymousClass2 implements Predicate<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Object f28729A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ AbstractNetwork f28730B;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Object f28731z;

        public boolean apply(Object obj) {
            return this.f28730B.m(obj).e(this.f28731z).equals(this.f28729A);
        }
    }

    public static Map o(final Network network) {
        return Maps.h(network.b(), new Function<Object, EndpointPair<Object>>() {
            /* renamed from: a */
            public EndpointPair apply(Object obj) {
                return Network.this.m(obj);
            }
        });
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return d() == network.d() && f().equals(network.f()) && o(this).equals(o(network));
    }

    public final int hashCode() {
        return o(this).hashCode();
    }

    public String toString() {
        boolean d2 = d();
        boolean l2 = l();
        boolean e2 = e();
        String valueOf = String.valueOf(f());
        String valueOf2 = String.valueOf(o(this));
        StringBuilder sb = new StringBuilder(valueOf.length() + 87 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(d2);
        sb.append(", allowsParallelEdges: ");
        sb.append(l2);
        sb.append(", allowsSelfLoops: ");
        sb.append(e2);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
