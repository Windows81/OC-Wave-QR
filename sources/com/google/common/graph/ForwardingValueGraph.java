package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class ForwardingValueGraph<N, V> extends AbstractValueGraph<N, V> {
    public Set c(Object obj) {
        return r().c(obj);
    }

    public boolean d() {
        return r().d();
    }

    public boolean e() {
        return r().e();
    }

    public Set f() {
        return r().f();
    }

    public int g(Object obj) {
        return r().g(obj);
    }

    public Set h(Object obj) {
        return r().h(obj);
    }

    public int i(Object obj) {
        return r().i(obj);
    }

    public int j(Object obj) {
        return r().j(obj);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return r().n(obj, obj2, obj3);
    }

    public long o() {
        return (long) r().b().size();
    }

    public abstract ValueGraph r();

    public Set a(Object obj) {
        return r().a(obj);
    }
}
