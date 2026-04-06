package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
public interface FutureCallback<V> {
    void a(Object obj);

    void b(Throwable th);
}
