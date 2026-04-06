package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f30768a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30769b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30770c;

    public static final class Builder extends InstallationTokenResult.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30771a;

        /* renamed from: b  reason: collision with root package name */
        public Long f30772b;

        /* renamed from: c  reason: collision with root package name */
        public Long f30773c;

        public InstallationTokenResult a() {
            String str = "";
            if (this.f30771a == null) {
                str = str + " token";
            }
            if (this.f30772b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f30773c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.f30771a, this.f30772b.longValue(), this.f30773c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public InstallationTokenResult.Builder b(String str) {
            if (str != null) {
                this.f30771a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public InstallationTokenResult.Builder c(long j2) {
            this.f30773c = Long.valueOf(j2);
            return this;
        }

        public InstallationTokenResult.Builder d(long j2) {
            this.f30772b = Long.valueOf(j2);
            return this;
        }
    }

    public String b() {
        return this.f30768a;
    }

    public long c() {
        return this.f30770c;
    }

    public long d() {
        return this.f30769b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f30768a.equals(installationTokenResult.b()) && this.f30769b == installationTokenResult.d() && this.f30770c == installationTokenResult.c();
    }

    public int hashCode() {
        long j2 = this.f30769b;
        long j3 = this.f30770c;
        return ((((this.f30768a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f30768a + ", tokenExpirationTimestamp=" + this.f30769b + ", tokenCreationTimestamp=" + this.f30770c + "}";
    }

    public AutoValue_InstallationTokenResult(String str, long j2, long j3) {
        this.f30768a = str;
        this.f30769b = j2;
        this.f30770c = j3;
    }
}
