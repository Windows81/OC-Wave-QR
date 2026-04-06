package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class ForwardingGraph<N> extends AbstractGraph<N> {
    public Set c(Object obj) {
        return q().c(obj);
    }

    public boolean d() {
        return q().d();
    }

    public boolean e() {
        return q().e();
    }

    public Set f() {
        return q().f();
    }

    public int g(Object obj) {
        return q().g(obj);
    }

    public Set h(Object obj) {
        return q().h(obj);
    }

    public int i(Object obj) {
        return q().i(obj);
    }

    public int j(Object obj) {
        return q().j(obj);
    }

    public Set k(Object obj) {
        return q().k(obj);
    }

    public long o() {
        return (long) q().b().size();
    }

    public abstract BaseGraph q();

    public Set a(Object obj) {
        return q().a(obj);
    }
}
