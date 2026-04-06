package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;

final class AutoValue_ComplianceData extends ComplianceData {

    /* renamed from: a  reason: collision with root package name */
    public final ExternalPrivacyContext f23929a;

    /* renamed from: b  reason: collision with root package name */
    public final ComplianceData.ProductIdOrigin f23930b;

    public static final class Builder extends ComplianceData.Builder {

        /* renamed from: a  reason: collision with root package name */
        public ExternalPrivacyContext f23931a;

        /* renamed from: b  reason: collision with root package name */
        public ComplianceData.ProductIdOrigin f23932b;

        public ComplianceData a() {
            return new AutoValue_ComplianceData(this.f23931a, this.f23932b);
        }

        public ComplianceData.Builder b(ExternalPrivacyContext externalPrivacyContext) {
            this.f23931a = externalPrivacyContext;
            return this;
        }

        public ComplianceData.Builder c(ComplianceData.ProductIdOrigin productIdOrigin) {
            this.f23932b = productIdOrigin;
            return this;
        }
    }

    public ExternalPrivacyContext b() {
        return this.f23929a;
    }

    public ComplianceData.ProductIdOrigin c() {
        return this.f23930b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        ExternalPrivacyContext externalPrivacyContext = this.f23929a;
        if (externalPrivacyContext != null ? externalPrivacyContext.equals(complianceData.b()) : complianceData.b() == null) {
            ComplianceData.ProductIdOrigin productIdOrigin = this.f23930b;
            if (productIdOrigin == null) {
                if (complianceData.c() == null) {
                    return true;
                }
            } else if (productIdOrigin.equals(complianceData.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ExternalPrivacyContext externalPrivacyContext = this.f23929a;
        int i2 = 0;
        int hashCode = ((externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.f23930b;
        if (productIdOrigin != null) {
            i2 = productIdOrigin.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f23929a + ", productIdOrigin=" + this.f23930b + "}";
    }

    public AutoValue_ComplianceData(ExternalPrivacyContext externalPrivacyContext, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.f23929a = externalPrivacyContext;
        this.f23930b = productIdOrigin;
    }
}
