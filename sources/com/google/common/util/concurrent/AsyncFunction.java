package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
public interface AsyncFunction<I, O> {
    ListenableFuture apply(Object obj);
}
