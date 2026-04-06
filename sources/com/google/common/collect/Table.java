package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        Object a();

        Object b();

        Object getValue();
    }

    Map D();

    void clear();

    boolean containsValue(Object obj);

    boolean equals(Object obj);

    int hashCode();

    Map o();

    int size();

    Collection values();

    Set z();
}
