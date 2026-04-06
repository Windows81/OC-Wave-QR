package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

abstract class Token {

    /* renamed from: b  reason: collision with root package name */
    public static final Token f32506b = new SimpleToken((Token) null, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Token f32507a;

    public Token(Token token) {
        this.f32507a = token;
    }

    public final Token a(int i2, int i3) {
        return new SimpleToken(this, i2, i3);
    }

    public final Token b(int i2, int i3) {
        return new BinaryShiftToken(this, i2, i3);
    }

    public abstract void c(BitArray bitArray, byte[] bArr);

    public final Token d() {
        return this.f32507a;
    }
}
