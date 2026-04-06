package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class TransportRuntime_Factory implements Factory<TransportRuntime> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24074a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24075b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24076c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f24077d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f24078e;

    public TransportRuntime_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f24074a = provider;
        this.f24075b = provider2;
        this.f24076c = provider3;
        this.f24077d = provider4;
        this.f24078e = provider5;
    }

    public static TransportRuntime_Factory a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new TransportRuntime_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static TransportRuntime c(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    /* renamed from: b */
    public TransportRuntime get() {
        return c((Clock) this.f24074a.get(), (Clock) this.f24075b.get(), (Scheduler) this.f24076c.get(), (Uploader) this.f24077d.get(), (WorkInitializer) this.f24078e.get());
    }
}
