package com.google.common.graph;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* renamed from: a  reason: collision with root package name */
    public final Map f28722a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f28723b;

    /* renamed from: c  reason: collision with root package name */
    public int f28724c;

    /* renamed from: com.google.common.graph.AbstractDirectedNetworkConnections$1  reason: invalid class name */
    class AnonymousClass1 extends AbstractSet<Object> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ AbstractDirectedNetworkConnections f28725z;

        public boolean contains(Object obj) {
            return this.f28725z.f28722a.containsKey(obj) || this.f28725z.f28723b.containsKey(obj);
        }

        /* renamed from: e */
        public UnmodifiableIterator iterator() {
            return Iterators.K((this.f28725z.f28724c == 0 ? Iterables.d(this.f28725z.f28722a.keySet(), this.f28725z.f28723b.keySet()) : Sets.o(this.f28725z.f28722a.keySet(), this.f28725z.f28723b.keySet())).iterator());
        }

        public int size() {
            return IntMath.i(this.f28725z.f28722a.size(), this.f28725z.f28723b.size() - this.f28725z.f28724c);
        }
    }

    public Set a() {
        return Sets.o(c(), b());
    }

    public Object d(Object obj) {
        Object obj2 = this.f28723b.get(obj);
        Objects.requireNonNull(obj2);
        return obj2;
    }
}
