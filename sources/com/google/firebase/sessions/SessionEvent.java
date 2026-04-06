package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Encodable
public final class SessionEvent {

    /* renamed from: a  reason: collision with root package name */
    public final EventType f31530a;

    /* renamed from: b  reason: collision with root package name */
    public final SessionInfo f31531b;

    /* renamed from: c  reason: collision with root package name */
    public final ApplicationInfo f31532c;

    public SessionEvent(EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo) {
        Intrinsics.i(eventType, "eventType");
        Intrinsics.i(sessionInfo, "sessionData");
        Intrinsics.i(applicationInfo, "applicationInfo");
        this.f31530a = eventType;
        this.f31531b = sessionInfo;
        this.f31532c = applicationInfo;
    }

    public final ApplicationInfo a() {
        return this.f31532c;
    }

    public final EventType b() {
        return this.f31530a;
    }

    public final SessionInfo c() {
        return this.f31531b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        return this.f31530a == sessionEvent.f31530a && Intrinsics.d(this.f31531b, sessionEvent.f31531b) && Intrinsics.d(this.f31532c, sessionEvent.f31532c);
    }

    public int hashCode() {
        return (((this.f31530a.hashCode() * 31) + this.f31531b.hashCode()) * 31) + this.f31532c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f31530a + ", sessionData=" + this.f31531b + ", applicationInfo=" + this.f31532c + ')';
    }
}
