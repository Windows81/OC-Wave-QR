package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SessionDetails {

    /* renamed from: a  reason: collision with root package name */
    public final String f31526a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31527b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31528c;

    /* renamed from: d  reason: collision with root package name */
    public final long f31529d;

    public SessionDetails(String str, String str2, int i2, long j2) {
        Intrinsics.i(str, "sessionId");
        Intrinsics.i(str2, "firstSessionId");
        this.f31526a = str;
        this.f31527b = str2;
        this.f31528c = i2;
        this.f31529d = j2;
    }

    public final String a() {
        return this.f31527b;
    }

    public final String b() {
        return this.f31526a;
    }

    public final int c() {
        return this.f31528c;
    }

    public final long d() {
        return this.f31529d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return Intrinsics.d(this.f31526a, sessionDetails.f31526a) && Intrinsics.d(this.f31527b, sessionDetails.f31527b) && this.f31528c == sessionDetails.f31528c && this.f31529d == sessionDetails.f31529d;
    }

    public int hashCode() {
        return (((((this.f31526a.hashCode() * 31) + this.f31527b.hashCode()) * 31) + Integer.hashCode(this.f31528c)) * 31) + Long.hashCode(this.f31529d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f31526a + ", firstSessionId=" + this.f31527b + ", sessionIndex=" + this.f31528c + ", sessionStartTimestampUs=" + this.f31529d + ')';
    }
}
