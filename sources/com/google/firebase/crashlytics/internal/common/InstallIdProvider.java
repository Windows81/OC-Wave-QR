package com.google.firebase.crashlytics.internal.common;

public interface InstallIdProvider {

    public static abstract class InstallIds {
        public static InstallIds a(String str, FirebaseInstallationId firebaseInstallationId) {
            return new AutoValue_InstallIdProvider_InstallIds(str, firebaseInstallationId.b(), firebaseInstallationId.a());
        }

        public static InstallIds b(String str) {
            return new AutoValue_InstallIdProvider_InstallIds(str, (String) null, (String) null);
        }

        public abstract String c();

        public abstract String d();

        public abstract String e();
    }

    InstallIds a();
}
