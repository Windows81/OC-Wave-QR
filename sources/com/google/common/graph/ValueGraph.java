package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
public interface ValueGraph<N, V> extends BaseGraph<N> {
    Set a(Object obj);

    Set b();

    Set c(Object obj);

    boolean d();

    boolean e();

    Set f();

    int g(Object obj);

    Set h(Object obj);

    int i(Object obj);

    int j(Object obj);

    Object n(Object obj, Object obj2, Object obj3);
}
