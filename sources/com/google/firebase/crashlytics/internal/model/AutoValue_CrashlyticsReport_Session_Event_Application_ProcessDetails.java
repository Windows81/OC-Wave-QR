package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* renamed from: a  reason: collision with root package name */
    public final String f30526a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30527b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30528c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f30529d;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30530a;

        /* renamed from: b  reason: collision with root package name */
        public int f30531b;

        /* renamed from: c  reason: collision with root package name */
        public int f30532c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f30533d;

        /* renamed from: e  reason: collision with root package name */
        public byte f30534e;

        public CrashlyticsReport.Session.Event.Application.ProcessDetails a() {
            String str;
            if (this.f30534e == 7 && (str = this.f30530a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(str, this.f30531b, this.f30532c, this.f30533d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30530a == null) {
                sb.append(" processName");
            }
            if ((this.f30534e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f30534e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f30534e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder b(boolean z2) {
            this.f30533d = z2;
            this.f30534e = (byte) (this.f30534e | 4);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder c(int i2) {
            this.f30532c = i2;
            this.f30534e = (byte) (this.f30534e | 2);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder d(int i2) {
            this.f30531b = i2;
            this.f30534e = (byte) (this.f30534e | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder e(String str) {
            if (str != null) {
                this.f30530a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    public int b() {
        return this.f30528c;
    }

    public int c() {
        return this.f30527b;
    }

    public String d() {
        return this.f30526a;
    }

    public boolean e() {
        return this.f30529d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        return this.f30526a.equals(processDetails.d()) && this.f30527b == processDetails.c() && this.f30528c == processDetails.b() && this.f30529d == processDetails.e();
    }

    public int hashCode() {
        return ((((((this.f30526a.hashCode() ^ 1000003) * 1000003) ^ this.f30527b) * 1000003) ^ this.f30528c) * 1000003) ^ (this.f30529d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f30526a + ", pid=" + this.f30527b + ", importance=" + this.f30528c + ", defaultProcess=" + this.f30529d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i2, int i3, boolean z2) {
        this.f30526a = str;
        this.f30527b = i2;
        this.f30528c = i3;
        this.f30529d = z2;
    }
}
