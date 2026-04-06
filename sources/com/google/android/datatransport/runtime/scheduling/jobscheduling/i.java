package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class i implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24222a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Iterable f24223b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24224c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f24225d;

    public /* synthetic */ i(Uploader uploader, Iterable iterable, TransportContext transportContext, long j2) {
        this.f24222a = uploader;
        this.f24223b = iterable;
        this.f24224c = transportContext;
        this.f24225d = j2;
    }

    public final Object D() {
        return this.f24222a.n(this.f24223b, this.f24224c, this.f24225d);
    }
}
