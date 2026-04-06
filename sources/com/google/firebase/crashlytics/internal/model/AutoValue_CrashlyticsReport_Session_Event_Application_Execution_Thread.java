package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* renamed from: a  reason: collision with root package name */
    public final String f30508a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30509b;

    /* renamed from: c  reason: collision with root package name */
    public final List f30510c;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30511a;

        /* renamed from: b  reason: collision with root package name */
        public int f30512b;

        /* renamed from: c  reason: collision with root package name */
        public List f30513c;

        /* renamed from: d  reason: collision with root package name */
        public byte f30514d;

        public CrashlyticsReport.Session.Event.Application.Execution.Thread a() {
            String str;
            List list;
            if (this.f30514d == 1 && (str = this.f30511a) != null && (list = this.f30513c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(str, this.f30512b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30511a == null) {
                sb.append(" name");
            }
            if ((1 & this.f30514d) == 0) {
                sb.append(" importance");
            }
            if (this.f30513c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder b(List list) {
            if (list != null) {
                this.f30513c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder c(int i2) {
            this.f30512b = i2;
            this.f30514d = (byte) (this.f30514d | 1);
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder d(String str) {
            if (str != null) {
                this.f30511a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public List b() {
        return this.f30510c;
    }

    public int c() {
        return this.f30509b;
    }

    public String d() {
        return this.f30508a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        return this.f30508a.equals(thread.d()) && this.f30509b == thread.c() && this.f30510c.equals(thread.b());
    }

    public int hashCode() {
        return ((((this.f30508a.hashCode() ^ 1000003) * 1000003) ^ this.f30509b) * 1000003) ^ this.f30510c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f30508a + ", importance=" + this.f30509b + ", frames=" + this.f30510c + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i2, List list) {
        this.f30508a = str;
        this.f30509b = i2;
        this.f30510c = list;
    }
}
