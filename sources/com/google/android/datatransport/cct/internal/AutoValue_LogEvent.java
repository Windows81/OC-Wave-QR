package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;

final class AutoValue_LogEvent extends LogEvent {

    /* renamed from: a  reason: collision with root package name */
    public final long f23941a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f23942b;

    /* renamed from: c  reason: collision with root package name */
    public final ComplianceData f23943c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23944d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f23945e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23946f;

    /* renamed from: g  reason: collision with root package name */
    public final long f23947g;

    /* renamed from: h  reason: collision with root package name */
    public final NetworkConnectionInfo f23948h;

    /* renamed from: i  reason: collision with root package name */
    public final ExperimentIds f23949i;

    public static final class Builder extends LogEvent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Long f23950a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f23951b;

        /* renamed from: c  reason: collision with root package name */
        public ComplianceData f23952c;

        /* renamed from: d  reason: collision with root package name */
        public Long f23953d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f23954e;

        /* renamed from: f  reason: collision with root package name */
        public String f23955f;

        /* renamed from: g  reason: collision with root package name */
        public Long f23956g;

        /* renamed from: h  reason: collision with root package name */
        public NetworkConnectionInfo f23957h;

        /* renamed from: i  reason: collision with root package name */
        public ExperimentIds f23958i;

        public LogEvent a() {
            String str = "";
            if (this.f23950a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f23953d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f23956g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogEvent(this.f23950a.longValue(), this.f23951b, this.f23952c, this.f23953d.longValue(), this.f23954e, this.f23955f, this.f23956g.longValue(), this.f23957h, this.f23958i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public LogEvent.Builder b(ComplianceData complianceData) {
            this.f23952c = complianceData;
            return this;
        }

        public LogEvent.Builder c(Integer num) {
            this.f23951b = num;
            return this;
        }

        public LogEvent.Builder d(long j2) {
            this.f23950a = Long.valueOf(j2);
            return this;
        }

        public LogEvent.Builder e(long j2) {
            this.f23953d = Long.valueOf(j2);
            return this;
        }

        public LogEvent.Builder f(ExperimentIds experimentIds) {
            this.f23958i = experimentIds;
            return this;
        }

        public LogEvent.Builder g(NetworkConnectionInfo networkConnectionInfo) {
            this.f23957h = networkConnectionInfo;
            return this;
        }

        public LogEvent.Builder h(byte[] bArr) {
            this.f23954e = bArr;
            return this;
        }

        public LogEvent.Builder i(String str) {
            this.f23955f = str;
            return this;
        }

        public LogEvent.Builder j(long j2) {
            this.f23956g = Long.valueOf(j2);
            return this;
        }
    }

    public ComplianceData b() {
        return this.f23943c;
    }

    public Integer c() {
        return this.f23942b;
    }

    public long d() {
        return this.f23941a;
    }

    public long e() {
        return this.f23944d;
    }

    public boolean equals(Object obj) {
        Integer num;
        ComplianceData complianceData;
        String str;
        NetworkConnectionInfo networkConnectionInfo;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f23941a == logEvent.d() && ((num = this.f23942b) != null ? num.equals(logEvent.c()) : logEvent.c() == null) && ((complianceData = this.f23943c) != null ? complianceData.equals(logEvent.b()) : logEvent.b() == null) && this.f23944d == logEvent.e()) {
            if (Arrays.equals(this.f23945e, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).f23945e : logEvent.h()) && ((str = this.f23946f) != null ? str.equals(logEvent.i()) : logEvent.i() == null) && this.f23947g == logEvent.j() && ((networkConnectionInfo = this.f23948h) != null ? networkConnectionInfo.equals(logEvent.g()) : logEvent.g() == null)) {
                ExperimentIds experimentIds = this.f23949i;
                if (experimentIds == null) {
                    if (logEvent.f() == null) {
                        return true;
                    }
                } else if (experimentIds.equals(logEvent.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public ExperimentIds f() {
        return this.f23949i;
    }

    public NetworkConnectionInfo g() {
        return this.f23948h;
    }

    public byte[] h() {
        return this.f23945e;
    }

    public int hashCode() {
        long j2 = this.f23941a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f23942b;
        int i3 = 0;
        int hashCode = (i2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.f23943c;
        int hashCode2 = complianceData == null ? 0 : complianceData.hashCode();
        long j3 = this.f23944d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f23945e)) * 1000003;
        String str = this.f23946f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j4 = this.f23947g;
        int i4 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f23948h;
        int hashCode5 = (i4 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        ExperimentIds experimentIds = this.f23949i;
        if (experimentIds != null) {
            i3 = experimentIds.hashCode();
        }
        return hashCode5 ^ i3;
    }

    public String i() {
        return this.f23946f;
    }

    public long j() {
        return this.f23947g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f23941a + ", eventCode=" + this.f23942b + ", complianceData=" + this.f23943c + ", eventUptimeMs=" + this.f23944d + ", sourceExtension=" + Arrays.toString(this.f23945e) + ", sourceExtensionJsonProto3=" + this.f23946f + ", timezoneOffsetSeconds=" + this.f23947g + ", networkConnectionInfo=" + this.f23948h + ", experimentIds=" + this.f23949i + "}";
    }

    public AutoValue_LogEvent(long j2, Integer num, ComplianceData complianceData, long j3, byte[] bArr, String str, long j4, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.f23941a = j2;
        this.f23942b = num;
        this.f23943c = complianceData;
        this.f23944d = j3;
        this.f23945e = bArr;
        this.f23946f = str;
        this.f23947g = j4;
        this.f23948h = networkConnectionInfo;
        this.f23949i = experimentIds;
    }
}
