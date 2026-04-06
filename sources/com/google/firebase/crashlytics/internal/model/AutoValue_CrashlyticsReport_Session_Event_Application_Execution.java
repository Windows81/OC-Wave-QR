package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {

    /* renamed from: a  reason: collision with root package name */
    public final List f30471a;

    /* renamed from: b  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f30472b;

    /* renamed from: c  reason: collision with root package name */
    public final CrashlyticsReport.ApplicationExitInfo f30473c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal f30474d;

    /* renamed from: e  reason: collision with root package name */
    public final List f30475e;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* renamed from: a  reason: collision with root package name */
        public List f30476a;

        /* renamed from: b  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f30477b;

        /* renamed from: c  reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f30478c;

        /* renamed from: d  reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal f30479d;

        /* renamed from: e  reason: collision with root package name */
        public List f30480e;

        public CrashlyticsReport.Session.Event.Application.Execution a() {
            List list;
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = this.f30479d;
            if (signal != null && (list = this.f30480e) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.f30476a, this.f30477b, this.f30478c, signal, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30479d == null) {
                sb.append(" signal");
            }
            if (this.f30480e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f30478c = applicationExitInfo;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Builder c(List list) {
            if (list != null) {
                this.f30480e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Builder d(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f30477b = exception;
            return this;
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Builder e(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal != null) {
                this.f30479d = signal;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        public CrashlyticsReport.Session.Event.Application.Execution.Builder f(List list) {
            this.f30476a = list;
            return this;
        }
    }

    public CrashlyticsReport.ApplicationExitInfo b() {
        return this.f30473c;
    }

    public List c() {
        return this.f30475e;
    }

    public CrashlyticsReport.Session.Event.Application.Execution.Exception d() {
        return this.f30472b;
    }

    public CrashlyticsReport.Session.Event.Application.Execution.Signal e() {
        return this.f30474d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        List list = this.f30471a;
        if (list != null ? list.equals(execution.f()) : execution.f() == null) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f30472b;
            if (exception != null ? exception.equals(execution.d()) : execution.d() == null) {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f30473c;
                if (applicationExitInfo != null ? applicationExitInfo.equals(execution.b()) : execution.b() == null) {
                    if (this.f30474d.equals(execution.e()) && this.f30475e.equals(execution.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List f() {
        return this.f30471a;
    }

    public int hashCode() {
        List list = this.f30471a;
        int i2 = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f30472b;
        int hashCode2 = (hashCode ^ (exception == null ? 0 : exception.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f30473c;
        if (applicationExitInfo != null) {
            i2 = applicationExitInfo.hashCode();
        }
        return ((((hashCode2 ^ i2) * 1000003) ^ this.f30474d.hashCode()) * 1000003) ^ this.f30475e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f30471a + ", exception=" + this.f30472b + ", appExitInfo=" + this.f30473c + ", signal=" + this.f30474d + ", binaries=" + this.f30475e + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution(List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List list2) {
        this.f30471a = list;
        this.f30472b = exception;
        this.f30473c = applicationExitInfo;
        this.f30474d = signal;
        this.f30475e = list2;
    }
}
