package com.google.common.hash;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Funnel<T> extends Serializable {
    void o0(Object obj, PrimitiveSink primitiveSink);
}
