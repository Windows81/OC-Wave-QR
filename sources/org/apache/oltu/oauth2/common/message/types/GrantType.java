package org.apache.oltu.oauth2.common.message.types;

public enum GrantType {
    AUTHORIZATION_CODE("authorization_code"),
    IMPLICIT("implicit"),
    PASSWORD("password"),
    REFRESH_TOKEN("refresh_token"),
    CLIENT_CREDENTIALS("client_credentials"),
    JWT_BEARER("urn:ietf:params:oauth:grant-type:jwt-bearer");
    

    /* renamed from: z  reason: collision with root package name */
    public String f43548z;

    /* access modifiers changed from: public */
    GrantType(String str) {
        this.f43548z = str;
    }

    public String toString() {
        return this.f43548z;
    }
}
