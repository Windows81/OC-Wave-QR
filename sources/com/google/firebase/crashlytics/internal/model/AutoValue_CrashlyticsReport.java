package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport extends CrashlyticsReport {

    /* renamed from: b  reason: collision with root package name */
    public final String f30322b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30323c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30324d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30325e;

    /* renamed from: f  reason: collision with root package name */
    public final String f30326f;

    /* renamed from: g  reason: collision with root package name */
    public final String f30327g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30328h;

    /* renamed from: i  reason: collision with root package name */
    public final String f30329i;

    /* renamed from: j  reason: collision with root package name */
    public final String f30330j;

    /* renamed from: k  reason: collision with root package name */
    public final CrashlyticsReport.Session f30331k;

    /* renamed from: l  reason: collision with root package name */
    public final CrashlyticsReport.FilesPayload f30332l;

    /* renamed from: m  reason: collision with root package name */
    public final CrashlyticsReport.ApplicationExitInfo f30333m;

    public static final class Builder extends CrashlyticsReport.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30334a;

        /* renamed from: b  reason: collision with root package name */
        public String f30335b;

        /* renamed from: c  reason: collision with root package name */
        public int f30336c;

        /* renamed from: d  reason: collision with root package name */
        public String f30337d;

        /* renamed from: e  reason: collision with root package name */
        public String f30338e;

        /* renamed from: f  reason: collision with root package name */
        public String f30339f;

        /* renamed from: g  reason: collision with root package name */
        public String f30340g;

        /* renamed from: h  reason: collision with root package name */
        public String f30341h;

        /* renamed from: i  reason: collision with root package name */
        public String f30342i;

        /* renamed from: j  reason: collision with root package name */
        public CrashlyticsReport.Session f30343j;

        /* renamed from: k  reason: collision with root package name */
        public CrashlyticsReport.FilesPayload f30344k;

        /* renamed from: l  reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f30345l;

        /* renamed from: m  reason: collision with root package name */
        public byte f30346m;

        public CrashlyticsReport a() {
            if (this.f30346m == 1 && this.f30334a != null && this.f30335b != null && this.f30337d != null && this.f30341h != null && this.f30342i != null) {
                return new AutoValue_CrashlyticsReport(this.f30334a, this.f30335b, this.f30336c, this.f30337d, this.f30338e, this.f30339f, this.f30340g, this.f30341h, this.f30342i, this.f30343j, this.f30344k, this.f30345l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30334a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f30335b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f30346m) == 0) {
                sb.append(" platform");
            }
            if (this.f30337d == null) {
                sb.append(" installationUuid");
            }
            if (this.f30341h == null) {
                sb.append(" buildVersion");
            }
            if (this.f30342i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f30345l = applicationExitInfo;
            return this;
        }

        public CrashlyticsReport.Builder c(String str) {
            this.f30340g = str;
            return this;
        }

        public CrashlyticsReport.Builder d(String str) {
            if (str != null) {
                this.f30341h = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public CrashlyticsReport.Builder e(String str) {
            if (str != null) {
                this.f30342i = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        public CrashlyticsReport.Builder f(String str) {
            this.f30339f = str;
            return this;
        }

        public CrashlyticsReport.Builder g(String str) {
            this.f30338e = str;
            return this;
        }

        public CrashlyticsReport.Builder h(String str) {
            if (str != null) {
                this.f30335b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        public CrashlyticsReport.Builder i(String str) {
            if (str != null) {
                this.f30337d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        public CrashlyticsReport.Builder j(CrashlyticsReport.FilesPayload filesPayload) {
            this.f30344k = filesPayload;
            return this;
        }

        public CrashlyticsReport.Builder k(int i2) {
            this.f30336c = i2;
            this.f30346m = (byte) (this.f30346m | 1);
            return this;
        }

        public CrashlyticsReport.Builder l(String str) {
            if (str != null) {
                this.f30334a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        public CrashlyticsReport.Builder m(CrashlyticsReport.Session session) {
            this.f30343j = session;
            return this;
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport crashlyticsReport) {
            this.f30334a = crashlyticsReport.m();
            this.f30335b = crashlyticsReport.i();
            this.f30336c = crashlyticsReport.l();
            this.f30337d = crashlyticsReport.j();
            this.f30338e = crashlyticsReport.h();
            this.f30339f = crashlyticsReport.g();
            this.f30340g = crashlyticsReport.d();
            this.f30341h = crashlyticsReport.e();
            this.f30342i = crashlyticsReport.f();
            this.f30343j = crashlyticsReport.n();
            this.f30344k = crashlyticsReport.k();
            this.f30345l = crashlyticsReport.c();
            this.f30346m = 1;
        }
    }

    public CrashlyticsReport.ApplicationExitInfo c() {
        return this.f30333m;
    }

    public String d() {
        return this.f30328h;
    }

    public String e() {
        return this.f30329i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f30322b.equals(crashlyticsReport.m()) && this.f30323c.equals(crashlyticsReport.i()) && this.f30324d == crashlyticsReport.l() && this.f30325e.equals(crashlyticsReport.j()) && ((str = this.f30326f) != null ? str.equals(crashlyticsReport.h()) : crashlyticsReport.h() == null) && ((str2 = this.f30327g) != null ? str2.equals(crashlyticsReport.g()) : crashlyticsReport.g() == null) && ((str3 = this.f30328h) != null ? str3.equals(crashlyticsReport.d()) : crashlyticsReport.d() == null) && this.f30329i.equals(crashlyticsReport.e()) && this.f30330j.equals(crashlyticsReport.f()) && ((session = this.f30331k) != null ? session.equals(crashlyticsReport.n()) : crashlyticsReport.n() == null) && ((filesPayload = this.f30332l) != null ? filesPayload.equals(crashlyticsReport.k()) : crashlyticsReport.k() == null)) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f30333m;
            if (applicationExitInfo == null) {
                if (crashlyticsReport.c() == null) {
                    return true;
                }
            } else if (applicationExitInfo.equals(crashlyticsReport.c())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f30330j;
    }

    public String g() {
        return this.f30327g;
    }

    public String h() {
        return this.f30326f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f30322b.hashCode() ^ 1000003) * 1000003) ^ this.f30323c.hashCode()) * 1000003) ^ this.f30324d) * 1000003) ^ this.f30325e.hashCode()) * 1000003;
        String str = this.f30326f;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f30327g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30328h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f30329i.hashCode()) * 1000003) ^ this.f30330j.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.f30331k;
        int hashCode5 = (hashCode4 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f30332l;
        int hashCode6 = (hashCode5 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f30333m;
        if (applicationExitInfo != null) {
            i2 = applicationExitInfo.hashCode();
        }
        return hashCode6 ^ i2;
    }

    public String i() {
        return this.f30323c;
    }

    public String j() {
        return this.f30325e;
    }

    public CrashlyticsReport.FilesPayload k() {
        return this.f30332l;
    }

    public int l() {
        return this.f30324d;
    }

    public String m() {
        return this.f30322b;
    }

    public CrashlyticsReport.Session n() {
        return this.f30331k;
    }

    public CrashlyticsReport.Builder o() {
        return new Builder(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f30322b + ", gmpAppId=" + this.f30323c + ", platform=" + this.f30324d + ", installationUuid=" + this.f30325e + ", firebaseInstallationId=" + this.f30326f + ", firebaseAuthenticationToken=" + this.f30327g + ", appQualitySessionId=" + this.f30328h + ", buildVersion=" + this.f30329i + ", displayVersion=" + this.f30330j + ", session=" + this.f30331k + ", ndkPayload=" + this.f30332l + ", appExitInfo=" + this.f30333m + "}";
    }

    public AutoValue_CrashlyticsReport(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.f30322b = str;
        this.f30323c = str2;
        this.f30324d = i2;
        this.f30325e = str3;
        this.f30326f = str4;
        this.f30327g = str5;
        this.f30328h = str6;
        this.f30329i = str7;
        this.f30330j = str8;
        this.f30331k = session;
        this.f30332l = filesPayload;
        this.f30333m = applicationExitInfo;
    }
}
