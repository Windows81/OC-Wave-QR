package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
public class UncheckedExecutionException extends RuntimeException {
    public UncheckedExecutionException(Throwable th) {
        super(th);
    }
}
