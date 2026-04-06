package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* renamed from: a  reason: collision with root package name */
    public final String f30490a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30491b;

    /* renamed from: c  reason: collision with root package name */
    public final List f30492c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f30493d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30494e;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30495a;

        /* renamed from: b  reason: collision with root package name */
        public String f30496b;

        /* renamed from: c  reason: collision with root package name */
        public List f30497c;

        /* renamed from: d  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f30498d;

        /* renamed from: e  reason: collision with root package name */
        public int f30499e;

        /* renamed from: f  reason: collision with root package name */
        public byte f30500f;

        public CrashlyticsReport.Session.Event.Application.Execution.Exception a() {
            String str;
            List list;
            if (this.f30500f == 1 && (str = this.f30495a) != null && (list = this.f30497c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(str, this.f30496b, list, this.f30498d, this.f30499e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30495a == null) {
                sb.append(" type");
            }
            if (this.f30497c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f30500f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder b(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f30498d = exception;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder c(List list) {
            if (list != null) {
                this.f30497c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d(int i2) {
            this.f30499e = i2;
            this.f30500f = (byte) (this.f30500f | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder e(String str) {
            this.f30496b = str;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder f(String str) {
            if (str != null) {
                this.f30495a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    public CrashlyticsReport.Session.Event.Application.Execution.Exception b() {
        return this.f30493d;
    }

    public List c() {
        return this.f30492c;
    }

    public int d() {
        return this.f30494e;
    }

    public String e() {
        return this.f30491b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f30493d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f30491b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception) r5
            java.lang.String r1 = r4.f30490a
            java.lang.String r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f30491b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            java.util.List r1 = r4.f30492c
            java.util.List r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r4.f30493d
            if (r1 != 0) goto L_0x0043
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r5.b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f30494e
            int r5 = r5.d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.f30490a;
    }

    public int hashCode() {
        int hashCode = (this.f30490a.hashCode() ^ 1000003) * 1000003;
        String str = this.f30491b;
        int i2 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f30492c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f30493d;
        if (exception != null) {
            i2 = exception.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f30494e;
    }

    public String toString() {
        return "Exception{type=" + this.f30490a + ", reason=" + this.f30491b + ", frames=" + this.f30492c + ", causedBy=" + this.f30493d + ", overflowCount=" + this.f30494e + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String str, String str2, List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i2) {
        this.f30490a = str;
        this.f30491b = str2;
        this.f30492c = list;
        this.f30493d = exception;
        this.f30494e = i2;
    }
}
