package com.google.zxing.client.result;

public final class SMSParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f32569a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32570b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32571c;

    public String a() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.c(this.f32569a, sb);
        ParsedResult.b(this.f32570b, sb);
        ParsedResult.b(this.f32571c, sb);
        return sb.toString();
    }
}
