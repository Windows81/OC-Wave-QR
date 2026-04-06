package com.google.common.base;

@ElementTypesAreNonnullByDefault
public interface Supplier<T> {
    Object get();
}
