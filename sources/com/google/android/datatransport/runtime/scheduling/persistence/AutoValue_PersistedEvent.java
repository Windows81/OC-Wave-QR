package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

final class AutoValue_PersistedEvent extends PersistedEvent {

    /* renamed from: a  reason: collision with root package name */
    public final long f24249a;

    /* renamed from: b  reason: collision with root package name */
    public final TransportContext f24250b;

    /* renamed from: c  reason: collision with root package name */
    public final EventInternal f24251c;

    public AutoValue_PersistedEvent(long j2, TransportContext transportContext, EventInternal eventInternal) {
        this.f24249a = j2;
        if (transportContext != null) {
            this.f24250b = transportContext;
            if (eventInternal != null) {
                this.f24251c = eventInternal;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public EventInternal b() {
        return this.f24251c;
    }

    public long c() {
        return this.f24249a;
    }

    public TransportContext d() {
        return this.f24250b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f24249a == persistedEvent.c() && this.f24250b.equals(persistedEvent.d()) && this.f24251c.equals(persistedEvent.b());
    }

    public int hashCode() {
        long j2 = this.f24249a;
        return ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f24250b.hashCode()) * 1000003) ^ this.f24251c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f24249a + ", transportContext=" + this.f24250b + ", event=" + this.f24251c + "}";
    }
}
