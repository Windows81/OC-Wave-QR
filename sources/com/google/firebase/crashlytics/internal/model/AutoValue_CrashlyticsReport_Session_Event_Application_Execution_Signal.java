package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* renamed from: a  reason: collision with root package name */
    public final String f30501a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30502b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30503c;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30504a;

        /* renamed from: b  reason: collision with root package name */
        public String f30505b;

        /* renamed from: c  reason: collision with root package name */
        public long f30506c;

        /* renamed from: d  reason: collision with root package name */
        public byte f30507d;

        public CrashlyticsReport.Session.Event.Application.Execution.Signal a() {
            String str;
            String str2;
            if (this.f30507d == 1 && (str = this.f30504a) != null && (str2 = this.f30505b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(str, str2, this.f30506c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30504a == null) {
                sb.append(" name");
            }
            if (this.f30505b == null) {
                sb.append(" code");
            }
            if ((1 & this.f30507d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder b(long j2) {
            this.f30506c = j2;
            this.f30507d = (byte) (this.f30507d | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder c(String str) {
            if (str != null) {
                this.f30505b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder d(String str) {
            if (str != null) {
                this.f30504a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public long b() {
        return this.f30503c;
    }

    public String c() {
        return this.f30502b;
    }

    public String d() {
        return this.f30501a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        return this.f30501a.equals(signal.d()) && this.f30502b.equals(signal.c()) && this.f30503c == signal.b();
    }

    public int hashCode() {
        long j2 = this.f30503c;
        return ((((this.f30501a.hashCode() ^ 1000003) * 1000003) ^ this.f30502b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f30501a + ", code=" + this.f30502b + ", address=" + this.f30503c + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String str, String str2, long j2) {
        this.f30501a = str;
        this.f30502b = str2;
        this.f30503c = j2;
    }
}
