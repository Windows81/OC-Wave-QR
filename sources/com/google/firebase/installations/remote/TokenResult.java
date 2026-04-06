package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.AutoValue_TokenResult;

public abstract class TokenResult {

    public static abstract class Builder {
        public abstract TokenResult a();

        public abstract Builder b(ResponseCode responseCode);

        public abstract Builder c(String str);

        public abstract Builder d(long j2);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static Builder a() {
        return new AutoValue_TokenResult.Builder().d(0);
    }

    public abstract ResponseCode b();

    public abstract String c();

    public abstract long d();
}
