package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Map;

@ElementTypesAreNonnullByDefault
final class EdgesConnecting<E> extends AbstractSet<E> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f28756A;

    /* renamed from: z  reason: collision with root package name */
    public final Map f28757z;

    public boolean contains(Object obj) {
        Object e2 = e();
        return e2 != null && e2.equals(obj);
    }

    public final Object e() {
        return this.f28757z.get(this.f28756A);
    }

    /* renamed from: g */
    public UnmodifiableIterator iterator() {
        Object e2 = e();
        return e2 == null ? ImmutableSet.D().iterator() : Iterators.G(e2);
    }

    public int size() {
        return e() == null ? 0 : 1;
    }
}
