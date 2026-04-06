package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SessionInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f31550a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31551b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31552c;

    /* renamed from: d  reason: collision with root package name */
    public final long f31553d;

    /* renamed from: e  reason: collision with root package name */
    public final DataCollectionStatus f31554e;

    /* renamed from: f  reason: collision with root package name */
    public final String f31555f;

    /* renamed from: g  reason: collision with root package name */
    public final String f31556g;

    public SessionInfo(String str, String str2, int i2, long j2, DataCollectionStatus dataCollectionStatus, String str3, String str4) {
        Intrinsics.i(str, "sessionId");
        Intrinsics.i(str2, "firstSessionId");
        Intrinsics.i(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.i(str3, "firebaseInstallationId");
        Intrinsics.i(str4, "firebaseAuthenticationToken");
        this.f31550a = str;
        this.f31551b = str2;
        this.f31552c = i2;
        this.f31553d = j2;
        this.f31554e = dataCollectionStatus;
        this.f31555f = str3;
        this.f31556g = str4;
    }

    public final DataCollectionStatus a() {
        return this.f31554e;
    }

    public final long b() {
        return this.f31553d;
    }

    public final String c() {
        return this.f31556g;
    }

    public final String d() {
        return this.f31555f;
    }

    public final String e() {
        return this.f31551b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return Intrinsics.d(this.f31550a, sessionInfo.f31550a) && Intrinsics.d(this.f31551b, sessionInfo.f31551b) && this.f31552c == sessionInfo.f31552c && this.f31553d == sessionInfo.f31553d && Intrinsics.d(this.f31554e, sessionInfo.f31554e) && Intrinsics.d(this.f31555f, sessionInfo.f31555f) && Intrinsics.d(this.f31556g, sessionInfo.f31556g);
    }

    public final String f() {
        return this.f31550a;
    }

    public final int g() {
        return this.f31552c;
    }

    public int hashCode() {
        return (((((((((((this.f31550a.hashCode() * 31) + this.f31551b.hashCode()) * 31) + Integer.hashCode(this.f31552c)) * 31) + Long.hashCode(this.f31553d)) * 31) + this.f31554e.hashCode()) * 31) + this.f31555f.hashCode()) * 31) + this.f31556g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f31550a + ", firstSessionId=" + this.f31551b + ", sessionIndex=" + this.f31552c + ", eventTimestampUs=" + this.f31553d + ", dataCollectionStatus=" + this.f31554e + ", firebaseInstallationId=" + this.f31555f + ", firebaseAuthenticationToken=" + this.f31556g + ')';
    }
}
