package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.DirectedGraphConnections;

public final /* synthetic */ class f implements Function {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f28827z;

    public /* synthetic */ f(Object obj) {
        this.f28827z = obj;
    }

    public final Object apply(Object obj) {
        return DirectedGraphConnections.s(this.f28827z, (DirectedGraphConnections.NodeConnection) obj);
    }
}
