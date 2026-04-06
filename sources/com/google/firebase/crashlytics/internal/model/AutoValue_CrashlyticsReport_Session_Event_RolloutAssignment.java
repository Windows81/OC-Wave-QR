package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* renamed from: a  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f30550a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30551b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30552c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30553d;

    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* renamed from: a  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f30554a;

        /* renamed from: b  reason: collision with root package name */
        public String f30555b;

        /* renamed from: c  reason: collision with root package name */
        public String f30556c;

        /* renamed from: d  reason: collision with root package name */
        public long f30557d;

        /* renamed from: e  reason: collision with root package name */
        public byte f30558e;

        public CrashlyticsReport.Session.Event.RolloutAssignment a() {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
            String str;
            String str2;
            if (this.f30558e == 1 && (rolloutVariant = this.f30554a) != null && (str = this.f30555b) != null && (str2 = this.f30556c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(rolloutVariant, str, str2, this.f30557d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30554a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f30555b == null) {
                sb.append(" parameterKey");
            }
            if (this.f30556c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f30558e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder b(String str) {
            if (str != null) {
                this.f30555b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder c(String str) {
            if (str != null) {
                this.f30556c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder d(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant != null) {
                this.f30554a = rolloutVariant;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder e(long j2) {
            this.f30557d = j2;
            this.f30558e = (byte) (this.f30558e | 1);
            return this;
        }
    }

    public String b() {
        return this.f30551b;
    }

    public String c() {
        return this.f30552c;
    }

    public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant d() {
        return this.f30550a;
    }

    public long e() {
        return this.f30553d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.f30550a.equals(rolloutAssignment.d()) && this.f30551b.equals(rolloutAssignment.b()) && this.f30552c.equals(rolloutAssignment.c()) && this.f30553d == rolloutAssignment.e();
    }

    public int hashCode() {
        long j2 = this.f30553d;
        return ((((((this.f30550a.hashCode() ^ 1000003) * 1000003) ^ this.f30551b.hashCode()) * 1000003) ^ this.f30552c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f30550a + ", parameterKey=" + this.f30551b + ", parameterValue=" + this.f30552c + ", templateVersion=" + this.f30553d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j2) {
        this.f30550a = rolloutVariant;
        this.f30551b = str;
        this.f30552c = str2;
        this.f30553d = j2;
    }
}
