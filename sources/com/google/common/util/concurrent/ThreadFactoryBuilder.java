package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
public final class ThreadFactoryBuilder {

    /* renamed from: a  reason: collision with root package name */
    public String f29595a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f29596b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f29597c = null;

    /* renamed from: d  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f29598d = null;

    /* renamed from: e  reason: collision with root package name */
    public ThreadFactory f29599e = null;

    public static ThreadFactory c(ThreadFactoryBuilder threadFactoryBuilder) {
        final String str = threadFactoryBuilder.f29595a;
        final Boolean bool = threadFactoryBuilder.f29596b;
        final Integer num = threadFactoryBuilder.f29597c;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.f29598d;
        ThreadFactory threadFactory = threadFactoryBuilder.f29599e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory2 = threadFactory;
        final AtomicLong atomicLong = str != null ? new AtomicLong(0) : null;
        return new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory2.newThread(runnable);
                String str = str;
                if (str != null) {
                    AtomicLong atomicLong = atomicLong;
                    Objects.requireNonNull(atomicLong);
                    newThread.setName(ThreadFactoryBuilder.d(str, Long.valueOf(atomicLong.getAndIncrement())));
                }
                Boolean bool = bool;
                if (bool != null) {
                    newThread.setDaemon(bool.booleanValue());
                }
                Integer num = num;
                if (num != null) {
                    newThread.setPriority(num.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return newThread;
            }
        };
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public ThreadFactoryBuilder e(boolean z2) {
        this.f29596b = Boolean.valueOf(z2);
        return this;
    }

    public ThreadFactoryBuilder f(String str) {
        d(str, 0);
        this.f29595a = str;
        return this;
    }
}
