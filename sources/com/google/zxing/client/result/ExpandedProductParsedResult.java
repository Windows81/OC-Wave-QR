package com.google.zxing.client.result;

import java.util.Map;
import java.util.Objects;

public final class ExpandedProductParsedResult extends ParsedResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f32540a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32541b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32542c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32543d;

    /* renamed from: e  reason: collision with root package name */
    public final String f32544e;

    /* renamed from: f  reason: collision with root package name */
    public final String f32545f;

    /* renamed from: g  reason: collision with root package name */
    public final String f32546g;

    /* renamed from: h  reason: collision with root package name */
    public final String f32547h;

    /* renamed from: i  reason: collision with root package name */
    public final String f32548i;

    /* renamed from: j  reason: collision with root package name */
    public final String f32549j;

    /* renamed from: k  reason: collision with root package name */
    public final String f32550k;

    /* renamed from: l  reason: collision with root package name */
    public final String f32551l;

    /* renamed from: m  reason: collision with root package name */
    public final String f32552m;

    /* renamed from: n  reason: collision with root package name */
    public final Map f32553n;

    public String a() {
        return String.valueOf(this.f32540a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedProductParsedResult)) {
            return false;
        }
        ExpandedProductParsedResult expandedProductParsedResult = (ExpandedProductParsedResult) obj;
        return Objects.equals(this.f32541b, expandedProductParsedResult.f32541b) && Objects.equals(this.f32542c, expandedProductParsedResult.f32542c) && Objects.equals(this.f32543d, expandedProductParsedResult.f32543d) && Objects.equals(this.f32544e, expandedProductParsedResult.f32544e) && Objects.equals(this.f32545f, expandedProductParsedResult.f32545f) && Objects.equals(this.f32546g, expandedProductParsedResult.f32546g) && Objects.equals(this.f32547h, expandedProductParsedResult.f32547h) && Objects.equals(this.f32548i, expandedProductParsedResult.f32548i) && Objects.equals(this.f32549j, expandedProductParsedResult.f32549j) && Objects.equals(this.f32550k, expandedProductParsedResult.f32550k) && Objects.equals(this.f32551l, expandedProductParsedResult.f32551l) && Objects.equals(this.f32552m, expandedProductParsedResult.f32552m) && Objects.equals(this.f32553n, expandedProductParsedResult.f32553n);
    }

    public int hashCode() {
        return (((((((((((Objects.hashCode(this.f32541b) ^ Objects.hashCode(this.f32542c)) ^ Objects.hashCode(this.f32543d)) ^ Objects.hashCode(this.f32544e)) ^ Objects.hashCode(this.f32545f)) ^ Objects.hashCode(this.f32546g)) ^ Objects.hashCode(this.f32547h)) ^ Objects.hashCode(this.f32548i)) ^ Objects.hashCode(this.f32549j)) ^ Objects.hashCode(this.f32550k)) ^ Objects.hashCode(this.f32551l)) ^ Objects.hashCode(this.f32552m)) ^ Objects.hashCode(this.f32553n);
    }
}
