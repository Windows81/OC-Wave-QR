package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class f implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24216b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f24217c;

    public /* synthetic */ f(Uploader uploader, TransportContext transportContext, int i2) {
        this.f24215a = uploader;
        this.f24216b = transportContext;
        this.f24217c = i2;
    }

    public final Object D() {
        return this.f24215a.s(this.f24216b, this.f24217c);
    }
}
