package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class g implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24219b;

    public /* synthetic */ g(Uploader uploader, TransportContext transportContext) {
        this.f24218a = uploader;
        this.f24219b = transportContext;
    }

    public final Object D() {
        return this.f24218a.l(this.f24219b);
    }
}
