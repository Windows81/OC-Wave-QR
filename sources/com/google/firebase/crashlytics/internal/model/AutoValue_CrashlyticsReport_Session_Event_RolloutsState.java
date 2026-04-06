package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {

    /* renamed from: a  reason: collision with root package name */
    public final List f30563a;

    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {

        /* renamed from: a  reason: collision with root package name */
        public List f30564a;

        public CrashlyticsReport.Session.Event.RolloutsState a() {
            List list = this.f30564a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(list);
            }
            throw new IllegalStateException("Missing required properties:" + " rolloutAssignments");
        }

        public CrashlyticsReport.Session.Event.RolloutsState.Builder b(List list) {
            if (list != null) {
                this.f30564a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }

    public List b() {
        return this.f30563a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.f30563a.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f30563a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f30563a + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List list) {
        this.f30563a = list;
    }
}
