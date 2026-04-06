package com.google.firebase.crashlytics.internal.send;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f30647A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ReportQueue f30648z;

    public /* synthetic */ c(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        this.f30648z = reportQueue;
        this.f30647A = countDownLatch;
    }

    public final void run() {
        this.f30648z.m(this.f30647A);
    }
}
