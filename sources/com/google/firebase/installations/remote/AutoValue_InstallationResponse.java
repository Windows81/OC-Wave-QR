package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

final class AutoValue_InstallationResponse extends InstallationResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f30841a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30842b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30843c;

    /* renamed from: d  reason: collision with root package name */
    public final TokenResult f30844d;

    /* renamed from: e  reason: collision with root package name */
    public final InstallationResponse.ResponseCode f30845e;

    public static final class Builder extends InstallationResponse.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30846a;

        /* renamed from: b  reason: collision with root package name */
        public String f30847b;

        /* renamed from: c  reason: collision with root package name */
        public String f30848c;

        /* renamed from: d  reason: collision with root package name */
        public TokenResult f30849d;

        /* renamed from: e  reason: collision with root package name */
        public InstallationResponse.ResponseCode f30850e;

        public InstallationResponse a() {
            return new AutoValue_InstallationResponse(this.f30846a, this.f30847b, this.f30848c, this.f30849d, this.f30850e);
        }

        public InstallationResponse.Builder b(TokenResult tokenResult) {
            this.f30849d = tokenResult;
            return this;
        }

        public InstallationResponse.Builder c(String str) {
            this.f30847b = str;
            return this;
        }

        public InstallationResponse.Builder d(String str) {
            this.f30848c = str;
            return this;
        }

        public InstallationResponse.Builder e(InstallationResponse.ResponseCode responseCode) {
            this.f30850e = responseCode;
            return this;
        }

        public InstallationResponse.Builder f(String str) {
            this.f30846a = str;
            return this;
        }
    }

    public TokenResult b() {
        return this.f30844d;
    }

    public String c() {
        return this.f30842b;
    }

    public String d() {
        return this.f30843c;
    }

    public InstallationResponse.ResponseCode e() {
        return this.f30845e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f30841a;
        if (str != null ? str.equals(installationResponse.f()) : installationResponse.f() == null) {
            String str2 = this.f30842b;
            if (str2 != null ? str2.equals(installationResponse.c()) : installationResponse.c() == null) {
                String str3 = this.f30843c;
                if (str3 != null ? str3.equals(installationResponse.d()) : installationResponse.d() == null) {
                    TokenResult tokenResult = this.f30844d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.b()) : installationResponse.b() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f30845e;
                        if (responseCode == null) {
                            if (installationResponse.e() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f30841a;
    }

    public int hashCode() {
        String str = this.f30841a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f30842b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30843c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f30844d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f30845e;
        if (responseCode != null) {
            i2 = responseCode.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f30841a + ", fid=" + this.f30842b + ", refreshToken=" + this.f30843c + ", authToken=" + this.f30844d + ", responseCode=" + this.f30845e + "}";
    }

    public AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f30841a = str;
        this.f30842b = str2;
        this.f30843c = str3;
        this.f30844d = tokenResult;
        this.f30845e = responseCode;
    }
}
