package com.google.android.gms.common.api.internal;

abstract class zaav implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zaaw f24576z;

    public /* synthetic */ zaav(zaaw zaaw, zaau zaau) {
        this.f24576z = zaaw;
    }

    public abstract void a();

    public final void run() {
        this.f24576z.f24578b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
            }
        } catch (RuntimeException e2) {
            this.f24576z.f24577a.m(e2);
        } catch (Throwable th) {
            this.f24576z.f24578b.unlock();
            throw th;
        }
        this.f24576z.f24578b.unlock();
    }
}
