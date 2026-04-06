package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final /* synthetic */ class zzmx implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ zzgi f26849A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ JobParameters f26850B;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzmu f26851z;

    public /* synthetic */ zzmx(zzmu zzmu, zzgi zzgi, JobParameters jobParameters) {
        this.f26851z = zzmu;
        this.f26849A = zzgi;
        this.f26850B = jobParameters;
    }

    public final void run() {
        this.f26851z.e(this.f26849A, this.f26850B);
    }
}
