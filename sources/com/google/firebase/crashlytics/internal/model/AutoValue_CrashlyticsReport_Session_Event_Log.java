package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {

    /* renamed from: a  reason: collision with root package name */
    public final String f30548a;

    public static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30549a;

        public CrashlyticsReport.Session.Event.Log a() {
            String str = this.f30549a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(str);
            }
            throw new IllegalStateException("Missing required properties:" + " content");
        }

        public CrashlyticsReport.Session.Event.Log.Builder b(String str) {
            if (str != null) {
                this.f30549a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    public String b() {
        return this.f30548a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.f30548a.equals(((CrashlyticsReport.Session.Event.Log) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f30548a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f30548a + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.f30548a = str;
    }
}
