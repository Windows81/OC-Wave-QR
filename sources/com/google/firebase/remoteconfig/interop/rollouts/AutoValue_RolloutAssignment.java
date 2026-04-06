package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* renamed from: b  reason: collision with root package name */
    public final String f31409b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31410c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31411d;

    /* renamed from: e  reason: collision with root package name */
    public final String f31412e;

    /* renamed from: f  reason: collision with root package name */
    public final long f31413f;

    public static final class Builder extends RolloutAssignment.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f31414a;

        /* renamed from: b  reason: collision with root package name */
        public String f31415b;

        /* renamed from: c  reason: collision with root package name */
        public String f31416c;

        /* renamed from: d  reason: collision with root package name */
        public String f31417d;

        /* renamed from: e  reason: collision with root package name */
        public long f31418e;

        /* renamed from: f  reason: collision with root package name */
        public byte f31419f;

        public RolloutAssignment a() {
            if (this.f31419f == 1 && this.f31414a != null && this.f31415b != null && this.f31416c != null && this.f31417d != null) {
                return new AutoValue_RolloutAssignment(this.f31414a, this.f31415b, this.f31416c, this.f31417d, this.f31418e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f31414a == null) {
                sb.append(" rolloutId");
            }
            if (this.f31415b == null) {
                sb.append(" variantId");
            }
            if (this.f31416c == null) {
                sb.append(" parameterKey");
            }
            if (this.f31417d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f31419f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public RolloutAssignment.Builder b(String str) {
            if (str != null) {
                this.f31416c = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        public RolloutAssignment.Builder c(String str) {
            if (str != null) {
                this.f31417d = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        public RolloutAssignment.Builder d(String str) {
            if (str != null) {
                this.f31414a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        public RolloutAssignment.Builder e(long j2) {
            this.f31418e = j2;
            this.f31419f = (byte) (this.f31419f | 1);
            return this;
        }

        public RolloutAssignment.Builder f(String str) {
            if (str != null) {
                this.f31415b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public String b() {
        return this.f31411d;
    }

    public String c() {
        return this.f31412e;
    }

    public String d() {
        return this.f31409b;
    }

    public long e() {
        return this.f31413f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.f31409b.equals(rolloutAssignment.d()) && this.f31410c.equals(rolloutAssignment.f()) && this.f31411d.equals(rolloutAssignment.b()) && this.f31412e.equals(rolloutAssignment.c()) && this.f31413f == rolloutAssignment.e();
    }

    public String f() {
        return this.f31410c;
    }

    public int hashCode() {
        long j2 = this.f31413f;
        return ((((((((this.f31409b.hashCode() ^ 1000003) * 1000003) ^ this.f31410c.hashCode()) * 1000003) ^ this.f31411d.hashCode()) * 1000003) ^ this.f31412e.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f31409b + ", variantId=" + this.f31410c + ", parameterKey=" + this.f31411d + ", parameterValue=" + this.f31412e + ", templateVersion=" + this.f31413f + "}";
    }

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j2) {
        this.f31409b = str;
        this.f31410c = str2;
        this.f31411d = str3;
        this.f31412e = str4;
        this.f31413f = j2;
    }
}
