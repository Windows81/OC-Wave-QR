package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* renamed from: b  reason: collision with root package name */
    public final String f30818b;

    /* renamed from: c  reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f30819c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30820d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30821e;

    /* renamed from: f  reason: collision with root package name */
    public final long f30822f;

    /* renamed from: g  reason: collision with root package name */
    public final long f30823g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30824h;

    public static final class Builder extends PersistedInstallationEntry.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30825a;

        /* renamed from: b  reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f30826b;

        /* renamed from: c  reason: collision with root package name */
        public String f30827c;

        /* renamed from: d  reason: collision with root package name */
        public String f30828d;

        /* renamed from: e  reason: collision with root package name */
        public Long f30829e;

        /* renamed from: f  reason: collision with root package name */
        public Long f30830f;

        /* renamed from: g  reason: collision with root package name */
        public String f30831g;

        public PersistedInstallationEntry a() {
            String str = "";
            if (this.f30826b == null) {
                str = str + " registrationStatus";
            }
            if (this.f30829e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f30830f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.f30825a, this.f30826b, this.f30827c, this.f30828d, this.f30829e.longValue(), this.f30830f.longValue(), this.f30831g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public PersistedInstallationEntry.Builder b(String str) {
            this.f30827c = str;
            return this;
        }

        public PersistedInstallationEntry.Builder c(long j2) {
            this.f30829e = Long.valueOf(j2);
            return this;
        }

        public PersistedInstallationEntry.Builder d(String str) {
            this.f30825a = str;
            return this;
        }

        public PersistedInstallationEntry.Builder e(String str) {
            this.f30831g = str;
            return this;
        }

        public PersistedInstallationEntry.Builder f(String str) {
            this.f30828d = str;
            return this;
        }

        public PersistedInstallationEntry.Builder g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f30826b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public PersistedInstallationEntry.Builder h(long j2) {
            this.f30830f = Long.valueOf(j2);
            return this;
        }

        public Builder() {
        }

        public Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.f30825a = persistedInstallationEntry.d();
            this.f30826b = persistedInstallationEntry.g();
            this.f30827c = persistedInstallationEntry.b();
            this.f30828d = persistedInstallationEntry.f();
            this.f30829e = Long.valueOf(persistedInstallationEntry.c());
            this.f30830f = Long.valueOf(persistedInstallationEntry.h());
            this.f30831g = persistedInstallationEntry.e();
        }
    }

    public String b() {
        return this.f30820d;
    }

    public long c() {
        return this.f30822f;
    }

    public String d() {
        return this.f30818b;
    }

    public String e() {
        return this.f30824h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f30818b;
        if (str3 != null ? str3.equals(persistedInstallationEntry.d()) : persistedInstallationEntry.d() == null) {
            if (this.f30819c.equals(persistedInstallationEntry.g()) && ((str = this.f30820d) != null ? str.equals(persistedInstallationEntry.b()) : persistedInstallationEntry.b() == null) && ((str2 = this.f30821e) != null ? str2.equals(persistedInstallationEntry.f()) : persistedInstallationEntry.f() == null) && this.f30822f == persistedInstallationEntry.c() && this.f30823g == persistedInstallationEntry.h()) {
                String str4 = this.f30824h;
                if (str4 == null) {
                    if (persistedInstallationEntry.e() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f30821e;
    }

    public PersistedInstallation.RegistrationStatus g() {
        return this.f30819c;
    }

    public long h() {
        return this.f30823g;
    }

    public int hashCode() {
        String str = this.f30818b;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f30819c.hashCode()) * 1000003;
        String str2 = this.f30820d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30821e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.f30822f;
        long j3 = this.f30823g;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f30824h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i3 ^ i2;
    }

    public PersistedInstallationEntry.Builder n() {
        return new Builder(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f30818b + ", registrationStatus=" + this.f30819c + ", authToken=" + this.f30820d + ", refreshToken=" + this.f30821e + ", expiresInSecs=" + this.f30822f + ", tokenCreationEpochInSecs=" + this.f30823g + ", fisError=" + this.f30824h + "}";
    }

    public AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j2, long j3, String str4) {
        this.f30818b = str;
        this.f30819c = registrationStatus;
        this.f30820d = str2;
        this.f30821e = str3;
        this.f30822f = j2;
        this.f30823g = j3;
        this.f30824h = str4;
    }
}
