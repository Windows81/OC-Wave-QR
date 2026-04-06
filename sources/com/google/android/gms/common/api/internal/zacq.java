package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class zacq implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zact f24707z;

    public zacq(zact zact) {
        this.f24707z = zact;
    }

    public final void run() {
        this.f24707z.f24717r.b(new ConnectionResult(4));
    }
}
