package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {

    /* renamed from: a  reason: collision with root package name */
    public final int f30424a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30425b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30426c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30427d;

    /* renamed from: e  reason: collision with root package name */
    public final long f30428e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30429f;

    /* renamed from: g  reason: collision with root package name */
    public final int f30430g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30431h;

    /* renamed from: i  reason: collision with root package name */
    public final String f30432i;

    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {

        /* renamed from: a  reason: collision with root package name */
        public int f30433a;

        /* renamed from: b  reason: collision with root package name */
        public String f30434b;

        /* renamed from: c  reason: collision with root package name */
        public int f30435c;

        /* renamed from: d  reason: collision with root package name */
        public long f30436d;

        /* renamed from: e  reason: collision with root package name */
        public long f30437e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f30438f;

        /* renamed from: g  reason: collision with root package name */
        public int f30439g;

        /* renamed from: h  reason: collision with root package name */
        public String f30440h;

        /* renamed from: i  reason: collision with root package name */
        public String f30441i;

        /* renamed from: j  reason: collision with root package name */
        public byte f30442j;

        public CrashlyticsReport.Session.Device a() {
            String str;
            String str2;
            String str3;
            if (this.f30442j == 63 && (str = this.f30434b) != null && (str2 = this.f30440h) != null && (str3 = this.f30441i) != null) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.f30433a, str, this.f30435c, this.f30436d, this.f30437e, this.f30438f, this.f30439g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f30442j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f30434b == null) {
                sb.append(" model");
            }
            if ((this.f30442j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f30442j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f30442j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f30442j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f30442j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f30440h == null) {
                sb.append(" manufacturer");
            }
            if (this.f30441i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Device.Builder b(int i2) {
            this.f30433a = i2;
            this.f30442j = (byte) (this.f30442j | 1);
            return this;
        }

        public CrashlyticsReport.Session.Device.Builder c(int i2) {
            this.f30435c = i2;
            this.f30442j = (byte) (this.f30442j | 2);
            return this;
        }

        public CrashlyticsReport.Session.Device.Builder d(long j2) {
            this.f30437e = j2;
            this.f30442j = (byte) (this.f30442j | 8);
            return this;
        }

        public CrashlyticsReport.Session.Device.Builder e(String str) {
            if (str != null) {
                this.f30440h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        public CrashlyticsReport.Session.Device.Builder f(String str) {
            if (str != null) {
                this.f30434b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        public CrashlyticsReport.Session.Device.Builder g(String str) {
            if (str != null) {
                this.f30441i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        public CrashlyticsReport.Session.Device.Builder h(long j2) {
            this.f30436d = j2;
            this.f30442j = (byte) (this.f30442j | 4);
            return this;
        }

        public CrashlyticsReport.Session.Device.Builder i(boolean z2) {
            this.f30438f = z2;
            this.f30442j = (byte) (this.f30442j | 16);
            return this;
        }

        public CrashlyticsReport.Session.Device.Builder j(int i2) {
            this.f30439g = i2;
            this.f30442j = (byte) (this.f30442j | 32);
            return this;
        }
    }

    public int b() {
        return this.f30424a;
    }

    public int c() {
        return this.f30426c;
    }

    public long d() {
        return this.f30428e;
    }

    public String e() {
        return this.f30431h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        return this.f30424a == device.b() && this.f30425b.equals(device.f()) && this.f30426c == device.c() && this.f30427d == device.h() && this.f30428e == device.d() && this.f30429f == device.j() && this.f30430g == device.i() && this.f30431h.equals(device.e()) && this.f30432i.equals(device.g());
    }

    public String f() {
        return this.f30425b;
    }

    public String g() {
        return this.f30432i;
    }

    public long h() {
        return this.f30427d;
    }

    public int hashCode() {
        long j2 = this.f30427d;
        long j3 = this.f30428e;
        return ((((((((((((((((this.f30424a ^ 1000003) * 1000003) ^ this.f30425b.hashCode()) * 1000003) ^ this.f30426c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f30429f ? 1231 : 1237)) * 1000003) ^ this.f30430g) * 1000003) ^ this.f30431h.hashCode()) * 1000003) ^ this.f30432i.hashCode();
    }

    public int i() {
        return this.f30430g;
    }

    public boolean j() {
        return this.f30429f;
    }

    public String toString() {
        return "Device{arch=" + this.f30424a + ", model=" + this.f30425b + ", cores=" + this.f30426c + ", ram=" + this.f30427d + ", diskSpace=" + this.f30428e + ", simulator=" + this.f30429f + ", state=" + this.f30430g + ", manufacturer=" + this.f30431h + ", modelClass=" + this.f30432i + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Device(int i2, String str, int i3, long j2, long j3, boolean z2, int i4, String str2, String str3) {
        this.f30424a = i2;
        this.f30425b = str;
        this.f30426c = i3;
        this.f30427d = j2;
        this.f30428e = j3;
        this.f30429f = z2;
        this.f30430g = i4;
        this.f30431h = str2;
        this.f30432i = str3;
    }
}
