package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Interner<E> {
    Object a(Object obj);
}
