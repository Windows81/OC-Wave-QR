package com.google.common.graph;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class UndirectedMultiNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {

    /* renamed from: b  reason: collision with root package name */
    public transient Reference f28820b;

    /* renamed from: com.google.common.graph.UndirectedMultiNetworkConnections$1  reason: invalid class name */
    class AnonymousClass1 extends MultiEdgesConnecting<Object> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Object f28821B;
        public final /* synthetic */ UndirectedMultiNetworkConnections C;

        public int size() {
            return this.C.f().L0(this.f28821B);
        }
    }

    private static Object g(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public Set a() {
        return Collections.unmodifiableSet(f().k());
    }

    public final Multiset f() {
        Multiset multiset = (Multiset) g(this.f28820b);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset q2 = HashMultiset.q(this.f28733a.values());
        this.f28820b = new SoftReference(q2);
        return q2;
    }
}
