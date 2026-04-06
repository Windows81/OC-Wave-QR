package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Collections;
import java.util.Set;
import javax.inject.Singleton;

@Singleton
public class TransportRuntime implements TransportInternal {

    /* renamed from: e  reason: collision with root package name */
    public static volatile TransportRuntimeComponent f24069e;

    /* renamed from: a  reason: collision with root package name */
    public final Clock f24070a;

    /* renamed from: b  reason: collision with root package name */
    public final Clock f24071b;

    /* renamed from: c  reason: collision with root package name */
    public final Scheduler f24072c;

    /* renamed from: d  reason: collision with root package name */
    public final Uploader f24073d;

    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f24070a = clock;
        this.f24071b = clock2;
        this.f24072c = scheduler;
        this.f24073d = uploader;
        workInitializer.c();
    }

    public static TransportRuntime c() {
        TransportRuntimeComponent transportRuntimeComponent = f24069e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(Destination destination) {
        return destination instanceof EncodedDestination ? Collections.unmodifiableSet(((EncodedDestination) destination).a()) : Collections.singleton(Encoding.b("proto"));
    }

    public static void f(Context context) {
        if (f24069e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f24069e == null) {
                        f24069e = DaggerTransportRuntimeComponent.a().a(context).d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.f24072c.a(sendRequest.f().f(sendRequest.c().d()), b(sendRequest), transportScheduleCallback);
    }

    public final EventInternal b(SendRequest sendRequest) {
        EventInternal.Builder g2 = EventInternal.a().i(this.f24070a.a()).o(this.f24071b.a()).n(sendRequest.g()).h(new EncodedPayload(sendRequest.b(), sendRequest.d())).g(sendRequest.c().a());
        if (!(sendRequest.c().e() == null || sendRequest.c().e().a() == null)) {
            g2.l(sendRequest.c().e().a());
        }
        if (sendRequest.c().b() != null) {
            EventContext b2 = sendRequest.c().b();
            if (b2.c() != null) {
                g2.m(b2.c());
            }
            if (b2.a() != null) {
                g2.j(b2.a());
            }
            if (b2.b() != null) {
                g2.k(b2.b());
            }
        }
        return g2.d();
    }

    public Uploader e() {
        return this.f24073d;
    }

    public TransportFactory g(Destination destination) {
        return new TransportFactoryImpl(d(destination), TransportContext.a().b(destination.getName()).c(destination.getExtras()).a(), this);
    }
}
