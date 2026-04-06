package com.google.android.datatransport.runtime.firebase.transport;

public final class StorageMetrics {

    /* renamed from: c  reason: collision with root package name */
    public static final StorageMetrics f24135c = new Builder().a();

    /* renamed from: a  reason: collision with root package name */
    public final long f24136a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24137b;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f24138a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f24139b = 0;

        public StorageMetrics a() {
            return new StorageMetrics(this.f24138a, this.f24139b);
        }

        public Builder b(long j2) {
            this.f24138a = j2;
            return this;
        }

        public Builder c(long j2) {
            this.f24139b = j2;
            return this;
        }
    }

    public StorageMetrics(long j2, long j3) {
        this.f24136a = j2;
        this.f24137b = j3;
    }

    public static Builder c() {
        return new Builder();
    }

    public long a() {
        return this.f24136a;
    }

    public long b() {
        return this.f24137b;
    }
}
