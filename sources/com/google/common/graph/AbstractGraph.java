package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class AbstractGraph<N> extends AbstractBaseGraph<N> implements Graph<N> {
    public /* bridge */ /* synthetic */ Set b() {
        return super.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Graph)) {
            return false;
        }
        Graph graph = (Graph) obj;
        return d() == graph.d() && f().equals(graph.f()) && b().equals(graph.b());
    }

    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return super.j(obj);
    }

    public /* bridge */ /* synthetic */ Set k(Object obj) {
        return super.k(obj);
    }

    public String toString() {
        boolean d2 = d();
        boolean e2 = e();
        String valueOf = String.valueOf(f());
        String valueOf2 = String.valueOf(b());
        StringBuilder sb = new StringBuilder(valueOf.length() + 59 + valueOf2.length());
        sb.append("isDirected: ");
        sb.append(d2);
        sb.append(", allowsSelfLoops: ");
        sb.append(e2);
        sb.append(", nodes: ");
        sb.append(valueOf);
        sb.append(", edges: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
