package com.google.firebase.installations.local;

import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallation;

public abstract class PersistedInstallationEntry {

    /* renamed from: a  reason: collision with root package name */
    public static PersistedInstallationEntry f30840a = a().a();

    public static abstract class Builder {
        public abstract PersistedInstallationEntry a();

        public abstract Builder b(String str);

        public abstract Builder c(long j2);

        public abstract Builder d(String str);

        public abstract Builder e(String str);

        public abstract Builder f(String str);

        public abstract Builder g(PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract Builder h(long j2);
    }

    public static Builder a() {
        return new AutoValue_PersistedInstallationEntry.Builder().h(0).g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).c(0);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract PersistedInstallation.RegistrationStatus g();

    public abstract long h();

    public boolean i() {
        return g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    public boolean l() {
        return g() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    public boolean m() {
        return g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public abstract Builder n();

    public PersistedInstallationEntry o(String str, long j2, long j3) {
        return n().b(str).c(j2).h(j3).a();
    }

    public PersistedInstallationEntry p() {
        return n().b((String) null).a();
    }

    public PersistedInstallationEntry q(String str) {
        return n().e(str).g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).a();
    }

    public PersistedInstallationEntry r() {
        return n().g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).a();
    }

    public PersistedInstallationEntry s(String str, String str2, long j2, String str3, long j3) {
        return n().d(str).g(PersistedInstallation.RegistrationStatus.REGISTERED).b(str3).f(str2).c(j3).h(j2).a();
    }

    public PersistedInstallationEntry t(String str) {
        return n().d(str).g(PersistedInstallation.RegistrationStatus.UNREGISTERED).a();
    }
}
