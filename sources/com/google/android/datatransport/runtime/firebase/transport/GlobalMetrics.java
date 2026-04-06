package com.google.android.datatransport.runtime.firebase.transport;

public final class GlobalMetrics {

    /* renamed from: b  reason: collision with root package name */
    public static final GlobalMetrics f24119b = new Builder().a();

    /* renamed from: a  reason: collision with root package name */
    public final StorageMetrics f24120a;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public StorageMetrics f24121a = null;

        public GlobalMetrics a() {
            return new GlobalMetrics(this.f24121a);
        }

        public Builder b(StorageMetrics storageMetrics) {
            this.f24121a = storageMetrics;
            return this;
        }
    }

    public GlobalMetrics(StorageMetrics storageMetrics) {
        this.f24120a = storageMetrics;
    }

    public static Builder b() {
        return new Builder();
    }

    public StorageMetrics a() {
        return this.f24120a;
    }
}
