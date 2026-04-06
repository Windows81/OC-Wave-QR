package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* renamed from: a  reason: collision with root package name */
    public final long f30481a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30482b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30483c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30484d;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f30485a;

        /* renamed from: b  reason: collision with root package name */
        public long f30486b;

        /* renamed from: c  reason: collision with root package name */
        public String f30487c;

        /* renamed from: d  reason: collision with root package name */
        public String f30488d;

        /* renamed from: e  reason: collision with root package name */
        public byte f30489e;

        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage a() {
            String str;
            if (this.f30489e == 3 && (str = this.f30487c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.f30485a, this.f30486b, str, this.f30488d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f30489e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f30489e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f30487c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder b(long j2) {
            this.f30485a = j2;
            this.f30489e = (byte) (this.f30489e | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder c(String str) {
            if (str != null) {
                this.f30487c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder d(long j2) {
            this.f30486b = j2;
            this.f30489e = (byte) (this.f30489e | 2);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder e(String str) {
            this.f30488d = str;
            return this;
        }
    }

    public long b() {
        return this.f30481a;
    }

    public String c() {
        return this.f30483c;
    }

    public long d() {
        return this.f30482b;
    }

    public String e() {
        return this.f30484d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f30481a == binaryImage.b() && this.f30482b == binaryImage.d() && this.f30483c.equals(binaryImage.c())) {
            String str = this.f30484d;
            if (str == null) {
                if (binaryImage.e() == null) {
                    return true;
                }
            } else if (str.equals(binaryImage.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f30481a;
        long j3 = this.f30482b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f30483c.hashCode()) * 1000003;
        String str = this.f30484d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f30481a + ", size=" + this.f30482b + ", name=" + this.f30483c + ", uuid=" + this.f30484d + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j2, long j3, String str, String str2) {
        this.f30481a = j2;
        this.f30482b = j3;
        this.f30483c = str;
        this.f30484d = str2;
    }
}
