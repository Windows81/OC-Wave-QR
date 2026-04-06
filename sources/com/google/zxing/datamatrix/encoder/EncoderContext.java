package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.nio.charset.StandardCharsets;

final class EncoderContext {

    /* renamed from: a  reason: collision with root package name */
    public final String f32664a;

    /* renamed from: b  reason: collision with root package name */
    public SymbolShapeHint f32665b;

    /* renamed from: c  reason: collision with root package name */
    public Dimension f32666c;

    /* renamed from: d  reason: collision with root package name */
    public Dimension f32667d;

    /* renamed from: e  reason: collision with root package name */
    public final StringBuilder f32668e;

    /* renamed from: f  reason: collision with root package name */
    public int f32669f;

    /* renamed from: g  reason: collision with root package name */
    public int f32670g;

    /* renamed from: h  reason: collision with root package name */
    public SymbolInfo f32671h;

    /* renamed from: i  reason: collision with root package name */
    public int f32672i;

    public EncoderContext(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 != '?' || str.charAt(i2) == '?') {
                sb.append(c2);
                i2++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f32664a = sb.toString();
        this.f32665b = SymbolShapeHint.FORCE_NONE;
        this.f32668e = new StringBuilder(str.length());
        this.f32670g = -1;
    }

    public int a() {
        return this.f32668e.length();
    }

    public StringBuilder b() {
        return this.f32668e;
    }

    public char c() {
        return this.f32664a.charAt(this.f32669f);
    }

    public String d() {
        return this.f32664a;
    }

    public int e() {
        return this.f32670g;
    }

    public int f() {
        return h() - this.f32669f;
    }

    public SymbolInfo g() {
        return this.f32671h;
    }

    public final int h() {
        return this.f32664a.length() - this.f32672i;
    }

    public boolean i() {
        return this.f32669f < h();
    }

    public void j() {
        this.f32670g = -1;
    }

    public void k() {
        this.f32671h = null;
    }

    public void l(Dimension dimension, Dimension dimension2) {
        this.f32666c = dimension;
        this.f32667d = dimension2;
    }

    public void m(int i2) {
        this.f32672i = i2;
    }

    public void n(SymbolShapeHint symbolShapeHint) {
        this.f32665b = symbolShapeHint;
    }

    public void o(int i2) {
        this.f32670g = i2;
    }

    public void p() {
        q(a());
    }

    public void q(int i2) {
        SymbolInfo symbolInfo = this.f32671h;
        if (symbolInfo == null || i2 > symbolInfo.a()) {
            this.f32671h = SymbolInfo.l(i2, this.f32665b, this.f32666c, this.f32667d, true);
        }
    }

    public void r(char c2) {
        this.f32668e.append(c2);
    }

    public void s(String str) {
        this.f32668e.append(str);
    }
}
