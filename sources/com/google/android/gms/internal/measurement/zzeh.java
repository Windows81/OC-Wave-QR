package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class zzeh implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public ThreadFactory f25436a = Executors.defaultThreadFactory();

    public zzeh(zzdv zzdv) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f25436a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
