package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f28736e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Map f28737a;

    /* renamed from: b  reason: collision with root package name */
    public final List f28738b;

    /* renamed from: c  reason: collision with root package name */
    public int f28739c;

    /* renamed from: d  reason: collision with root package name */
    public int f28740d;

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28750a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.graph.ElementOrder$Type[] r0 = com.google.common.graph.ElementOrder.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28750a = r0
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28750a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.DirectedGraphConnections.AnonymousClass5.<clinit>():void");
        }
    }

    public static abstract class NodeConnection<N> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28751a;

        public static final class Pred<N> extends NodeConnection<N> {
            public boolean equals(Object obj) {
                if (obj instanceof Pred) {
                    return this.f28751a.equals(((Pred) obj).f28751a);
                }
                return false;
            }

            public int hashCode() {
                return Pred.class.hashCode() + this.f28751a.hashCode();
            }
        }

        public static final class Succ<N> extends NodeConnection<N> {
            public boolean equals(Object obj) {
                if (obj instanceof Succ) {
                    return this.f28751a.equals(((Succ) obj).f28751a);
                }
                return false;
            }

            public int hashCode() {
                return Succ.class.hashCode() + this.f28751a.hashCode();
            }
        }
    }

    public static final class PredAndSucc {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28752a;
    }

    public static boolean o(Object obj) {
        return obj == f28736e || (obj instanceof PredAndSucc);
    }

    public static boolean p(Object obj) {
        return (obj == f28736e || obj == null) ? false : true;
    }

    public static /* synthetic */ EndpointPair s(Object obj, NodeConnection nodeConnection) {
        return nodeConnection instanceof NodeConnection.Succ ? EndpointPair.p(obj, nodeConnection.f28751a) : EndpointPair.p(nodeConnection.f28751a, obj);
    }

    public Set a() {
        return this.f28738b == null ? Collections.unmodifiableSet(this.f28737a.keySet()) : new AbstractSet<N>() {
            public boolean contains(Object obj) {
                return DirectedGraphConnections.this.f28737a.containsKey(obj);
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                final Iterator it = DirectedGraphConnections.this.f28738b.iterator();
                final HashSet hashSet = new HashSet();
                return new AbstractIterator<N>(this) {
                    public Object b() {
                        while (it.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it.next();
                            if (hashSet.add(nodeConnection.f28751a)) {
                                return nodeConnection.f28751a;
                            }
                        }
                        return c();
                    }
                };
            }

            public int size() {
                return DirectedGraphConnections.this.f28737a.size();
            }
        };
    }

    public Set b() {
        return new AbstractSet<N>() {
            public boolean contains(Object obj) {
                return DirectedGraphConnections.p(DirectedGraphConnections.this.f28737a.get(obj));
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                if (DirectedGraphConnections.this.f28738b == null) {
                    final Iterator it = DirectedGraphConnections.this.f28737a.entrySet().iterator();
                    return new AbstractIterator<N>(this) {
                        public Object b() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.p(entry.getValue())) {
                                    return entry.getKey();
                                }
                            }
                            return c();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f28738b.iterator();
                return new AbstractIterator<N>(this) {
                    public Object b() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.Succ) {
                                return nodeConnection.f28751a;
                            }
                        }
                        return c();
                    }
                };
            }

            public int size() {
                return DirectedGraphConnections.this.f28740d;
            }
        };
    }

    public Set c() {
        return new AbstractSet<N>() {
            public boolean contains(Object obj) {
                return DirectedGraphConnections.o(DirectedGraphConnections.this.f28737a.get(obj));
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                if (DirectedGraphConnections.this.f28738b == null) {
                    final Iterator it = DirectedGraphConnections.this.f28737a.entrySet().iterator();
                    return new AbstractIterator<N>(this) {
                        public Object b() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.o(entry.getValue())) {
                                    return entry.getKey();
                                }
                            }
                            return c();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f28738b.iterator();
                return new AbstractIterator<N>(this) {
                    public Object b() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.Pred) {
                                return nodeConnection.f28751a;
                            }
                        }
                        return c();
                    }
                };
            }

            public int size() {
                return DirectedGraphConnections.this.f28739c;
            }
        };
    }

    public Object d(Object obj) {
        Preconditions.q(obj);
        Object obj2 = this.f28737a.get(obj);
        if (obj2 == f28736e) {
            return null;
        }
        return obj2 instanceof PredAndSucc ? ((PredAndSucc) obj2).f28752a : obj2;
    }

    public Iterator e(Object obj) {
        Preconditions.q(obj);
        List list = this.f28738b;
        final Iterator g2 = list == null ? Iterators.g(Iterators.J(c().iterator(), new d(obj)), Iterators.J(b().iterator(), new e(obj))) : Iterators.J(list.iterator(), new f(obj));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new AbstractIterator<EndpointPair<N>>(this) {
            /* JADX WARNING: Removed duplicated region for block: B:2:0x0008  */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.common.graph.EndpointPair b() {
                /*
                    r3 = this;
                L_0x0000:
                    java.util.Iterator r0 = r4
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L_0x0028
                    java.util.Iterator r0 = r4
                    java.lang.Object r0 = r0.next()
                    com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                    java.lang.Object r1 = r0.i()
                    java.lang.Object r2 = r0.m()
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L_0x0027
                    java.util.concurrent.atomic.AtomicBoolean r1 = r0
                    r2 = 1
                    boolean r1 = r1.getAndSet(r2)
                    if (r1 != 0) goto L_0x0000
                L_0x0027:
                    return r0
                L_0x0028:
                    java.lang.Object r0 = r3.c()
                    com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.DirectedGraphConnections.AnonymousClass4.b():com.google.common.graph.EndpointPair");
            }
        };
    }
}
