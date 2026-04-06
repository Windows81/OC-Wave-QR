package com.google.zxing.client.result;

public final class URIParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f32575a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32576b;

    public String a() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.b(this.f32576b, sb);
        ParsedResult.b(this.f32575a, sb);
        return sb.toString();
    }
}
