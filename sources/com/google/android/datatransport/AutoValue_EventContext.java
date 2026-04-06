package com.google.android.datatransport;

import com.google.android.datatransport.EventContext;
import java.util.Arrays;

final class AutoValue_EventContext extends EventContext {

    /* renamed from: a  reason: collision with root package name */
    public final String f23820a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f23821b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f23822c;

    public static final class Builder extends EventContext.Builder {
    }

    public byte[] a() {
        return this.f23821b;
    }

    public byte[] b() {
        return this.f23822c;
    }

    public String c() {
        return this.f23820a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventContext)) {
            return false;
        }
        EventContext eventContext = (EventContext) obj;
        String str = this.f23820a;
        if (str != null ? str.equals(eventContext.c()) : eventContext.c() == null) {
            boolean z2 = eventContext instanceof AutoValue_EventContext;
            if (Arrays.equals(this.f23821b, z2 ? ((AutoValue_EventContext) eventContext).f23821b : eventContext.a())) {
                if (Arrays.equals(this.f23822c, z2 ? ((AutoValue_EventContext) eventContext).f23822c : eventContext.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f23820a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23821b)) * 1000003) ^ Arrays.hashCode(this.f23822c);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f23820a + ", experimentIdsClear=" + Arrays.toString(this.f23821b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f23822c) + "}";
    }
}
