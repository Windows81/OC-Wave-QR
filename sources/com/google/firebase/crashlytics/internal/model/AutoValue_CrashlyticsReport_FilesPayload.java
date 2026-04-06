package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {

    /* renamed from: a  reason: collision with root package name */
    public final List f30376a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30377b;

    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {

        /* renamed from: a  reason: collision with root package name */
        public List f30378a;

        /* renamed from: b  reason: collision with root package name */
        public String f30379b;

        public CrashlyticsReport.FilesPayload a() {
            List list = this.f30378a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload(list, this.f30379b);
            }
            throw new IllegalStateException("Missing required properties:" + " files");
        }

        public CrashlyticsReport.FilesPayload.Builder b(List list) {
            if (list != null) {
                this.f30378a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        public CrashlyticsReport.FilesPayload.Builder c(String str) {
            this.f30379b = str;
            return this;
        }
    }

    public List b() {
        return this.f30376a;
    }

    public String c() {
        return this.f30377b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.f30376a.equals(filesPayload.b())) {
            String str = this.f30377b;
            if (str == null) {
                if (filesPayload.c() == null) {
                    return true;
                }
            } else if (str.equals(filesPayload.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f30376a.hashCode() ^ 1000003) * 1000003;
        String str = this.f30377b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f30376a + ", orgId=" + this.f30377b + "}";
    }

    public AutoValue_CrashlyticsReport_FilesPayload(List list, String str) {
        this.f30376a = list;
        this.f30377b = str;
    }
}
