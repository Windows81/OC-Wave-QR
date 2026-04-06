package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;

@ElementTypesAreNonnullByDefault
public final class SettableFuture<V> extends AbstractFuture.TrustedFuture<V> {
    public static SettableFuture G() {
        return new SettableFuture();
    }

    public boolean B(Object obj) {
        return super.B(obj);
    }

    public boolean D(Throwable th) {
        return super.D(th);
    }

    public boolean E(ListenableFuture listenableFuture) {
        return super.E(listenableFuture);
    }
}
