package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzb extends Thread {

    /* renamed from: A  reason: collision with root package name */
    public final long f24320A;

    /* renamed from: B  reason: collision with root package name */
    public final CountDownLatch f24321B = new CountDownLatch(1);
    public boolean C = false;

    /* renamed from: z  reason: collision with root package name */
    public final WeakReference f24322z;

    public zzb(AdvertisingIdClient advertisingIdClient, long j2) {
        this.f24322z = new WeakReference(advertisingIdClient);
        this.f24320A = j2;
        start();
    }

    public final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f24322z.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.c();
            this.C = true;
        }
    }

    public final void run() {
        try {
            if (!this.f24321B.await(this.f24320A, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
