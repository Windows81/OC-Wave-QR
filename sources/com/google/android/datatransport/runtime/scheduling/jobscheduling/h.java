package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class h implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24221b;

    public /* synthetic */ h(Uploader uploader, TransportContext transportContext) {
        this.f24220a = uploader;
        this.f24221b = transportContext;
    }

    public final Object D() {
        return this.f24220a.m(this.f24221b);
    }
}
