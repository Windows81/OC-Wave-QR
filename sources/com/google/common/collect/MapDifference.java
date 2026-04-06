package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface MapDifference<K, V> {

    @DoNotMock
    public interface ValueDifference<V> {
        Object a();

        Object b();
    }

    Map a();

    Map b();

    Map c();

    Map d();
}
