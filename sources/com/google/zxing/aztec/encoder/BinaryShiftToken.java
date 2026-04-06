package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

final class BinaryShiftToken extends Token {

    /* renamed from: c  reason: collision with root package name */
    public final short f32490c;

    /* renamed from: d  reason: collision with root package name */
    public final short f32491d;

    public BinaryShiftToken(Token token, int i2, int i3) {
        super(token);
        this.f32490c = (short) i2;
        this.f32491d = (short) i3;
    }

    public void c(BitArray bitArray, byte[] bArr) {
        int i2 = 0;
        while (true) {
            short s2 = this.f32491d;
            if (i2 < s2) {
                if (i2 == 0 || (i2 == 31 && s2 <= 62)) {
                    bitArray.e(31, 5);
                    short s3 = this.f32491d;
                    if (s3 > 62) {
                        bitArray.e(s3 - 31, 16);
                    } else if (i2 == 0) {
                        bitArray.e(Math.min(s3, 31), 5);
                    } else {
                        bitArray.e(s3 - 31, 5);
                    }
                }
                bitArray.e(bArr[this.f32490c + i2], 8);
                i2++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f32490c);
        sb.append("::");
        sb.append((this.f32490c + this.f32491d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
