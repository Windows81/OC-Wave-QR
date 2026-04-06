package com.google.firebase.events;

import java.util.concurrent.Executor;

public interface Subscriber {
    void a(Class cls, Executor executor, EventHandler eventHandler);
}
