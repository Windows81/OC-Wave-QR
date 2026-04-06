package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ JobParameters f24208A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f24209z;

    public /* synthetic */ b(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f24209z = jobInfoSchedulerService;
        this.f24208A = jobParameters;
    }

    public final void run() {
        this.f24209z.b(this.f24208A);
    }
}
