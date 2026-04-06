package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface RangeMap<K extends Comparable, V> {
    Map a();
}
