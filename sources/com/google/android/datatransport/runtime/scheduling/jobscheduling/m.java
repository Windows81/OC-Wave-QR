package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class m implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24231a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24232b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f24233c;

    public /* synthetic */ m(Uploader uploader, TransportContext transportContext, long j2) {
        this.f24231a = uploader;
        this.f24232b = transportContext;
        this.f24233c = j2;
    }

    public final Object D() {
        return this.f24231a.r(this.f24232b, this.f24233c);
    }
}
