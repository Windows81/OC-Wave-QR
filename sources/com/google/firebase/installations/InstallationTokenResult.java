package com.google.firebase.installations;

import com.google.firebase.installations.AutoValue_InstallationTokenResult;

public abstract class InstallationTokenResult {

    public static abstract class Builder {
        public abstract InstallationTokenResult a();

        public abstract Builder b(String str);

        public abstract Builder c(long j2);

        public abstract Builder d(long j2);
    }

    public static Builder a() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}
