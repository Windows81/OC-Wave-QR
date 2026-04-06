package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
public class UncheckedTimeoutException extends RuntimeException {
    public UncheckedTimeoutException(Throwable th) {
        super(th);
    }
}
