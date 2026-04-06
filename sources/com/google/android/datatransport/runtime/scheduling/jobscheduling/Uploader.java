package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class Uploader {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24182a;

    /* renamed from: b  reason: collision with root package name */
    public final BackendRegistry f24183b;

    /* renamed from: c  reason: collision with root package name */
    public final EventStore f24184c;

    /* renamed from: d  reason: collision with root package name */
    public final WorkScheduler f24185d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f24186e;

    /* renamed from: f  reason: collision with root package name */
    public final SynchronizationGuard f24187f;

    /* renamed from: g  reason: collision with root package name */
    public final Clock f24188g;

    /* renamed from: h  reason: collision with root package name */
    public final Clock f24189h;

    /* renamed from: i  reason: collision with root package name */
    public final ClientHealthMetricsStore f24190i;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f24182a = context;
        this.f24183b = backendRegistry;
        this.f24184c = eventStore;
        this.f24185d = workScheduler;
        this.f24186e = executor;
        this.f24187f = synchronizationGuard;
        this.f24188g = clock;
        this.f24189h = clock2;
        this.f24190i = clientHealthMetricsStore;
    }

    public EventInternal j(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.f24187f;
        ClientHealthMetricsStore clientHealthMetricsStore = this.f24190i;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.b(EventInternal.a().i(this.f24188g.a()).o(this.f24189h.a()).n("GDT_CLIENT_METRICS").h(new EncodedPayload(Encoding.b("proto"), ((ClientMetrics) synchronizationGuard.b(new d(clientHealthMetricsStore))).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f24182a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final /* synthetic */ Boolean l(TransportContext transportContext) {
        return Boolean.valueOf(this.f24184c.s1(transportContext));
    }

    public final /* synthetic */ Iterable m(TransportContext transportContext) {
        return this.f24184c.a0(transportContext);
    }

    public final /* synthetic */ Object n(Iterable iterable, TransportContext transportContext, long j2) {
        this.f24184c.u1(iterable);
        this.f24184c.j0(transportContext, this.f24188g.a() + j2);
        return null;
    }

    public final /* synthetic */ Object o(Iterable iterable) {
        this.f24184c.P(iterable);
        return null;
    }

    public final /* synthetic */ Object p() {
        this.f24190i.a();
        return null;
    }

    public final /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f24190i.d((long) ((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public final /* synthetic */ Object r(TransportContext transportContext, long j2) {
        this.f24184c.j0(transportContext, this.f24188g.a() + j2);
        return null;
    }

    public final /* synthetic */ Object s(TransportContext transportContext, int i2) {
        this.f24185d.a(transportContext, i2 + 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3.f24185d.a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void t(com.google.android.datatransport.runtime.TransportContext r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.f24187f     // Catch:{ SynchronizationException -> 0x0029 }
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1 = r3.f24184c     // Catch:{ SynchronizationException -> 0x0029 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0029 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.e r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.e     // Catch:{ SynchronizationException -> 0x0029 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0029 }
            r0.b(r2)     // Catch:{ SynchronizationException -> 0x0029 }
            boolean r0 = r3.k()     // Catch:{ SynchronizationException -> 0x0029 }
            if (r0 != 0) goto L_0x0022
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.f24187f     // Catch:{ SynchronizationException -> 0x0029 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.f r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.f     // Catch:{ SynchronizationException -> 0x0029 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0029 }
            r0.b(r1)     // Catch:{ SynchronizationException -> 0x0029 }
            goto L_0x0025
        L_0x0020:
            r4 = move-exception
            goto L_0x0032
        L_0x0022:
            r3.u(r4, r5)     // Catch:{ SynchronizationException -> 0x0029 }
        L_0x0025:
            r6.run()
            goto L_0x0031
        L_0x0029:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r3.f24185d     // Catch:{ all -> 0x0020 }
            int r5 = r5 + 1
            r0.a(r4, r5)     // Catch:{ all -> 0x0020 }
            goto L_0x0025
        L_0x0031:
            return
        L_0x0032:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.t(com.google.android.datatransport.runtime.TransportContext, int, java.lang.Runnable):void");
    }

    public BackendResponse u(TransportContext transportContext, int i2) {
        BackendResponse a2;
        TransportBackend e2 = this.f24183b.e(transportContext.b());
        long j2 = 0;
        BackendResponse e3 = BackendResponse.e(0);
        while (true) {
            long j3 = j2;
            while (((Boolean) this.f24187f.b(new g(this, transportContext))).booleanValue()) {
                Iterable<PersistedEvent> iterable = (Iterable) this.f24187f.b(new h(this, transportContext));
                if (!iterable.iterator().hasNext()) {
                    return e3;
                }
                if (e2 == null) {
                    Logging.a("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                    a2 = BackendResponse.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (PersistedEvent b2 : iterable) {
                        arrayList.add(b2.b());
                    }
                    if (transportContext.e()) {
                        arrayList.add(j(e2));
                    }
                    a2 = e2.a(BackendRequest.a().b(arrayList).c(transportContext.c()).a());
                }
                e3 = a2;
                if (e3.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f24187f.b(new i(this, iterable, transportContext, j3));
                    this.f24185d.b(transportContext, i2 + 1, true);
                    return e3;
                }
                this.f24187f.b(new j(this, iterable));
                if (e3.c() == BackendResponse.Status.OK) {
                    j2 = Math.max(j3, e3.b());
                    if (transportContext.e()) {
                        this.f24187f.b(new k(this));
                    }
                } else if (e3.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (PersistedEvent b3 : iterable) {
                        String n2 = b3.b().n();
                        if (!hashMap.containsKey(n2)) {
                            hashMap.put(n2, 1);
                        } else {
                            hashMap.put(n2, Integer.valueOf(((Integer) hashMap.get(n2)).intValue() + 1));
                        }
                    }
                    this.f24187f.b(new l(this, hashMap));
                }
            }
            this.f24187f.b(new m(this, transportContext, j3));
            return e3;
        }
    }

    public void v(TransportContext transportContext, int i2, Runnable runnable) {
        this.f24186e.execute(new c(this, transportContext, i2, runnable));
    }
}
