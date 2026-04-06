package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

public final class LogEventDropped {

    /* renamed from: c  reason: collision with root package name */
    public static final LogEventDropped f24122c = new Builder().a();

    /* renamed from: a  reason: collision with root package name */
    public final long f24123a;

    /* renamed from: b  reason: collision with root package name */
    public final Reason f24124b;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f24125a = 0;

        /* renamed from: b  reason: collision with root package name */
        public Reason f24126b = Reason.REASON_UNKNOWN;

        public LogEventDropped a() {
            return new LogEventDropped(this.f24125a, this.f24126b);
        }

        public Builder b(long j2) {
            this.f24125a = j2;
            return this;
        }

        public Builder c(Reason reason) {
            this.f24126b = reason;
            return this;
        }
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: z  reason: collision with root package name */
        public final int f24129z;

        /* access modifiers changed from: public */
        Reason(int i2) {
            this.f24129z = i2;
        }

        public int i() {
            return this.f24129z;
        }
    }

    public LogEventDropped(long j2, Reason reason) {
        this.f24123a = j2;
        this.f24124b = reason;
    }

    public static Builder c() {
        return new Builder();
    }

    public long a() {
        return this.f24123a;
    }

    public Reason b() {
        return this.f24124b;
    }
}
