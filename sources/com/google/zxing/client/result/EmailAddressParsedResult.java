package com.google.zxing.client.result;

public final class EmailAddressParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f32533a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f32534b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f32535c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32536d;

    /* renamed from: e  reason: collision with root package name */
    public final String f32537e;

    public String a() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.c(this.f32533a, sb);
        ParsedResult.c(this.f32534b, sb);
        ParsedResult.c(this.f32535c, sb);
        ParsedResult.b(this.f32536d, sb);
        ParsedResult.b(this.f32537e, sb);
        return sb.toString();
    }
}
