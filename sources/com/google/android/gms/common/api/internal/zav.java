package com.google.android.gms.common.api.internal;

final class zav implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zaaa f24765z;

    public final void run() {
        this.f24765z.f24546x.lock();
        try {
            zaaa.v(this.f24765z);
        } finally {
            this.f24765z.f24546x.unlock();
        }
    }
}
