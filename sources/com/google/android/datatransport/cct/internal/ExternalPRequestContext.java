package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext;

public abstract class ExternalPRequestContext {

    public static abstract class Builder {
        public abstract ExternalPRequestContext a();

        public abstract Builder b(Integer num);
    }

    public static Builder a() {
        return new AutoValue_ExternalPRequestContext.Builder();
    }

    public abstract Integer b();
}
