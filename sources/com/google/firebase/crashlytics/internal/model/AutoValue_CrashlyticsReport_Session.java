package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {

    /* renamed from: a  reason: collision with root package name */
    public final String f30384a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30385b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30386c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30387d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f30388e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30389f;

    /* renamed from: g  reason: collision with root package name */
    public final CrashlyticsReport.Session.Application f30390g;

    /* renamed from: h  reason: collision with root package name */
    public final CrashlyticsReport.Session.User f30391h;

    /* renamed from: i  reason: collision with root package name */
    public final CrashlyticsReport.Session.OperatingSystem f30392i;

    /* renamed from: j  reason: collision with root package name */
    public final CrashlyticsReport.Session.Device f30393j;

    /* renamed from: k  reason: collision with root package name */
    public final List f30394k;

    /* renamed from: l  reason: collision with root package name */
    public final int f30395l;

    public static final class Builder extends CrashlyticsReport.Session.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30396a;

        /* renamed from: b  reason: collision with root package name */
        public String f30397b;

        /* renamed from: c  reason: collision with root package name */
        public String f30398c;

        /* renamed from: d  reason: collision with root package name */
        public long f30399d;

        /* renamed from: e  reason: collision with root package name */
        public Long f30400e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f30401f;

        /* renamed from: g  reason: collision with root package name */
        public CrashlyticsReport.Session.Application f30402g;

        /* renamed from: h  reason: collision with root package name */
        public CrashlyticsReport.Session.User f30403h;

        /* renamed from: i  reason: collision with root package name */
        public CrashlyticsReport.Session.OperatingSystem f30404i;

        /* renamed from: j  reason: collision with root package name */
        public CrashlyticsReport.Session.Device f30405j;

        /* renamed from: k  reason: collision with root package name */
        public List f30406k;

        /* renamed from: l  reason: collision with root package name */
        public int f30407l;

        /* renamed from: m  reason: collision with root package name */
        public byte f30408m;

        public CrashlyticsReport.Session a() {
            String str;
            String str2;
            CrashlyticsReport.Session.Application application;
            if (this.f30408m == 7 && (str = this.f30396a) != null && (str2 = this.f30397b) != null && (application = this.f30402g) != null) {
                return new AutoValue_CrashlyticsReport_Session(str, str2, this.f30398c, this.f30399d, this.f30400e, this.f30401f, application, this.f30403h, this.f30404i, this.f30405j, this.f30406k, this.f30407l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30396a == null) {
                sb.append(" generator");
            }
            if (this.f30397b == null) {
                sb.append(" identifier");
            }
            if ((this.f30408m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f30408m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f30402g == null) {
                sb.append(" app");
            }
            if ((this.f30408m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Builder b(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.f30402g = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public CrashlyticsReport.Session.Builder c(String str) {
            this.f30398c = str;
            return this;
        }

        public CrashlyticsReport.Session.Builder d(boolean z2) {
            this.f30401f = z2;
            this.f30408m = (byte) (this.f30408m | 2);
            return this;
        }

        public CrashlyticsReport.Session.Builder e(CrashlyticsReport.Session.Device device) {
            this.f30405j = device;
            return this;
        }

        public CrashlyticsReport.Session.Builder f(Long l2) {
            this.f30400e = l2;
            return this;
        }

        public CrashlyticsReport.Session.Builder g(List list) {
            this.f30406k = list;
            return this;
        }

        public CrashlyticsReport.Session.Builder h(String str) {
            if (str != null) {
                this.f30396a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        public CrashlyticsReport.Session.Builder i(int i2) {
            this.f30407l = i2;
            this.f30408m = (byte) (this.f30408m | 4);
            return this;
        }

        public CrashlyticsReport.Session.Builder j(String str) {
            if (str != null) {
                this.f30397b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public CrashlyticsReport.Session.Builder l(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f30404i = operatingSystem;
            return this;
        }

        public CrashlyticsReport.Session.Builder m(long j2) {
            this.f30399d = j2;
            this.f30408m = (byte) (this.f30408m | 1);
            return this;
        }

        public CrashlyticsReport.Session.Builder n(CrashlyticsReport.Session.User user) {
            this.f30403h = user;
            return this;
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session session) {
            this.f30396a = session.g();
            this.f30397b = session.i();
            this.f30398c = session.c();
            this.f30399d = session.l();
            this.f30400e = session.e();
            this.f30401f = session.n();
            this.f30402g = session.b();
            this.f30403h = session.m();
            this.f30404i = session.k();
            this.f30405j = session.d();
            this.f30406k = session.f();
            this.f30407l = session.h();
            this.f30408m = 7;
        }
    }

    public CrashlyticsReport.Session.Application b() {
        return this.f30390g;
    }

    public String c() {
        return this.f30386c;
    }

    public CrashlyticsReport.Session.Device d() {
        return this.f30393j;
    }

    public Long e() {
        return this.f30388e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r1 = r7.f30388e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f30391h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f30392i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f30393j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        r1 = r7.f30394k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r7.f30386c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
            r2 = 0
            if (r1 == 0) goto L_0x00ca
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session) r8
            java.lang.String r1 = r7.f30384a
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r7.f30385b
            java.lang.String r3 = r8.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r7.f30386c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r8.c()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0038:
            long r3 = r7.f30387d
            long r5 = r8.l()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00c8
            java.lang.Long r1 = r7.f30388e
            if (r1 != 0) goto L_0x004d
            java.lang.Long r1 = r8.e()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0057
        L_0x004d:
            java.lang.Long r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0057:
            boolean r1 = r7.f30389f
            boolean r3 = r8.n()
            if (r1 != r3) goto L_0x00c8
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r1 = r7.f30390g
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r7.f30391h
            if (r1 != 0) goto L_0x0076
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r8.m()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0080
        L_0x0076:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r3 = r8.m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0080:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r7.f30392i
            if (r1 != 0) goto L_0x008b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r8.k()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0095
        L_0x008b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r3 = r8.k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0095:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r7.f30393j
            if (r1 != 0) goto L_0x00a0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r8.d()
            if (r1 != 0) goto L_0x00c8
            goto L_0x00aa
        L_0x00a0:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x00aa:
            java.util.List r1 = r7.f30394k
            if (r1 != 0) goto L_0x00b5
            java.util.List r1 = r8.f()
            if (r1 != 0) goto L_0x00c8
            goto L_0x00bf
        L_0x00b5:
            java.util.List r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x00bf:
            int r1 = r7.f30395l
            int r8 = r8.h()
            if (r1 != r8) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r0 = r2
        L_0x00c9:
            return r0
        L_0x00ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.equals(java.lang.Object):boolean");
    }

    public List f() {
        return this.f30394k;
    }

    public String g() {
        return this.f30384a;
    }

    public int h() {
        return this.f30395l;
    }

    public int hashCode() {
        int hashCode = (((this.f30384a.hashCode() ^ 1000003) * 1000003) ^ this.f30385b.hashCode()) * 1000003;
        String str = this.f30386c;
        int i2 = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f30387d;
        int i3 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.f30388e;
        int hashCode3 = (((((i3 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f30389f ? 1231 : 1237)) * 1000003) ^ this.f30390g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f30391h;
        int hashCode4 = (hashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f30392i;
        int hashCode5 = (hashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.f30393j;
        int hashCode6 = (hashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List list = this.f30394k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((hashCode6 ^ i2) * 1000003) ^ this.f30395l;
    }

    public String i() {
        return this.f30385b;
    }

    public CrashlyticsReport.Session.OperatingSystem k() {
        return this.f30392i;
    }

    public long l() {
        return this.f30387d;
    }

    public CrashlyticsReport.Session.User m() {
        return this.f30391h;
    }

    public boolean n() {
        return this.f30389f;
    }

    public CrashlyticsReport.Session.Builder o() {
        return new Builder(this);
    }

    public String toString() {
        return "Session{generator=" + this.f30384a + ", identifier=" + this.f30385b + ", appQualitySessionId=" + this.f30386c + ", startedAt=" + this.f30387d + ", endedAt=" + this.f30388e + ", crashed=" + this.f30389f + ", app=" + this.f30390g + ", user=" + this.f30391h + ", os=" + this.f30392i + ", device=" + this.f30393j + ", events=" + this.f30394k + ", generatorType=" + this.f30395l + "}";
    }

    public AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j2, Long l2, boolean z2, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List list, int i2) {
        this.f30384a = str;
        this.f30385b = str2;
        this.f30386c = str3;
        this.f30387d = j2;
        this.f30388e = l2;
        this.f30389f = z2;
        this.f30390g = application;
        this.f30391h = user;
        this.f30392i = operatingSystem;
        this.f30393j = device;
        this.f30394k = list;
        this.f30395l = i2;
    }
}
