package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {

    /* renamed from: a  reason: collision with root package name */
    public final int f30565a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30566b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30567c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f30568d;

    public static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* renamed from: a  reason: collision with root package name */
        public int f30569a;

        /* renamed from: b  reason: collision with root package name */
        public String f30570b;

        /* renamed from: c  reason: collision with root package name */
        public String f30571c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f30572d;

        /* renamed from: e  reason: collision with root package name */
        public byte f30573e;

        public CrashlyticsReport.Session.OperatingSystem a() {
            String str;
            String str2;
            if (this.f30573e == 3 && (str = this.f30570b) != null && (str2 = this.f30571c) != null) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.f30569a, str, str2, this.f30572d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f30573e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f30570b == null) {
                sb.append(" version");
            }
            if (this.f30571c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f30573e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.OperatingSystem.Builder b(String str) {
            if (str != null) {
                this.f30571c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public CrashlyticsReport.Session.OperatingSystem.Builder c(boolean z2) {
            this.f30572d = z2;
            this.f30573e = (byte) (this.f30573e | 2);
            return this;
        }

        public CrashlyticsReport.Session.OperatingSystem.Builder d(int i2) {
            this.f30569a = i2;
            this.f30573e = (byte) (this.f30573e | 1);
            return this;
        }

        public CrashlyticsReport.Session.OperatingSystem.Builder e(String str) {
            if (str != null) {
                this.f30570b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    public String b() {
        return this.f30567c;
    }

    public int c() {
        return this.f30565a;
    }

    public String d() {
        return this.f30566b;
    }

    public boolean e() {
        return this.f30568d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        return this.f30565a == operatingSystem.c() && this.f30566b.equals(operatingSystem.d()) && this.f30567c.equals(operatingSystem.b()) && this.f30568d == operatingSystem.e();
    }

    public int hashCode() {
        return ((((((this.f30565a ^ 1000003) * 1000003) ^ this.f30566b.hashCode()) * 1000003) ^ this.f30567c.hashCode()) * 1000003) ^ (this.f30568d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f30565a + ", version=" + this.f30566b + ", buildVersion=" + this.f30567c + ", jailbroken=" + this.f30568d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_OperatingSystem(int i2, String str, String str2, boolean z2) {
        this.f30565a = i2;
        this.f30566b = str;
        this.f30567c = str2;
        this.f30568d = z2;
    }
}
