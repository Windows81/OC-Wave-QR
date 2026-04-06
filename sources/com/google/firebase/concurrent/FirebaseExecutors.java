package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

public class FirebaseExecutors {

    public enum DirectExecutor implements Executor {
        INSTANCE;

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return DirectExecutor.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
