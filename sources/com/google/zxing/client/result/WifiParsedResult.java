package com.google.zxing.client.result;

public final class WifiParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f32600a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32601b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32602c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f32603d;

    public String a() {
        StringBuilder sb = new StringBuilder(80);
        ParsedResult.b(this.f32600a, sb);
        ParsedResult.b(this.f32601b, sb);
        ParsedResult.b(this.f32602c, sb);
        ParsedResult.b(Boolean.toString(this.f32603d), sb);
        return sb.toString();
    }
}
