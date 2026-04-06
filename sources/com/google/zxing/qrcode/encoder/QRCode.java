package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

public final class QRCode {

    /* renamed from: a  reason: collision with root package name */
    public Mode f32864a;

    /* renamed from: b  reason: collision with root package name */
    public ErrorCorrectionLevel f32865b;

    /* renamed from: c  reason: collision with root package name */
    public Version f32866c;

    /* renamed from: d  reason: collision with root package name */
    public int f32867d = -1;

    /* renamed from: e  reason: collision with root package name */
    public ByteMatrix f32868e;

    public static boolean b(int i2) {
        return i2 >= 0 && i2 < 8;
    }

    public ByteMatrix a() {
        return this.f32868e;
    }

    public void c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f32865b = errorCorrectionLevel;
    }

    public void d(int i2) {
        this.f32867d = i2;
    }

    public void e(ByteMatrix byteMatrix) {
        this.f32868e = byteMatrix;
    }

    public void f(Mode mode) {
        this.f32864a = mode;
    }

    public void g(Version version) {
        this.f32866c = version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f32864a);
        sb.append("\n ecLevel: ");
        sb.append(this.f32865b);
        sb.append("\n version: ");
        sb.append(this.f32866c);
        sb.append("\n maskPattern: ");
        sb.append(this.f32867d);
        if (this.f32868e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f32868e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
