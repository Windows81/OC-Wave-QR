package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {

    /* renamed from: a  reason: collision with root package name */
    public final String f30559a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30560b;

    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30561a;

        /* renamed from: b  reason: collision with root package name */
        public String f30562b;

        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant a() {
            String str;
            String str2 = this.f30561a;
            if (str2 != null && (str = this.f30562b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30561a == null) {
                sb.append(" rolloutId");
            }
            if (this.f30562b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder b(String str) {
            if (str != null) {
                this.f30561a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder c(String str) {
            if (str != null) {
                this.f30562b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public String b() {
        return this.f30559a;
    }

    public String c() {
        return this.f30560b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
        return this.f30559a.equals(rolloutVariant.b()) && this.f30560b.equals(rolloutVariant.c());
    }

    public int hashCode() {
        return ((this.f30559a.hashCode() ^ 1000003) * 1000003) ^ this.f30560b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f30559a + ", variantId=" + this.f30560b + "}";
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String str, String str2) {
        this.f30559a = str;
        this.f30560b = str2;
    }
}
