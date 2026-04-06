package com.google.android.gms.common.api.internal;

final class zabn implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zabq f24654A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f24655z;

    public zabn(zabq zabq, int i2) {
        this.f24654A = zabq;
        this.f24655z = i2;
    }

    public final void run() {
        this.f24654A.i(this.f24655z);
    }
}
