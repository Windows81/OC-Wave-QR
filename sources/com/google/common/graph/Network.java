package com.google.common.graph;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Network<N, E> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    Set a(Object obj);

    Set b();

    Set c(Object obj);

    boolean d();

    boolean e();

    Set f();

    Set h(Object obj);

    boolean l();

    EndpointPair m(Object obj);
}
