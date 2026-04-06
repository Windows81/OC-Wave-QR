package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface ListenableFuture<V> extends Future<V> {
    void C(Runnable runnable, Executor executor);
}
