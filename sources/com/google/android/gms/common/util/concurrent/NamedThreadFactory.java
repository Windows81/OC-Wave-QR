package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f25138a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f25139b = Executors.defaultThreadFactory();

    public NamedThreadFactory(String str) {
        Preconditions.n(str, "Name must not be null");
        this.f25138a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f25139b.newThread(new zza(runnable, 0));
        newThread.setName(this.f25138a);
        return newThread;
    }
}
