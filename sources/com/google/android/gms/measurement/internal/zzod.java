package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzod implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26946A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f26947B;
    public final /* synthetic */ zzoa C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26948z;

    public zzod(zzoa zzoa, String str, String str2, Bundle bundle) {
        this.f26948z = str;
        this.f26946A = str2;
        this.f26947B = bundle;
        this.C = zzoa;
    }

    public final void run() {
        this.C.f26942a.v((zzbh) Preconditions.m(this.C.f26942a.y0().H(this.f26948z, this.f26946A, this.f26947B, "auto", this.C.f26942a.b().a(), false, true)), this.f26948z);
    }
}
