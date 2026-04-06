package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f30347a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30348b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30349c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30350d;

    /* renamed from: e  reason: collision with root package name */
    public final long f30351e;

    /* renamed from: f  reason: collision with root package name */
    public final long f30352f;

    /* renamed from: g  reason: collision with root package name */
    public final long f30353g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30354h;

    /* renamed from: i  reason: collision with root package name */
    public final List f30355i;

    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* renamed from: a  reason: collision with root package name */
        public int f30356a;

        /* renamed from: b  reason: collision with root package name */
        public String f30357b;

        /* renamed from: c  reason: collision with root package name */
        public int f30358c;

        /* renamed from: d  reason: collision with root package name */
        public int f30359d;

        /* renamed from: e  reason: collision with root package name */
        public long f30360e;

        /* renamed from: f  reason: collision with root package name */
        public long f30361f;

        /* renamed from: g  reason: collision with root package name */
        public long f30362g;

        /* renamed from: h  reason: collision with root package name */
        public String f30363h;

        /* renamed from: i  reason: collision with root package name */
        public List f30364i;

        /* renamed from: j  reason: collision with root package name */
        public byte f30365j;

        public CrashlyticsReport.ApplicationExitInfo a() {
            String str;
            if (this.f30365j == 63 && (str = this.f30357b) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.f30356a, str, this.f30358c, this.f30359d, this.f30360e, this.f30361f, this.f30362g, this.f30363h, this.f30364i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f30365j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f30357b == null) {
                sb.append(" processName");
            }
            if ((this.f30365j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f30365j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f30365j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f30365j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f30365j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder b(List list) {
            this.f30364i = list;
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder c(int i2) {
            this.f30359d = i2;
            this.f30365j = (byte) (this.f30365j | 4);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder d(int i2) {
            this.f30356a = i2;
            this.f30365j = (byte) (this.f30365j | 1);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder e(String str) {
            if (str != null) {
                this.f30357b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder f(long j2) {
            this.f30360e = j2;
            this.f30365j = (byte) (this.f30365j | 8);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder g(int i2) {
            this.f30358c = i2;
            this.f30365j = (byte) (this.f30365j | 2);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder h(long j2) {
            this.f30361f = j2;
            this.f30365j = (byte) (this.f30365j | 16);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder i(long j2) {
            this.f30362g = j2;
            this.f30365j = (byte) (this.f30365j | 32);
            return this;
        }

        public CrashlyticsReport.ApplicationExitInfo.Builder j(String str) {
            this.f30363h = str;
            return this;
        }
    }

    public List b() {
        return this.f30355i;
    }

    public int c() {
        return this.f30350d;
    }

    public int d() {
        return this.f30347a;
    }

    public String e() {
        return this.f30348b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f30347a == applicationExitInfo.d() && this.f30348b.equals(applicationExitInfo.e()) && this.f30349c == applicationExitInfo.g() && this.f30350d == applicationExitInfo.c() && this.f30351e == applicationExitInfo.f() && this.f30352f == applicationExitInfo.h() && this.f30353g == applicationExitInfo.i() && ((str = this.f30354h) != null ? str.equals(applicationExitInfo.j()) : applicationExitInfo.j() == null)) {
            List list = this.f30355i;
            if (list == null) {
                if (applicationExitInfo.b() == null) {
                    return true;
                }
            } else if (list.equals(applicationExitInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f30351e;
    }

    public int g() {
        return this.f30349c;
    }

    public long h() {
        return this.f30352f;
    }

    public int hashCode() {
        long j2 = this.f30351e;
        long j3 = this.f30352f;
        long j4 = this.f30353g;
        int hashCode = (((((((((((((this.f30347a ^ 1000003) * 1000003) ^ this.f30348b.hashCode()) * 1000003) ^ this.f30349c) * 1000003) ^ this.f30350d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str = this.f30354h;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f30355i;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public long i() {
        return this.f30353g;
    }

    public String j() {
        return this.f30354h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f30347a + ", processName=" + this.f30348b + ", reasonCode=" + this.f30349c + ", importance=" + this.f30350d + ", pss=" + this.f30351e + ", rss=" + this.f30352f + ", timestamp=" + this.f30353g + ", traceFile=" + this.f30354h + ", buildIdMappingForArch=" + this.f30355i + "}";
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo(int i2, String str, int i3, int i4, long j2, long j3, long j4, String str2, List list) {
        this.f30347a = i2;
        this.f30348b = str;
        this.f30349c = i3;
        this.f30350d = i4;
        this.f30351e = j2;
        this.f30352f = j3;
        this.f30353g = j4;
        this.f30354h = str2;
        this.f30355i = list;
    }
}
