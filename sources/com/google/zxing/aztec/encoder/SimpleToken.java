package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

final class SimpleToken extends Token {

    /* renamed from: c  reason: collision with root package name */
    public final short f32499c;

    /* renamed from: d  reason: collision with root package name */
    public final short f32500d;

    public SimpleToken(Token token, int i2, int i3) {
        super(token);
        this.f32499c = (short) i2;
        this.f32500d = (short) i3;
    }

    public void c(BitArray bitArray, byte[] bArr) {
        bitArray.e(this.f32499c, this.f32500d);
    }

    public String toString() {
        short s2 = this.f32499c;
        short s3 = this.f32500d;
        short s4 = (s2 & ((1 << s3) - 1)) | (1 << s3);
        return "<" + Integer.toBinaryString(s4 | (1 << this.f32500d)).substring(1) + '>';
    }
}
