package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface RangeSet<C extends Comparable> {
    Set a();
}
