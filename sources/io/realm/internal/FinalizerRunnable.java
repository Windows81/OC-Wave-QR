package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

class FinalizerRunnable implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final ReferenceQueue f40122z;

    public FinalizerRunnable(ReferenceQueue referenceQueue) {
        this.f40122z = referenceQueue;
    }

    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f40122z.remove()).e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.c("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
