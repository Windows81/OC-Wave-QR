package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {

    /* renamed from: a  reason: collision with root package name */
    public final String f30372a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30373b;

    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30374a;

        /* renamed from: b  reason: collision with root package name */
        public String f30375b;

        public CrashlyticsReport.CustomAttribute a() {
            String str;
            String str2 = this.f30374a;
            if (str2 != null && (str = this.f30375b) != null) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30374a == null) {
                sb.append(" key");
            }
            if (this.f30375b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.CustomAttribute.Builder b(String str) {
            if (str != null) {
                this.f30374a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public CrashlyticsReport.CustomAttribute.Builder c(String str) {
            if (str != null) {
                this.f30375b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    public String b() {
        return this.f30372a;
    }

    public String c() {
        return this.f30373b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        return this.f30372a.equals(customAttribute.b()) && this.f30373b.equals(customAttribute.c());
    }

    public int hashCode() {
        return ((this.f30372a.hashCode() ^ 1000003) * 1000003) ^ this.f30373b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f30372a + ", value=" + this.f30373b + "}";
    }

    public AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.f30372a = str;
        this.f30373b = str2;
    }
}
