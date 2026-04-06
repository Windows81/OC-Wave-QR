package org.apache.oltu.oauth2.common.message.types;

public enum ParameterStyle {
    BODY("body"),
    QUERY("query"),
    HEADER("header");
    

    /* renamed from: z  reason: collision with root package name */
    public String f43551z;

    /* access modifiers changed from: public */
    ParameterStyle(String str) {
        this.f43551z = str;
    }

    public String toString() {
        return this.f43551z;
    }
}
