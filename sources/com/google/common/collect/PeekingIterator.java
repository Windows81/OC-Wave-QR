package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface PeekingIterator<E> extends Iterator<E> {
    Object next();

    Object peek();
}
