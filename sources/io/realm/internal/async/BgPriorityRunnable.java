package io.realm.internal.async;

import android.os.Process;

public class BgPriorityRunnable implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final Runnable f40252z;

    public BgPriorityRunnable(Runnable runnable) {
        this.f40252z = runnable;
    }

    public void run() {
        Process.setThreadPriority(10);
        this.f40252z.run();
    }
}
