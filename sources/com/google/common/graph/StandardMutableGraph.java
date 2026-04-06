package com.google.common.graph;

@ElementTypesAreNonnullByDefault
final class StandardMutableGraph<N> extends ForwardingGraph<N> implements MutableGraph<N> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableValueGraph f28792a;

    public BaseGraph q() {
        return this.f28792a;
    }
}
