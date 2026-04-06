package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;

public class SymbolInfo {

    /* renamed from: i  reason: collision with root package name */
    public static final SymbolInfo[] f32677i;

    /* renamed from: j  reason: collision with root package name */
    public static SymbolInfo[] f32678j;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32679a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32680b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32681c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32682d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32683e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32684f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32685g;

    /* renamed from: h  reason: collision with root package name */
    public final int f32686h;

    static {
        SymbolInfo[] symbolInfoArr = {new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, 144, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, 280, 112, 14, 14, 16, 140, 56), new SymbolInfo(false, 368, 144, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, 192, 18, 18, 16, 114, 48), new SymbolInfo(false, 576, 224, 20, 20, 16, 144, 56), new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56), new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new DataMatrixSymbolInfo144()};
        f32677i = symbolInfoArr;
        f32678j = symbolInfoArr;
    }

    public SymbolInfo(boolean z2, int i2, int i3, int i4, int i5, int i6) {
        this(z2, i2, i3, i4, i5, i6, i2, i3);
    }

    public static SymbolInfo l(int i2, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z2) {
        for (SymbolInfo symbolInfo : f32678j) {
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !symbolInfo.f32679a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.f32679a) && ((dimension == null || (symbolInfo.j() >= dimension.b() && symbolInfo.i() >= dimension.a())) && ((dimension2 == null || (symbolInfo.j() <= dimension2.b() && symbolInfo.i() <= dimension2.a())) && i2 <= symbolInfo.f32680b)))) {
                return symbolInfo;
            }
        }
        if (!z2) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
    }

    public final int a() {
        return this.f32680b;
    }

    public int b(int i2) {
        return this.f32685g;
    }

    public final int c() {
        return this.f32681c;
    }

    public final int d(int i2) {
        return this.f32686h;
    }

    public final int e() {
        int i2 = this.f32684f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (!(i2 == 2 || i2 == 4)) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    public int f() {
        return this.f32680b / this.f32685g;
    }

    public final int g() {
        return k() * this.f32683e;
    }

    public final int h() {
        return e() * this.f32682d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final int k() {
        int i2 = this.f32684f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32679a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f32682d);
        sb.append('x');
        sb.append(this.f32683e);
        sb.append(", symbol size ");
        sb.append(j());
        sb.append('x');
        sb.append(i());
        sb.append(", symbol data size ");
        sb.append(h());
        sb.append('x');
        sb.append(g());
        sb.append(", codewords ");
        sb.append(this.f32680b);
        sb.append('+');
        sb.append(this.f32681c);
        return sb.toString();
    }

    public SymbolInfo(boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f32679a = z2;
        this.f32680b = i2;
        this.f32681c = i3;
        this.f32682d = i4;
        this.f32683e = i5;
        this.f32684f = i6;
        this.f32685g = i7;
        this.f32686h = i8;
    }
}
