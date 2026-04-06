package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

class SafeLoggingExecutor implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final Executor f24059z;

    public static class SafeLoggingRunnable implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final Runnable f24060z;

        public SafeLoggingRunnable(Runnable runnable) {
            this.f24060z = runnable;
        }

        public void run() {
            try {
                this.f24060z.run();
            } catch (Exception e2) {
                Logging.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    public SafeLoggingExecutor(Executor executor) {
        this.f24059z = executor;
    }

    public void execute(Runnable runnable) {
        this.f24059z.execute(new SafeLoggingRunnable(runnable));
    }
}
