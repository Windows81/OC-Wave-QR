package com.google.common.graph;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class DirectedMultiNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {

    /* renamed from: d  reason: collision with root package name */
    public transient Reference f28753d;

    /* renamed from: e  reason: collision with root package name */
    public transient Reference f28754e;

    /* renamed from: com.google.common.graph.DirectedMultiNetworkConnections$1  reason: invalid class name */
    class AnonymousClass1 extends MultiEdgesConnecting<Object> {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Object f28755B;
        public final /* synthetic */ DirectedMultiNetworkConnections C;

        public int size() {
            return this.C.i().L0(this.f28755B);
        }
    }

    public static Object g(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public Set b() {
        return Collections.unmodifiableSet(i().k());
    }

    public Set c() {
        return Collections.unmodifiableSet(h().k());
    }

    public final Multiset h() {
        Multiset multiset = (Multiset) g(this.f28753d);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset q2 = HashMultiset.q(this.f28722a.values());
        this.f28753d = new SoftReference(q2);
        return q2;
    }

    public final Multiset i() {
        Multiset multiset = (Multiset) g(this.f28754e);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset q2 = HashMultiset.q(this.f28723b.values());
        this.f28754e = new SoftReference(q2);
        return q2;
    }
}
