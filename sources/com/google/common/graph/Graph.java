package com.google.common.graph;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Graph<N> extends BaseGraph<N> {
    Set a(Object obj);

    Set b();

    Set c(Object obj);

    boolean d();

    boolean e();

    Set f();

    int g(Object obj);

    int i(Object obj);

    Set k(Object obj);
}
