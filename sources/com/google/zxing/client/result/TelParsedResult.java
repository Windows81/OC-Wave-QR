package com.google.zxing.client.result;

public final class TelParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f32572a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32573b;

    public String a() {
        StringBuilder sb = new StringBuilder(20);
        ParsedResult.b(this.f32572a, sb);
        ParsedResult.b(this.f32573b, sb);
        return sb.toString();
    }
}
