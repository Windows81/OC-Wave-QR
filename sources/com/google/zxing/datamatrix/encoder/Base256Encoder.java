package com.google.zxing.datamatrix.encoder;

final class Base256Encoder implements Encoder {
    public static char c(char c2, int i2) {
        int i3 = c2 + ((i2 * 149) % 255) + 1;
        return i3 <= 255 ? (char) i3 : (char) (i3 - 256);
    }

    public void a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!encoderContext.i()) {
                break;
            }
            sb.append(encoderContext.c());
            encoderContext.f32669f++;
            if (HighLevelEncoder.n(encoderContext.d(), encoderContext.f32669f, b()) != b()) {
                encoderContext.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a2 = encoderContext.a() + length + 1;
        encoderContext.q(a2);
        boolean z2 = encoderContext.g().a() - a2 > 0;
        if (encoderContext.i() || z2) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            encoderContext.r(c(sb.charAt(i2), encoderContext.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
