package com.google.common.graph;

import com.google.errorprone.annotations.DoNotMock;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface SuccessorsFunction<N> {
    Iterable a(Object obj);
}
