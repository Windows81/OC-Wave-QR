package com.google.common.base;

@ElementTypesAreNonnullByDefault
public interface Predicate<T> {
    boolean apply(Object obj);

    boolean equals(Object obj);
}
