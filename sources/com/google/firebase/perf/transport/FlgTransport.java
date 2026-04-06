package com.google.firebase.perf.transport;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.PerfMetric;

final class FlgTransport {

    /* renamed from: d  reason: collision with root package name */
    public static final AndroidLogger f31070d = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final String f31071a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f31072b;

    /* renamed from: c  reason: collision with root package name */
    public Transport f31073c;

    public FlgTransport(Provider provider, String str) {
        this.f31071a = str;
        this.f31072b = provider;
    }

    public final boolean a() {
        if (this.f31073c == null) {
            TransportFactory transportFactory = (TransportFactory) this.f31072b.get();
            if (transportFactory != null) {
                this.f31073c = transportFactory.a(this.f31071a, PerfMetric.class, Encoding.b("proto"), new a());
            } else {
                f31070d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f31073c != null;
    }

    public void b(PerfMetric perfMetric) {
        if (!a()) {
            f31070d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f31073c.a(Event.f(perfMetric));
        }
    }
}
