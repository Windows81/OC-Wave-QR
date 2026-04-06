package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
public class ExecutionError extends Error {
    public ExecutionError(Error error) {
        super(error);
    }
}
