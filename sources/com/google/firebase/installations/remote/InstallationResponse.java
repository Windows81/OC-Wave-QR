package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.AutoValue_InstallationResponse;

public abstract class InstallationResponse {

    public static abstract class Builder {
        public abstract InstallationResponse a();

        public abstract Builder b(TokenResult tokenResult);

        public abstract Builder c(String str);

        public abstract Builder d(String str);

        public abstract Builder e(ResponseCode responseCode);

        public abstract Builder f(String str);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    public static Builder a() {
        return new AutoValue_InstallationResponse.Builder();
    }

    public abstract TokenResult b();

    public abstract String c();

    public abstract String d();

    public abstract ResponseCode e();

    public abstract String f();
}
