package com.google.firebase.inject;

public interface Deferred<T> {

    public interface DeferredHandler<T> {
        void a(Provider provider);
    }

    void a(DeferredHandler deferredHandler);
}
