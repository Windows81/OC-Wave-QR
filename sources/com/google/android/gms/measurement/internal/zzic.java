package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzic implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ Bundle f26527A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ String f26528B;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzia f26529z;

    public /* synthetic */ zzic(zzia zzia, Bundle bundle, String str) {
        this.f26529z = zzia;
        this.f26527A = bundle;
        this.f26528B = str;
    }

    public final void run() {
        this.f26529z.Y2(this.f26527A, this.f26528B);
    }
}
