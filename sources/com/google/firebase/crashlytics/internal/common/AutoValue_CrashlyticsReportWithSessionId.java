package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {

    /* renamed from: a  reason: collision with root package name */
    public final CrashlyticsReport f29942a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29943b;

    /* renamed from: c  reason: collision with root package name */
    public final File f29944c;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.f29942a = crashlyticsReport;
            if (str != null) {
                this.f29943b = str;
                if (file != null) {
                    this.f29944c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public CrashlyticsReport b() {
        return this.f29942a;
    }

    public File c() {
        return this.f29944c;
    }

    public String d() {
        return this.f29943b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return this.f29942a.equals(crashlyticsReportWithSessionId.b()) && this.f29943b.equals(crashlyticsReportWithSessionId.d()) && this.f29944c.equals(crashlyticsReportWithSessionId.c());
    }

    public int hashCode() {
        return ((((this.f29942a.hashCode() ^ 1000003) * 1000003) ^ this.f29943b.hashCode()) * 1000003) ^ this.f29944c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f29942a + ", sessionId=" + this.f29943b + ", reportFile=" + this.f29944c + "}";
    }
}
