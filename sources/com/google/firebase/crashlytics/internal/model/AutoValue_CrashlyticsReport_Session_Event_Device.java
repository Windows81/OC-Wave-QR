package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {

    /* renamed from: a  reason: collision with root package name */
    public final Double f30535a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30536b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30537c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30538d;

    /* renamed from: e  reason: collision with root package name */
    public final long f30539e;

    /* renamed from: f  reason: collision with root package name */
    public final long f30540f;

    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Double f30541a;

        /* renamed from: b  reason: collision with root package name */
        public int f30542b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f30543c;

        /* renamed from: d  reason: collision with root package name */
        public int f30544d;

        /* renamed from: e  reason: collision with root package name */
        public long f30545e;

        /* renamed from: f  reason: collision with root package name */
        public long f30546f;

        /* renamed from: g  reason: collision with root package name */
        public byte f30547g;

        public CrashlyticsReport.Session.Event.Device a() {
            if (this.f30547g == 31) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f30541a, this.f30542b, this.f30543c, this.f30544d, this.f30545e, this.f30546f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f30547g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f30547g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f30547g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f30547g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f30547g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Device.Builder b(Double d2) {
            this.f30541a = d2;
            return this;
        }

        public CrashlyticsReport.Session.Event.Device.Builder c(int i2) {
            this.f30542b = i2;
            this.f30547g = (byte) (this.f30547g | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Device.Builder d(long j2) {
            this.f30546f = j2;
            this.f30547g = (byte) (this.f30547g | 16);
            return this;
        }

        public CrashlyticsReport.Session.Event.Device.Builder e(int i2) {
            this.f30544d = i2;
            this.f30547g = (byte) (this.f30547g | 4);
            return this;
        }

        public CrashlyticsReport.Session.Event.Device.Builder f(boolean z2) {
            this.f30543c = z2;
            this.f30547g = (byte) (this.f30547g | 2);
            return this;
        }

        public CrashlyticsReport.Session.Event.Device.Builder g(long j2) {
            this.f30545e = j2;
            this.f30547g = (byte) (this.f30547g | 8);
            return this;
        }
    }

    public Double b() {
        return this.f30535a;
    }

    public int c() {
        return this.f30536b;
    }

    public long d() {
        return this.f30540f;
    }

    public int e() {
        return this.f30538d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d2 = this.f30535a;
        if (d2 != null ? d2.equals(device.b()) : device.b() == null) {
            if (this.f30536b == device.c() && this.f30537c == device.g() && this.f30538d == device.e() && this.f30539e == device.f() && this.f30540f == device.d()) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f30539e;
    }

    public boolean g() {
        return this.f30537c;
    }

    public int hashCode() {
        Double d2 = this.f30535a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f30536b) * 1000003;
        int i2 = this.f30537c ? 1231 : 1237;
        long j2 = this.f30539e;
        long j3 = this.f30540f;
        return ((((((hashCode ^ i2) * 1000003) ^ this.f30538d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f30535a + ", batteryVelocity=" + this.f30536b + ", proximityOn=" + this.f30537c + ", orientation=" + this.f30538d + ", ramUsed=" + this.f30539e + ", diskUsed=" + this.f30540f + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Device(Double d2, int i2, boolean z2, int i3, long j2, long j3) {
        this.f30535a = d2;
        this.f30536b = i2;
        this.f30537c = z2;
        this.f30538d = i3;
        this.f30539e = j2;
        this.f30540f = j3;
    }
}
