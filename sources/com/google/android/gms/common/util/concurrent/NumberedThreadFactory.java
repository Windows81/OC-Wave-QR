package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f25140a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f25141b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    public final ThreadFactory f25142c = Executors.defaultThreadFactory();

    public NumberedThreadFactory(String str) {
        Preconditions.n(str, "Name must not be null");
        this.f25140a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f25142c.newThread(new zza(runnable, 0));
        int andIncrement = this.f25141b.getAndIncrement();
        newThread.setName(this.f25140a + "[" + andIncrement + "]");
        return newThread;
    }
}
