package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzie implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ Bundle f26532A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ String f26533B;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzia f26534z;

    public /* synthetic */ zzie(zzia zzia, Bundle bundle, String str) {
        this.f26534z = zzia;
        this.f26532A = bundle;
        this.f26533B = str;
    }

    public final void run() {
        this.f26534z.P(this.f26532A, this.f26533B);
    }
}
