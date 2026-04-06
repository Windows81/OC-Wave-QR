package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {

    /* renamed from: a  reason: collision with root package name */
    public final String f30409a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30410b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30411c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashlyticsReport.Session.Application.Organization f30412d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30413e;

    /* renamed from: f  reason: collision with root package name */
    public final String f30414f;

    /* renamed from: g  reason: collision with root package name */
    public final String f30415g;

    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30416a;

        /* renamed from: b  reason: collision with root package name */
        public String f30417b;

        /* renamed from: c  reason: collision with root package name */
        public String f30418c;

        /* renamed from: d  reason: collision with root package name */
        public CrashlyticsReport.Session.Application.Organization f30419d;

        /* renamed from: e  reason: collision with root package name */
        public String f30420e;

        /* renamed from: f  reason: collision with root package name */
        public String f30421f;

        /* renamed from: g  reason: collision with root package name */
        public String f30422g;

        public CrashlyticsReport.Session.Application a() {
            String str;
            String str2 = this.f30416a;
            if (str2 != null && (str = this.f30417b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Application(str2, str, this.f30418c, this.f30419d, this.f30420e, this.f30421f, this.f30422g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30416a == null) {
                sb.append(" identifier");
            }
            if (this.f30417b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Application.Builder b(String str) {
            this.f30421f = str;
            return this;
        }

        public CrashlyticsReport.Session.Application.Builder c(String str) {
            this.f30422g = str;
            return this;
        }

        public CrashlyticsReport.Session.Application.Builder d(String str) {
            this.f30418c = str;
            return this;
        }

        public CrashlyticsReport.Session.Application.Builder e(String str) {
            if (str != null) {
                this.f30416a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public CrashlyticsReport.Session.Application.Builder f(String str) {
            this.f30420e = str;
            return this;
        }

        public CrashlyticsReport.Session.Application.Builder g(String str) {
            if (str != null) {
                this.f30417b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    public String b() {
        return this.f30414f;
    }

    public String c() {
        return this.f30415g;
    }

    public String d() {
        return this.f30411c;
    }

    public String e() {
        return this.f30409a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (this.f30409a.equals(application.e()) && this.f30410b.equals(application.h()) && ((str = this.f30411c) != null ? str.equals(application.d()) : application.d() == null) && ((organization = this.f30412d) != null ? organization.equals(application.g()) : application.g() == null) && ((str2 = this.f30413e) != null ? str2.equals(application.f()) : application.f() == null) && ((str3 = this.f30414f) != null ? str3.equals(application.b()) : application.b() == null)) {
            String str4 = this.f30415g;
            if (str4 == null) {
                if (application.c() == null) {
                    return true;
                }
            } else if (str4.equals(application.c())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f30413e;
    }

    public CrashlyticsReport.Session.Application.Organization g() {
        return this.f30412d;
    }

    public String h() {
        return this.f30410b;
    }

    public int hashCode() {
        int hashCode = (((this.f30409a.hashCode() ^ 1000003) * 1000003) ^ this.f30410b.hashCode()) * 1000003;
        String str = this.f30411c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.f30412d;
        int hashCode3 = (hashCode2 ^ (organization == null ? 0 : organization.hashCode())) * 1000003;
        String str2 = this.f30413e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30414f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f30415g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public String toString() {
        return "Application{identifier=" + this.f30409a + ", version=" + this.f30410b + ", displayVersion=" + this.f30411c + ", organization=" + this.f30412d + ", installationUuid=" + this.f30413e + ", developmentPlatform=" + this.f30414f + ", developmentPlatformVersion=" + this.f30415g + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization, String str4, String str5, String str6) {
        this.f30409a = str;
        this.f30410b = str2;
        this.f30411c = str3;
        this.f30412d = organization;
        this.f30413e = str4;
        this.f30414f = str5;
        this.f30415g = str6;
    }
}
