package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class j implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24226a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Iterable f24227b;

    public /* synthetic */ j(Uploader uploader, Iterable iterable) {
        this.f24226a = uploader;
        this.f24227b = iterable;
    }

    public final Object D() {
        return this.f24226a.o(this.f24227b);
    }
}
