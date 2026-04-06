package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;

public abstract class LogEvent {

    public static abstract class Builder {
        public abstract LogEvent a();

        public abstract Builder b(ComplianceData complianceData);

        public abstract Builder c(Integer num);

        public abstract Builder d(long j2);

        public abstract Builder e(long j2);

        public abstract Builder f(ExperimentIds experimentIds);

        public abstract Builder g(NetworkConnectionInfo networkConnectionInfo);

        public abstract Builder h(byte[] bArr);

        public abstract Builder i(String str);

        public abstract Builder j(long j2);
    }

    public static Builder a() {
        return new AutoValue_LogEvent.Builder();
    }

    public static Builder k(String str) {
        return a().i(str);
    }

    public static Builder l(byte[] bArr) {
        return a().h(bArr);
    }

    public abstract ComplianceData b();

    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    public abstract ExperimentIds f();

    public abstract NetworkConnectionInfo g();

    public abstract byte[] h();

    public abstract String i();

    public abstract long j();
}
