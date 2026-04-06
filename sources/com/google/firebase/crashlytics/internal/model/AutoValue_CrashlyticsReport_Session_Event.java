package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {

    /* renamed from: a  reason: collision with root package name */
    public final long f30443a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30444b;

    /* renamed from: c  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application f30445c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Device f30446d;

    /* renamed from: e  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Log f30447e;

    /* renamed from: f  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutsState f30448f;

    public static final class Builder extends CrashlyticsReport.Session.Event.Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f30449a;

        /* renamed from: b  reason: collision with root package name */
        public String f30450b;

        /* renamed from: c  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application f30451c;

        /* renamed from: d  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Device f30452d;

        /* renamed from: e  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Log f30453e;

        /* renamed from: f  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutsState f30454f;

        /* renamed from: g  reason: collision with root package name */
        public byte f30455g;

        public CrashlyticsReport.Session.Event a() {
            String str;
            CrashlyticsReport.Session.Event.Application application;
            CrashlyticsReport.Session.Event.Device device;
            if (this.f30455g == 1 && (str = this.f30450b) != null && (application = this.f30451c) != null && (device = this.f30452d) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.f30449a, str, application, device, this.f30453e, this.f30454f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f30455g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f30450b == null) {
                sb.append(" type");
            }
            if (this.f30451c == null) {
                sb.append(" app");
            }
            if (this.f30452d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Builder b(CrashlyticsReport.Session.Event.Application application) {
            if (application != null) {
                this.f30451c = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public CrashlyticsReport.Session.Event.Builder c(CrashlyticsReport.Session.Event.Device device) {
            if (device != null) {
                this.f30452d = device;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        public CrashlyticsReport.Session.Event.Builder d(CrashlyticsReport.Session.Event.Log log) {
            this.f30453e = log;
            return this;
        }

        public CrashlyticsReport.Session.Event.Builder e(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f30454f = rolloutsState;
            return this;
        }

        public CrashlyticsReport.Session.Event.Builder f(long j2) {
            this.f30449a = j2;
            this.f30455g = (byte) (this.f30455g | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Builder g(String str) {
            if (str != null) {
                this.f30450b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session.Event event) {
            this.f30449a = event.f();
            this.f30450b = event.g();
            this.f30451c = event.b();
            this.f30452d = event.c();
            this.f30453e = event.d();
            this.f30454f = event.e();
            this.f30455g = 1;
        }
    }

    public CrashlyticsReport.Session.Event.Application b() {
        return this.f30445c;
    }

    public CrashlyticsReport.Session.Event.Device c() {
        return this.f30446d;
    }

    public CrashlyticsReport.Session.Event.Log d() {
        return this.f30447e;
    }

    public CrashlyticsReport.Session.Event.RolloutsState e() {
        return this.f30448f;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.f30443a == event.f() && this.f30444b.equals(event.g()) && this.f30445c.equals(event.b()) && this.f30446d.equals(event.c()) && ((log = this.f30447e) != null ? log.equals(event.d()) : event.d() == null)) {
            CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f30448f;
            if (rolloutsState == null) {
                if (event.e() == null) {
                    return true;
                }
            } else if (rolloutsState.equals(event.e())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f30443a;
    }

    public String g() {
        return this.f30444b;
    }

    public CrashlyticsReport.Session.Event.Builder h() {
        return new Builder(this);
    }

    public int hashCode() {
        long j2 = this.f30443a;
        int hashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f30444b.hashCode()) * 1000003) ^ this.f30445c.hashCode()) * 1000003) ^ this.f30446d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f30447e;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (log == null ? 0 : log.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f30448f;
        if (rolloutsState != null) {
            i2 = rolloutsState.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public String toString() {
        return "Event{timestamp=" + this.f30443a + ", type=" + this.f30444b + ", app=" + this.f30445c + ", device=" + this.f30446d + ", log=" + this.f30447e + ", rollouts=" + this.f30448f + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event(long j2, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.f30443a = j2;
        this.f30444b = str;
        this.f30445c = application;
        this.f30446d = device;
        this.f30447e = log;
        this.f30448f = rolloutsState;
    }
}
