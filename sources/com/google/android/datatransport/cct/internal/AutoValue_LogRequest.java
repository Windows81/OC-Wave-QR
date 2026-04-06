package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.LogRequest;
import java.util.List;

final class AutoValue_LogRequest extends LogRequest {

    /* renamed from: a  reason: collision with root package name */
    public final long f23959a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23960b;

    /* renamed from: c  reason: collision with root package name */
    public final ClientInfo f23961c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f23962d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23963e;

    /* renamed from: f  reason: collision with root package name */
    public final List f23964f;

    /* renamed from: g  reason: collision with root package name */
    public final QosTier f23965g;

    public static final class Builder extends LogRequest.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Long f23966a;

        /* renamed from: b  reason: collision with root package name */
        public Long f23967b;

        /* renamed from: c  reason: collision with root package name */
        public ClientInfo f23968c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f23969d;

        /* renamed from: e  reason: collision with root package name */
        public String f23970e;

        /* renamed from: f  reason: collision with root package name */
        public List f23971f;

        /* renamed from: g  reason: collision with root package name */
        public QosTier f23972g;

        public LogRequest a() {
            String str = "";
            if (this.f23966a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f23967b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogRequest(this.f23966a.longValue(), this.f23967b.longValue(), this.f23968c, this.f23969d, this.f23970e, this.f23971f, this.f23972g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public LogRequest.Builder b(ClientInfo clientInfo) {
            this.f23968c = clientInfo;
            return this;
        }

        public LogRequest.Builder c(List list) {
            this.f23971f = list;
            return this;
        }

        public LogRequest.Builder d(Integer num) {
            this.f23969d = num;
            return this;
        }

        public LogRequest.Builder e(String str) {
            this.f23970e = str;
            return this;
        }

        public LogRequest.Builder f(QosTier qosTier) {
            this.f23972g = qosTier;
            return this;
        }

        public LogRequest.Builder g(long j2) {
            this.f23966a = Long.valueOf(j2);
            return this;
        }

        public LogRequest.Builder h(long j2) {
            this.f23967b = Long.valueOf(j2);
            return this;
        }
    }

    public ClientInfo b() {
        return this.f23961c;
    }

    public List c() {
        return this.f23964f;
    }

    public Integer d() {
        return this.f23962d;
    }

    public String e() {
        return this.f23963e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f23959a == logRequest.g() && this.f23960b == logRequest.h() && ((clientInfo = this.f23961c) != null ? clientInfo.equals(logRequest.b()) : logRequest.b() == null) && ((num = this.f23962d) != null ? num.equals(logRequest.d()) : logRequest.d() == null) && ((str = this.f23963e) != null ? str.equals(logRequest.e()) : logRequest.e() == null) && ((list = this.f23964f) != null ? list.equals(logRequest.c()) : logRequest.c() == null)) {
            QosTier qosTier = this.f23965g;
            if (qosTier == null) {
                if (logRequest.f() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.f())) {
                return true;
            }
        }
        return false;
    }

    public QosTier f() {
        return this.f23965g;
    }

    public long g() {
        return this.f23959a;
    }

    public long h() {
        return this.f23960b;
    }

    public int hashCode() {
        long j2 = this.f23959a;
        long j3 = this.f23960b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ClientInfo clientInfo = this.f23961c;
        int i3 = 0;
        int hashCode = (i2 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f23962d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f23963e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f23964f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f23965g;
        if (qosTier != null) {
            i3 = qosTier.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f23959a + ", requestUptimeMs=" + this.f23960b + ", clientInfo=" + this.f23961c + ", logSource=" + this.f23962d + ", logSourceName=" + this.f23963e + ", logEvents=" + this.f23964f + ", qosTier=" + this.f23965g + "}";
    }

    public AutoValue_LogRequest(long j2, long j3, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f23959a = j2;
        this.f23960b = j3;
        this.f23961c = clientInfo;
        this.f23962d = num;
        this.f23963e = str;
        this.f23964f = list;
        this.f23965g = qosTier;
    }
}
