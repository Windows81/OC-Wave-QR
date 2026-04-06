package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class o implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WorkInitializer f24235a;

    public /* synthetic */ o(WorkInitializer workInitializer) {
        this.f24235a = workInitializer;
    }

    public final Object D() {
        return this.f24235a.d();
    }
}
