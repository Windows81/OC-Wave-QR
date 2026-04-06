package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* renamed from: a  reason: collision with root package name */
    public final long f30515a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30516b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30517c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30518d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30519e;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f30520a;

        /* renamed from: b  reason: collision with root package name */
        public String f30521b;

        /* renamed from: c  reason: collision with root package name */
        public String f30522c;

        /* renamed from: d  reason: collision with root package name */
        public long f30523d;

        /* renamed from: e  reason: collision with root package name */
        public int f30524e;

        /* renamed from: f  reason: collision with root package name */
        public byte f30525f;

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame a() {
            String str;
            if (this.f30525f == 7 && (str = this.f30521b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.f30520a, str, this.f30522c, this.f30523d, this.f30524e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f30525f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f30521b == null) {
                sb.append(" symbol");
            }
            if ((this.f30525f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f30525f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder b(String str) {
            this.f30522c = str;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder c(int i2) {
            this.f30524e = i2;
            this.f30525f = (byte) (this.f30525f | 4);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder d(long j2) {
            this.f30523d = j2;
            this.f30525f = (byte) (this.f30525f | 2);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder e(long j2) {
            this.f30520a = j2;
            this.f30525f = (byte) (this.f30525f | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder f(String str) {
            if (str != null) {
                this.f30521b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    public String b() {
        return this.f30517c;
    }

    public int c() {
        return this.f30519e;
    }

    public long d() {
        return this.f30518d;
    }

    public long e() {
        return this.f30515a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f30517c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) r8
            long r3 = r7.f30515a
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f30516b
            java.lang.String r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f30517c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f30518d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f30519e
            int r8 = r8.c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.f30516b;
    }

    public int hashCode() {
        long j2 = this.f30515a;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f30516b.hashCode()) * 1000003;
        String str = this.f30517c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f30518d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f30519e;
    }

    public String toString() {
        return "Frame{pc=" + this.f30515a + ", symbol=" + this.f30516b + ", file=" + this.f30517c + ", offset=" + this.f30518d + ", importance=" + this.f30519e + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long j2, String str, String str2, long j3, int i2) {
        this.f30515a = j2;
        this.f30516b = str;
        this.f30517c = str2;
        this.f30518d = j3;
        this.f30519e = i2;
    }
}
