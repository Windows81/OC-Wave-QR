package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzmy;

public final class AppMeasurementJobService extends JobService implements zzmy {

    /* renamed from: z  reason: collision with root package name */
    public zzmu f26151z;

    public final void a(Intent intent) {
    }

    public final void b(JobParameters jobParameters, boolean z2) {
        jobFinished(jobParameters, false);
    }

    public final zzmu c() {
        if (this.f26151z == null) {
            this.f26151z = new zzmu(this);
        }
        return this.f26151z;
    }

    public final boolean j(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
