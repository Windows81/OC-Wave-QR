package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class ForwardingNetwork<N, E> extends AbstractNetwork<N, E> {
    public Set b() {
        return p().b();
    }

    public Set c(Object obj) {
        return p().c(obj);
    }

    public boolean d() {
        return p().d();
    }

    public boolean e() {
        return p().e();
    }

    public Set f() {
        return p().f();
    }

    public Set h(Object obj) {
        return p().h(obj);
    }

    public boolean l() {
        return p().l();
    }

    public EndpointPair m(Object obj) {
        return p().m(obj);
    }

    public abstract Network p();

    public Set a(Object obj) {
        return p().a(obj);
    }
}
