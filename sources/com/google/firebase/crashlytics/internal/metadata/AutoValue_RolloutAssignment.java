package com.google.firebase.crashlytics.internal.metadata;

final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* renamed from: b  reason: collision with root package name */
    public final String f30123b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30124c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30125d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30126e;

    /* renamed from: f  reason: collision with root package name */
    public final long f30127f;

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j2) {
        if (str != null) {
            this.f30123b = str;
            if (str2 != null) {
                this.f30124c = str2;
                if (str3 != null) {
                    this.f30125d = str3;
                    if (str4 != null) {
                        this.f30126e = str4;
                        this.f30127f = j2;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public String c() {
        return this.f30124c;
    }

    public String d() {
        return this.f30125d;
    }

    public String e() {
        return this.f30123b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.f30123b.equals(rolloutAssignment.e()) && this.f30124c.equals(rolloutAssignment.c()) && this.f30125d.equals(rolloutAssignment.d()) && this.f30126e.equals(rolloutAssignment.g()) && this.f30127f == rolloutAssignment.f();
    }

    public long f() {
        return this.f30127f;
    }

    public String g() {
        return this.f30126e;
    }

    public int hashCode() {
        long j2 = this.f30127f;
        return ((((((((this.f30123b.hashCode() ^ 1000003) * 1000003) ^ this.f30124c.hashCode()) * 1000003) ^ this.f30125d.hashCode()) * 1000003) ^ this.f30126e.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f30123b + ", parameterKey=" + this.f30124c + ", parameterValue=" + this.f30125d + ", variantId=" + this.f30126e + ", templateVersion=" + this.f30127f + "}";
    }
}
