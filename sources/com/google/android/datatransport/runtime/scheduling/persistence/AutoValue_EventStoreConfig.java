package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;

final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* renamed from: b  reason: collision with root package name */
    public final long f24239b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24240c;

    /* renamed from: d  reason: collision with root package name */
    public final int f24241d;

    /* renamed from: e  reason: collision with root package name */
    public final long f24242e;

    /* renamed from: f  reason: collision with root package name */
    public final int f24243f;

    public static final class Builder extends EventStoreConfig.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Long f24244a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f24245b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f24246c;

        /* renamed from: d  reason: collision with root package name */
        public Long f24247d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f24248e;

        public EventStoreConfig a() {
            String str = "";
            if (this.f24244a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f24245b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f24246c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f24247d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f24248e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.f24244a.longValue(), this.f24245b.intValue(), this.f24246c.intValue(), this.f24247d.longValue(), this.f24248e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public EventStoreConfig.Builder b(int i2) {
            this.f24246c = Integer.valueOf(i2);
            return this;
        }

        public EventStoreConfig.Builder c(long j2) {
            this.f24247d = Long.valueOf(j2);
            return this;
        }

        public EventStoreConfig.Builder d(int i2) {
            this.f24245b = Integer.valueOf(i2);
            return this;
        }

        public EventStoreConfig.Builder e(int i2) {
            this.f24248e = Integer.valueOf(i2);
            return this;
        }

        public EventStoreConfig.Builder f(long j2) {
            this.f24244a = Long.valueOf(j2);
            return this;
        }
    }

    public int b() {
        return this.f24241d;
    }

    public long c() {
        return this.f24242e;
    }

    public int d() {
        return this.f24240c;
    }

    public int e() {
        return this.f24243f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        return this.f24239b == eventStoreConfig.f() && this.f24240c == eventStoreConfig.d() && this.f24241d == eventStoreConfig.b() && this.f24242e == eventStoreConfig.c() && this.f24243f == eventStoreConfig.e();
    }

    public long f() {
        return this.f24239b;
    }

    public int hashCode() {
        long j2 = this.f24239b;
        long j3 = this.f24242e;
        return ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f24240c) * 1000003) ^ this.f24241d) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f24243f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f24239b + ", loadBatchSize=" + this.f24240c + ", criticalSectionEnterTimeoutMs=" + this.f24241d + ", eventCleanUpAge=" + this.f24242e + ", maxBlobByteSizePerRow=" + this.f24243f + "}";
    }

    public AutoValue_EventStoreConfig(long j2, int i2, int i3, long j3, int i4) {
        this.f24239b = j2;
        this.f24240c = i2;
        this.f24241d = i3;
        this.f24242e = j3;
        this.f24243f = i4;
    }
}
