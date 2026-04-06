package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.lokalise.sdk.api.Params;

abstract class EventStoreConfig {

    /* renamed from: a  reason: collision with root package name */
    public static final EventStoreConfig f24252a = a().f(10485760).d(200).b(Params.Timeout.CONNECT_LONG).c(604800000).e(81920).a();

    public static abstract class Builder {
        public abstract EventStoreConfig a();

        public abstract Builder b(int i2);

        public abstract Builder c(long j2);

        public abstract Builder d(int i2);

        public abstract Builder e(int i2);

        public abstract Builder f(long j2);
    }

    public static Builder a() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
