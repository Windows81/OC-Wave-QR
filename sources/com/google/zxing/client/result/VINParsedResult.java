package com.google.zxing.client.result;

public final class VINParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f32591a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32592b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32593c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32594d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32595e;

    /* renamed from: f  reason: collision with root package name */
    public final char f32596f;

    /* renamed from: g  reason: collision with root package name */
    public final String f32597g;

    public String a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f32591a);
        sb.append(' ');
        sb.append(this.f32592b);
        sb.append(' ');
        sb.append(this.f32593c);
        sb.append(10);
        String str = this.f32594d;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f32595e);
        sb.append(' ');
        sb.append(this.f32596f);
        sb.append(' ');
        sb.append(this.f32597g);
        sb.append(10);
        return sb.toString();
    }
}
