package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;

public abstract class BackendRequest {

    public static abstract class Builder {
        public abstract BackendRequest a();

        public abstract Builder b(Iterable iterable);

        public abstract Builder c(byte[] bArr);
    }

    public static Builder a() {
        return new AutoValue_BackendRequest.Builder();
    }

    public abstract Iterable b();

    public abstract byte[] c();
}
