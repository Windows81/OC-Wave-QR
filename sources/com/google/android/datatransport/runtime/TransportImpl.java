package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

final class TransportImpl<T> implements Transport<T> {

    /* renamed from: a  reason: collision with root package name */
    public final TransportContext f24064a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24065b;

    /* renamed from: c  reason: collision with root package name */
    public final Encoding f24066c;

    /* renamed from: d  reason: collision with root package name */
    public final Transformer f24067d;

    /* renamed from: e  reason: collision with root package name */
    public final TransportInternal f24068e;

    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, TransportInternal transportInternal) {
        this.f24064a = transportContext;
        this.f24065b = str;
        this.f24066c = encoding;
        this.f24067d = transformer;
        this.f24068e = transportInternal;
    }

    public static /* synthetic */ void e(Exception exc) {
    }

    public void a(Event event) {
        b(event, new a());
    }

    public void b(Event event, TransportScheduleCallback transportScheduleCallback) {
        this.f24068e.a(SendRequest.a().e(this.f24064a).c(event).f(this.f24065b).d(this.f24067d).b(this.f24066c).a(), transportScheduleCallback);
    }

    public TransportContext d() {
        return this.f24064a;
    }
}
