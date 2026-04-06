package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import j.a;
import j.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class DefaultScheduler implements Scheduler {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f24145f = Logger.getLogger(TransportRuntime.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final WorkScheduler f24146a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f24147b;

    /* renamed from: c  reason: collision with root package name */
    public final BackendRegistry f24148c;

    /* renamed from: d  reason: collision with root package name */
    public final EventStore f24149d;

    /* renamed from: e  reason: collision with root package name */
    public final SynchronizationGuard f24150e;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f24147b = executor;
        this.f24148c = backendRegistry;
        this.f24146a = workScheduler;
        this.f24149d = eventStore;
        this.f24150e = synchronizationGuard;
    }

    public void a(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.f24147b.execute(new a(this, transportContext, transportScheduleCallback, eventInternal));
    }

    public final /* synthetic */ Object d(TransportContext transportContext, EventInternal eventInternal) {
        this.f24149d.g1(transportContext, eventInternal);
        this.f24146a.a(transportContext, 1);
        return null;
    }

    public final /* synthetic */ void e(TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend e2 = this.f24148c.e(transportContext.b());
            if (e2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{transportContext.b()});
                f24145f.warning(format);
                transportScheduleCallback.a(new IllegalArgumentException(format));
                return;
            }
            this.f24150e.b(new b(this, transportContext, e2.b(eventInternal)));
            transportScheduleCallback.a((Exception) null);
        } catch (Exception e3) {
            Logger logger = f24145f;
            logger.warning("Error scheduling event " + e3.getMessage());
            transportScheduleCallback.a(e3);
        }
    }
}
