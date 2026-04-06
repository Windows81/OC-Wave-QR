package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class CustomThreadFactory implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f29810e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f29811a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f29812b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29813c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f29814d;

    public CustomThreadFactory(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f29812b = str;
        this.f29813c = i2;
        this.f29814d = threadPolicy;
    }

    public final /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f29813c);
        StrictMode.ThreadPolicy threadPolicy = this.f29814d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f29810e.newThread(new a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f29812b, Long.valueOf(this.f29811a.getAndIncrement())}));
        return newThread;
    }
}
