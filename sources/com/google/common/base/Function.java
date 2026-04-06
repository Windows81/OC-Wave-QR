package com.google.common.base;

@ElementTypesAreNonnullByDefault
public interface Function<F, T> {
    Object apply(Object obj);

    boolean equals(Object obj);
}
