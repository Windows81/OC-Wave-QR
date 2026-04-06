package com.google.zxing.client.result;

public final class GeoParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final double f32554a;

    /* renamed from: b  reason: collision with root package name */
    public final double f32555b;

    /* renamed from: c  reason: collision with root package name */
    public final double f32556c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32557d;

    public String a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f32554a);
        sb.append(", ");
        sb.append(this.f32555b);
        if (this.f32556c > 0.0d) {
            sb.append(", ");
            sb.append(this.f32556c);
            sb.append('m');
        }
        if (this.f32557d != null) {
            sb.append(" (");
            sb.append(this.f32557d);
            sb.append(')');
        }
        return sb.toString();
    }
}
