package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

final class AutoValue_ExternalPrivacyContext extends ExternalPrivacyContext {

    /* renamed from: a  reason: collision with root package name */
    public final ExternalPRequestContext f23939a;

    public static final class Builder extends ExternalPrivacyContext.Builder {

        /* renamed from: a  reason: collision with root package name */
        public ExternalPRequestContext f23940a;

        public ExternalPrivacyContext a() {
            return new AutoValue_ExternalPrivacyContext(this.f23940a);
        }

        public ExternalPrivacyContext.Builder b(ExternalPRequestContext externalPRequestContext) {
            this.f23940a = externalPRequestContext;
            return this;
        }
    }

    public ExternalPRequestContext b() {
        return this.f23939a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = this.f23939a;
        ExternalPRequestContext b2 = ((ExternalPrivacyContext) obj).b();
        return externalPRequestContext == null ? b2 == null : externalPRequestContext.equals(b2);
    }

    public int hashCode() {
        ExternalPRequestContext externalPRequestContext = this.f23939a;
        return (externalPRequestContext == null ? 0 : externalPRequestContext.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f23939a + "}";
    }

    public AutoValue_ExternalPrivacyContext(ExternalPRequestContext externalPRequestContext) {
        this.f23939a = externalPRequestContext;
    }
}
