package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {

    /* renamed from: a  reason: collision with root package name */
    public final String f30423a;

    public static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {
    }

    public String a() {
        return this.f30423a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.f30423a.equals(((CrashlyticsReport.Session.Application.Organization) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f30423a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f30423a + "}";
    }
}
