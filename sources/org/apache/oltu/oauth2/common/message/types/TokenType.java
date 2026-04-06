package org.apache.oltu.oauth2.common.message.types;

public enum TokenType {
    BEARER("Bearer"),
    MAC("MAC");
    

    /* renamed from: z  reason: collision with root package name */
    public String f43557z;

    /* access modifiers changed from: public */
    TokenType(String str) {
        this.f43557z = str;
    }

    public String toString() {
        return this.f43557z;
    }
}
