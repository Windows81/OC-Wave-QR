package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {

    /* renamed from: a  reason: collision with root package name */
    public final String f30574a;

    public static final class Builder extends CrashlyticsReport.Session.User.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30575a;

        public CrashlyticsReport.Session.User a() {
            String str = this.f30575a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_User(str);
            }
            throw new IllegalStateException("Missing required properties:" + " identifier");
        }

        public CrashlyticsReport.Session.User.Builder b(String str) {
            if (str != null) {
                this.f30575a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    public String b() {
        return this.f30574a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f30574a.equals(((CrashlyticsReport.Session.User) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f30574a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f30574a + "}";
    }

    public AutoValue_CrashlyticsReport_Session_User(String str) {
        this.f30574a = str;
    }
}
