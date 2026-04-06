package com.google.android.datatransport.runtime.firebase.transport;

public final class TimeWindow {

    /* renamed from: c  reason: collision with root package name */
    public static final TimeWindow f24140c = new Builder().a();

    /* renamed from: a  reason: collision with root package name */
    public final long f24141a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24142b;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f24143a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f24144b = 0;

        public TimeWindow a() {
            return new TimeWindow(this.f24143a, this.f24144b);
        }

        public Builder b(long j2) {
            this.f24144b = j2;
            return this;
        }

        public Builder c(long j2) {
            this.f24143a = j2;
            return this;
        }
    }

    public TimeWindow(long j2, long j3) {
        this.f24141a = j2;
        this.f24142b = j3;
    }

    public static Builder c() {
        return new Builder();
    }

    public long a() {
        return this.f24142b;
    }

    public long b() {
        return this.f24141a;
    }
}
