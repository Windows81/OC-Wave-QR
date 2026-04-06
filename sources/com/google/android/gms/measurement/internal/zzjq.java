package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzjq implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ Bundle f26647A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ long f26648B;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzjk f26649z;

    public /* synthetic */ zzjq(zzjk zzjk, Bundle bundle, long j2) {
        this.f26649z = zzjk;
        this.f26647A = bundle;
        this.f26648B = j2;
    }

    public final void run() {
        this.f26649z.O(this.f26647A, this.f26648B);
    }
}
