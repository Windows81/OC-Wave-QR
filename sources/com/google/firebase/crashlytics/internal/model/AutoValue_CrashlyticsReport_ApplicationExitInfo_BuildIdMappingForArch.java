package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* renamed from: a  reason: collision with root package name */
    public final String f30366a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30367b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30368c;

    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30369a;

        /* renamed from: b  reason: collision with root package name */
        public String f30370b;

        /* renamed from: c  reason: collision with root package name */
        public String f30371c;

        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch a() {
            String str;
            String str2;
            String str3 = this.f30369a;
            if (str3 != null && (str = this.f30370b) != null && (str2 = this.f30371c) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30369a == null) {
                sb.append(" arch");
            }
            if (this.f30370b == null) {
                sb.append(" libraryName");
            }
            if (this.f30371c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder b(String str) {
            if (str != null) {
                this.f30369a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder c(String str) {
            if (str != null) {
                this.f30371c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder d(String str) {
            if (str != null) {
                this.f30370b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    public String b() {
        return this.f30366a;
    }

    public String c() {
        return this.f30368c;
    }

    public String d() {
        return this.f30367b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        return this.f30366a.equals(buildIdMappingForArch.b()) && this.f30367b.equals(buildIdMappingForArch.d()) && this.f30368c.equals(buildIdMappingForArch.c());
    }

    public int hashCode() {
        return ((((this.f30366a.hashCode() ^ 1000003) * 1000003) ^ this.f30367b.hashCode()) * 1000003) ^ this.f30368c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f30366a + ", libraryName=" + this.f30367b + ", buildId=" + this.f30368c + "}";
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.f30366a = str;
        this.f30367b = str2;
        this.f30368c = str3;
    }
}
