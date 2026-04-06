package com.google.android.gms.common.api.internal;

import android.os.IBinder;

public final /* synthetic */ class zacg implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IBinder f24694A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NonGmsServiceBrokerClient f24695z;

    public /* synthetic */ zacg(NonGmsServiceBrokerClient nonGmsServiceBrokerClient, IBinder iBinder) {
        this.f24695z = nonGmsServiceBrokerClient;
        this.f24694A = iBinder;
    }

    public final void run() {
        this.f24695z.v(this.f24694A);
    }
}
