package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata
public final class EventGDTLogger implements EventGDTLoggerInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f31485b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Provider f31486a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public EventGDTLogger(Provider provider) {
        Intrinsics.i(provider, "transportFactoryProvider");
        this.f31486a = provider;
    }

    public void a(SessionEvent sessionEvent) {
        Intrinsics.i(sessionEvent, "sessionEvent");
        ((TransportFactory) this.f31486a.get()).a("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, Encoding.b("json"), new a(this)).a(Event.f(sessionEvent));
    }

    public final byte[] c(SessionEvent sessionEvent) {
        String b2 = SessionEvents.f31533a.c().b(sessionEvent);
        Intrinsics.h(b2, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + b2);
        byte[] bytes = b2.getBytes(Charsets.f41118b);
        Intrinsics.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
