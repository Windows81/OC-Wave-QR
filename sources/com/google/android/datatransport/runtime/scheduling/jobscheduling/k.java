package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class k implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24228a;

    public /* synthetic */ k(Uploader uploader) {
        this.f24228a = uploader;
    }

    public final Object D() {
        return this.f24228a.p();
    }
}
