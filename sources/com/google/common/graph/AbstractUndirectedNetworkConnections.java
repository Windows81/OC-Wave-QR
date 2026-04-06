package com.google.common.graph;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* renamed from: a  reason: collision with root package name */
    public final Map f28733a;

    public Set b() {
        return a();
    }

    public Set c() {
        return a();
    }

    public Object d(Object obj) {
        Object obj2 = this.f28733a.get(obj);
        Objects.requireNonNull(obj2);
        return obj2;
    }
}
