package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {

    /* renamed from: a  reason: collision with root package name */
    public final String f30380a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f30381b;

    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30382a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f30383b;

        public CrashlyticsReport.FilesPayload.File a() {
            byte[] bArr;
            String str = this.f30382a;
            if (str != null && (bArr = this.f30383b) != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f30382a == null) {
                sb.append(" filename");
            }
            if (this.f30383b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public CrashlyticsReport.FilesPayload.File.Builder b(byte[] bArr) {
            if (bArr != null) {
                this.f30383b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        public CrashlyticsReport.FilesPayload.File.Builder c(String str) {
            if (str != null) {
                this.f30382a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    public byte[] b() {
        return this.f30381b;
    }

    public String c() {
        return this.f30380a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f30380a.equals(file.c())) {
            if (Arrays.equals(this.f30381b, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).f30381b : file.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30380a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f30381b);
    }

    public String toString() {
        return "File{filename=" + this.f30380a + ", contents=" + Arrays.toString(this.f30381b) + "}";
    }

    public AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.f30380a = str;
        this.f30381b = bArr;
    }
}
