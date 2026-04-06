package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {

    /* renamed from: a  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution f30456a;

    /* renamed from: b  reason: collision with root package name */
    public final List f30457b;

    /* renamed from: c  reason: collision with root package name */
    public final List f30458c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f30459d;

    /* renamed from: e  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails f30460e;

    /* renamed from: f  reason: collision with root package name */
    public final List f30461f;

    /* renamed from: g  reason: collision with root package name */
    public final int f30462g;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {

        /* renamed from: a  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution f30463a;

        /* renamed from: b  reason: collision with root package name */
        public List f30464b;

        /* renamed from: c  reason: collision with root package name */
        public List f30465c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f30466d;

        /* renamed from: e  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.ProcessDetails f30467e;

        /* renamed from: f  reason: collision with root package name */
        public List f30468f;

        /* renamed from: g  reason: collision with root package name */
        public int f30469g;

        /* renamed from: h  reason: collision with root package name */
        public byte f30470h;

        public CrashlyticsReport.Session.Event.Application a() {
            CrashlyticsReport.Session.Event.Application.Execution execution;
            if (this.f30470h == 1 && (execution = this.f30463a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(execution, this.f30464b, this.f30465c, this.f30466d, this.f30467e, this.f30468f, this.f30469g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30463a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f30470h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.Builder b(List list) {
            this.f30468f = list;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Builder c(Boolean bool) {
            this.f30466d = bool;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Builder d(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.f30467e = processDetails;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Builder e(List list) {
            this.f30464b = list;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Builder f(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution != null) {
                this.f30463a = execution;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        public CrashlyticsReport.Session.Event.Application.Builder g(List list) {
            this.f30465c = list;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Builder h(int i2) {
            this.f30469g = i2;
            this.f30470h = (byte) (this.f30470h | 1);
            return this;
        }

        public Builder() {
        }

        public Builder(CrashlyticsReport.Session.Event.Application application) {
            this.f30463a = application.f();
            this.f30464b = application.e();
            this.f30465c = application.g();
            this.f30466d = application.c();
            this.f30467e = application.d();
            this.f30468f = application.b();
            this.f30469g = application.h();
            this.f30470h = 1;
        }
    }

    public List b() {
        return this.f30461f;
    }

    public Boolean c() {
        return this.f30459d;
    }

    public CrashlyticsReport.Session.Event.Application.ProcessDetails d() {
        return this.f30460e;
    }

    public List e() {
        return this.f30457b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f30458c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f30459d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f30460e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r4.f30461f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f30457b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
            r2 = 0
            if (r1 == 0) goto L_0x008b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application) r5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r1 = r4.f30456a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            java.util.List r1 = r4.f30457b
            if (r1 != 0) goto L_0x0022
            java.util.List r1 = r5.e()
            if (r1 != 0) goto L_0x0089
            goto L_0x002c
        L_0x0022:
            java.util.List r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x002c:
            java.util.List r1 = r4.f30458c
            if (r1 != 0) goto L_0x0037
            java.util.List r1 = r5.g()
            if (r1 != 0) goto L_0x0089
            goto L_0x0041
        L_0x0037:
            java.util.List r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0041:
            java.lang.Boolean r1 = r4.f30459d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.c()
            if (r1 != 0) goto L_0x0089
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0056:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r4.f30460e
            if (r1 != 0) goto L_0x0061
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r5.d()
            if (r1 != 0) goto L_0x0089
            goto L_0x006b
        L_0x0061:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x006b:
            java.util.List r1 = r4.f30461f
            if (r1 != 0) goto L_0x0076
            java.util.List r1 = r5.b()
            if (r1 != 0) goto L_0x0089
            goto L_0x0080
        L_0x0076:
            java.util.List r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0080:
            int r1 = r4.f30462g
            int r5 = r5.h()
            if (r1 != r5) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r0 = r2
        L_0x008a:
            return r0
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.equals(java.lang.Object):boolean");
    }

    public CrashlyticsReport.Session.Event.Application.Execution f() {
        return this.f30456a;
    }

    public List g() {
        return this.f30458c;
    }

    public int h() {
        return this.f30462g;
    }

    public int hashCode() {
        int hashCode = (this.f30456a.hashCode() ^ 1000003) * 1000003;
        List list = this.f30457b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f30458c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f30459d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f30460e;
        int hashCode5 = (hashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        List list3 = this.f30461f;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.f30462g;
    }

    public CrashlyticsReport.Session.Event.Application.Builder i() {
        return new Builder(this);
    }

    public String toString() {
        return "Application{execution=" + this.f30456a + ", customAttributes=" + this.f30457b + ", internalKeys=" + this.f30458c + ", background=" + this.f30459d + ", currentProcessDetails=" + this.f30460e + ", appProcessDetails=" + this.f30461f + ", uiOrientation=" + this.f30462g + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, List list, List list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List list3, int i2) {
        this.f30456a = execution;
        this.f30457b = list;
        this.f30458c = list2;
        this.f30459d = bool;
        this.f30460e = processDetails;
        this.f30461f = list3;
        this.f30462g = i2;
    }
}
